var nros = [1,2,3,4,5]
console.log(nros[1])


var personas = [
{
    name: "Andrea",
    surname: "Jalil"
},
{
    name: "Nombre1",
    surname: "Apellido1"
},
{
    name: "Nombre2",
    surname: "Apellido2"
}
];
//acceder al último elemento
console.log(personas[personas.length -1])
personas.reverse //lo modifica
personas.forEach ( (e)=> console.log(e.name) )

nros.filter ( (e)=> e%2 == 0)// si son pares

nros.map( (e)=> e*30 )//genera una modificación según lo que indique

console.log(nros.map( (e)=> e*30 ))