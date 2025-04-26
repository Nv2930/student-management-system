#web_table procedures-
DELIMITER &
create procedure course_web_procedure(in s_name varchar(20), in s_email varchar(50), 
	in s_phone numeric, in s_city varchar(20), in s_dob date, in s_gender varchar(10), 
    in s_qualification varchar(20), in s_course varchar(50), in s_batch numeric)
BEGIN
	insert into course_webtech_table(student_name, email, phone_number, city, dob, gender,
			qualification, course, batch)
	Values
		(s_name, s_email, s_phone, s_city, s_dob, s_gender, 
			s_qualification, s_course, s_batch);
END &
DELIMITER ;

call course_web_procedure('neha', 'neha543@gmail.com', 1234567809, 'roorkee', 
						'2002-10-04', 'female', 'bca', 'web development', 1);