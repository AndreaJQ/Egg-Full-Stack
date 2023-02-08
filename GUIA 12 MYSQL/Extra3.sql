/*Importar el script de la base de datos llamada “pokemondb.sql” y 
ejecutarlo para crear todas las tablas e insertar los registros en las mismas. 
A continuación, generar el modelo de entidad relación y reorganizar las tablas para mayor claridad de sus relaciones. 
Deberá obtener un diagrama de entidad de relación similar al que se muestra a continuación:*/

SHOW DATABASES;
use pokemondb;
SHOW TABLES;
#A continuación, se deben realizar las siguientes consultas:
#1. Mostrar el nombre de todos los pokemon.
SELECT nombre
FROM pokemon;

#2. Mostrar los pokemon que pesen menos de 10k.
SELECT nombre, peso
FROM pokemon
WHERE peso<10;

#3. Mostrar los pokemon de tipo agua.
-- pokemon (numero_pokedex) pokemon_tipo (numero_pokedex id_tipo)  tipo (id_tipo)
SELECT p.nombre'NOMBRE', t.nombre 'TIPO'
FROM pokemon p
INNER JOIN pokemon_tipo pt
ON p.numero_pokedex= pt.numero_pokedex
INNER JOIN tipo t
ON pt.id_tipo = t.id_tipo
WHERE t.nombre='Agua';


#4. Mostrar los pokemon de tipo agua, fuego o tierra ordenados por tipo.
SELECT p.nombre'NOMBRE', t.nombre 'TIPO'
FROM pokemon p
INNER JOIN pokemon_tipo pt
ON p.numero_pokedex= pt.numero_pokedex
INNER JOIN tipo t
ON pt.id_tipo = t.id_tipo
WHERE t.nombre IN ('Agua','Fuego','Tierra')
ORDER BY t.nombre asc;

#5. Mostrar los pokemon que son de tipo fuego y volador.
SELECT p.nombre'NOMBRE', t.nombre 'TIPO'
FROM pokemon p
INNER JOIN pokemon_tipo pt
ON p.numero_pokedex= pt.numero_pokedex
INNER JOIN tipo t
ON pt.id_tipo = t.id_tipo
WHERE t.nombre IN ('Fuego','Volador');

#6. Mostrar los pokemon con una estadística base de ps mayor que 200.
-- pokemon (numero_pokedex) estadistica_base (numero_pokedex - ps)
SELECT p.nombre, eb.ps
FROM pokemon p
INNER JOIN estadisticas_base eb
ON p.numero_pokedex= eb.numero_pokedex
WHERE eb.ps>200;

#7. Mostrar los datos (nombre, peso, altura) de la prevolución de Arbok.
SELECT p.nombre, p.altura, p.peso
FROM pokemon p, evoluciona_de ev
WHERE p.numero_pokedex = ev.pokemon_origen
AND ev.pokemon_evolucionado = (SELECT numero_pokedex 
                    FROM pokemon 
                    WHERE LOWER(nombre) = 'arbok');

#8. Mostrar aquellos pokemon que evolucionan por intercambio.
SELECT p.nombre
FROM pokemon p, pokemon_forma_evolucion pfe, 
forma_evolucion fe, tipo_evolucion te
WHERE p.numero_pokedex = pfe.numero_pokedex 
AND pfe.id_forma_evolucion = fe.id_forma_evolucion
AND fe.tipo_evolucion = te.id_tipo_evolucion
AND lower(te.tipo_evolucion) = 'intercambio';

#9. Mostrar el nombre del movimiento con más prioridad.
SELECT nombre
FROM movimiento mov
WHERE prioridad = (SELECT max(prioridad) 
             FROM movimiento);

#10. Mostrar el pokemon más pesado.
SELECT nombre, peso
FROM pokemon
WHERE peso = (SELECT MAX(peso)
				FROM pokemon);

#11. Mostrar el nombre y tipo del ataque con más potencia.
SELECT m.nombre 'movimiento' ,t.nombre 'tipo', m.potencia
FROM movimiento m, tipo t
WHERE m.id_tipo = t.id_tipo
AND m.potencia = (SELECT max(potencia) 
           FROM movimiento);

#12. Mostrar el número de movimientos de cada tipo.
SELECT id_tipo, count(id_tipo)
FROM movimiento
GROUP BY id_tipo;

SELECT t.nombre 'tipo', count(m.id_tipo)
FROM tipo t , movimiento m
WHERE m.id_tipo=t.id_tipo
GROUP BY t.nombre;

#13. Mostrar todos los movimientos que puedan envenenar.
-- movimiento(nombre.  id_movimiento)		movimiento_efecto_secundario(id_efecto_secundario)  efecto_secundario(efecto_secundario=envenenamiento leve)
SELECT m.nombre, es.efecto_secundario
FROM movimiento m, movimiento_efecto_secundario mes, efecto_secundario es
WHERE m.id_movimiento = mes.id_movimiento and mes.id_efecto_secundario=es.id_efecto_secundario
and es.efecto_secundario='Envenenamiento leve';


#14. Mostrar todos los movimientos que causan daño, ordenados alfabéticamente por nombre.
-- movimiento (descripcion=causa_daño)
SELECT nombre
FROM movimiento
WHERE descripcion='Causa daño'
ORDER BY nombre asc;

#15. Mostrar todos los movimientos que aprende pikachu.
SELECT DISTINCT m.nombre
FROM movimiento m, pokemon p, pokemon_movimiento_forma pmf
WHERE p.numero_pokedex= pmf.numero_pokedex 
AND pmf.id_movimiento= m.id_movimiento
AND p.nombre='pikachu';




#16. Mostrar todos los movimientos que aprende pikachu por MT (tipo de aprendizaje).
select distinct m.nombre
from movimiento m, pokemon p, pokemon_movimiento_forma pmf, forma_aprendizaje fa, tipo_forma_aprendizaje tfa
where p.numero_pokedex = pmf.numero_pokedex 
and pmf.id_movimiento = m.id_movimiento
and pmf.id_forma_aprendizaje = fa.id_forma_aprendizaje
and fa.id_tipo_aprendizaje = tfa.id_tipo_aprendizaje
and lower(tfa.tipo_aprendizaje) = 'mt'
and lower(p.nombre) = 'pikachu';


#17. Mostrar todos los movimientos de tipo normal que aprende pikachu por nivel.
select distinct m.nombre
from movimiento m, pokemon p, 
pokemon_movimiento_forma pmf, 
forma_aprendizaje fa, 
tipo_forma_aprendizaje tfa,
tipo t
where p.numero_pokedex = pmf.numero_pokedex 
and pmf.id_movimiento = m.id_movimiento
and pmf.id_forma_aprendizaje = fa.id_forma_aprendizaje
and fa.id_tipo_aprendizaje = tfa.id_tipo_aprendizaje
and m.id_tipo = t.id_tipo
and lower(t.nombre) = 'normal'
and lower(tfa.tipo_aprendizaje) = 'nivel'
and lower(p.nombre) = 'pikachu';


#18. Mostrar todos los movimientos de efecto secundario cuya probabilidad sea mayor al 30%.





#19. Mostrar todos los pokemon que evolucionan por piedra.
create or replace view pokemon_evolucion_piedra as
select distinct p.numero_pokedex, p.nombre
from pokemon p, pokemon_forma_evolucion pfe, 
forma_evolucion fe, tipo_evolucion te
where p.numero_pokedex = pfe.numero_pokedex 
and pfe.id_forma_evolucion = fe.id_forma_evolucion
and fe.tipo_evolucion = te.id_tipo_evolucion
and lower(te.tipo_evolucion) = 'piedra';
 
select * from pokemon_evolucion_piedra;



#20. Mostrar todos los pokemon que no pueden evolucionar.
create or replace view pokemon_no_evolucionan as
select p.numero_pokedex, p.nombre
from pokemon p, evoluciona_de ev
where p.numero_pokedex = ev.pokemon_evolucionado
and not exists (select pokemon_origen from evoluciona_de where pokemon_origen = p.numero_pokedex)
union
select p.numero_pokedex, p.nombre
from pokemon p
where not exists (select * 
           from evoluciona_de 
           where pokemon_origen = p.numero_pokedex or pokemon_evolucionado = p.numero_pokedex);
                     
select * from pokemon_no_evolucionan;



#21. Mostrar la cantidad de los pokemon de cada tipo.
create or replace view cantidad_tipo_pokemon as
select t.nombre as tipo, count(*) as cantidad
from pokemon p, pokemon_tipo pt, tipo t
where p.numero_pokedex = pt.numero_pokedex
and pt.id_tipo = t.id_tipo
group by t.nombre;
 
select * from cantidad_tipo_pokemon;
