use thaotaccsdl_thuchanh1;
select student_name from student where student_name like 'h%';
select*from class where start_date between'2022-12-1' and '2022-12-30';
select*from subject where subject.credit between 3 and 5;
update student
set class_id = 2
where student.student_name;
select student_name, sub_name, mark from student 
join mark on student.student_id = mark.student_id 
join subject on mark.sub_id = subject.sub_id
order by mark;
