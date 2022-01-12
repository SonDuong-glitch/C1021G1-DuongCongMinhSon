use erd_baitap1;
create table phieu_xuat(
	so_px int primary key,
    ngay_xuat date not null 
);
--
create table vattu(
	ma_vattu int primary key ,
    tem_vattu varchar(45) not null
);
--
create table phieu_nhap(
	so_pn int primary key,
    ngay_nhap date not null
);
--
create table dondh(
	ma_ncc int,
	so_don_hang int not null primary key,
    ngay_dh date not null,
    foreign key (ma_ncc) references nhacc(ma_ncc)
);
--
create table nhacc(
	ma_ncc int primary key,
    ten_ncc varchar(45) not null
);
--
create table chi_tiet_phieu_xuat(
so_px int,
ma_vattu int,
don_gia_xuat int not null,
so_luong_xuat int not null,
primary key(so_px , ma_vattu),
foreign key (so_px) references phieu_xuat(so_px),
foreign key (ma_vattu) references vattu(ma_vattu)
);
create table chi_tiet_phieu_nhap(
ma_vattu int,
so_pn int,
dongia_nhap int not null, 
soluong_nhap int not null,
primary key(ma_vattu,so_pn),
foreign key (ma_vattu) references vattu(ma_vattu),
foreign key (so_pn) references phieu_nhap(so_pn)
);
--
create table chi_tiet_don_dat_hang(
ma_vattu int, 
so_don_hang int,
primary key (ma_vattu, so_don_hang),
foreign key (ma_vattu) references vattu(ma_vattu),
foreign key (so_don_hang) references dondh(so_don_hang)
);
--
create table phone_number(
code_phone_number int auto_increment,
phone_number int(13),
ma_ncc int,
primary key (code_phone_number),
foreign key (ma_ncc) references nhacc(ma_ncc)  
);