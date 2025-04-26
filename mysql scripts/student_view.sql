use studypoint_database;
create view student_view
AS
select id, first_name, last_name, email, phone_number, city, dob, gender
from student_table;