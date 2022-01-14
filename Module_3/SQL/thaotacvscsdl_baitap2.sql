use thaotacvoicsdl_baitap2;
create table Customer (
cID int not null auto_increment primary key,
name_customer varchar(25) not null,
cAge tinyint not null
);
create table Oder(
oID int not null auto_increment primary key,
cID int,
oDate datetime not null,
oTotalPrice int ,
foreign key (cID) references Customer(cID)
);
create table Product(
pID int auto_increment not null primary key,
pName varchar(25) not null,
pPrice int
);
create table OderDetail (
oID int,
pID int,
odQTY int not null,
foreign key (oID) references Oder(oID),
foreign key (pID) references Product(pID)
);
select*from Customer;
insert into Customer(name_customer , cAge) 
values ('Minh Quan',10),('Ngoc Oanh',20),('Hong Ha',50);
insert into Oder(cID , oDate, oTotalPrice)
values (1,'2006-3-21',null),(1,'2006-3-23',null),(1,'2006-3-16',null);
insert into Product(pName, pPrice)
values ('May giat', 3), ('Tu Lanh',5),('Dieu Hoa',7),('Quat',1),('Bep Dien',2);
insert into OderDetail(oID, pID,odQTY)
values (1,1,3),(1,3,7),(1,4,2),(2,1,1),(3,1,8),(2,5,4),(2,3,3);