// HTML
// <div class="caja c6">
//                 ejercicio 6 <br>
//                 <label for="text">Ingrese un Nro entero</label> <br>
//                 <input type="number" id="nro6"> <br>
//                 <p><h2 id="respuesta6"></h2></p>
//             </div>

//             S

// //ejercicio 6
// nro6.addEventListener("keyup",()=>{
//     if (event.key==="Enter") {
//         const nro = parseInt(document.getElementById("nro6").value);
//         console.log(typeof nro)
//         const respu6 = document.getElementById("respuesta6");
//         console.log(nro);
//         if (nro === 0) {
//             respu6.innerHTML = "El número no es par ni impar"
//         }else if (nro % 2 === 0) {
//             respu6.innerHTML = "El número es par"
//         }else{
//             respu6.innerHTML = "El número es impar"
//         }
//     }
// })