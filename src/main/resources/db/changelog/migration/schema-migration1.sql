CREATE TABLE USER(id int(10) NOT NULL,name varchar(50) NOT NULL, lastname varchar(50) not null, password varchar(50) not null, fk_type varchar(50) not null);
CREATE TABLE ROLE(id int(10) not null, type varchar(50) not null);
CREATE TABLE ADDRESS(id int(10) not null, phone numeric(50) null, city varchar(50), country varchar(50), street varchar(50));