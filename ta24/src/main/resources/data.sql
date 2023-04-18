DROP table IF EXISTS empleados;

create table empleados (
	id int auto_increment PRIMARY KEY,
	nombre varchar(250),
	apellido varchar(250),
	trabajo varchar(100),
    salario int
);

insert into empleados (nombre, apellido, trabajo, salario) values ('Roger','Gibert', 'CEO', 5800);
insert into empleados (nombre, apellido, trabajo, salario) values ('Jose','Mourinho', 'DEVELOPER', 2000);
insert into empleados (nombre, apellido, trabajo, salario) values ('Pedro','Pascal', 'CONSULTANT', 1500);
insert into empleados (nombre, apellido, trabajo, salario) values ('Jordi','Casademont', 'DEVELOPER', 2000);
insert into empleados (nombre, apellido, trabajo, salario) values ('Maria','Jimenez', 'ENGINEER', 2400);
