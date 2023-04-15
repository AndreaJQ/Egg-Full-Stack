// Call the dataTables jQuery plugin
$(document).ready(function() {
// on ready
});


//EMPIEZA FUNCION
async function iniciarSesion() {
  let datos = {};
  datos.email = document.getElementById('txtEmail').value;
  datos.password = document.getElementById('textPassword').value;

const request = await fetch('api/login',{
    method: 'POST',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
     body: JSON.stringify(datos)//toma los objetos de js y los convierte a un string de json
  });

  const respuesta = await request.text();
    if (respuesta == 'OK') {
      window.location.href = 'usuarios.html'
    } else {
      alert("Las credenciales son incorrectas. Por favor intente nuevamente.");
} //TERMINA FUNCION

//tenemos que capturar los datos que se ingresan

}