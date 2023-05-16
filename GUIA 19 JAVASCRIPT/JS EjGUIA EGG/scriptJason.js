/* JSON - OBJETO */

/* key, value */
var persona = {
    apellido: "Jalil",
    nombre: "Andrea",
    dni: 21324551,
    nacimiento: new Date ("28-07-1986"),
    mascota: {
        apodo: "nicky",
        nacimiento : new Date("03-03-2013")
    }
}

// var mascota = {
//     apodo: "nicky",
//     nacimiento : new Date("03-03-2013")
// }
console.log (persona.mascota.apodo);

//CLASS
class Mascota {
    apodo;
    nroID;
}

var m = new Mascota();

m.apodo="filo";
m.nroID=3123;

console.log(m);