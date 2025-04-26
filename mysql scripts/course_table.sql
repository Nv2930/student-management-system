use studypoint_database;
create table course_table(
    c_id int unique not null auto_increment,
    c_name varchar(30) not null,
    c_duration varchar(20) not null,
    available_batches int not null
);

insert into course_table(c_name, c_duration, available_batches)
values
	('Java Development', '6-months', 3),
    ('DSA with java', '6-months', 3),
    ('Web Development', '6-months', 3);