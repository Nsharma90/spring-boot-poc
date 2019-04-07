create table Employee (emp_id int,
fname varchar(30), lname varchar(30), city varchar(20), dept_id int);

create table Department (dept_id int, dept_name varchar(15), location varchar(20));

insert into Employee(emp_id,fname, lname, city, dept_id)
values(10001,'Steve', 'Johnson', 'Oregon', 101);

insert into Employee(emp_id,fname, lname, city, dept_id)
values(10002,'Tristan', 'Journal', 'Albama', 102);

insert into Department(dept_id,dept_name,location)
values(101, 'HSBC', 'Oregon');
insert into Department(dept_id,dept_name,location)
values(102, 'BNY', 'Albama');