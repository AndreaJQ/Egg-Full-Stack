const formulario = document.getElementById('formulario')
const listaTareas = document.getElementById('lista-tareas')
const template = document.getElementById('template').content
const fragment = document.createDocumentFragment()
let tareas = {}

document.addEventListener('DOMContentLoaded', () => {
    //LOCAL STORAGE PARA QUE CARGUE LO GUARDADO
    if (localStorage.getItem('tareas')) {
        tareas = JSON.parse(localStorage.getItem('tareas'))
    }
    pintarTareas()
})

listaTareas.addEventListener('click', (e) => {
    btnAccion(e)
    //ACCIONES QUE TOMARAN LOS BOTONES DENTRO DEL DIV CUYA CLASE ES listaTareas
})


//ACCIONES AL DAR SUBMIT -> SE VA A setTarea
formulario.addEventListener('submit', e => {
    e.preventDefault()
    // console.log(e.target[0].value)
    // console.log(e.target.querySelector('input').value)
    setTarea(e)
})


const setTarea = e => {
    const texto = e.target.querySelector('input').value
    // if there is no text y doesn't load.
    if (texto.trim() === '') {
        console.log('EMPTY')
        return
    }
    //else it creates objects
    const tarea = {
        id: Date.now(),
        texto: texto,
        estado: false
    }
    
    tareas[tarea.id] = tarea
    pintarTareas()

    //it resets the form and leaves the cursor inside with focus.
    formulario.reset()
    e.target.querySelector('input').focus()
}


const pintarTareas = () => {
    //setear el localStorage
    localStorage.setItem('tareas', JSON.stringify(tareas))

    //if there is nothing it will fill the div with the text, and returns
    if (Object.values(tareas).length === 0) {
        listaTareas.innerHTML = `
        <div class="alert alert-dark text-center">
        Sin tareas pendientes 😍
        </div>
        `
        return
    }
    
    //initiate the list empty
    listaTareas.innerHTML = ''

    //for each object.value(tarea)
    //create the template.cloneNode
    //fill the text
    Object.values(tareas).forEach(tarea => {
        const clone = template.cloneNode(true)
        clone.querySelector('p').textContent = tarea.texto

        //buttons behavior
        if (tarea.estado) {
            clone.querySelectorAll('.fas')[0].classList.replace('fa-check-circle', 'fa-undo-alt')
            clone.querySelector('.alert').classList.replace('alert-warning', 'alert-primary')
            clone.querySelector('p').style.textDecoration = 'line-through'
        }

        clone.querySelectorAll('.fas')[0].dataset.id = tarea.id
        clone.querySelectorAll('.fas')[1].dataset.id = tarea.id
        fragment.appendChild(clone)
    })
    listaTareas.appendChild(fragment)
}

//buttons actions
const btnAccion = e => {
    // console.log(e.target.classList.contains('fa-check-circle'))

    //set the tick to true
    if (e.target.classList.contains('fa-check-circle')) {
        tareas[e.target.dataset.id].estado = true
        pintarTareas() //goes back to function fill list -> pintarTareas()
    }

    //delete 
    if (e.target.classList.contains('fa-minus-circle')) {
        // console.log(e.target.dataset.id)
        delete tareas[e.target.dataset.id]
        pintarTareas() //goes back to function fill list -> pintarTareas()
    }

    //set the tick to false
    if (e.target.classList.contains('fa-undo-alt')) {
        tareas[e.target.dataset.id].estado = false
        pintarTareas() //goes back to function fill list -> pintarTareas()
    }

    e.stopPropagation()
}