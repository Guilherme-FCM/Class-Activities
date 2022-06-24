create table Activities(
	id serial not null,
	title varchar not null,
	description text,
	teacher varchar,
	subject varchar,
	deadline date default current_date
);

--insert into Activities (title, description, teacher, subject) 
--values ('Trabalho Final', 'Fazer o trabalho final da disciplina', 'Vinicius', 'GDW')

select * from activities