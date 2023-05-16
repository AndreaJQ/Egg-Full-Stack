/*
1- Escribir un algoritmo en el cual se consulte al usuario que ingrese ¿cómo está el día de hoy? (soleado, nublado, lloviendo). A continuación, mostrar por pantalla un mensaje que indique “El día de hoy está ...”, completando el mensaje con el dato que ingresó el usuario.
*/

//var dia = prompt("¿cómo está el día de hoy? (soleado, nublado, lloviendo) ") 

//console.log("El día de hoy está ..." + dia)

/*
2- Conocido el número en matemática PI π, pedir al usuario que ingrese el valor del radio de una circunferencia y calcular y mostrar por pantalla el área y perímetro. Recuerde que para calcular el área y el perímetro se utilizan las siguientes fórmulas:
area = PI * radio2 perimetro = 2 * PI * radio
*/

//var radio = parseInt(prompt("Ingrese el valor del radio de una circunferencia ") )
// const area = Math.PI * (radio * radio)
// const perimetro= 2*Math.PI * radio


// console.log(`El área es ${area}
// y el perímetro es ${perimetro}`)


/*
3- Escriba un programa en donde se pida la edad del usuario. Si el usuario es mayor de edad se debe mostrar un mensaje indicándolo.
*/

// var edad = prompt("ingrese su edad")

// if (edad>18) {
//     console.log("usted es mayor de edad")
// }else{
//     console.log("es menor de edad")
// }

/*
4- Realiza un programa que sólo permita introducir los caracteres ‘S’ y ‘N’. Si el usuario ingresa alguno de esos dos caracteres se deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
 */

// var caracter = prompt("ingrese una letra")

// if (caracter==="S" || caracter==="N") {
//     console.log("CORRECTO")
// }else{
//     console.log("INCORRECTO")
// }

/*
5-
Construir un programa que simule un menú de opciones para realizar las cuatro operaciones aritméticas básicas (suma, resta, multiplicación y división) con dos valores numéricos enteros. El usuario, además, debe especificar la operación con el primer carácter de la operación que desea realizar: ‘S' o ‘s’ para la suma, ‘R’ o ‘r’ para la resta, ‘M’ o ‘m’ para la multiplicación y ‘D’ o ‘d’ para la división.
 */

// var num1 = parseInt(prompt("ingrese el 1er nro"))
// var num2 = parseInt(prompt("ingrese el 2do nro"))
// var fun = prompt("ingrese la funcion (suma -s-, resta -r-, multiplicación -m-  y división -d-)")
// switch (fun) {
//     case "s","S":
//         console.log(num1+num2)
//         break;
//     case "r","R":
//         console.log(num1-num2)
//         break;
//     case "m","M":
//         console.log(num1*num2)
//         break;
//     case "d","D":
//         console.log(num1/num2)
//         break;

//     default:
//         console.log("error, no ingreso la función correcta")
//         break;
// }

/*
6-Realizar un programa que, dado un número entero, visualice en pantalla si es par o impar. En caso de que el valor ingresado sea 0, se debe mostrar “el número no es par ni impar”.
 */

// var num1 = parseInt(prompt("ingrese un nro"))


// if (num1===0) {
//     console.log("no es par ni impar")
// } else {
//     if (num1%2===0) {
//         console.log("es par")
//     }else{
//        console.log("es impar") 
//     }
// }


/*
7-Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */

// var limite = parseInt(prompt("ingrese un nro"))
// var suma=0
// for (let i = 0; i < limite+1; i++) {
//     suma+=i
    
// }
// console.log(suma)


/*
8- Escribir un programa que lea números enteros hasta teclear 0 (cero). Al finalizar el programa se debe mostrar el máximo número ingresado, el mínimo, y el promedio de todos ellos.
 */

// var arrayNum=[]

// do {
    
//     num=parseInt(prompt("ingrese un nro"))
//     arrayNum.push(num)

// } while (num!==0);
// arrayNum.pop()
    
// console.log(arrayNum)
// suma = 0;
//     arrayNum.forEach (function(num){
//         suma += num;
//     });

// console.log("El promedio "+suma/arrayNum.length);

// console.log("El valor maximo "+Math.max(...arrayNum))
// console.log("El valor minimo "+Math.min(...arrayNum))



/*
9-Realizar un programa que pida una frase y el programa deberá mostrar la frase con un espacio entre cada letra. La frase se mostrara así: H o l a. Nota: recordar el funcionamiento de la función Substring().
 */

// let frase = prompt("Ingrese una frase");
// let array = frase.split("");
// frase = array.join(" ");
// console.log(frase)


/*
10-Escribir una función flecha que reciba una palabra y la devuelva al revés.
 */
// let texto        = 'Hola mundo',
// 	textoReversa = texto.split('').reverse().join('')

//     console.log(textoReversa)
