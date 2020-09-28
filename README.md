# DesafioM5-8.Control_Destinos
Desafío 8 del módulo 5. Curso full stack java 

Descripción

Crear una aplicación que:
- Permita el ingreso de pasajeros con sus respectivos datos además de listarlos.
- Permita ingresar destinos (ciudades) y listarlas.
- Al momento de crear un destino, se debe poder asignar a un usuario con el objetivo de identificar destinos por usuarios.

Requerimientos

1. Usar Spring Initializr para generar proyecto con las respectivas dependencias.

2. Crear modelo Pasajero con los siguientes atributos, en carpeta model la cual debe contener anotaciones de JPA y tener una relación de 1:N con Destino .
 id
 rut
 nombre
 apellido
 edad
 ciudadNatal

3. Crear modelo Destino con los siguientes atributos, en carpeta model la cual debe contener anotaciones de JPA y tener una relacióin de N:1 con Pasajero .
 id
 ciudad
 pais
 fecha

4. Crear interfaz llamada DestinoRepository en carpeta repository .

5. Crear interfaz llamada DestinoService en carpeta service .
- Método save para crear destino.
- Método findAll para listar destinos.

6. Crear clase llamada DestinoServiceImpl en carpeta service .
- Método save para crear destino.
- Método findAll para listar destinos.

7. Crear interfaz llamada PasajeroRepository en carpeta repository .

8. Crear interfaz llamada PasajeroService en carpeta service .
- Método save para crear pasajero.
- Método findAll para listar pasajeros.

9. Crear clase llamada PasajeroServiceImpl en carpeta service .
- Método save para crear pasajeros.
- Método findAll para listar pasajeros.

10. Crear clase DestinoController .
- Método crearDestino (GET) mostrar formulario de destino.
- Método crearDestino (POST) para crear destino.
- Método destinos para mostrar vista de destinos.

11. Crear vista crear-destino.html en carpeta resources/templates , para agregar destinoa pasajero.

12. Crear vista
- destinos.html en carpeta
- resources/templates , para listar destinos registrados.

13. Crear clase PasajeroController.
- Método crearPasajero (GET) mostrar formulario de pasajero.
- Método crearPasajero (POST) para crear pasajero.
- Método pasajeros para mostrar vista de pasajeros.

14. Crear vista
 crear-pasajero.html en carpeta
 resources/templates , para agregar
 pasajero.

15. Crear vista
 pasajeros.html en carpeta resources/templates , para listar pasajeros registrados.
