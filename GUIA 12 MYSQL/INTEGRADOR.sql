/*CANDADO A. 
Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Teniendo el máximo de asistencias por partido, muestre cuantas veces se logró dicho máximo.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/
USE NBA;
SELECT count(j.codigo) 'POSICION'
FROM jugadores j, estadisticas e 
WHERE j.codigo = e.jugador AND e.Asistencias_por_partido >= (SELECT MAX(Asistencias_por_partido)
                FROM estadisticas);


/*Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de
datos:
Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición sea
centro o esté comprendida en otras posiciones.*/

SELECT SUM(j.peso) 'CLAVE' 
  FROM jugadores j, equipos e
  WHERE j.Nombre_equipo= e.Nombre
  AND e.conferencia='East' AND j.Posicion LIKE'%C%';



SELECT(SELECT count(j.codigo) 'POSICION'
FROM jugadores j, estadisticas e 
WHERE j.codigo = e.jugador AND e.Asistencias_por_partido >= (SELECT MAX(Asistencias_por_partido)
                FROM estadisticas))'POSICION',(SELECT SUM(j.peso) 'CLAVE' 
  FROM jugadores j, equipos e
  WHERE j.Nombre_equipo= e.Nombre
  AND e.conferencia='East' AND j.Posicion LIKE'%C%') 'CLAVE';


/*CANDADO B      
Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero de
jugadores que tiene el equipo Heat.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/








/*Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos:
La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.*/
SELECT
(SELECT COUNT(j.nombre) 'POSICION'
FROM jugadores j, estadisticas es
WHERE es.jugador= j.codigo
AND es.Asistencias_por_partido>(SELECT COUNT(j.nombre)
        FROM jugadores j
        WHERE j.nombre_equipo like 'Heat'))'POSICION',
(SELECT COUNT(TEMPORADA) 'CLAVE'
FROM PARTIDOS
WHERE TEMPORADA LIKE '%99%')'CLAVE';





/*CANDADO C 

Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:

La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman
parte de equipos de la conferencia oeste.
Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual a
195, y a eso le vamos a sumar 0.9945.
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/

SELECT ROUND ( (  (SELECT count(j.nombre)
      FROM jugadores j, equipos e
      WHERE j.Nombre_equipo= e.Nombre
      AND Procedencia ='Michigan'
      AND e.conferencia ='West') #2

     /

      (SELECT COUNT(j.nombre)
      FROM jugadores j
      WHERE peso>=195)
     )
                    +0.9945) 'POSICION';

#1
/*Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de
datos: 
Para obtener el siguiente código deberás redondear hacia abajo el resultado que se devuelve de
sumar: el promedio de puntos por partido, el conteo de asistencias por partido, y la suma de
tapones por partido. Además, este resultado debe ser, donde la división sea central.*/
SELECT floor(AVG(e.Puntos_por_partido)+ COUNT(e.Asistencias_por_partido) + SUM(e.Tapones_por_partido)) 'CLAVE'
FROM estadisticas e, jugadores j, equipos eq
WHERE e.jugador = j.codigo 
AND eq.Nombre = j.Nombre_equipo 
AND eq.Division = 'central';


SELECT(SELECT ROUND ( (  (SELECT count(j.nombre)
      FROM jugadores j, equipos e
      WHERE j.Nombre_equipo= e.Nombre
      AND Procedencia ='Michigan'
      AND e.conferencia ='West') #2

     /

      (SELECT COUNT(j.nombre)
      FROM jugadores j
      WHERE peso>=195)
     )
                    +0.9945) 'POSICION')'POSICION',(SELECT floor(AVG(e.Puntos_por_partido)+ COUNT(e.Asistencias_por_partido) + SUM(e.Tapones_por_partido)) 'CLAVE'
FROM estadisticas e, jugadores j, equipos eq
WHERE e.jugador = j.codigo 
AND eq.Nombre = j.Nombre_equipo 
AND eq.Division = 'central') 'CLAVE';



/*CANDADO D            
Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s
siguiente/s consulta/s:
Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01. Este
resultado debe ser redondeado. Nota: el resultado debe estar redondeado
Este resultado nos dará la posición del candado (1, 2, 3 o 4)*/





/*Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de
datos:
Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por partido
de todos los jugadores de procedencia argentina.*/

SELECT
(SELECT ROUND(e.tapones_por_partido) 'POSICION'
FROM estadisticas e,jugadores j
WHERE e.jugador = j.codigo 
AND j.Nombre = 'Corey Maggette' 
AND e.temporada = '00/01') 'POSICION'
,
(SELECT FLOOR(SUM(e.puntos_por_partido)) 'CLAVE' 
FROM estadisticas e, jugadores j 
WHERE e.jugador = j.codigo 
AND j.Procedencia = 'argentina') 'CLAVE';








#################################################################
########### R E S U L T A D O      F I N A L ####################
#################################################################
#PRIMER PUNTO
SELECT(SELECT count(j.codigo) 'POSICION'
FROM jugadores j, estadisticas e 
WHERE j.codigo = e.jugador AND e.Asistencias_por_partido >= (SELECT MAX(Asistencias_por_partido)
                FROM estadisticas))'POSICION',(SELECT SUM(j.peso) 'CLAVE' 
  FROM jugadores j, equipos e
  WHERE j.Nombre_equipo= e.Nombre
  AND e.conferencia='East' AND j.Posicion LIKE'%C%') 'CLAVE'
UNION

#SEGUNDO PUNTO
SELECT
(SELECT COUNT(j.nombre) 'POSICION'
FROM jugadores j, estadisticas es
WHERE es.jugador= j.codigo
AND es.Asistencias_por_partido>(SELECT COUNT(j.nombre)
        FROM jugadores j
        WHERE j.nombre_equipo like 'Heat'))'POSICION',
(SELECT COUNT(TEMPORADA) 'CLAVE'
FROM PARTIDOS
WHERE TEMPORADA LIKE '%99%')'CLAVE'

#TERCER PUNTO
UNION
SELECT(SELECT ROUND ( (  (SELECT count(j.nombre)
      FROM jugadores j, equipos e
      WHERE j.Nombre_equipo= e.Nombre
      AND Procedencia ='Michigan'
      AND e.conferencia ='West') #2

     /

      (SELECT COUNT(j.nombre)
      FROM jugadores j
      WHERE peso>=195)
     )
                    +0.9945) 'POSICION')'POSICION',(SELECT floor(AVG(e.Puntos_por_partido)+ COUNT(e.Asistencias_por_partido) + SUM(e.Tapones_por_partido)) 'CLAVE'
FROM estadisticas e, jugadores j, equipos eq
WHERE e.jugador = j.codigo 
AND eq.Nombre = j.Nombre_equipo 
AND eq.Division = 'central') 'CLAVE'

UNION

#CUARTO PUNTO
SELECT
(SELECT ROUND(e.tapones_por_partido) 'POSICION'
FROM estadisticas e,jugadores j
WHERE e.jugador = j.codigo 
AND j.Nombre = 'Corey Maggette' 
AND e.temporada = '00/01') 'POSICION'
,
(SELECT FLOOR(SUM(e.puntos_por_partido)) 'CLAVE' 
FROM estadisticas e, jugadores j 
WHERE e.jugador = j.codigo 
AND j.Procedencia = 'argentina') 'CLAVE'

;

#################################################################
########### R E S U L T A D O      F I N A L ####################
#################################################################
#PRIMER PUNTO
SELECT
  (SELECT ROUND ( (  (SELECT count(j.nombre)
      FROM jugadores j, equipos e
      WHERE j.Nombre_equipo= e.Nombre
      AND Procedencia ='Michigan'
      AND e.conferencia ='West') #2

     /

      (SELECT COUNT(j.nombre)
      FROM jugadores j
      WHERE peso>=195)
     )
                    +0.9945)) 'POSICION'
        ,
  (SELECT SUM(j.peso) 'CLAVE' 
  FROM jugadores j, equipos e
  WHERE j.Nombre_equipo= e.Nombre
  AND e.conferencia='East' AND j.Posicion LIKE'%C%')'CLAVE'
UNION
#SEGUNDO PUNTO
SELECT
(SELECT COUNT(j.nombre) 'POSICION'
FROM jugadores j, estadisticas es
WHERE es.jugador= j.codigo
AND es.Asistencias_por_partido>(SELECT COUNT(j.nombre)
        FROM jugadores j
        WHERE j.nombre_equipo like 'Heat'))'POSICION',
(SELECT COUNT(TEMPORADA) 'CLAVE'
FROM PARTIDOS
WHERE TEMPORADA LIKE '%99%')'CLAVE'

#TERCER PUNTO
UNION
 SELECT
 (SELECT count(j.codigo) 'POSICION'
FROM jugadores j, estadisticas e 
WHERE j.codigo = e.jugador AND e.Asistencias_por_partido >= (SELECT MAX(Asistencias_por_partido)
                FROM estadisticas)) 'POSICION'
                                                                ,
(SELECT floor(AVG(e.Puntos_por_partido)+ COUNT(e.Asistencias_por_partido) + SUM(e.Tapones_por_partido)) 'CLAVE'
FROM estadisticas e, jugadores j, equipos eq
WHERE e.jugador = j.codigo 
AND eq.Nombre = j.Nombre_equipo 
AND eq.Division = 'central') 'CLAVE'

UNION

#CUARTO PUNTO
SELECT
(SELECT ROUND(e.tapones_por_partido) 'POSICION'
FROM estadisticas e,jugadores j
WHERE e.jugador = j.codigo 
AND j.Nombre = 'Corey Maggette' 
AND e.temporada = '00/01') 'POSICION'
,
(SELECT FLOOR(SUM(e.puntos_por_partido)) 'CLAVE' 
FROM estadisticas e, jugadores j 
WHERE e.jugador = j.codigo 
AND j.Procedencia = 'argentina') 'CLAVE'

;

