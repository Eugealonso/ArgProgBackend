create schema portafolio
create table portafolio.usuario(
	id_usuario bigint not null,
	mail varchar(30) not null,
	pass varchar(10) not null,
	nombre_apellido varchar(30) not null,
	foto varchar not null,
	foto_portada varchar not null,
	presentacion varchar(100) not null,
	descripcion varchar(400) not NULL,
	url_linkedin varchar(200) not null,
	url_github varchar(200) not null,
);
alter table portafolio.usuario add primary key(id_usuario);
create sequence portafolio.sq_usuario;
create table portafolio.seccion(
	id_seccion bigint not null,
	titulo varchar(30) not null,
	id_usuario bigint not null
);
alter table portafolio.seccion add primary key(id_seccion);
alter table portafolio.seccion add foreign key(id_usuario) references portafolio.usuario(id_usuario);
create sequence portafolio.sq_seccion;
create table portafolio.item_seccion(
	id_item_seccion bigint not null,
	titulo varchar(40) not null,
	descripcion varchar(200) not null,
	id_seccion bigint not null
);
create sequence portafolio.sq_item_seccion;
alter table portafolio.item_seccion add primary key(id_item_seccion);
alter table portafolio.item_seccion add foreign key(id_seccion) references portafolio.seccion(id_seccion);
create table portafolio.habilidad(
	id_habilidad bigint not null,
	titulo varchar(20) not null,
	porcentaje integer not null,
	tipo varchar(4) not null,
	id_usuario bigint not null
);
create sequence portafolio.sq_habilidad;
alter table portafolio.habilidad add primary key(id_habilidad);
alter table portafolio.habilidad add foreign key (id_usuario) references portafolio.usuario(id_usuario);

insert into portafolio.usuario (id_usuario, mail, pass, nombre_apellido, presentacion, descripcion, url_linkedin, url_github)
values(nextval('portafolio.sq_usuario'), 'alonso.maeuge@gmail.com', 'Anubis', 'María Eugenia Alonso', 'Licenciada en Psicología Estudiante de Argentina Programa','Aprendiendo a programar de a poco. Me gustan los videojuegos y los gatos', 'https://www.linkedin.com/in/mar%C3%ADa-eugenia-alonso-4727bb162/', 'https://github.com/Eugealonso')