#admin table
use studypoint_database;
create table admin_table(
	admin_id int not null unique auto_increment,
    admin_name varchar(50) not null,
    admin_password varchar(20) not null unique
);

insert into admin_table(admin_name, admin_password)
values
	('studypoint30@gmail.com', 'studypoint30');