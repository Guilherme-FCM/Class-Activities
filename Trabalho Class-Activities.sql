create table Activities(
	id serial not null,
	title varchar not null,
	description text,
	teacher varchar,
	subject varchar,
	deadline date default current_date
);