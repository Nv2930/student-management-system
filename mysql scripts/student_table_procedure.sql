#student_table procedures-
DELIMITER &
create procedure student_procedure(in f_name varchar(20), in l_name varchar(20), 
	in s_email varchar(50), in s_passwords varchar(20), in s_phoneno varchar(10), in s_city varchar(20), 
    in s_dob date, in s_gender varchar(10))
BEGIN
	insert into student_table(first_name, last_name, email, passwords, 
													phone_number, city, dob, gender)
	
    Values
			(f_name, l_name, s_email, s_passwords, s_phoneno, s_city, s_dob, s_gender);
END &
DELIMITER ;

call student_procedure('neha', 'pal', 'neha543@gmail.com', 'neha543', '1234567809', 'roorkee', 
						'2002-10-04', 'female');