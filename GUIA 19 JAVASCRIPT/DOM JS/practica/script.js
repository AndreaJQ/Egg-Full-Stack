// document.querySelector('h3')
// console.log(document.querySelector('h3'))
// console.log(document.querySelector('.h3-d'))
// console.log(document.querySelector('#parrafo'))
// console.log(document.getElementById('parrafo'))
// console.log(document.querySelectorAll('h3'))

// const parrafo = document.querySelector('#parrafo')
// parrafo.textContent= 'texto desde JS'
// parrafo.innerHTML = 'texto con innerHtml'

//CREATE ELEMENT
const lista = document.getElementById('lista')
// console.log(lista)
// const li = document.createElement('li')
//     li.textContent='texto'
//     lista.appendChild(li)


    
const arrayElement = ['primer elemento', 'segundo','tercero']

////ADD AN ARRAYLIST textContent
// arrayElement.forEach(item=>{
//     console.log(item)
//     const li = document.createElement('li')
//     li.textContent=item
//     lista.appendChild(li)
// })
////ADD AN ARRAYLIST innerHTML
// arrayElement.forEach(item => {
//     lista.innerHTML += `<li>${item} </li>`
// })

//AVOID REFLOW WITH FRAGMENT

// const fragment = document.createDocumentFragment()
// arrayElement.forEach (item => {
//     const li = document.createElement('li')
//     li.textContent = item
//     fragment.appendChild(li)
// })

// lista.appendChild(fragment)


//-----insertBefore
const fragment = document.createDocumentFragment()
arrayElement.forEach (item => {
    const li = document.createElement('li')
    li.textContent = item
    
    const referenceNode = fragment.firstChild;

    fragment.insertBefore(li, referenceNode)
})

lista.appendChild(fragment)


// //ADDEVENTLISTENER
// const btnAdd = document.querySelector('.btn-info')
// const result = document.getElementById('result')
// const btnSubst = document.querySelector('.btn-danger')
// let cont =0

// //SUMAR
// btnAdd.addEventListener('click', ()=> {
//     console.log("hiciste click")
//     cont++
//     result.textContent = cont
// })

// //RESTAR
// btnSubst.addEventListener('click', () =>{
//     cont--
//     result.textContent= cont
// })

//DELEGATION
const container = document.querySelector('.container')
const result = document.getElementById('result')
let cont = 0
container.addEventListener('click', e =>{

    if (e.target.classList.contains('btn-info')) {
        cont ++
        result.textContent = cont
    }
    
    if (e.target.classList.contains('btn-danger')) {
        cont --
        result.textContent = cont
    }
    e.stopPropagation
})