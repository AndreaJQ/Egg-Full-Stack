/*Abrir el script de la base de datos llamada “tienda.sql” 
y ejecutarlo para crear sus tablas e insertar datos en las mismas.
 A continuación, generar el modelo de entidad relación. 
 Deberá obtener un diagrama de entidad relación igual al que se muestra a continuación:*/
 SHOW DATABASES;
 USE tienda;
 SHOW TABLES;
 
#A continuación, se deben realizar las siguientes consultas sobre la base de datos:
#1. Lista el nombre de todos los productos que hay en la tabla producto.
SELECT nombre FROM producto;

#2. Lista los nombres y los precios de todos los productos de la tabla producto.
SELECT nombre, precio FROM producto;

#3. Lista todas las columnas de la tabla producto.
SELECT * 
FROM producto;

#4. Lista los nombres y los precios de todos los productos de la tabla producto, redondeando el valor del precio.
SELECT nombre, round(precio) as PRECIO 
FROM producto;

#5. Lista el código de los fabricantes que tienen productos en la tabla producto.


#PONER NOMBRES EN MAYUSCULA
SELECT nombre, UCASE(SUBSTRING(nombre, 1)) AS 'NOMBRE con MAYUS'
FROM fabricante;

#6. Lista el código de los fabricantes que tienen productos en la tabla producto, sin mostrar los repetidos.
SELECT DISTINCT f.nombre, f.codigo 
FROM producto p, fabricante f 
WHERE p.codigo_fabricante = f.codigo;

#7. Lista los nombres de los fabricantes ordenados de forma ascendente.
SELECT nombre
FROM fabricante
ORDER BY nombre asc;

#8. Lista los nombres de los productos ordenados 
#en primer lugar por el nombre de forma ascendente y en segundo lugar por el precio de forma descendente.
SELECT nombre, precio
FROM producto
ORDER BY nombre ASC, precio DESC;

#9. Devuelve una lista con las 5 primeras filas de la tabla fabricante.
SELECT *
FROM fabricante
LIMIT 5;

#10. Lista el nombre y el precio del producto más barato. (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT nombre, precio
FROM producto
ORDER BY precio ASC
LIMIT 1;

#11. Lista el nombre y el precio del producto más caro. (Utilice solamente las cláusulas ORDER BY y LIMIT)
SELECT nombre, precio
FROM producto
ORDER BY precio DESC
LIMIT 1;

#12. Lista el nombre de los productos que tienen un precio menor o igual a $120.
SELECT nombre, precio
FROM producto
WHERE precio<=120;

#13. Lista todos los productos que tengan un precio entre $60y$200. Utilizando el operador BETWEEN.
SELECT nombre, precio
FROM producto
WHERE precio BETWEEN 60 AND 120;

#14. Lista todos los productos donde el código de fabricante sea 1,3 o 5. Utilizando el operador IN.
SELECT *
FROM producto
WHERE codigo_fabricante IN(1,3,5);

#15. Devuelve una lista con el nombre de todos los productos que contienen la cadena Portátil en el nombre.
SELECT *
FROM producto
WHERE nombre LIKE "%Portatil%";


#Consultas Multitabla
#1. Devuelve una lista con el código del producto, nombre del producto, 
#código del fabricante y nombre del fabricante, de todos los productos de la base de datos.
SELECT f.codigo,f.nombre, p.codigo_fabricante, p.nombre
FROM fabricante f
INNER JOIN producto p
ON f.codigo=p.codigo_fabricante;


#2. Devuelve una lista con el nombre del producto, precio y nombre
# de fabricante de todos los productos de la base de datos. 
#Ordene el resultado por el nombre del fabricante, por orden alfabético.

SELECT f.nombre 'BRAND', p.precio 'PRICE', p.nombre 'PRODUCT'
FROM fabricante f
INNER JOIN producto p
ON f.codigo=p.codigo_fabricante
ORDER BY f.nombre ASC;

SELECT f.nombre 'BRAND', p.precio 'PRICE', p.nombre 'PRODUCT'
FROM fabricante f, producto p
WHERE f.codigo=p.codigo_fabricante
ORDER BY f.nombre ASC;

#3. Devuelve el nombre del producto, su precio y el nombre de su fabricante, del producto más barato.
SELECT f.nombre 'BRAND', p.precio 'PRICE', p.nombre 'PRODUCT'
FROM fabricante f
INNER JOIN producto p
ON f.codigo=p.codigo_fabricante
ORDER BY p.precio ASC
LIMIT 1;

#4. Devuelve una lista de todos los productos del fabricante Lenovo.
SELECT f.nombre 'BRAND', p.precio 'PRICE', p.nombre 'PRODUCT'
FROM fabricante f
INNER JOIN producto p
ON f.codigo=p.codigo_fabricante
WHERE f.nombre ="Lenovo";

#5. Devuelve una lista de todos los productos del fabricante Crucial que tengan un precio mayor que $200.
SELECT f.nombre 'BRAND', p.precio 'PRICE', p.nombre 'PRODUCT'
FROM fabricante f
INNER JOIN producto p
ON f.codigo=p.codigo_fabricante
WHERE f.nombre ="Crucial" AND p.precio>200;

#6. Devuelve un listado con todos los productos de los fabricantes Asus, Hewlett-Packard. Utilizando el operador IN.
SELECT f.nombre 'BRAND', p.precio 'PRICE', p.nombre 'PRODUCT'
FROM fabricante f
INNER JOIN producto p
ON f.codigo=p.codigo_fabricante
WHERE f.nombre IN("Asus", "Hewlett-Packard");

#7. Devuelve un listado con el nombre de producto, precio y nombre de fabricante,
# de todos los productos que tengan un precio mayor o igual a $180. 
#Ordene el resultado en primer lugar por el precio (en orden descendente) y en segundo lugar por el nombre (en orden ascendente)
SELECT f.nombre 'BRAND', p.precio 'PRICE', p.nombre 'PRODUCT NAME'
FROM fabricante f
INNER JOIN producto p
ON f.codigo=p.codigo_fabricante
WHERE p.precio>=180
ORDER BY p.precio ASC, p.nombre ASC;



#Consultas Multitabla
#Resuelva todas las consultas utilizando las cláusulas LEFT JOIN y RIGHT JOIN.
#1. Devuelve un listado de todos los fabricantes que existen en la base de datos,
# junto con los productos que tiene cada uno de ellos.
# El listado deberá mostrar también aquellos fabricantes que no tienen productos asociados.
SELECT p.nombre, f.nombre, f.codigo 
FROM fabricante f 
LEFT JOIN producto p 
ON f.codigo = p.codigo_fabricante;

SELECT p.nombre, f.nombre, f.codigo 
FROM producto p 
RIGHT JOIN fabricante f 
ON f.codigo = p.codigo_fabricante;


#2. Devuelve un listado donde sólo aparezcan aquellos fabricantes que no tienen ningún producto asociado.

SELECT p.nombre PRODUCTO, f.nombre FABRICANTE, f.codigo CODIGO
FROM producto p 
RIGHT JOIN fabricante f 
ON f.codigo = p.codigo_fabricante
WHERE p.codigo_fabricante IS NULL;

SELECT p.codigo_fabricante


#Subconsultas (En la cláusula WHERE)
#Con operadores básicos de comparación
#1. Devuelve todos los productos del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT f.nombre 'BRAND', p.precio 'PRICE', p.nombre 'PRODUCT'
FROM fabricante f,producto p
WHERE f.codigo=p.codigo_fabricante
AND f.nombre IN("Lenovo");


#2. Devuelve todos los datos de los productos que tienen 
#el mismo precio que el producto más caro del fabricante Lenovo. (Sin utilizar INNER JOIN).
SELECT max(precio)
FROM producto p, fabricante f 
WHERE f.codigo=p.codigo_fabricante 
AND f.nombre IN("Lenovo"); #primera consulta

SELECT* 
FROM producto
WHERE precio = 
(SELECT max(precio)#ingresa la subconsulta
FROM producto p, fabricante f 
WHERE f.codigo=p.codigo_fabricante 
AND f.nombre IN("Lenovo"));


#3. Lista el nombre del producto más caro del fabricante Lenovo.
SELECT nombre
FROM producto
WHERE precio = 
(SELECT max(precio)#ingresa la subconsulta
FROM producto p, fabricante f 
WHERE f.codigo=p.codigo_fabricante 
AND f.nombre IN("Lenovo"));


#4. Lista todos los productos del fabricante Asus que tienen un precio superior al precio medio de todos sus productos.
SELECT AVG(p.precio)
FROM producto p, fabricante f 
WHERE f.codigo=p.codigo_fabricante 
AND f.nombre in('Asus'); #primera consulta

SELECT f.nombre 'BRAND', p.precio 'PRICE', p.nombre 'PRODUCT'
FROM fabricante f,producto p
WHERE f.codigo=p.codigo_fabricante
AND f.nombre IN("Asus") 
AND p.precio>(SELECT AVG(p.precio)
	FROM producto p, fabricante f 
	WHERE f.codigo=p.codigo_fabricante 
	AND f.nombre in('Asus'));


#Subconsultas con IN y NOT IN
#1. Devuelve los nombres de los fabricantes que tienen productos asociados. (Utilizando IN o NOT IN).
SELECT codigo_fabricante FROM producto;
SELECT nombre 'FABRICANTE CON PRODUCTO ASOCIADO'
FROM fabricante 
WHERE codigo IN (SELECT codigo_fabricante FROM producto);

use tienda;
#2. Devuelve los nombres de los fabricantes que no tienen productos asociados. (Utilizando IN o NOT IN).
SELECT nombre 'FABRICANTE SIN PRODUCTO ASOCIADO'
FROM fabricante 
WHERE codigo NOT IN (select codigo_fabricante from producto);


SHOW DATABASES;
USE TIENDA;

#Subconsultas (En la cláusula HAVING)
#1. Devuelve un listado con todos los nombres de los fabricantes que tienen el mismo número de productos que el fabricante Lenovo.                   
SELECT F.nombre
FROM producto AS P
JOIN fabricante f on f.codigo = P.codigo_fabricante
GROUP BY P.codigo_fabricante
HAVING COUNT(*) = (select count(*)
from fabricante f,producto p
where f.codigo=p.codigo_fabricante
and f.nombre in("Lenovo"));

SELECT F.nombre
FROM producto P, fabricante f 
WHERE f.codigo = P.codigo_fabricante
GROUP BY P.codigo_fabricante
HAVING COUNT(*) = (select count(*)
from fabricante f,producto p
where f.codigo=p.codigo_fabricante
and f.nombre in("Lenovo"));
