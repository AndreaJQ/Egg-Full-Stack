// Call the dataTables jQuery plugin
$(document).ready(function() {
// on ready
});


//EMPIEZA FUNCION
async function registrarUsuario() {
  let datos = {};
  datos.nombre = document.getElementById('txtNombre').value;
  datos.apellido = document.getElementById('txtApellido').value;
  datos.email = document.getElementById('txtEmail').value;
  datos.password = document.getElementById('textPassword').value;

  let repetirPassword = document.getElementById('txtRepetirPassword').value;

  if (repetirPassword != datos.password) {
    alert('La contraseña que escribiste es diferente.');
    return;
  }
const request = await fetch('api/usuarios',{
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
     body: JSON.stringify(datos)//toma los objetos de js y los convierte a un string de json
  });
  alert("La cuenta fue creada con exito!");
    window.location.href = 'login.html'

} //TERMINA FUNCION

//tenemos que capturar los datos que se ingresan



