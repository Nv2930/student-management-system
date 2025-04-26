create database studyPoint_database;
use studyPoint_database;

create table student_table(
	id int auto_increment,
	first_name varchar(20) not null,
	last_name varchar(20),
	email varchar(50) unique not null,
	passwords varchar(20) unique not null,
	phone_number varchar(10) unique not null,
	city varchar(20) not null,
	dob date not null,
	gender varchar(10) not null,
    primary key(id)
);

create table course_java_table(
	id int auto_increment,
	student_name varchar(20) not null,
	email varchar(50) unique not null,
	phone_number varchar(10) unique not null,
	city varchar(20) not null,
	dob date not null,
	gender varchar(10) not null,
    qualification varchar(20) not null,
    course varchar(50) not null,
    batch numeric,
    primary key(id)
) auto_increment=101;

create table course_dsa_table(
	id int auto_increment,
	student_name varchar(20) not null,
	email varchar(50) unique not null,
	phone_number varchar(10) unique not null,
	city varchar(20) not null,
	dob date not null,
	gender varchar(10) not null,
    qualification varchar(20) not null,
    course varchar(50) not null,
    batch numeric,
    primary key(id)
) auto_increment=201;


create table course_webtech_table(
	id int auto_increment,
	student_name varchar(20) not null,
	email varchar(50) unique not null,
	phone_number varchar(10) unique not null,
	city varchar(20) not null,
	dob date not null,
	gender varchar(10) not null,
    qualification varchar(20) not null,
    course varchar(50) not null,
    batch numeric,
    primary key(id)
) auto_increment=301;