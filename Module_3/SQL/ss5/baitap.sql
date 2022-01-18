CREATE DATABASE bai5_baitap;
USE bai5_baitap;
create table Products(
Id int,
productCode int,
productName varchar(50),
productPrice int,
productAmount int,
productDescription varchar(50),
productStatus bit
);

insert into `products`
values(1,2,'quat',1,1,'hoi nuoc',1)
,(2,2,'dieu hoa',2,2,'co nong lanh',0)
,(3,3,'dieu hoa',3,3,'chi co lam mat',1)
,(4,4,'ti vi',4,4,'co cong hdmi',1)
,(5,5,'tivi',5,5,'khong co hdmi',1);

create index `unique` on products(productcode);

create index `composite` on products(productname,productprice);

explain select * from products where productname="quat"; 

create view products_view as select productCode, productName, productPrice, productStatus from `products`;
select * from products_view;

update products_view 
set productcode=2,productprice=4
where productname='chi co lam mat';
delete from products_view where productname='chi co lam mat';

DELIMITER //
create procedure `show_information`()
begin
select * from products;
end//
DELIMITER ;
call show_information;

DELIMITER //
create procedure `add_new_product`(in Id int,
productCode int,
productName varchar(50),
productPrice int,
productAmount int,
productDescription varchar(50),
productStatus bit)
begin
insert into products
value(Id,
productCode,
productName,
productPrice,
productAmount,
productDescription,
productStatus);
end //
DELIMITER ;
call `add_new_product`(11,32,'kkk',22,98,'ssss',1);

DELIMITER //
create procedure `update_product`(in
fixId int,
productCodeFix int,
productNameFix varchar(50),
productPriceFix int,
productAmountFix int,
productDescriptionFix varchar(50),
productStatusFix bit)
begin
SET SQL_SAFE_UPDATES = 0;
update products
set 
productCode=productCodeFix,
productName=productNameFix,
productPrice=productPriceFix,
productAmount=productAmountFix,
productDescription=productDescriptionFix,
productStatus=productStatusFix
where Id=FixId;
end //
DELIMITER ;
call `update_product`(10,14,'xxxx',1,7,'zzzsaxxx',1);

DELIMITER //
create procedure `delete_product`(in ID_delete int)
begin 
delete from products where Id=Id_delete;
end //
DELIMITER ;
call `delete_product`(3);