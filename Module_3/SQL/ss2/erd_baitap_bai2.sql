use erd_baitap2;
create table customer(
cID int auto_increment primary key, 
cName varchar(45) not null,
cAge int(3)
);
--
create table oder(
oID int auto_increment primary key,
cID int ,
oDate date not null ,
oTotalPrice int not null,
foreign key (cID) references customer(cID) 
);
--
create table oder_detail (
oID int,
pID int, 
odQTY varchar(45),
primary key (oID,pID),
foreign key (oID) references oder(oID),
foreign key (pID) references product(pID)
);
--
create table product(
pID int not null auto_increment primary key,
pName varchar(45) not null,
pPrice int not null
);