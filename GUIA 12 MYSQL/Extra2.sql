/*Abrir el script de la base de datos llamada “jardineria.sql” y ejecutarlo para crear 
todas las tablas e insertar datos en las mismas. Deberá obtener un diagrama de entidad relación igual al que se muestra a continuación:*/
SHOW DATABASES;
USE JARDINERIA;
SHOW TABLES;


#A continuación, se deben realizar las siguientes consultas sobre la base de datos:
#Consultas sobre una tabla
#1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.
SELECT codigo_oficina, ciudad 
FROM oficina;

#2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.
SELECT ciudad, telefono
FROM oficina
WHERE ciudad;

#3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.
SELECT nombre 'NOMBRE', concat(apellido1,' ', apellido2) 'APELLIDO', email
FROM empleado
WHERE codigo_jefe = 7;

#4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.
#el jefe tambien es empleado, y el código de jefe corresponde a un código de empleado / EL JEFE NO TIENE JEFE =)
SELECT puesto 'PUESTO', nombre 'NOMBRE', concat(apellido1,' ', apellido2) 'APELLIDO', email 'EMAIL'
FROM empleado
WHERE codigo_jefe is null;

#5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.
SELECT puesto 'PUESTO', nombre 'NOMBRE', concat(apellido1,' ', apellido2) 'APELLIDO'
FROM empleado
WHERE puesto NOT LIKE "representante ventas";

#6. Devuelve un listado con el nombre de los todos los clientes españoles.
SELECT nombre_cliente 'CLIENTES ESPAÑOLES'
FROM cliente
WHERE pais LIKE "Spain";

#7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.
SELECT estado 'ESTADO'
FROM pedido
GROUP BY estado;


#8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. 
#Tenga en cuenta que deberá eliminar aquellos códigos de cliente que aparezcan repetidos. Resuelva la consulta:
#o Utilizando la función YEAR de MySQL.
SELECT DISTINCT codigo_cliente 
FROM pago
WHERE YEAR(fecha_pago)=2008;

#o Utilizando la función DATE_FORMAT de MySQL. 
SELECT DISTINCT codigo_cliente
FROM pago
WHERE DATE_FORMAT(fecha_pago,"%Y")=2008;

#o Sin utilizar ninguna de las funciones anteriores.
SELECT DISTINCT codigo_cliente 
FROM pago
WHERE fecha_pago BETWEEN ("2008-01-01") AND ("2008-12-31");


#9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega 
#de los pedidos que no han sido entregados a tiempo.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
FROM pedido
WHERE estado NOT LIKE "entregado";

#10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega
# de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada.
#o Utilizando la función ADDDATE de MySQL.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
FROM pedido
WHERE fecha_entrega >= adddate(fecha_esperada, interval 2 day);#AL MENOS 2 DÍAS MAYOR O IGUAL A 2 DÍAS

#o Utilizando la función DATEDIFF de MySQL.
SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega
FROM pedido
WHERE DATEDIFF(fecha_entrega, fecha_esperada)>=2;

#11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.
SELECT *
FROM pedido
WHERE YEAR (fecha_pedido)= 2009
AND estado LIKE "rechazado";

#12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.
SELECT *
FROM pedido
WHERE month(fecha_pedido)=1;

#13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal.
# Ordene el resultado de mayor a menor.
SELECT *
FROM pago
WHERE year(fecha_pago)=2008
AND forma_pago LIKE "PayPal"
ORDER BY fecha_pago asc;

#14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago.
#Tenga en cuenta que no deben aparecer formas de pago repetidas.
SELECT DISTINCT forma_pago 'FORMA DE PAGO'
FROM pago
ORDER BY forma_pago asc;

#15. Devuelve un listado con todos los productos que pertenecen a la gama Ornamentales y 
#que tienen más de 100 unidades en stock. 
#El listado deberá estar ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.
SELECT *
FROM producto
WHERE gama LIKE "Ornamentales" 
AND cantidad_en_stock>=100
ORDER BY precio_venta DESC;

#16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid 
#y cuyo representante de ventas tenga el código de empleado 11 o 30.
SELECT *
FROM cliente
WHERE ciudad LIKE 'Madrid'
AND codigo_empleado_rep_ventas IN(11,30);

####Consultas multitabla (Composición interna)
#Las consultas se deben resolver con INNER JOIN.
#1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.
SELECT c.nombre_cliente 'NOMBRE CLIENTE', concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'NOMBRE y APELLIDO RV'
FROM cliente c
INNER JOIN empleado e
ON e.codigo_empleado=c.codigo_empleado_rep_ventas;

#2. Muestra el nombre de los clientes que hayan realizado pagos junto con el nombre de sus representantes de ventas.
#inner join de 3 tablas https://es.stackoverflow.com/questions/52156/mysql-join-inner-join-3-tablas
SELECT c.nombre_cliente 'NOMBRE CLIENTE', concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'NOMBRE y APELLIDO RV'
FROM cliente c
INNER JOIN pago p
ON c.codigo_cliente = p.codigo_cliente
INNER JOIN empleado e
ON e.codigo_empleado=c.codigo_empleado_rep_ventas;

#3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.
SELECT c.nombre_cliente 'NOMBRE CLIENTE', concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'NOMBRE y APELLIDO RV'
FROM cliente c
INNER JOIN pago p
ON c.codigo_cliente = p.codigo_cliente
INNER JOIN empleado e
ON e.codigo_empleado=c.codigo_empleado_rep_ventas
WHERE p.fecha_pago IS NULL;

#4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes 
#junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente 'NOMBRE CLIENTE', concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'NOMBRE y APELLIDO RV', o.ciudad 'CIUDAD OFICINA RV'
FROM cliente c
INNER JOIN pago p
ON c.codigo_cliente = p.codigo_cliente
INNER JOIN empleado e
ON e.codigo_empleado=c.codigo_empleado_rep_ventas
INNER JOIN oficina o
ON o.codigo_oficina= e.codigo_oficina;

#5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus representantes 
#junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente 'NOMBRE CLIENTE', concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'NOMBRE y APELLIDO RV',o.ciudad 'CIUDAD OFICINA RV'
FROM cliente c
INNER JOIN pago p
ON c.codigo_cliente = p.codigo_cliente
INNER JOIN empleado e
ON e.codigo_empleado=c.codigo_empleado_rep_ventas
INNER JOIN oficina o
ON o.codigo_oficina= e.codigo_oficina
WHERE p.fecha_pago IS NULL;

#6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
SELECT c.nombre_cliente 'NOMBRE CLIENTE', c.linea_direccion2 'DIRECCION CLIENTE',o.codigo_oficina 'COD OFICINA', o.linea_direccion1 'DIRECCION OFICINA', o.ciudad 'CIUDAD'
FROM cliente c
INNER JOIN empleado e
ON e.codigo_empleado=c.codigo_empleado_rep_ventas
INNER JOIN oficina o
ON o.codigo_oficina= e.codigo_oficina
WHERE c.linea_direccion2 LIKE 'Fuenlabrada';

#7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la ciudad de la oficina a la que pertenece el representante.
SELECT c.nombre_cliente 'NOMBRE CLIENTE', concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'NOMBRE y APELLIDO RV',o.ciudad 'CIUDAD OFICINA RV'
FROM cliente c
INNER JOIN empleado e
ON e.codigo_empleado=c.codigo_empleado_rep_ventas
INNER JOIN oficina o
ON o.codigo_oficina= e.codigo_oficina;

#8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
#el jefe tambien es empleado, y el código de jefe corresponde a un código de empleado
SELECT *
FROM empleado;

SELECT concat(nombre, ' ', apellido1,' ', apellido2) 'EMPLEADO',
		codigo_empleado, 
        codigo_jefe,
		(SELECT concat(nombre, ' ', apellido1,' ', apellido2) FROM empleado WHERE e.codigo_jefe = codigo_empleado) 'JEFE'
FROM empleado e;

#9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
SELECT c.nombre_cliente, p.fecha_esperada, p.fecha_entrega
FROM cliente c 
INNER JOIN pedido p
ON c.codigo_cliente= p.codigo_cliente
WHERE p.fecha_entrega>p.fecha_esperada;


#10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
#cliente (nombre y codigo_cliente)
-- > pedido (codigo_cliente y codigo_pedido) 
-- > detalle pedido(codigo_pedido y codigo_producto) 
-- > producto (codigo_producto y gama)
-- > gama_producto (gama)
SELECT distinct c.nombre_cliente 'NOMBRE CLIENTE',  g.gama 'GAMA'
FROM cliente c
INNER JOIN pedido p
ON c.codigo_cliente= p.codigo_cliente
INNER JOIN detalle_pedido dp
ON p.codigo_pedido= dp.codigo_pedido
INNER JOIN producto prod
ON prod.codigo_producto = dp.codigo_producto
INNER JOIN gama_producto g
ON g.gama= prod.gama;

SELECT c.nombre_cliente 'NOMBRE CLIENTE',  prod.gama 'GAMA'
FROM cliente c
INNER JOIN pedido p
ON c.codigo_cliente= p.codigo_cliente
INNER JOIN detalle_pedido dp
ON p.codigo_pedido= dp.codigo_pedido
INNER JOIN producto prod
ON prod.codigo_producto = dp.codigo_producto
GROUP BY c.nombre_cliente, prod.gama;

####Consultas multitabla (Composición externa)
#Resuelva todas las consultas utilizando las cláusulas LEFT JOIN, RIGHT JOIN, JOIN.
-- SELECT nombre/s de la/s columna/s FROM tabla1 LEFT JOIN tabla2 ON tabla1.nombre_columna = tabla2.nombre_columna;
-- SELECT Nombre, Nombre_curso 
-- FROM Profesores 
-- LEFT JOIN Cursos 
-- ON Profesores.Id = Cursos.Id_profesor;

-- SELECT nombre/s de la/s columna/s FROM tabla1 RIGHT JOIN tabla2 ON tabla1.nombre_columna = tabla2.nombre_columna;
-- SELECT Nombre, Nombre_curso FROM Profesores RIGHT JOIN Cursos ON Profesores.Id = Cursos.Id_profesor;

#1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT c.codigo_cliente, c.nombre_cliente 'CLIENTE'
FROM cliente c
LEFT JOIN pago p
ON c.codigo_cliente = p.codigo_cliente
WHERE p.codigo_cliente IS NULL;

#2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pedido.
SELECT c.codigo_cliente, c.nombre_cliente 'CLIENTE'
FROM cliente c
LEFT JOIN pedido p
ON c.codigo_cliente = p.codigo_cliente
WHERE p.codigo_cliente IS NULL;

#3. Devuelve un listado que muestre los clientes que no han realizado ningún pago y los que no han realizado ningún pedido.
SELECT c.codigo_cliente, c.nombre_cliente 'CLIENTE'
FROM cliente c
LEFT JOIN pago p
ON c.codigo_cliente = p.codigo_cliente
WHERE p.codigo_cliente IS NULL
UNION 									#SOLO PONER UNION Y UNE LAS CONDICIONES DE PUNTOS 1 Y 2
SELECT c.codigo_cliente, c.nombre_cliente 'CLIENTE'
FROM cliente c
LEFT JOIN pedido p
ON c.codigo_cliente = p.codigo_cliente
WHERE p.codigo_cliente IS NULL;

SELECT DISTINCT(c.codigo_cliente), c.nombre_cliente
FROM cliente c
LEFT JOIN pedido p1
ON p1.codigo_cliente = c.codigo_cliente
LEFT JOIN pago as p2
ON p2.codigo_cliente = c.codigo_cliente
WHERE (p1.codigo_cliente IS NULL) OR (p2.codigo_cliente IS NULL);

#4. Devuelve un listado que muestre solamente los empleados que no tienen una oficina asociada.
SELECT codigo_oficina
FROM oficina; # 9 oficinas

SELECT DISTINCT codigo_oficina
FROM empleado; # 9 oficinas

SELECT concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'EMPLEADO', o.codigo_oficina
FROM empleado e
LEFT JOIN oficina o
ON e.codigo_oficina= o.codigo_oficina
WHERE e.codigo_oficina is null; #ninguna empleado que no tenga oficina asociada


#5. Devuelve un listado que muestre solamente los empleados que no tienen un cliente asociado.
SELECT concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'EMPLEADO', c.codigo_cliente
FROM empleado e
RIGHT JOIN cliente c
ON c.codigo_empleado_rep_ventas= e.codigo_empleado
WHERE c.codigo_cliente is null;


#6. Devuelve un listado que muestre los empleados que no tienen una oficina asociada y los que no tienen un cliente asociado.
SELECT concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'EMPLEADO', o.codigo_oficina
FROM empleado e
LEFT JOIN oficina o
ON e.codigo_oficina= o.codigo_oficina
WHERE e.codigo_oficina is null #ninguna empleado que no tenga oficina asociada
UNION
SELECT concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'EMPLEADO', c.codigo_cliente
FROM empleado e
RIGHT JOIN cliente c
ON c.codigo_empleado_rep_ventas= e.codigo_empleado
WHERE c.codigo_cliente is null;

#7. Devuelve un listado de los productos que nunca han aparecido en un pedido.
-- productos (codigo_producto) -> pedido -> detalle_pedido(codigo_pedido y codigo_producto)
SELECT*FROM pedido;
SELECT DISTINCT codigo_pedido FROM detalle_pedido; #115 pedidos 115 distinct codigos en detalles 
-- entonces uso tabla detalle_pedido que contiene codigo producto y codigo pedido

SELECT p.nombre, p.codigo_producto, dp.codigo_pedido
FROM producto p
LEFT JOIN detalle_pedido dp
ON p.codigo_producto = dp.codigo_producto
WHERE dp.codigo_pedido is NULL;

#8. Devuelve las oficinas donde no trabajan ninguno de los empleados que hayan sido los representantes de ventas 
#de algún cliente que haya realizado la compra de algún producto de la gama Frutales.
-- oficina ->empleados -> clientes (cod empleados)-> pedido(cod pedido y cod prod)-> producto(gama)
SELECT codigo_oficina
FROM empleado
WHERE puesto="representante ventas" ;

SELECT distinct codigo_oficina, c.nombre_cliente, prod.gama
FROM empleado e
INNER JOIN cliente c
ON c.codigo_empleado_rep_ventas= e.codigo_empleado
INNER JOIN pedido p
ON c.codigo_cliente= p.codigo_cliente
INNER JOIN detalle_pedido dp
ON p.codigo_pedido= dp.codigo_pedido
INNER JOIN producto prod
ON prod.codigo_producto = dp.codigo_producto
WHERE prod.gama="frutales" and e.puesto <>"representante ventas";

#9. Devuelve un listado con los clientes que han realizado algún pedido, pero no han realizado ningún pago.
-- cliente -> pago(cod_cliente) -> pedido cod cliente
SELECT DISTINCT codigo_cliente
FROM cliente; # 36 clientes
SELECT DISTINCT codigo_cliente
FROM pago; #18 clientes
SELECT DISTINCT codigo_cliente
FROM pedido; # 19 clientes

SELECT distinct c.codigo_cliente, ped.codigo_pedido, c.nombre_cliente
FROM  pedido ped
RIGHT JOIN cliente c
ON c.codigo_cliente= ped.codigo_cliente
RIGHT JOIN pago p
ON ped.codigo_cliente = p.codigo_cliente
WHERE p.codigo_cliente != p.codigo_cliente#?????????????
order by codigo_cliente asc
;

#10. Devuelve un listado con los datos de los empleados que no tienen clientes asociados y el nombre de su jefe asociado.


USE JARDINERIA;

SELECT e.nombre
FROM empleado e;


SELECT e.nombre 'NOMBRE', concat(e.apellido1,' ', e.apellido2) 'APELLIDO'
FROM empleado e, cliente c, oficina o
WHERE e.codigo_empleado NOT IN (c.codigo_empleado_rep_ventas)
AND e.codigo_oficina= o.codigo_oficina;

#??????????????????????????????
SELECT DISTINCT e.codigo_empleado, e.nombre
FROM empleado e
WHERE (

SELECT DISTINCT e.codigo_empleado, e.nombre
FROM empleado e, cliente c
WHERE c.codigo_empleado_rep_ventas = e.codigo_empleado); #11 empleados vinculados y los otros 20???


####Consultas resumen
#1. ¿Cuántos empleados hay en la compañía?
SELECT count(*) 'CANTIDAD DE EMPLEADOS'
FROM empleado;

#2. ¿Cuántos clientes tiene cada país?
SELECT pais 'PAIS', count(codigo_cliente) 'CLIENTES'
FROM cliente
GROUP BY pais; 

#3. ¿Cuál fue el pago medio en 2009?
SELECT AVG( total) 'PAGO MEDIO 2009'
FROM pago
WHERE year(fecha_pago)=2009;

#4. ¿Cuántos pedidos hay en cada estado? Ordena el resultado de forma descendente por el número de pedidos.
SELECT estado 'ESTADO', count(codigo_pedido) 'PEDIDOS'
FROM pedido
GROUP BY estado; 


#5. Calcula el precio de venta del producto más caro y más barato en una misma consulta.
SELECT MAX(total)'PAGO MÁXIMO', MIN(total) 'PAGO MINIMO'
from pago;

#6. Calcula el número de clientes que tiene la empresa.
SELECT COUNT(*) 'CLIENTES'
from cliente;

#7. ¿Cuántos clientes tiene la ciudad de Madrid?
SELECT ciudad 'CIUDAD', count(codigo_cliente) 'CLIENTES'
FROM cliente
WHERE ciudad ='madrid'; 

#8. ¿Calcula cuántos clientes tiene cada una de las ciudades que empiezan por M?
SELECT ciudad ,count(ciudad)'cantidad de clientes'
FROM cliente
WHERE ciudad REGEXP '^M'
GROUP BY ciudad;

#9. Devuelve el nombre de los representantes de ventas y el número de clientes al que atiende cada uno.
-- cliente (codigo_cliente - codigo_empleado_rep_ventas) -> empleado (codigo_empleado - puesto - nombre del empleado)
SELECT concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'EMPLEADO', e.puesto, count(c.codigo_empleado_rep_ventas)'CLIENTES'
FROM empleado e
INNER JOIN cliente c
ON c.codigo_empleado_rep_ventas= e.codigo_empleado
WHERE puesto='representante ventas'
GROUP BY c.codigo_empleado_rep_ventas;

SELECT concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'EMPLEADO', e.puesto, c.codigo_empleado_rep_ventas'cod_empleado', c.codigo_cliente
FROM empleado e
INNER JOIN cliente c
ON c.codigo_empleado_rep_ventas= e.codigo_empleado
WHERE puesto='Representante ventas';

#10. Calcula el número de clientes que no tiene asignado representante de ventas.
SELECT concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'EMPLEADO', e.puesto, c.codigo_empleado_rep_ventas'cod_empleado', c.codigo_cliente
FROM empleado e
INNER JOIN cliente c
ON c.codigo_empleado_rep_ventas= e.codigo_empleado
WHERE puesto not like 'Representante ventas';

#11. Calcula la fecha del primer y último pago realizado por cada uno de los clientes. 
#El listado deberá mostrar el nombre y los apellidos de cada cliente.
-- pago (codigo_cliente   - fecha_ pago) -> cliente (cod_cliente  - nombre)

SELECT p.codigo_cliente 
FROM pago p;

SELECT distinct p.codigo_cliente
FROM pago p;

SELECT MAX(FECHA_PAGO),MIN(FECHA_PAGO)
FROM PAGO;

SELECT DATEDIFF(max(fecha_pago), min(fecha_pago)) 
from pago p;

SELECT DATEDIFF(max(fecha_pago), min(fecha_pago)), p.codigo_cliente, concat(c.nombre_contacto,' ', apellido_contacto) 'CLIENTE'
from pago p
inner join cliente c
on c.codigo_cliente=p.codigo_cliente
WHERE p.codigo_cliente in(1);
--                    FALTA TERMINAR   --------- ?????????? CÓMO VINCULO???????

#12. Calcula el número de productos diferentes que hay en cada uno de los pedidos.

SELECT dp.codigo_pedido, count(distinct dp.codigo_producto)'cantidad'
FROM detalle_pedido dp
group by dp.codigo_pedido;

-- nombre de los productos y códoigo de pedido
-- pedidos ( codigo_pedido). -> detalle_pedido (codigo_pedido . codigo_producto) -> producto
SELECT distinct dp.codigo_producto, prod.nombre, p.codigo_pedido
FROM detalle_pedido dp
INNER JOIN pedido p
ON p.codigo_pedido = dp.codigo_pedido
INNER JOIN producto prod
ON prod.codigo_producto = dp.codigo_producto
order by p.codigo_pedido asc;


#13. Calcula la suma de la cantidad total de todos los productos que aparecen en cada uno de los pedidos.
SELECT dp.codigo_pedido, count(distinct dp.codigo_producto)'cantidad'
FROM detalle_pedido dp
group by dp.codigo_pedido;

#14. Devuelve un listado de los 20 productos más vendidos y el número total de unidades que se han vendido de cada uno. 
#El listado deberá estar ordenado por el número total de unidades vendidas.


#15. La facturación que ha tenido la empresa en toda la historia, indicando la base imponible, el IVA y el total facturado. La base imponible se calcula sumando el coste del producto por el número de unidades vendidas de la tabla detalle_pedido. El IVA es el 21 % de la base imponible, y el total la suma de los dos campos anteriores.


#16. La misma información que en la pregunta anterior, pero agrupada por código de producto.


#17. La misma información que en la pregunta anterior, pero agrupada por código de producto filtrada por los códigos que empiecen por OR.


#18. Lista las ventas totales de los productos que hayan facturado más de 3000 euros. Se mostrará el nombre, unidades vendidas, total facturado y total facturado con impuestos (21% IVA)

use jardineria;


####Subconsultas con operadores básicos de comparación
#1. Devuelve el nombre del cliente con mayor límite de crédito.
SELECT limite_credito, nombre_cliente
FROM cliente
order by limite_credito desc
limit 1;

#2. Devuelve el nombre del producto que tenga el precio de venta más caro.
SELECT nombre, precio_venta
FROM producto
WHERE precio_venta =(SELECT max(precio_venta)
FROM producto);

#3. Devuelve el nombre del producto del que se han vendido más unidades. (Tenga en cuenta que tendrá que calcular cuál es el número total de unidades que se han vendido de cada producto a partir de los datos de la tabla detalle_pedido. Una vez que sepa cuál es el código del producto, puede obtener su nombre fácilmente.)
SELECT max(cantidad)
FROM detalle_pedido; #MAXIMA CANTIDAD

SELECT codigo_producto
FROM detalle_pedido
WHERE cantidad= (SELECT max(cantidad)
FROM detalle_pedido); #CÓDIGO DE PRODUCTO


SELECT nombre
FROM producto
WHERE codigo_producto=
					(SELECT codigo_producto
					FROM detalle_pedido
					WHERE cantidad= (SELECT max(cantidad)
										FROM detalle_pedido));

#4. Los clientes cuyo límite de crédito sea mayor que los pagos que haya realizado. (Sin utilizar INNER JOIN).
SELECT p.codigo_cliente,c.nombre_cliente, p.total,'<', c.limite_credito
FROM pago p , cliente c
WHERE c.codigo_cliente=p.codigo_cliente
AND c.limite_credito>(p.total);



#5. Devuelve el producto que más unidades tiene en stock.
SELECT nombre, cantidad_en_stock
FROM producto
WHERE cantidad_en_stock=(SELECT max(cantidad_en_stock)
FROM producto);

#6. Devuelve el producto que menos unidades tiene en stock.
SELECT nombre, cantidad_en_stock
FROM producto
WHERE cantidad_en_stock=(SELECT min(cantidad_en_stock)
FROM producto);


#7. Devuelve el nombre, los apellidos y el email de los empleados que están a cargo de Alberto Soria.
SELECT concat(e.nombre, ' ', e.apellido1,' ', e.apellido2) 'EMPLEADO',e.email 'EMAIL'
from empleado e
WHERE e.codigo_jefe=(SELECT codigo_empleado
					from empleado
					WHERE nombre = 'Alberto');


####Subconsultas con ALL y ANY
/* SELECT column_name(s)
FROM table_name
WHERE column_name operator ANY
  (SELECT column_name
  FROM table_name
  WHERE condition);*/
#1. Devuelve el nombre del cliente con mayor límite de crédito.
SELECT nombre_cliente
FROM cliente
WHERE limite_credito =ANY(SELECT max(limite_credito)
FROM cliente);


#2. Devuelve el nombre del producto que tenga el precio de venta más caro.
SELECT nombre, precio_venta
FROM producto
WHERE precio_venta =ANY(SELECT max(precio_venta)
FROM producto);

#3. Devuelve el producto que menos unidades tiene en stock.
SELECT nombre, cantidad_en_stock
FROM producto
WHERE cantidad_en_stock =ANY(SELECT min(cantidad_en_stock)
FROM producto);

####Subconsultas con IN y NOT IN
/*SELECT column_name(s)
FROM table_name
WHERE column_name IN (value1, value2, ...);*/

#1. Devuelve el nombre, apellido1 y cargo de los empleados que no representen a ningún cliente.
SELECT distinct e.puesto 'PUESTO', e.nombre 'NOMBRE', concat(e.apellido1,' ', e.apellido2) 'APELLIDO'
FROM empleado e, cliente c
WHERE e.codigo_empleado NOT IN (c.codigo_empleado_rep_ventas);

#2. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT distinct c.nombre_cliente
FROM cliente c, pago p
WHERE c.codigo_cliente NOT IN (p.codigo_cliente);

#3. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
SELECT DISTINCT c.nombre_cliente
FROM cliente c, pago p
WHERE c.codigo_cliente IN (p.codigo_cliente);

#4. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT *
FROM producto p, detalle_producto dp
WHERE p.codigo_producto NOT IN(dp.codigo_producto);

#5. Devuelve el nombre, apellidos, puesto y teléfono de la oficina de aquellos empleados que no sean representante de ventas de ningún cliente.
SELECT distinct e.puesto 'PUESTO', e.nombre 'NOMBRE', concat(e.apellido1,' ', e.apellido2) 'APELLIDO', o.telefono'TEFELONO'
FROM empleado e, cliente c, oficina o
WHERE e.codigo_empleado NOT IN (c.codigo_empleado_rep_ventas)
AND e.codigo_oficina= o.codigo_oficina;

#####Subconsultas con EXISTS y NOT EXISTS
/*SELECT column_name(s)
FROM table_name
WHERE EXISTS
(SELECT column_name FROM table_name WHERE condition);*/
#1. Devuelve un listado que muestre solamente los clientes que no han realizado ningún pago.
SELECT *
FROM cliente c
WHERE not EXISTS(SELECT p.codigo_cliente FROM pago p WHERE c.codigo_cliente= p.codigo_cliente);

#2. Devuelve un listado que muestre solamente los clientes que sí han realizado ningún pago.
SELECT *
FROM cliente c
WHERE EXISTS(SELECT p.codigo_cliente FROM pago p WHERE c.codigo_cliente= p.codigo_cliente);

#3. Devuelve un listado de los productos que nunca han aparecido en un pedido.
SELECT * 
FROM producto p
WHERE NOT EXISTS(SELECT dp.codigo_producto FROM detalle_pedido dp WHERE dp.codigo_producto= p.codigo_producto);

#4. Devuelve un listado de los productos que han aparecido en un pedido alguna vez.
SELECT * 
FROM producto p
WHERE  EXISTS(SELECT dp.codigo_producto FROM detalle_pedido dp WHERE dp.codigo_producto= p.codigo_producto);
