// Call the dataTables jQuery plugin
$(document).ready(function() {

cargarUsuarios();
  $('#usuarios').DataTable();
});


//EMPIEZA FUNCION
async function cargarUsuarios(){ //acá va toda la lógica, dentro de un fetch

  const request = await fetch('api/usuarios', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
  const usuarios = await request.json();


   let listadoHtml = ''; //iniciamos vacio - va a ser el resultado de incrementar los usuarioHtml

   for(let usuario of usuarios){ //corremos el for para que cargue las tablas.

        let botonEliminar = '<a href="#" onclick="eliminarUsuario('+usuario.id+')" class="btn btn-danger btn-circle btn-sm"><i class="fas fa-trash"></i></a>';

        let telefonoTexto = usuario.telefono == null ? '-' : usuario.telefono;
                //cada usuario se va agregando en la variable usuarioHtml
        let usuarioHtml= '<tr><td>'+usuario.id+'</td><td>' + usuario.nombre+' '+ usuario.apellido
                +' </td><td>'+usuario.email+'</td><td>'+telefonoTexto
                +'</td><td>'+botonEliminar+'</td></tr>'; //creamos el btnEliminar para que el codigo quede más limpio

            listadoHtml += usuarioHtml
   } //termina el for para armar la tabla

    //cargamos listadoHtml en el HTML propiamente. En el html de la tabla el "id=usuarios"
   document.querySelector('#usuarios tbody').outerHTML = listadoHtml;

} //TERMINA FUNCION


// FUNCION para eliminar usuario por id
async function eliminarUsuario(id){

if(!confirm("¿Desea eliminar este usuario?")){ //primero confirmación. si retorna cancelar no hace nada
return;
} //sino ejecuta lo siguiente

//await for the url, included id. Then apply method DELETE.
const request = await fetch('api/usuarios/' + id, {
    method: 'DELETE',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    }
  });
location.reload()//recarga la página y ya estará eliminado
}
