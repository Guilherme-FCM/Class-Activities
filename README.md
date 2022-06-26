<h1 align="center">Class Activities</h1>
<p align="center">📝 A Java service to CRUD class activities</p>

<p align="center">
    <a href="#about">About</a> |
    <a href="#installations">Installations</a> |
    <a href="#technologies">Technologies</a> | 
    <a href="#license">License</a>
</p>

## 😁**About**
This app was created for studants who need to insert, delete and edit your activities and lessons in anywhere digitally. The purpose of developing this app is to learn about Java DataBase Connectivity (JDBC).

## 👨‍💻**Installations**
To use this API, it's require install in your computer:
- [Java & JVM](https://www.oracle.com/java/technologies/downloads/)
- [Apache Tomcat](https://tomcat.apache.org/download-90.cgi)
- [PostgreSQL](https://www.postgresql.org/download/)

## ✨**Technologies**
- [Java](https://docs.oracle.com/javase/8/docs/technotes/tools/windows/javadoc.html)
- [PostgreSQL](https://www.postgresql.org/docs/)

## **Database Query**
~~~ sql
create database Class-Activities;
use Class-Activities;

create table Activities(
	id serial not null,
	title varchar not null,
	description text,
	teacher varchar,
	subject varchar,
	deadline date default current_date
);
~~~

## ⚖**License**
This project is under the license [MIT](./LICENSE).
