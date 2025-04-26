use studypoint_database;
create table teachers_table(
	t_id int not null unique auto_increment,
    t_name varchar(30) not null,
    t_email varchar(50) not null unique,
    t_phoneno varchar(10) not null unique,
    t_degree varchar(50) not null,
    t_subject varchar(50) not null,
    t_salary numeric not null,
    t_gender varchar(10) not null
);


use studypoint_database;
insert into teachers_table(t_name, t_email, t_phoneno, t_degree, t_subject, t_salary, t_gender)
values
	('manoj sharma', 'manoj88@gmail.com', '9087564453', 'Bca, Mca', 'java development', 8000, 'male'),
	('pankaj tiwari', 'pankaj43@gmail.com', '4655345233', 'B.Tech- CS', 'web development', 9500, 'male'),
    ('rekha kumari', 'rekha45@gmail.com', 7788776543, 'Bsc, Mca', 'java, dsa', 10000, 'female');