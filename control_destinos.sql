CREATE DATABASE control_destinos;
USE control_destinos;

CREATE TABLE pasajero (
id_pasajero INT AUTO_INCREMENT,
rut VARCHAR(30),
nombre VARCHAR (70),
apellido VARCHAR (70),
edad INT,
ciudad_natal VARCHAR(70),
CONSTRAINT pk_table_pasajero PRIMARY KEY (id_pasajero)
);

CREATE TABLE destino (
id_destino INT AUTO_INCREMENT,
ciudad VARCHAR (70),
pais VARCHAR (70),
fecha DATE,
id_pasajero int,
constraint pk_table_destino primary key (id_destino),
constraint fk_table_pasajero foreign key (id_pasajero) references pasajero(id_pasajero) on delete cascade
);


insert into pasajero (rut, nombre, apellido, edad, ciudad_natal) values("18.164.479-5", "Felipe", "Martinez", 51, "Santiago");
insert into pasajero (rut, nombre, apellido, edad, ciudad_natal) values("07.452.953-9", "Daniela", "Jimenez", 45, "Quito");
insert into pasajero (rut, nombre, apellido, edad, ciudad_natal) values("12.365.956-8", "Camilo", "Hilera", 63, "New York");
insert into pasajero (rut, nombre, apellido, edad, ciudad_natal) values("15.645.956-8", "Sandra", "Peron", 20, "Lima");
insert into pasajero (rut, nombre, apellido, edad, ciudad_natal) values("06.963.147-2", "Lucia", "Toro", 26, "Toronto");
insert into pasajero (rut, nombre, apellido, edad, ciudad_natal) values("23.654.852-7", "Azir", "Fibonachi", 74, "Valdivia");

insert into destino (ciudad, pais, fecha,id_pasajero) values("Santiago", "Chile", "2020-08-09", 2);
insert into destino (ciudad, pais, fecha,id_pasajero) values("Lima", "Perú", "2020-09-10",2);
insert into destino (ciudad, pais, fecha,id_pasajero) values("Buenos Aires", "Argentina", "2020-11-15",1);
insert into destino (ciudad, pais, fecha,id_pasajero) values("La Paz", "Bolivia", "2020-11-30",1);
insert into destino (ciudad, pais, fecha,id_pasajero) values("Quito", "Ecuador", "2020-12-04",3);


select * from destino;
select * from pasajero;

