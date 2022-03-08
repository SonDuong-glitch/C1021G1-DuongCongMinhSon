create DATABASE bai_thi;
use bai_thi;

create TABLE category(
id_category int PRIMARY KEY AUTO_INCREMENT,
category_detail VARCHAR(45) NOT NULL
);

create table phone(
id_phone INT PRIMARY KEY AUTO_INCREMENT,
product_name VARCHAR(45) NOT NULL,
price DOUBLE not null,
quatily DOUBLE NOT NULL,
color VARCHAR(45) NOT NULL,
id_category int,
FOREIGN KEY (id_category) REFERENCES category(id_category)
);
INSERT INTO category(category_detail) VALUES ("Phone") , ("Televison");
INSERT INTO phone(product_name,price,quatily,color,id_category) VALUES ("IPhone11", 779.0,12,"Green",1),
("IPhone12", 832.0,12,"Green",1),
("IPhone13", 999.0,12,"Purple",1),
("IPhoneXS", 1000.0,12,"Pink",1),
("SmartTV LG" ,450.0,21,"Black",2),
("IPhoneXSMAx", 1100.0,12,"Red",1),
("SmartTVSamSung", 450.0,2,"Blue",2);
SELECT* FROM phone ;