USE case_study;
-- tạo table
CREATE TABLE vi_tri (
ma_vi_tri INT AUTO_INCREMENT,
ten_vi_tri VARCHAR(45) not null,
PRIMARY KEY (ma_vi_tri)
);
CREATE TABLE trinh_do(
ma_trinh_do INT AUTO_INCREMENT,
ten_trinh_do VARCHAR(45), 
PRIMARY KEY (ma_trinh_do)
);
CREATE TABLE bo_phan(
ma_bo_phan INT AUTO_INCREMENT,
ten_bo_phan VARCHAR(45),
PRIMARY KEY (ma_bo_phan)
);
CREATE TABLE nhan_vien(
ma_nhan_vien INT PRIMARY KEY AUTO_INCREMENT,
ho_ten VARCHAR(45),
ngay_sinh DATE,
so_cmnd VARCHAR(45),
luong DOUBLE,
so_dien_thoai VARCHAR(45),
email VARCHAR(45),
dia_chi VARCHAR(45),
ma_vi_tri INT,
ma_trinh_do INT,
ma_bo_phan INT,
FOREIGN KEY (ma_vi_tri) REFERENCES vi_tri(ma_vi_tri),
FOREIGN KEY (ma_trinh_do) REFERENCES trinh_do(ma_trinh_do),
FOREIGN KEY (ma_bo_phan) REFERENCES bo_phan(ma_bo_phan)
);
CREATE TABLE loai_khach (
ma_loai_khach INT AUTO_INCREMENT PRIMARY KEY,
ten_loai_khach VARCHAR(45)
);
CREATE TABLE khach_hang(
ma_khach_hang INT AUTO_INCREMENT PRIMARY KEY,
ma_loai_khach INT,
ho_ten VARCHAR(45),
ngay_sinh DATE,
gioi_tinh BIT,
so_cmnd VARCHAR(45),
so_dien_thoai VARCHAR(45),
email VARCHAR(45),
dia_chi VARCHAR(45),
FOREIGN KEY (ma_loai_khach) REFERENCES loai_khach(ma_loai_khach)
);
CREATE TABLE kieu_thue(
ma_kieu_thue INT AUTO_INCREMENT PRIMARY KEY,
ten_kieu_thue VARCHAR(45)
);
CREATE TABLE loai_dich_vu(
ma_loai_dich_vu INT AUTO_INCREMENT PRIMARY KEY,
ten_loai_dich_vu VARCHAR(45)
);
CREATE TABLE dich_vu(
ma_dich_vu INT AUTO_INCREMENT PRIMARY KEY,
ten_dich_vu VARCHAR(45), 
dien_tich int, 
chi_phi_thue DOUBLE,
so_nguoi_toi_da INT,
ma_kieu_thue INT, 
ma_loai_dich_vu INT,
tieu_chuan_phong VARCHAR(45),
mo_ta_tien_nghi_khac VARCHAR(45),
dien_tich_ho_boi DOUBLE,
so_tang INT,
FOREIGN KEY (ma_kieu_thue) REFERENCES kieu_thue(ma_kieu_thue),
FOREIGN KEY (ma_loai_dich_vu) REFERENCES loai_dich_vu(ma_loai_dich_vu)
);
CREATE TABLE dich_vu_di_kem(
ma_dich_vu_di_kem INT AUTO_INCREMENT PRIMARY KEY,
ten_dich_vu_di_kem VARCHAR(45),
gia DOUBLE,
don_vi VARCHAR(45),
trang_thai VARCHAR(45)
);
CREATE TABLE hop_dong(
ma_hop_dong INT AUTO_INCREMENT PRIMARY KEY,
ngay_lam_hop_dong DATETIME,
ngay_ket_thuc DATETIME,
tien_dat_coc DOUBLE,
ma_nhan_vien INT,
ma_khach_hang INT,
ma_dich_vu INT,
FOREIGN KEY (ma_nhan_vien) REFERENCES nhan_vien(ma_nhan_vien),
FOREIGN KEY (ma_khach_hang) REFERENCES khach_hang(ma_khach_hang),
FOREIGN KEY (ma_dich_vu) REFERENCES dich_vu(ma_dich_vu)
);
CREATE TABLE hop_dong_chi_tiet(
ma_hop_dong_chi_tiet INT AUTO_INCREMENT PRIMARY KEY,
ma_hop_dong INT,
ma_dich_vu_di_kem INT,
so_luong INT,
FOREIGN KEY(ma_hop_dong) REFERENCES hop_dong(ma_hop_dong),
FOREIGN KEY(ma_dich_vu_di_kem) REFERENCES dich_vu_di_kem(ma_dich_vu_di_kem)
);
-- tạo dữ liệu cho bảng 
INSERT INTO vi_tri(ten_vi_tri)
VALUES ('Quản lí'),('Nhân Viên');
INSERT INTO trinh_do(ten_trinh_do)
VALUES ('Trung cấp'),('Cao ĐẲng'),('Đại Học'),('Sau Đại Học');
INSERT INTO bo_phan(ten_bo_phan)
VALUES ('Sale Marketing'),('Hành Chính'),('Phục vụ'),('Quản Lí');
INSERT INTO nhan_vien(ho_ten,ngay_sinh,so_cmnd,luong,so_dien_thoai,email,dia_chi,ma_vi_tri,ma_trinh_do,ma_bo_phan)
VALUES('Nguyễn Văn An', '1970-11-07', '456231786',10000000,'0901234121','annguyen@gmail.com','295 Nguyễn Tất Thành, Đà Nẵng',1,3,1),
('Lê Văn Bình','1997-04-09','654231234',7000000,'0934212314','binhlv@gmail.com','22 Yên Bái, Đà Nẵng',1,2,2),
('Hồ Thị Yến','1995-12-12','999231723',14000000,'0412352315','thiyen@gmail.com','K234/11 Điện Biên Phủ, Gia Lai',1,3,2),
('Võ Công Toản','1980-04-04','123231365',17000000,'0374443232','toan0404@gmail.com','77 Hoàng Diệu, Quảng Trị',1,4,4),
('Nguyễn Bỉnh Phát','1999-12-09','454363232',6000000,'0902341231','phatphat@gmail.com','43 Yên Bái, Đà Nẵng',2,1,1),
('Khúc Nguyễn An Nghi','2000-11-08','964542311','7000000','0978653213','annghi20@gmail.com','294 Nguyễn Tất Thành, Đà Nẵng',2,2,3),
('Nguyễn Hữu Hà','1993-01-01','534323231',8000000,'0941234553','nhh0101@gmail.com','4 Nguyễn Chí Thanh, Huế',2,3,2),
('Nguyễn Hà Đông','1989-09-03','234414123',9000000,'0642123111','donghanguyen@gmail.com','111 Hùng Vương, Hà Nội',2,4,4),
('Tòng Hoang','1982-09-03','256781231',6000000,'0245144444','hoangtong@gmail.com','213 Hàm Nghi, Đà Nẵng',2,4,4),
('Nguyễn Công Đạo','1994-01-08','755434343',8000000,'0988767111','nguyencongdao12@gmail.com','6 Hoà Khánh, Đồng Nai',2,3,2);
INSERT INTO loai_khach(ten_loai_khach)
VALUES ('Diamond'),('Platinium'),('Gold'),('Silver'),('Member');
INSERT INTO khach_hang (ho_ten,ngay_sinh,gioi_tinh,so_cmnd,so_dien_thoai,email,dia_chi,ma_loai_khach)
VALUES('Nguyễn Thị Hào','1970-11-07',0,'643431213','0945423362','thihao07@gmail.com','23 Nguyễn Hoàng, Đà Nẵng',5),
('Phạm Xuân Diệu', '1992-08-08',1,'865342123','0954333333','xuandieu92@gmail.com','K77/22 Thái Phiên, Quảng Trị',3),
('Trương Đình Nghệ','1990-02-27',1,'488645199','0373213122','nghenhan2702@gmail.com','K323/12 Ông Ích Khiêm, Vinh',1),
('Dương Văn Quan','1981-07-08',1,'543432111','0490039241','duongquan@gmail.com', 'K453/12 Lê Lợi, Đà Nẵng',1),
('Hoàng Trần Nhi Nhi','1995-12-09',0,'795453345','0312345678','nhinhi123@gmail.com','224 Lý Thái Tổ, Gia Lai',4),
('Tôn Nữ Mộc Châu','2005-12-06',0,'732434215','0988888844','tonnuchau@gmail.com','37 Yên Thế, Đà Nẵng',4),
('Nguyễn Mỹ Kim','1984-04-08',0,'856453123','0912345698','kimcuong84@gmail.com','K123/45 Lê Lợi, Hồ Chí Minh',1),
('Nguyễn Thị Hào','1999-04-08',0,'965656433','0763212345','haohao99@gmail.com','55 Nguyễn Văn Linh, Kon Tum',3),
('Trần Đại Danh','1994-07-01',1,'432341235','0643343433','danhhai99@gmail.com','24 Lý Thường Kiệt, Quảng Ngãi',1),
('Nguyễn Tâm Đắc','1989-07-01',1,'344343432','0987654321','dactam@gmail.com','22 Ngô Quyền, Đà Nẵng',2);
INSERT INTO kieu_thue(ten_kieu_thue) 
VALUES('year'),('day'),('month'),('hour');
INSERT INTO loai_dich_vu(ten_loai_dich_vu)
VALUES('Villa'),('House'),('Room');
INSERT INTO dich_vu(ten_dich_vu,dien_tich,chi_phi_thue,so_nguoi_toi_da,tieu_chuan_phong,mo_ta_tien_nghi_khac,dien_tich_ho_boi,so_tang,ma_kieu_thue,ma_loai_dich_vu)
VALUES('Villa Beach Front',25000,10000000,10,'vip','Có hồ bơi',500,4,3,1),
('House Princess 01',14000,'5000000',7,'vip','Có thêm bếp nướng',null,3,2,2),
('Room Twin 01',5000,1000000,2,'normal','Có tivi',null,null,4,3),
('Villa No Beach Front',22000,9000000,8,'normal','Có hồ bơi',300,3,3,1),
('House Princess 02',10000,4000000,5,'normal','Có thêm bếp nướng',null,2,3,2),
('Room Twin 02',3000,900000,2,'normal','Có tivi',null,null,4,3);
INSERT INTO dich_vu_di_kem(ten_dich_vu_di_kem,gia,don_vi,trang_thai)
VALUES ('Karaoke',10000,'giờ','tiện nghi, hiện tại'),
('Thuê xe máy',10000,'chiếc','hỏng 1 xe'),
('Thuê xe đạp',20000,'chiếc','tốt'),
('Buffet buổi sáng',15000,'suất','đầy đủ đồ ăn, tráng miệng'),
('Buffet buổi trưa',90000,'suất','đầy đủ đồ ăn, tráng miệng'),
('Buffet buổi tối','16000','suất','đầy đủ đồ ăn, tráng miệng');
INSERT INTO hop_dong(ngay_lam_hop_dong,ngay_ket_thuc,tien_dat_coc,ma_nhan_vien,ma_khach_hang,ma_dich_vu)
VALUES('2020-12-08','2020-12-08',0,3,1,3),
('2020-07-14','2020-07-21','200000',7,3,1),
('2021-03-15','2021-03-17',50000,3,4,2),
('2021-01-14','2021-01-18',100000,7,5,5),
('2021-07-14','2021-07-15',0,7,2,6),
('2021-06-01','2021-06-03',0,7,7,6),
('2021-09-02','2021-09-05',100000,7,4,4),
('2021-06-17','2021-06-17',150000,3,4,1),
('2020-11-19','2020-11-19',0,3,4,3),
('2021-04-12','2021-04-14',0,10,3,5),
('2021-04-25','2021-04-25',0,2,2,1),
('2021-05-25','2021-05-27',0,7,10,1);
INSERT INTO hop_dong_chi_tiet(so_luong,ma_hop_dong,ma_dich_vu_di_kem)
VALUES(5,2,4),
(8,2,5),
(15,2,6),
(1,3,1),
(11,3,2),
(1,1,3),
(2,1,2),
(2,12,2);
-- truy xuất dữ liệu 
-- câu 2
SELECT * FROM nhan_vien 
WHERE nhan_vien.ho_ten LIKE 'K%' 
OR nhan_vien.ho_ten LIKE 'T%' 
OR nhan_vien.ho_ten LIKE 'H%';
-- câu 3
SELECT khach_hang.ma_khach_hang,ho_ten FROM khach_hang 
WHERE (khach_hang.ngay_sinh < '2003-01-17' AND khach_hang.ngay_sinh > '1972-01-17')
AND (khach_hang.dia_chi LIKE '%Đà Nẵng%' OR khach_hang.dia_chi LIKE '%Quảng trị%');
-- câu 4
SELECT khach_hang.ma_khach_hang ,khach_hang.ho_ten, count(hop_dong.ma_khach_hang) as so_lan_dat_phong
FROM khach_hang 
JOIN hop_dong
ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
WHERE khach_hang.ma_loai_khach LIKE 1
GROUP BY khach_hang.ma_khach_hang;
-- câu 5 
SELECT khach_hang.ma_khach_hang ,khach_hang.ho_ten, ten_loai_khach, hop_dong.ma_hop_dong,
ngay_lam_hop_dong,ngay_ket_thuc, hop_dong_chi_tiet.so_luong*dich_vu.chi_phi_thue*dich_vu_di_kem.gia as tong_tien FROM khach_hang
LEFT JOIN loai_khach
ON loai_khach.ma_loai_khach = khach_hang.ma_khach_hang
LEFT JOIN hop_dong 
ON hop_dong.ma_khach_hang = khach_hang.ma_khach_hang
LEFT JOIN hop_dong_chi_tiet
ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
LEFT JOIN dich_vu
ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
LEFT JOIN dich_vu_di_kem
ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem;
-- cau 6
SELECT dich_vu.ma_dich_vu, dich_vu.ten_dich_vu, dich_vu.dien_tich, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu 
FROM dich_vu
LEFT JOIN loai_dich_vu
ON dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
LEFT JOIN hop_dong
ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
where hop_dong.ngay_lam_hop_dong not between "2021-01-01" and "2021-03-31"
GROUP BY ten_dich_vu;
-- cau 7
SELECT  dich_vu.ma_dich_vu, ten_dich_vu, dich_vu.dien_tich, dich_vu.so_nguoi_toi_da, dich_vu.chi_phi_thue, loai_dich_vu.ten_loai_dich_vu
FROM dich_vu
INNER JOIN loai_dich_vu
ON dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
INNER JOIN hop_dong
ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
where year(hop_dong.ngay_lam_hop_dong) = "2020";
-- cau 8
-- cach 1
select distinct khach_hang.ho_ten from khach_hang;
-- cach 2
select khach_hang.ho_ten from khach_hang 
group by khach_hang.ho_ten;
-- cach 3
select khach_hang.ho_ten from khach_hang
union
select khach_hang.ho_ten from khach_hang;
-- cau 9
select month(hop_dong.ngay_lam_hop_dong) as "thang", count(ma_khach_hang) as "so luong"
from hop_dong
inner join dich_vu
on hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
where (year(hop_dong.ngay_lam_hop_dong) = 2021)
group by month(ngay_lam_hop_dong) 
order by ngay_lam_hop_dong asc;
-- cau 10 
SELECT hop_dong.ma_hop_dong,hop_dong.ngay_lam_hop_dong,hop_dong.ngay_ket_thuc,hop_dong.tien_dat_coc,SUM(hop_dong_chi_tiet.so_luong)
FROM hop_dong 
LEFT JOIN hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong 
GROUP BY ma_hop_dong;
-- cau 11
select  dich_vu_di_kem.ma_dich_vu_di_kem , dich_vu_di_kem.ten_dich_vu_di_kem from loai_khach
INNER JOIN khach_hang ON loai_khach.ma_loai_khach = khach_hang.ma_loai_khach
INNER JOIN hop_dong ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
INNER JOIN hop_dong_chi_tiet ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
INNER JOIN dich_vu_di_kem ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
WHERE loai_khach.ten_loai_khach = "Diamond" AND (khach_hang.dia_chi LIKE "%Vinh" OR khach_hang.dia_chi LIKE "%Quảng Ngãi");
-- cau 12
SELECT hop_dong.ma_hop_dong, nhan_vien.ho_ten, khach_hang.ho_ten, khach_hang.so_dien_thoai, dich_vu.ten_dich_vu, 
sum(hop_dong_chi_tiet.so_luong) AS "so_luong_dich_vu_di_kem", hop_dong.tien_dat_coc
FROM nhan_vien 
LEFT JOIN hop_dong 
ON nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
LEFT JOIN khach_hang
ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
LEFT JOIN hop_dong_chi_tiet
ON hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
left join dich_vu 
ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
WHERE  dich_vu.ten_dich_vu NOT IN
(SELECT dich_vu.ma_dich_vu
FROM dich_vu 
JOIN hop_dong 
ON dich_vu.ma_dich_vu = hop_dong.ma_dich_vu
WHERE year(hop_dong.ngay_lam_hop_dong) = 2021 AND month(hop_dong.ngay_lam_hop_dong) in (1,2,3,4,5,6) )
AND (year(hop_dong.ngay_lam_hop_dong) = 2020 AND month(hop_dong.ngay_lam_hop_dong) in (10,11,12))
GROUP BY khach_hang.ho_ten;
-- cau 13
SELECT dich_vu_di_kem.ma_dich_vu_di_kem, dich_vu_di_kem.ten_dich_vu_di_kem,SUM(so_luong) AS "so_luong_dich_vu_di_kem"
FROM dich_vu_di_kem 
LEFT JOIN hop_dong_chi_tiet 
ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
GROUP BY dich_vu_di_kem.ma_dich_vu_di_kem
HAVING SUM(so_luong) = (SELECT SUM(so_luong) 
FROM hop_dong_chi_tiet 
JOIN dich_vu_di_kem
ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
GROUP BY dich_vu_di_kem.ma_dich_vu_di_kem
ORDER BY SUM(so_luong) DESC
LIMIT 1);
-- cau 14
SELECT hop_dong.ma_hop_dong, loai_dich_vu.ten_loai_dich_vu, dich_vu_di_kem.ten_dich_vu_di_kem, count(dich_vu_di_kem.ma_dich_vu_di_kem) as "so_lan"
FROM hop_dong 
INNER JOIN hop_dong_chi_tiet 
ON hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong	
INNER JOIN dich_vu_di_kem
ON hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
INNER JOIN dich_vu 
ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
INNER JOIN loai_dich_vu 
ON dich_vu.ma_loai_dich_vu = loai_dich_vu.ma_loai_dich_vu
GROUP BY  dich_vu_di_kem.ten_dich_vu_di_kem
HAVING so_lan = 1
ORDER BY  ma_hop_dong;
-- cau 15
SELECT nhan_vien.ma_nhan_vien, nhan_vien.ho_ten, trinh_do.ten_trinh_do, bo_phan.ten_bo_phan, nhan_vien.so_dien_thoai, nhan_vien.dia_chi
FROM nhan_vien 
INNER JOIN hop_dong
ON nhan_vien.ma_nhan_vien = hop_dong.ma_nhan_vien
INNER JOIN trinh_do
ON nhan_vien.ma_trinh_do = trinh_do.ma_trinh_do
INNER JOIN bo_phan
ON nhan_vien.ma_bo_phan = bo_phan.ma_bo_phan
GROUP BY  nhan_vien.ma_nhan_vien
HAVING count(hop_dong.ma_hop_dong) <= 3;
-- cau 16
SET FOREIGN_KEY_CHECKS=0; 
DELETE 
FROM nhan_vien
WHERE ma_nhan_vien NOT IN (
SELECT ma_nhan_vien
FROM hop_dong
WHERE ngay_lam_hop_dong BETWEEN '2019-01-01' AND '2021-12-31');
SET FOREIGN_KEY_CHECKS=1; 
SELECT * FROM nhan_vien;
-- cau 17
CREATE TEMPORARY TABLE example
SELECT khach_hang.ma_khach_hang from khach_hang
INNER JOIN hop_dong
ON khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
INNER JOIN dich_vu 
ON hop_dong.ma_dich_vu = dich_vu.ma_dich_vu
INNER JOIN hop_dong_chi_tiet
ON hop_dong_chi_tiet.ma_hop_dong = hop_dong.ma_hop_dong
INNER JOIN dich_vu_di_kem
ON dich_vu_di_kem.ma_dich_vu_di_kem = hop_dong_chi_tiet.ma_dich_vu_di_kem
INNER JOIN loai_khach
ON khach_hang.ma_loai_khach = loai_khach.ma_loai_khach
WHERE loai_khach.ten_loai_khach = "Platinium"
GROUP BY  hop_dong.ma_hop_dong
HAVING sum(dich_vu.chi_phi_thue + hop_dong_chi_tiet.so_luong * dich_vu_di_kem.gia) > 10000000;
SELECT * FROM example;
UPDATE loai_khach
SET ten_loai_khach = "Diamond" 
WHERE (loai_khach.ten_loai_khach = "Platinium");
-- cau 18
SET FOREIGN_KEY_CHECKS=0;
create temporary table example_1
select khach_hang.ma_khach_hang, hop_dong.ngay_lam_hop_dong from khach_hang
inner join hop_dong
on  khach_hang.ma_khach_hang = hop_dong.ma_khach_hang
where year(hop_dong.ngay_lam_hop_dong) < 2021;
delete from khach_hang
where khach_hang.ma_khach_hang 
in (select example_1.ma_khach_hang from example_1);
SET FOREIGN_KEY_CHECKS=1;
-- cau 19 
create temporary table example_2
select dich_vu_di_kem.ma_dich_vu_di_kem from dich_vu_di_kem
inner join hop_dong_chi_tiet
on hop_dong_chi_tiet.ma_dich_vu_di_kem = dich_vu_di_kem.ma_dich_vu_di_kem
inner join hop_dong
on hop_dong.ma_hop_dong = hop_dong_chi_tiet.ma_hop_dong
where hop_dong_chi_tiet.so_luong > 10 and year(hop_dong.ngay_lam_hop_dong) = 2020;
select * from example_2;
update dich_vu_di_kem
set dich_vu_di_kem.gia = dich_vu_di_kem.gia*2
where dich_vu_di_kem.ma_dich_vu_di_kem in (select example_2.ma_dich_vu_di_kem from example_2);
drop table example_2;
-- cau 20
select nhan_vien.ma_nhan_vien, nhan_vien.ho_ten, nhan_vien.email, nhan_vien.so_dien_thoai, nhan_vien.ngay_sinh, nhan_vien.dia_chi from nhan_vien
union 
select khach_hang.ma_khach_hang, khach_hang.ho_ten, khach_hang.email, khach_hang.so_dien_thoai, khach_hang.ngay_sinh, khach_hang.dia_chi from khach_hang;