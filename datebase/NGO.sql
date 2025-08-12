create database NGO_system;
use NGO_system;

create table register
(
  s_id int primary key auto_increment,
  registration_number int(20),
  owner_name varchar(50),
  organization varchar(50),
  address varchar(100),
  district varchar(50),
  taluka varchar(50),
  email varchar(50),
  phone_number bigint(12),
  pass int(15)
);

create table food
(
 s_id int primary key auto_increment,
 fullname varchar(50),
 item varchar(50),
 typefood varchar(50),
 qun int(100),
 expi_date varchar(20)
);

create table pickup_food
(
  s_id int primary key auto_increment,
  fullname varchar(50),
  dat varchar(15),
  tim varchar(10),
  address varchar(100)
);

create table clothes
(
   s_id int primary key auto_increment,
   regnumber int(20),
   orgname varchar(50),
   typeclothes varchar(50),
   item varchar(50),
   condcloth varchar(50),
   qun int(50),
   detail varchar(100)
);

create table pickup_clothes
(
  s_id int primary key auto_increment,
  fullname varchar(50),
  dat varchar(15),
  tim varchar(10),
  address varchar(100)
);

create table notification
(
   s_id int primary key auto_increment,
   regnumber int(20),
   orgname varchar(50),
   message varchar(100)
);
