use thaotaccsdl_thuchanh1;
create table class(
class_id int not null auto_increment primary key,
class_name varchar(45) not null,
start_date datetime , 
`status` bit not null
);
create table student(
student_id int not null auto_increment primary key,
student_name varchar(45) not null,
address varchar(45) not null,
phone_number varchar(13),
`status` bit,
class_id int not null,
foreign key (class_id) references class(class_id)
);
create table subject(
sub_id int primary key,
sub_name varchar(45) not null,
credit tinyint not null default 1 check (credit >= 1), 
`status` bit default 1
);
create table mark(
mark_id int  not null  auto_increment primary key,
sub_id int not null,
student_id int not null,
mark float default 0 check (mark between 0 and 100), 
exam_time tinyint default 1,
foreign key (sub_id) references subject(sub_id),
foreign key (student_id) references student(student_id)
);
insert into class(class_name,start_date,`status`) 
values ('A1','2022-12-20',1) ,('A2','2022-11-20',0),('A3',current_date(),1);
insert into student(student_name, address, phone_number,`status`,class_id)
values	('hung','ha noi', '0123565122',1,1),('tuan','ha tay', '02211221236',1,1),('xuan','ha dong', '06334521452',1,1);
insert into subject (sub_id,sub_name ,credit,`status`)
VALUES ( 1,'CF', 5, 1),
       ( 2,'C', 6, 1),
       ( 3,'HDJ', 5, 1),
       (4,'RDBMS', 10, 1);
INSERT INTO Mark (sub_id, student_id, mark, exam_time)
VALUES (1, 1, 8, 1),
       (1, 2, 10, 2),
       (2, 1, 12, 1);
       
select*from student
where `status` = true;
select*from subject
where credit <10;
select S.student_id, S.student_name, C.class_name
FROM Student S join Class C on S.class_id = C.class_id;
select S.student_id, S.student_name, C.class_name
FROM student S join Class C on S.class_id = C.class_id
WHERE C.class_name = 'A1';
SELECT S.student_id, S.student_name, Sub.sub_name, M.mark
FROM student S join Mark M on S.Student_id = M.student_id join Subject Sub on M.sub_id = Sub.sub_id