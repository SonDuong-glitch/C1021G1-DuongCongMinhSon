create database bai1;
use bai1;
create table class(
	id int auto_increment,
    name varchar(20),
    primary key (id)
);
select * from class;
insert into class(name) values ("son");

create table teacher (
	id_teacher int not null auto_increment,
    name varchar(45) not null,
    age int not null,
    country varchar(45) not null,
    primary key (id_teacher)
);
select*from teacher;
insert into teacher(name ,age, country) values ('son',12,'quang binh');