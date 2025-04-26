#dsa_table procedures-
DELIMITER &
create procedure course_dsa_procedure(in s_name varchar(20), in s_email varchar(50), 
	in s_phone numeric, in s_city varchar(20), in s_dob date, in s_gender varchar(10), 
    in s_qualification varchar(20), in s_course varchar(50), in s_batch numeric)
BEGIN
	insert into course_dsa_table(student_name, email, phone_number, city, dob, gender,
			qualification, course, batch)
	Values
		(s_name, s_email, s_phone, s_city, s_dob, s_gender, 
			s_qualification, s_course, s_batch);
END &
DELIMITER ;

call course_dsa_procedure('mohan', 'mohan321@gmail.com', 7893710241, 'meerut', 
						'2003-10-05', 'male', 'bca', 'dsa', 1);