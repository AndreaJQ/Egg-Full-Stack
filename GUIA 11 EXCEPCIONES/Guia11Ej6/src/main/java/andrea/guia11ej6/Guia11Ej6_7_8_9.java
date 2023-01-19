/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package andrea.guia11ej6;

/**
 *
 * @author andreajalil
 */
public class Guia11Ej6_7_8_9 {

    public static void main(String[] args) {
      

    
}
}
//EJERCICIO 6
//Dado el método metodoA de la clase A, indique:
//------------------------------------------
//        class A {
//            void metodoA() {
//                sentencia_a1
//                sentencia_a2
//                try {
//                    sentencia_a3
//                    sentencia_a4
//                } catch (MioException e){ 
//                    sentencia_a6 
//                }
//            sentencia_a5
//            }
//        }
//---------------------------------------------
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción 
//MioException? RT: 1ro sentencia_a1
//                  2do sentencia_a2
//                  3ro sentencia_a6
//  ********** Que pasa si la excepcion la provoca la sentencia a4?? ********
// 
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción 
//MioException? RT: 1ro sentencia_a1
//                  2do sentencia_a2
//                  3ro sentencia_a3
//                  4do sentencia_a4
//                  5do sentencia_a5
//------------------------------------------



//EJERCICIO 7 
//Dado el método metodoB de la clase B, indique:
//------------------------------------------         
//      class B {
//          void metodoB() {
//              sentencia_b1
//                  try {
//                      sentencia_b2
//                  } catch (MioException e){ 
//                      sentencia_b3 
//                  }
//                  finally
//                      sentencia_b4
//                  }
//      }
//------------------------------------------
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//                  1ro sentencia_b1
//                  2do sentencia_b3
//                  3ro sentencia_b4
//
//b) ¿Qué sentencias y en qué orden se ejecutan si NO se produce la excepción MioException? 
//                  1ro sentencia_b1
//                  2do sentencia_b2
//                  3ro sentencia_b4
//------------------------------------------

//EJERCICIO 8

//CLASS UNO
/*
Valor final del try: 44
Valor final del finally: 45
Valor antes del return: 46
46
*/

//CLASS DOS
/*
Valor final del catch: 43
Valor final del finally: 44
Valor antes del return: 45
45
*/

//CLASS TRES
/*
Valor final del finally: 2
Excepcion en metodo()
java.lang.NumberFormatException: For input string: "W"
*/




//EJERCICIO 9
//------------------------------------------
//  class C {
//      void metodoC() throws TuException{
//          sentencia_c1
//              try {
//                  sentencia_c2
//                  sentencia_c3
//              } catch (MioException e){
//                  sentencia_c4
//              } catch (TuException e){
//                  sentencia_c5
//              throw (e)
//              }
//              finally
//                  sentencia_c6
//              }
//      }
//------------------------------------------
//8. Dado el método metodoC de la clase C, indique:
//a) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción MioException?
//RT:   1ro sentencia_c1
//      2do sentencia_c4
//      3ro sentencia_c6  
//b) ¿Qué sentencias y en qué orden se ejecutan si no se produce la excepción MioException?
//RT:   1ro sentencia_c1
//      2do sentencia_c2
//      3ro sentencia_c3
//      4to sentencia_c6
//c) ¿Qué sentencias y en qué orden se ejecutan si se produce la excepción TuException?
//RT:   1ro sentencia_c1
//      2do sentencia_c5
//      3ro sentencia_c6  
