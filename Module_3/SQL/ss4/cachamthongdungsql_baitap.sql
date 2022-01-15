use cachamthongdungsql;
select*from subject 
where credit = (select max(credit) from subject);
select s.subid,s.subname,s.Status,s.Credit,m.Mark from subject s
join Mark m
on m.SubId = s.SubId
where Mark = (select max(mark) from Mark);
select st.StudentId , st.StudentName, st.Address, st.Phone, st.Status, st.ClassId, mark,avg(mark) from student st
left join Mark m 
on m.StudentID = st.StudentId
group by mark
order by mark desc ;
