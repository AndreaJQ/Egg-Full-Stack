const cards = document.getElementById('cards')
const items = document.getElementById('items')
const footer = document.getElementById('footer')
const templateCard = document.getElementById('template-card').content
const templateFooter = document.getElementById('template-footer').content
const templateCart = document.getElementById('template-cart').content
const fragment = document.createDocumentFragment()
let cart = {}

document.addEventListener('DOMContentLoaded', ()=>{
    fetchData()
    //cuando se carga sitio le preguntamos al localStorage si hay algo
    if (localStorage.getItem('cart')) {
        cart = JSON.parse(localStorage.getItem('cart'))
        fillCart()
    }
})
cards.addEventListener('click', e =>{
    addCart(e)
})

items.addEventListener('click', e =>{
    btnAction(e)
})


const fetchData = async () => {
    try{
        const res = await fetch('api.json')
        const data = await res.json()
       // console.log(data)
        paintCards(data)
    }catch(error){
        console.log(error)
    }

}

const paintCards = data =>{
    data.forEach(producto =>{
        templateCard.querySelector('h5').textContent = producto.title
        templateCard.querySelector('p').textContent = producto.precio
        templateCard.querySelector('img').setAttribute('src', producto.thumbnailUrl)
        templateCard.querySelector('.btn-dark').dataset.id = producto.id
        const clone = templateCard.cloneNode(true)
        fragment.appendChild(clone)
    })
    cards.appendChild(fragment)
} 

const addCart = e =>{
      if (e.target.classList.contains('btn-dark')) {
        setCart(e.target.parentElement)
    }
    e.stopPropagation()
}

const setCart = object => {
    
    const product = {
        id:object.querySelector('.btn-dark').dataset.id,
        title:object.querySelector('h5').textContent,
        precio:object.querySelector('p').textContent,
        cant:1
    }
if (cart.hasOwnProperty(product.id)) {
    product.cant= cart[product.id].cant+1
    
}

    cart[product.id]= {...product}
    fillCart()
}
 
const fillCart = ()=>{
   
    items.innerHTML=''
    Object.values(cart).forEach(producto =>{
        templateCart.querySelector('th').textContent = producto.id
        templateCart.querySelectorAll('td')[0].textContent = producto.title
        templateCart.querySelectorAll('td')[1].textContent = producto.cant
        templateCart.querySelector('.btn-info').dataset.id= producto.id
        templateCart.querySelector('.btn-danger').dataset.id= producto.id
        templateCart.querySelector('span').textContent=producto.cant*producto.precio

        const clone = templateCart.cloneNode(true)
        fragment.appendChild(clone)
    })
    items.appendChild(fragment)

    changeFooter()

    localStorage.setItem('cart', JSON.stringify(cart))
}



const changeFooter= ()=>{
    footer.innerHTML= ''
    if (Object.keys(cart).length===0) {
        footer.innerHTML= `
        <th scope="row" colspan="5">Carrito vacío - comience a comprar!</th>
        `
        return //sale de funcion
    }
 // sumar cantidad y sumar totales
                                                                    // PONEMOS 0 PORQUE DEVUELVE UN NÚMERO
 const nCant = Object.values(cart).reduce((acc, { cant }) => acc + cant, 0)
 const nPrecio = Object.values(cart).reduce((acc, {cant, precio}) => acc + cant * precio ,0)
 
templateFooter.querySelectorAll('td')[0].textContent=nCant
templateFooter.querySelector('span').textContent=nPrecio

const clone =templateFooter.cloneNode(true)
fragment.appendChild(clone)
footer.appendChild(fragment)

const btnEmpty = document.getElementById('empty-cart')
btnEmpty.addEventListener('click', () => {
    cart = {}
    fillCart()
})
}


const btnAction = e => {
    
    //Add
    if (e.target.classList.contains('btn-info')) {
        console.log(cart[e.target.dataset.id])
        //cart[e.target.dataset.id]
        const producto = cart[e.target.dataset.id]
        producto.cant++
        cart[e.target.dataset.id] = {...producto}
        fillCart()
    }

    //substract
    if (e.target.classList.contains('btn-danger')) {
        console.log(cart[e.target.dataset.id])
        //cart[e.target.dataset.id]
        const producto = cart[e.target.dataset.id]
        producto.cant--
        if (producto.cant === 0) {
            delete  cart[e.target.dataset.id]
        }
        
        fillCart()
    }

    e.stopPropagation()
}
