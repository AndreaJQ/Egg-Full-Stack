/* 11. Escribir una función que reciba un String y devuelva la palabra más larga.
String Ejemplo: “Guia de JavaScript” Resultado esperado : “JavaScript” */




// function GetMaximunLengthWord(str)
// {
//     // En el split intervienen los siguientes separadores: 
//     // ' ', ',' ,'¡', '¿', '!', '?', '.', ';', ':'
//     var words = str.split(/[ ,¡¿!?.;:]/);
//     var maxLengthWordIndex=0;

//     for(var i=1; i < words.length; i++)
//     {
//         if (words[i].length > words[maxLengthWordIndex].length)
//             maxLengthWordIndex = i;
//     }

//     return words[maxLengthWordIndex];
// }
// console.log(GetMaximunLengthWord("Guia de Javascript"))


/* 12. Escribir una función flecha de JavaScript que reciba un argumento y retorne el tipo de dato. */


var typeOf=(ingreso) => console.log("el tipo de dato es: " + typeof(ingreso));



/* 13. Crear un objeto persona, con las propiedades nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. A continuación, muestre las propiedades del objeto JavaScript. */





/* 14. Crear un objeto libro que contenga las siguientes propiedades: ISBN, Título, Autor, Número de páginas. Crear un método para cargar un libro pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN, el título, el autor del libro y el numero de páginas. */

let a =prompt("Ingrese el isbn del libro")
let b = prompt("Ingrese el titulo del libro")
let c = prompt("Ingrese el autor del libro")
let d =parseInt(prompt("Ingrese el numero de paginas del libro"))

let libro = {
    isbn : a,
    titulo: b,
    autor: c,
    numPaginas: d,
    
    mostrarInfo: () => {
        return `ISBN: ${libro.isbn}
TITULO: ${libro.titulo}
AUTOR: ${libro.autor}
NUMERO DE PAGINAS: ${libro.numPaginas}`
    }
    
}

console.log(libro.mostrarInfo())


/* 
15. Escribe un programa JavaScript para calcular el área y el perímetro de un objeto Círculo con la propiedad radio. Nota: Cree dos métodos para calcular el área y el perímetro. El radio del círculo lo proporcionará el usuario. */





/* 16. Realizar un programa que rellene dos vectores al mismo tiempo, con 5 valores aleatorios y los muestre por pantalla. */





/* 17. Realizar un programa que elimine los dos últimos elementos de un array. Mostrar el resultado */





/* 18. A partir del siguiente array: var valores = [true, 5, false, "hola", "adios", 2]:
a) Determinar cual de los dos elementos de texto es mayor
b) Utilizando exclusivamente los dos valores booleanos del array, determinar los operadores necesarios para obtener un resultado true y otro resultado false
c) Determinar el resultado de las cinco operaciones matemáticas realizadas con los dos elementos numéricos */





/* 19. Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de 20. */





/* 20. Realizar un programa que obtenga la siguiente matriz [[3], [6], [9], [12], [15]] y devuelve y muestre el siguiente array [6, 9, 12, 15, 18]. */





/* 
21. Escribir un programa para obtener un array de las propiedades de un objeto Persona. Las propiedades son nombre, edad, sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. */