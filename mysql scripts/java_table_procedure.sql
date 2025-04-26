#java_table procedures-
DELIMITER &
create procedure course_java_procedure(in s_name varchar(20), in s_email varchar(50), 
	in s_phone numeric, in s_city varchar(20), in s_dob date, in s_gender varchar(10), 
    in s_qualification varchar(20), in s_course varchar(50), in s_batch numeric)
BEGIN
	insert into course_java_table(student_name, email, phone_number, city, dob, gender,
			qualification, course, batch)
	Values
		(s_name, s_email, s_phone, s_city, s_dob, s_gender, 
			s_qualification, s_course, s_batch);
END &
DELIMITER ;

call course_java_procedure('rohit', 'rohit123@gmail.com', 9760321507, 'saharanpur', 
						'2001-07-13', 'male', 'b.com', 'java development', 1);