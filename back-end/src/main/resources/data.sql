
insert into customer(id, address, company_code, company_name, name, personal_code, surname )
values(1001, 'Gatve 26', 'ALT','Aivaras LT','Aivaras',656656565, 'Aivaričius');

insert into customer(id, address, company_code, company_name, name, personal_code, surname )
values(1002, 'Gatve 30', 'LTT','LT Televizija','Tomas',356568912, 'Tomavičius');

insert into customer(id, address, company_code, company_name, name, personal_code, surname )
values(1003, 'Gatve 14', 'LTU','LT United','Guoda',2348885744, 'Guodavičienė');

insert into ordered_service(id, active_from, active_to, description, name, type, customer_id )
values(1111, '2020-06-10', '2020-12-12', 'Geras planas', 'Namų internetas', 'INTERNET', 1001 );

insert into ordered_service(id, active_from, active_to, description, name, type, customer_id )
values(2222, '2020-01-01', '2022-01-01', 'Super planas', 'Išmani televizija', 'TV', 1001 );

insert into ordered_service(id, active_from, active_to, description, name, type, customer_id )
values(3333, '2019-05-19', '2021-05-19', 'Liuks planas', 'Nešiojamas kompiuteris', 'LAPTOP', 1001 );

insert into ordered_service(id, active_from, active_to, description, name, type, customer_id )
values(4444, '2020-05-10', '2020-10-22', 'Visai nieko planas', 'Kelionių internetas', 'INTERNET', 1002 );

insert into ordered_service(id, active_from, active_to, description, name, type, customer_id )
values(5555, '2019-09-10', '2021-09-19', 'Man patinka planas', 'Daiktų internetas', 'INTERNET', 1002 );

insert into ordered_service(id, active_from, active_to, description, name, type, customer_id )
values(6666, '2020-04-19', '2020-12-21', 'Visas planas', 'Iphone SE', 'PHONE', 1002 );

insert into ordered_service(id, active_from, active_to, description, name, type, customer_id )
values(7777, '2019-09-30', '2020-05-04', 'Bite planas', 'Namų internetas', 'INTERNET', 1003 );
