/*Abrir el script de la base de datos llamada “nba.sql” y
 ejecutarlo para crear todas las tablas e insertar datos en las mismas. 
 A continuación, generar el modelo de entidad relación.
 Deberá obtener un diagrama de entidad relación igual al que se muestra a continuación:*/
 show databases;
 use nba;
 show tables;
 
# A continuación, se deben realizar las siguientes consultas sobre la base de datos:
#1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.
SELECT * 
FROM jugadores 
order by nombre ASC;
SELECT nombre 
FROM jugadores 
order by nombre ASC;

#2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200 libras, ordenados por nombre alfabéticamente.
SELECT nombre, posicion 
FROM jugadores 
WHERE posicion LIKE "C";

#3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.
SELECT * 
FROM equipos 
ORDER BY nombre ASC;
SELECT nombre 
FROM equipos 
ORDER BY nombre ASC;

#4. Mostrar el nombre de los equipos del este (East).
SELECT nombre, conferencia 
FROM equipos 
WHERE conferencia LIKE "east";

#5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.
SELECT nombre, ciudad 
FROM equipos 
WHERE ciudad LIKE "c%";

#6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.
SELECT nombre, nombre_equipo 
FROM jugadores 
ORDER BY Nombre_equipo ASC, nombre ASC; 

#7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.
SELECT nombre, nombre_equipo 
FROM jugadores 
WHERE nombre_equipo IN('Raptors') 
ORDER BY nombre ASC;

#8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.
SELECT j.nombre, e.puntos_por_partido 
FROM estadisticas e 
INNER JOIN jugadores j 
ON j.codigo = e.jugador 
WHERE j.nombre = 'pau gasol';

#9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.
SELECT j.nombre, e.puntos_por_partido 
FROM estadisticas e 
INNER JOIN jugadores j 
ON j.codigo = e.jugador 
WHERE j.nombre = 'pau gasol'
AND e.temporada='04/05';

#10. Mostrar el número de puntos de cada jugador en toda su carrera.
SELECT j.nombre, TRUNCATE((sum(e.puntos_por_partido)),2) 'Puntos totales'
FROM estadisticas e 
INNER JOIN jugadores j 
ON j.codigo = e.jugador 
GROUP BY e.jugador, j.nombre
ORDER BY j.nombre AS;

#11. Mostrar el número de jugadores de cada equipo.
SELECT nombre_equipo'EQUIPO', count(*) 'JUGADORES' 
FROM jugadores 
GROUP BY Nombre_equipo;

#12. Mostrar el jugador que más puntos ha realizado en toda su carrera.
SELECT j.nombre, round(sum(e.puntos_por_partido)) 'Puntos totales'
FROM estadisticas e 
INNER JOIN jugadores j 
ON j.codigo = e.jugador 
GROUP BY e.jugador, j.nombre
ORDER BY round(sum(e.puntos_por_partido)) DESC
LIMIT 1;

#13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.
SELECT j.nombre, j.altura, e.nombre 'equipo', e.conferencia, e.division
FROM jugadores j
INNER JOIN equipos e
ON e.nombre=j.Nombre_equipo
ORDER BY j.Altura DESC
LIMIT 1;
USE nba;
#14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
#PROMEDIO PUNTOS POR PARTIDO POR EQUIPO

SELECT p.equipo_local, AVG(p.puntos_local+p.puntos_visitante) as 'Media_de_puntos'
FROM partidos as p
INNER JOIN equipos as e
ON p.equipo_local = e.nombre
WHERE e.division = 'Pacific'
GROUP BY p.equipo_local;

#15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.
SELECT max(abs(puntos_local - puntos_visitante)) "MAXIMA DIFERENCIA" from partidos;#PRIMERA CONSULTA
SELECT equipo_local "LOCAL", equipo_visitante "VISITANTE", abs(puntos_visitante - puntos_local) "DIFERENCIA DE PUNTOS"
FROM partidos
WHERE abs(puntos_visitante - puntos_local) = 
(SELECT max(abs(puntos_local - puntos_visitante)) from partidos);

#14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
#16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.
SELECT e.nombre, AVG(puntos_local)
FROM partidos p 
INNER JOIN equipos e 
ON e.Nombre = p.equipo_local 
WHERE e.Division = 'PACIFIC'
GROUP BY e.nombre;



#PROMEDIO PUNTOS POR PARTIDO
SELECT avg(puntos_local + puntos_visitante) 
FROM partidos p 
JOIN equipos e 
ON e.Nombre = p.equipo_local 
WHERE e.Division = 'PACIFIC';

#17. Mostrar los puntos de cada equipo en los partidos,tanto de local como de visitante.
	#PUNTOS DE CADA EQUIPO POR PARTIDO, TANTO DE LOCAL COMO VISITANTE
SELECT codigo, equipo_local AS Equipo, puntos_local AS Puntos
FROM partidos
UNION ALL SELECT codigo, equipo_visitante AS Equipo, puntos_visitante AS Puntos
FROM partidos
ORDER BY Equipo, codigo;

	#PUNTOS POR PARTIDO
SELECT equipo_local, equipo_visitante, puntos_local, puntos_visitante
FROM partidos 
ORDER BY equipo_local, equipo_visitante;

	#PUNTOS TOTALES DE CADA EQUIPO, TANTO DE LOCAL COMO DE VISITANTE
    #PUNTOS DE LOCAL
SELECT equipo_local AS Equipo,
		SUM(puntos_local) AS Total 
		FROM partidos
		GROUP BY Equipo;
	#PUNTOS DE VISITANTE
SELECT equipo_visitante      AS Equipo,
				SUM(puntos_visitante) AS Total
				FROM partidos
				GROUP BY Equipo;
                
    #APLICANDO UNION
SELECT Equipo, SUM(Total)
FROM (SELECT equipo_local AS Equipo,
		SUM(puntos_local) AS Total 
		FROM partidos
		GROUP BY Equipo
		UNION
				SELECT equipo_visitante      AS Equipo,
				SUM(puntos_visitante) AS Total
				FROM partidos
				GROUP BY Equipo) AS TEMP
GROUP BY Equipo;


use nba;
#18. Mostrar quien gana en cada partido(codigo,equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.
SELECT codigo "CODIGO", equipo_local "LOCAL", equipo_visitante "VISITANTE",
CASE
	WHEN puntos_local > puntos_visitante THEN equipo_local
    WHEN puntos_local < puntos_visitante THEN equipo_visitante
    WHEN puntos_local = puntos_visitante THEN NULL
    END AS GANADOR
FROM partidos
ORDER BY codigo;




SELECT 
distinct p.codigo,p.equipo_local, p.equipo_visitante,
if(puntos_local=puntos_visitante, "EMPATE", 
if(puntos_local>puntos_visitante, p.equipo_local, p.equipo_visitante)) 'GANADOR'
FROM partidos p, equipos e;




