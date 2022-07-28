create database railway;
use railway;
drop table user;
create table user(
	id int primary key auto_increment,
	first_name varchar(30),
    last_name varchar(30),
    dob date,
    gender varchar(30),
    contact_number varchar(10),
    username varchar(30),
    password varchar(15)
    ); 

insert into user values(1, 'Sajid', 'Ali', '2017/03/15', 'Male', '1234567', 'ali007', '1234');
insert into user values(2, 'Aman', 'Kumar', '2000/09/15', 'Male', '98765432', 'aman07', '9876');
insert into user values(3, 'Seemant', 'Kumar', '2000/09/19', 'Male', '654321234', 'see007', '111', 'Admin');
select password from user where username = 'see007';
select role from User where username = 'see007';
delete from user where ID >=15;
ALTER TABLE user ADD role varchar(20);
select * from user;		
delete from user where id = 21;
delete from user where username =NULL;
desc user;
delete from user;
drop table train_details;
create table train_details(
	train_no int,
    train_name  varchar(30),
    source_station varchar(10),
    destination_station varchar(10),
    arrival_time varchar(15),
    dept_time varchar(15),
    duration varchar(20),
    no_of_seats int,
    first_ClassACfare int,
    two_tier_AC_fare int,
    three_tier_AC_fare int,
    sleeper_fare int
    );

use railway;
select * from train_details;
delete from train_details ;

insert into train_details values(12564, 'Rajdhani', 'Delhi', 'Jaipur', '11:00', '11:00', '11hr', 72, 2500, 2000, 1500, 1000);
insert into train_details values(76584, 'Shatabdi', 'Delhi', 'Jaipur', '16:00', '16:25', '19hr 10mins', 50, 200, 250, 300, 400);
insert into train_details values(11234, 'Delhi Mail', 'Delhi', 'Jaipur', '23:40', '23:54', '24hr 55mins', 60, 1500, 2500, 3000, 4000);
insert into train_details values(12650, 'Delhi Mail', 'Delhi', 'Jaipur', '23:40', '23:54', '24hr 55mins', 60, 1500, 2500, 3000, 4000);
select * from train_details;
update train_details set arrival_time = '17:00';
delete from train_details where train_no = 12;

show tables;
drop table payment;
create table payment(
	card_no varchar(20),
    pnr_no  varchar(20),
    cvv int,
    bank_name varchar(20),
    class_type varchar(15)
    );
    
insert into payment values('123465781234', '123456', 768, 'SBI', '2A');
insert into payment values('098765432123', '098765', 123, 'ICICI', '1A');
insert into payment values('123456789988', '1234567', 987, 'Kotak', '3A');
select * from payment;
delete from payment ;
desc payment;
use railway;
show tables;
desc booking_details;
select * from booking_details;
drop table booking_details;
delete from booking_details where id >11;
create table booking_details(
	id int primary key auto_increment,
    pnr_no varchar(15),
    name varchar(20),
    age int,
    sex varchar(10),
    address varchar(70),
    train_name varchar(30),
    train_no int,
    source_station varchar(10),
    destination_station varchar(10),
    class_type varchar(5),
    adults int,
    children int,
    payment varchar(10)
    );

use railway;
insert into booking_details values(1, '8973731176', 'Ali', 29, 'Male', 'Sirohi', 'Shatabdi', '12564', 'Sirohi', 'Delhi', '2A', 2, 1, 'Success');
insert into booking_details values(3, '8973731186', 'Divya', 22, 'Female', 'Jaipur', 'Delhi mail', '76584', 'Jaipur', 'Falna', '1A', 1, 0, 'Success');
select * from booking_details;
delete from booking_details where id <4;
show tables;
delete from booking_details where id=9;
select * from payment;
delete from payment where bank_name = 'BOB';
delete from booking_details where id =7;
show tables;

create table Forget_User(
	username varchar(20),
    ans1 varchar(50),
    ans2 varchar(50),
    ans3 varchar(50)    
);

insert into Forget_User values('ali007', 'Captain', 'Blue', 'Kiara');
insert into Forget_User values('see007', 'Seemant', 'Red', 'Yami');
select * from forget_user;
DROP table help;
create table Help(
	username varchar(20),
    issue varchar(20),
    problem varchar(100)
    );
    
insert into help values('ama007', 'Cancellation ', 'I was not able to get my refund');
insert into help values('ali007', 'Technical issue', 'I was not able to login');
insert into help values('ali007', 'Technical issue', 'I was not able to book ticket');
select * from help;
delete from help where issue = '1'; 
    