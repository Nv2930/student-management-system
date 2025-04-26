package admin_portal;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;


class Show_Students extends JFrame{
    JPanel panel1;
    ImageIcon logo;
    public void enroll_Frame(){
        setTitle("StudyPoint");
        setSize(1500, 800);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.ORANGE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //-------------------To set logo-----------------------------
        logo=new ImageIcon("C:\\Google pics\\studypoint_logo2.png");
        setIconImage(logo.getImage());

        //panel1 coding-
        panel1=new JPanel();
        panel1.setBounds(50, 50 ,1380, 675);
        panel1.setLayout(null);
        panel1.setBackground(Color.white);
    }

    JLabel java_batch_label, dsa_batch_label, webtech_batch_label;
    JPanel java_batch_underline, dsa_batch_underline, webtech_batch_underline;   
    JTable java_table2;
    JScrollPane java_scrollbar2;
    JTableHeader table_header2;
    JButton add_button_java, dlt_button_java, update_button_java, add_button_dsa, dlt_button_dsa, update_button_dsa, add_button_web, dlt_button_web, update_button_web;

    public class Java_Batch{
        String s_id, s_name, s_email, s_phoneno, s_city, s_dob, s_gender, s_qualification, s_course, s_batch;

        String  url="jdbc:mysql://localhost:3306/studypoint_database",
            username="root",
            password="nisha@1979",
       
            query3="select * from course_java_table";

        public void java_Batch_Content(){
            enroll_Frame();

            java_batch_label=new JLabel("Java Batch Students");
            java_batch_label.setFont(new Font("Arial", Font.BOLD, 40));
            java_batch_label.setBounds(50,50, 400, 40);
            java_batch_label.setForeground(Color.BLACK);

            //underline text-
            java_batch_underline=new JPanel();
            java_batch_underline.setBounds(50, 95, 400, 3);
            java_batch_underline.setBackground(Color.BLACK);

            panel1.add(java_batch_label);
            panel1.add(java_batch_underline);

            //buttons coding-
            add_button_java=new JButton("Add Students");
            add_button_java.setBounds(50, 500, 200, 40);
            add_button_java.setFont(new Font("Arial", Font.PLAIN, 25));
            add_button_java.setForeground(Color.BLACK);
            add_button_java.setBackground(Color.ORANGE);
            add_button_java.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

            dlt_button_java=new JButton("Delete Students");
            dlt_button_java.setBounds(550, 500, 200, 40);
            dlt_button_java.setFont(new Font("Arial", Font.PLAIN, 25));
            dlt_button_java.setForeground(Color.BLACK);
            dlt_button_java.setBackground(Color.ORANGE);
            dlt_button_java.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

            update_button_java=new JButton("Update Students");
            update_button_java.setBounds(1100, 500, 200, 40);
            update_button_java.setFont(new Font("Arial", Font.PLAIN, 25));
            update_button_java.setForeground(Color.BLACK);
            update_button_java.setBackground(Color.ORANGE);
            update_button_java.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

            add_button_java.addMouseListener(new TestMouseListeners());
            dlt_button_java.addMouseListener(new TestMouseListeners());
            update_button_java.addMouseListener(new TestMouseListeners());

            add_button_java.addActionListener(new TestActionListeners());
            dlt_button_java.addActionListener(new TestActionListeners());
            update_button_java.addActionListener(new TestActionListeners());

            //jdbc code-
            fetch_Java_Students();

            add(panel1);
            setVisible(true);
        }
        public void fetch_Java_Students(){
            try{
                //step1: load & register the driver-
                //step2: create connection-
                Connection con3=DriverManager.getConnection(url, username, password);
    
                //step3: create the object of prepareStatment-
                PreparedStatement ps3=con3.prepareStatement(query3);
    
                //step4: execute the query-
                ResultSet r=ps3.executeQuery();
                ResultSetMetaData rsmd2=r.getMetaData();
                int java_column_count=rsmd2.getColumnCount();
    
                String java_column[];
                java_column=new String[java_column_count];
    
                DefaultTableModel model2=new DefaultTableModel();
                model2.setRowCount(0);
    
    
                for(int i=0; i<java_column_count; i++){
                    java_column[i]=rsmd2.getColumnName(i+1);
    
                    model2.addColumn(java_column[i]);
                }
    
                java_table2=new JTable(model2);

                java_table2.setFont(new Font("Arial", Font.PLAIN, 20));
                java_table2.setRowHeight(30);
                table_header2=java_table2.getTableHeader();
                table_header2.setBackground(Color.ORANGE);
                table_header2.setFont(new Font("Arial", Font.BOLD, 20));
                java_scrollbar2=new JScrollPane(java_table2);
                java_scrollbar2.setBounds(20, 150, 1300, 300);
    

                // Set custom widths for each column
                TableColumnModel columnModel = java_table2.getColumnModel();
    
            
                columnModel.getColumn(0).setPreferredWidth(70);  // ID Column
                columnModel.getColumn(1).setPreferredWidth(300); // Name Column
                columnModel.getColumn(2).setPreferredWidth(450); // Email Column
                columnModel.getColumn(3).setPreferredWidth(280); // Phone Number
                columnModel.getColumn(4).setPreferredWidth(200); // City
                columnModel.getColumn(5).setPreferredWidth(200); // DOB
                columnModel.getColumn(6).setPreferredWidth(150);  // Gender
                columnModel.getColumn(7).setPreferredWidth(250); // Qualification
                columnModel.getColumn(8).setPreferredWidth(380); // Course
                columnModel.getColumn(9).setPreferredWidth(150); // Batch
    

                while(r.next()){
                    s_id =r.getString(1);
                    s_name=r.getString(2);
                    s_email=r.getString(3);
                    s_phoneno=r.getString(4);
                    s_city=r.getString(5);
                    s_dob=r.getString(6);
                    s_gender=r.getString(7);
                    s_qualification=r.getString(8);
                    s_course=r.getString(9);
                    s_batch=r.getString(10);
                
                
                    String java_table_row[]={s_id, s_name, s_email, s_phoneno, s_city, s_dob, s_gender, s_qualification, s_course, s_batch};
    
                    model2.addRow(java_table_row);
                }    
                //step5: close the connections-
                con3.close();
                ps3.close();
    
                panel1.add(java_scrollbar2);
                panel1.add(add_button_java);
                panel1.add(dlt_button_java);
                panel1.add(update_button_java);
            }
            catch(SQLException sql3){
                sql3.printStackTrace();
            }
        }
    }

    public class DSA_Batch{
        JTable dsa_table2;
        JScrollPane dsa_scrollbar2;
        JTableHeader table_header3;

        String  url="jdbc:mysql://localhost:3306/studypoint_database",
            username="root",
            password="nisha@1979",
       
            query3="select * from course_dsa_table";

            String s_id2, s_name2, s_email2, s_phoneno2, s_city2, s_dob2, s_gender2, s_qualification2, s_course2, s_batch2;

        public void dsa_Batch_Content(){
            enroll_Frame();

            dsa_batch_label=new JLabel("DSA Batch Students");
            dsa_batch_label.setFont(new Font("Arial", Font.BOLD, 40));
            dsa_batch_label.setBounds(50,50, 400, 40);
            dsa_batch_label.setForeground(Color.BLACK);

            //underline text-
            dsa_batch_underline=new JPanel();
            dsa_batch_underline.setBounds(50, 95, 400, 3);
            dsa_batch_underline.setBackground(Color.BLACK);

            panel1.add(dsa_batch_label);
            panel1.add(dsa_batch_underline);


            //buttons coding-
            add_button_dsa=new JButton("Add Students");
            add_button_dsa.setBounds(50, 500, 200, 40);
            add_button_dsa.setFont(new Font("Arial", Font.PLAIN, 25));
            add_button_dsa.setForeground(Color.BLACK);
            add_button_dsa.setBackground(Color.ORANGE);
            add_button_dsa.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

            dlt_button_dsa=new JButton("Delete Students");
            dlt_button_dsa.setBounds(550, 500, 200, 40);
            dlt_button_dsa.setFont(new Font("Arial", Font.PLAIN, 25));
            dlt_button_dsa.setForeground(Color.BLACK);
            dlt_button_dsa.setBackground(Color.ORANGE);
            dlt_button_dsa.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

            update_button_dsa=new JButton("Update Students");
            update_button_dsa.setBounds(1100, 500, 200, 40);
            update_button_dsa.setFont(new Font("Arial", Font.PLAIN, 25));
            update_button_dsa.setForeground(Color.BLACK);
            update_button_dsa.setBackground(Color.ORANGE);
            update_button_dsa.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

            panel1.add(add_button_dsa);
            panel1.add(dlt_button_dsa);
            panel1.add(update_button_dsa);

            //events-
            add_button_dsa.addMouseListener(new TestMouseListeners());
            dlt_button_dsa.addMouseListener(new TestMouseListeners());
            update_button_dsa.addMouseListener(new TestMouseListeners());

            add_button_dsa.addActionListener(new TestActionListeners());
            dlt_button_dsa.addActionListener(new TestActionListeners());
            update_button_dsa.addActionListener(new TestActionListeners());

            //JDBC code to fetch dsa students data- 
            dsa_Fetch_Students();       
            
            add(panel1);
            setVisible(true);
        }
        public void dsa_Fetch_Students(){
            try{
                //step1: load & register the driver-
                //step2: create connection-
                Connection con4=DriverManager.getConnection(url, username, password);

                //step3: create the object of prepareStatment-
                PreparedStatement ps4=con4.prepareStatement(query3);

                //step4: execute the query-
                ResultSet r2=ps4.executeQuery();
                ResultSetMetaData rsmd3=r2.getMetaData();
                int dsa_column_count=rsmd3.getColumnCount();

                String dsa_column[];
                dsa_column=new String[dsa_column_count];

                DefaultTableModel model3=new DefaultTableModel();
                model3.setRowCount(0);


                for(int i=0; i<dsa_column_count; i++){
                    dsa_column[i]=rsmd3.getColumnName(i+1);
                    model3.addColumn(dsa_column[i]);
                }

                dsa_table2=new JTable(model3);
                
                dsa_table2.setFont(new Font("Arial", Font.PLAIN, 20));
                dsa_table2.setRowHeight(30);
                table_header3=dsa_table2.getTableHeader();
                table_header3.setBackground(Color.ORANGE);
                table_header3.setFont(new Font("Arial", Font.BOLD, 20));
                dsa_scrollbar2=new JScrollPane(dsa_table2);
                dsa_scrollbar2.setBounds(20, 150, 1300, 300);


                // Set custom widths for each column
                TableColumnModel columnModel2 = dsa_table2.getColumnModel();
               
                columnModel2.getColumn(0).setPreferredWidth(70);  // ID Column
                columnModel2.getColumn(1).setPreferredWidth(300); // Name Column
                columnModel2.getColumn(2).setPreferredWidth(450); // Email Column
                columnModel2.getColumn(3).setPreferredWidth(280); // Phone Number
                columnModel2.getColumn(4).setPreferredWidth(200); // City
                columnModel2.getColumn(5).setPreferredWidth(200); // DOB
                columnModel2.getColumn(6).setPreferredWidth(150);  // Gender
                columnModel2.getColumn(7).setPreferredWidth(250); // Qualification
                columnModel2.getColumn(8).setPreferredWidth(380); // Course
                columnModel2.getColumn(9).setPreferredWidth(150); // Batch

                while(r2.next()){
                    s_id2 =r2.getString(1);
                    s_name2=r2.getString(2);
                    s_email2=r2.getString(3);
                    s_phoneno2=r2.getString(4);
                    s_city2=r2.getString(5);
                    s_dob2=r2.getString(6);
                    s_gender2=r2.getString(7);
                    s_qualification2=r2.getString(8);
                    s_course2=r2.getString(9);
                    s_batch2=r2.getString(10);
              
            
                    String dsa_table_row[]={s_id2, s_name2, s_email2, s_phoneno2, s_city2, s_dob2, s_gender2, s_qualification2, s_course2, s_batch2};

                    model3.addRow(dsa_table_row);
                }

                panel1.add(dsa_scrollbar2);

                //step5: close the connections-
                con4.close();
                ps4.close();
            }
            catch(SQLException sql3){
                sql3.printStackTrace();
            }
        }
    }
    
    public class WebTech_Batch{
        JTable web_Table;
        JScrollPane web_scrollbar2;
        JTableHeader table_header5;

        String  url="jdbc:mysql://localhost:3306/studypoint_database",
            username="root",
            password="nisha@1979",
       
            query4="select * from course_webtech_table";

            String s_id3, s_name3, s_email3, s_phoneno3, s_city3, s_dob3, s_gender3, s_qualification3, s_course3, s_batch3;


        public void webtech_Batch_Content(){
            enroll_Frame();

            webtech_batch_label=new JLabel("Web-Tech Batch Students ");
            webtech_batch_label.setFont(new Font("Arial", Font.BOLD, 40));
            webtech_batch_label.setBounds(50,50, 550, 40);
            webtech_batch_label.setForeground(Color.BLACK);

            //underline text-
            webtech_batch_underline=new JPanel();
            webtech_batch_underline.setBounds(50, 95, 510, 3);
            webtech_batch_underline.setBackground(Color.BLACK);

            panel1.add(webtech_batch_label);
            panel1.add(webtech_batch_underline);

            //buttons coding-
            add_button_web=new JButton("Add Students");
            add_button_web.setBounds(50, 500, 200, 40);
            add_button_web.setFont(new Font("Arial", Font.PLAIN, 25));
            add_button_web.setForeground(Color.BLACK);
            add_button_web.setBackground(Color.ORANGE);
            add_button_web.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

            dlt_button_web=new JButton("Delete Students");
            dlt_button_web.setBounds(550, 500, 200, 40);
            dlt_button_web.setFont(new Font("Arial", Font.PLAIN, 25));
            dlt_button_web.setForeground(Color.BLACK);
            dlt_button_web.setBackground(Color.ORANGE);
            dlt_button_web.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

            update_button_web=new JButton("Update Students");
            update_button_web.setBounds(1100, 500, 200, 40);
            update_button_web.setFont(new Font("Arial", Font.PLAIN, 25));
            update_button_web.setForeground(Color.BLACK);
            update_button_web.setBackground(Color.ORANGE);
            update_button_web.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

            panel1.add(add_button_web);
            panel1.add(dlt_button_web);
            panel1.add(update_button_web);

            //events-
            add_button_web.addMouseListener(new TestMouseListeners());
            dlt_button_web.addMouseListener(new TestMouseListeners());
            update_button_web.addMouseListener(new TestMouseListeners());

            add_button_web.addActionListener(new TestActionListeners());
            dlt_button_web.addActionListener(new TestActionListeners());
            update_button_web.addActionListener(new TestActionListeners());


            //JDBC CODE TO FETCH WEBTECH STUDENTS RECORDS-
            web_Fetch_Students();
        }
        public void web_Fetch_Students(){
            try{
                //step1: load & register the driver-
                //step2: create connection-
                Connection con5=DriverManager.getConnection(url, username, password);

                //step3: create the object of prepareStatment-
                PreparedStatement ps5=con5.prepareStatement(query4);

                //step4: execute the query-
                ResultSet r3=ps5.executeQuery();
                ResultSetMetaData rsmd4=r3.getMetaData();
                int web_column_count=rsmd4.getColumnCount();

                String web_column[];
                web_column=new String[web_column_count];

                DefaultTableModel model4=new DefaultTableModel();
                model4.setRowCount(0);


                for(int i=0; i<web_column_count; i++){
                    web_column[i]=rsmd4.getColumnName(i+1);
                    model4.addColumn(web_column[i]);
                }

                web_Table=new JTable(model4);
                
                web_Table.setFont(new Font("Arial", Font.PLAIN, 20));
                web_Table.setRowHeight(30);
                table_header5=web_Table.getTableHeader();
                table_header5.setBackground(Color.ORANGE);
                table_header5.setFont(new Font("Arial", Font.BOLD, 20));
                web_scrollbar2=new JScrollPane(web_Table);
                web_scrollbar2.setBounds(20, 150, 1300, 300);


                // Set custom widths for each column
                TableColumnModel columnModel2 = web_Table.getColumnModel();

               
                columnModel2.getColumn(0).setPreferredWidth(70);  // ID Column
                columnModel2.getColumn(1).setPreferredWidth(300); // Name Column
                columnModel2.getColumn(2).setPreferredWidth(450); // Email Column
                columnModel2.getColumn(3).setPreferredWidth(280); // Phone Number
                columnModel2.getColumn(4).setPreferredWidth(200); // City
                columnModel2.getColumn(5).setPreferredWidth(200); // DOB
                columnModel2.getColumn(6).setPreferredWidth(150);  // Gender
                columnModel2.getColumn(7).setPreferredWidth(250); // Qualification
                columnModel2.getColumn(8).setPreferredWidth(380); // Course
                columnModel2.getColumn(9).setPreferredWidth(150); // Batch

                while(r3.next()){
                    s_id3 =r3.getString(1);
                    s_name3=r3.getString(2);
                    s_email3=r3.getString(3);
                    s_phoneno3=r3.getString(4);
                    s_city3=r3.getString(5);
                    s_dob3=r3.getString(6);
                    s_gender3=r3.getString(7);
                    s_qualification3=r3.getString(8);
                    s_course3=r3.getString(9);
                    s_batch3=r3.getString(10);
              
            
                    String web_table_row[]={s_id3, s_name3, s_email3, s_phoneno3, s_city3, s_dob3, s_gender3, s_qualification3, s_course3, s_batch3};

                    model4.addRow(web_table_row);
                }
                panel1.add(web_scrollbar2);

                //step5: close the connections-
                con5.close();
                ps5.close();

                add(panel1);
                setVisible(true);
            }
            catch(SQLException sql3){
                sql3.printStackTrace();
            }
        }
    }
    
    public class TestMouseListeners implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent me){
            if(me.getSource()==add_button_java){
                add_button_java.setBackground(Color.GREEN);
            }
            else if(me.getSource()==dlt_button_java){
                dlt_button_java.setBackground(Color.GREEN);
            }
            else if(me.getSource()==update_button_java){
                update_button_java.setBackground(Color.GREEN);
            }
            else if(me.getSource()==add_button_dsa){
                add_button_dsa.setBackground(Color.GREEN);
            }
            else if(me.getSource()==dlt_button_dsa){
                dlt_button_dsa.setBackground(Color.GREEN);
            }
            else if(me.getSource()==update_button_dsa){
                update_button_dsa.setBackground(Color.GREEN);
            }
            else if(me.getSource()==add_button_web){
                add_button_web.setBackground(Color.GREEN);
            }
            else if(me.getSource()==dlt_button_web){
                dlt_button_web.setBackground(Color.GREEN);
            }
            else if(me.getSource()==update_button_web){
                update_button_web.setBackground(Color.GREEN);
            }
        }
        @Override
        public void mouseExited(MouseEvent me){
            if(me.getSource()==add_button_java){
                add_button_java.setBackground(Color.ORANGE);
            }
            else if(me.getSource()==dlt_button_java){
                dlt_button_java.setBackground(Color.ORANGE);
            }
            else if(me.getSource()==update_button_java){
                update_button_java.setBackground(Color.ORANGE);
            }
            else if(me.getSource()==add_button_dsa){
               add_button_dsa.setBackground(Color.ORANGE);
            }
            else if(me.getSource()==dlt_button_dsa){
                dlt_button_dsa.setBackground(Color.ORANGE);
            }
            else if(me.getSource()==update_button_dsa){
                update_button_dsa.setBackground(Color.ORANGE);
            } 
            else if(me.getSource()==add_button_web){
               add_button_web.setBackground(Color.ORANGE);
            }
            else if(me.getSource()==dlt_button_web){
                dlt_button_web.setBackground(Color.ORANGE);
            }
            else if(me.getSource()==update_button_web){
                update_button_web.setBackground(Color.ORANGE);
            } 
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            // TODO Auto-generated method stub
           
        }
        @Override
        public void mousePressed(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            // TODO Auto-generated method stub
            
        }
    }
   
    public class TestActionListeners implements ActionListener{
        Delete_Students dlt_students;
        Update_Students update_student;
        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource()==add_button_java || ae.getSource()==add_button_dsa || ae.getSource()==add_button_web){
                Add_Students enrol_new_students=new Add_Students();
                enrol_new_students.enrollment_Frame_Content();
            }
            else if(ae.getSource()==dlt_button_java){
                dlt_students=new Delete_Students();
                dlt_students.delete_java_student();
            }
            else if(ae.getSource()==dlt_button_dsa){
                dlt_students=new Delete_Students();
                dlt_students.delete_dsa_students();
            }
            else if(ae.getSource()==dlt_button_web){
                dlt_students=new Delete_Students();
                dlt_students.delete_web_students();
            }
            else if(ae.getSource()==update_button_java){
                update_student=new Update_Students();
                update_student.update_Java_Students();
            }
            else if(ae.getSource()==update_button_dsa){
                update_student=new Update_Students();
                update_student.update_Dsa_Students();
            }
            else if(ae.getSource()==update_button_web){
                update_student=new Update_Students();
                update_student.update_Web_Students();
            }
        }
    }
}

class Add_Students extends Show_Students{
    String submit_placeholder1="student name", submit_placeholder2="email", submit_placeholder3="phone number", submit_placeholder4="address/city";
    JPanel enroll_underline;
    JLabel enrollment_form, b_day_label, gender_label, student_qualification_label, student_course_label, batch_label;
    JTextField submit_hiddenField, student_name, student_email, student_phoneno, student_address;    
    
    JRadioButton m_radio, f_radio, o_radio;
    JComboBox<String>submit_form_month, student_qualifications_combobox, student_course_combobox, student_batch;
    JComboBox<Integer>submit_form_date, submit_form_year;

    JButton submit_button;

    public void enrollment_Frame_Content(){
        //---------------------Frame Coding--------------------------
        enroll_Frame();
        //JLabels-
        enrollment_form=new JLabel("Enrollment Form");
        enrollment_form.setFont(new Font("Arial", Font.BOLD, 40));
        enrollment_form.setBounds(50, 50, 330, 50);

            enroll_underline=new JPanel();
            enroll_underline.setBounds(50, 95, 320, 3);
            enroll_underline.setBackground(Color.black);
            panel1.add(enroll_underline);

        b_day_label=new JLabel("Date of Birth");
        b_day_label.setBounds(150, 280, 200, 45);
        b_day_label.setFont(new Font("Arial", Font.BOLD, 23));
        b_day_label.setForeground(Color.BLACK);

        gender_label=new JLabel("Select Gender");
        gender_label.setBounds(150, 340, 200, 45);
        gender_label.setFont(new Font("Arial", Font.BOLD, 23));
        gender_label.setForeground(Color.BLACK);

        student_qualification_label=new JLabel("Qualification");
        student_qualification_label.setBounds(150, 400, 170, 45);
        student_qualification_label.setFont(new Font("Arial", Font.BOLD, 24));
        
        student_course_label=new JLabel("Select Course");
        student_course_label.setBounds(150, 465, 170, 45);
        student_course_label.setFont(new Font("Arial", Font.BOLD, 23));

        batch_label=new JLabel("Batch");
        batch_label.setBounds(150, 526, 170, 45);
        batch_label.setForeground(Color.BLACK);
        batch_label.setFont(new Font("Arial", Font.BOLD, 23));

        //JTextfields-
        student_name=new JTextField(submit_placeholder1);
        student_name.setBounds(150,150, 250, 45);
        student_name.setFont(new Font("Arial", Font.PLAIN, 23));
        student_name.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        
        student_email=new JTextField(submit_placeholder2);
        student_email.setBounds(470,150, 250, 45);
        student_email.setFont(new Font("Arial", Font.PLAIN, 23));
        student_email.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        student_phoneno=new JTextField(submit_placeholder3);
        student_phoneno.setBounds(150,210, 250, 45);
        student_phoneno.setFont(new Font("Arial", Font.PLAIN, 23));
        student_phoneno.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        student_address=new JTextField(submit_placeholder4);
        student_address.setBounds(470,210, 250, 45);
        student_address.setFont(new Font("Arial", Font.PLAIN, 23));
        student_address.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        submit_hiddenField=new JTextField();
        submit_hiddenField.setBounds(0, 0, 0, 0);
        panel1.add(submit_hiddenField);

        student_name.addFocusListener(new TestFocusListener12());
        student_email.addFocusListener(new TestFocusListener12());
        student_phoneno.addFocusListener(new TestFocusListener12());
        student_address.addFocusListener(new TestFocusListener12());

        //-------------------------JCombobox coding-------------------------------------------
        //------------Dates-----------
        Integer date2[];
        date2=new Integer[31];

        for(int j=0; j<31; j++){
            date2[j]=j+1;
        }
        submit_form_date=new JComboBox<>(date2);
        submit_form_date.setBounds(350, 290,60, 30);
        submit_form_date.setFont(new Font("Arial", Font.PLAIN, 20));
        submit_form_date.setBackground(Color.WHITE);
        submit_form_date.setForeground(Color.BLACK);

        //--------------Months---------------
        String month2[]={
            "January", "Februrary", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"
        };
        submit_form_month=new JComboBox<>(month2);
        submit_form_month.setBounds(480, 290, 150, 30);
        submit_form_month.setFont(new Font("Arial", Font.PLAIN, 20));
        submit_form_month.setBackground(Color.WHITE);
        submit_form_month.setForeground(Color.BLACK);

        String qual[]={"10th", "12th", "Graduation", "PG"};
        student_qualifications_combobox=new JComboBox<>(qual);
        student_qualifications_combobox.setBounds(350, 410, 120, 35);
        student_qualifications_combobox.setFont(new Font("Arial", Font.PLAIN,20));
        student_qualifications_combobox.setForeground(Color.BLACK);
        student_qualifications_combobox.setBackground(Color.WHITE);


        String course[]={
            "Java Development", "Data Structures & Algorithms", "Web Development"
        };

        student_course_combobox=new JComboBox<>(course);
        student_course_combobox.setBounds(350, 475, 350, 35);
        student_course_combobox.setFont(new Font("Arial", Font.PLAIN,20));
        student_course_combobox.setForeground(Color.BLACK);
        student_course_combobox.setBackground(Color.WHITE);


        String batch[]={"Batch1", "Batch2", "Batch3"};
        student_batch=new JComboBox<>(batch);
        student_batch.setBounds(350, 535, 100, 35);
        student_batch.setFont(new Font("Arial", Font.PLAIN,20));
        student_batch.setForeground(Color.BLACK);
        student_batch.setBackground(Color.WHITE);

        //---------------year---------------
        Integer year2[];
        year2=new Integer[95];
        for(int k=0; k<95; k++){
            year2[k]=k+1930;
        }
        submit_form_year=new JComboBox<>(year2);
        submit_form_year.setBounds(690, 290, 100, 30);
        submit_form_year.setFont(new Font("Arial", Font.PLAIN, 20));
        submit_form_year.setBackground(Color.WHITE);
        submit_form_year.setForeground(Color.BLACK);


        //----------------------------JRadioButton coding----------------------------------
        m_radio=new JRadioButton("Male");
        m_radio.setBounds(350, 350, 70, 28);
        m_radio.setFont(new Font("Arial", Font.PLAIN, 21));
        m_radio.setBackground(Color.WHITE);
        m_radio.setForeground(Color.BLACK);

        f_radio=new JRadioButton("Female");
        f_radio.setBounds(480, 350, 100, 28);
        f_radio.setFont(new Font("Arial", Font.PLAIN, 21));
        f_radio.setBackground(Color.WHITE);
        f_radio.setForeground(Color.BLACK);
        
        o_radio=new JRadioButton("Other");
        o_radio.setBounds(650, 350, 100, 28);
        o_radio.setFont(new Font("Arial", Font.PLAIN, 21));
        o_radio.setBackground(Color.WHITE);
        o_radio.setForeground(Color.BLACK);

        ButtonGroup bg=new ButtonGroup();
        bg.add(m_radio);
        bg.add(f_radio);
        bg.add(o_radio);

        //JButton Coding-
        submit_button=new JButton("Submit");
        submit_button.setBounds(150, 600, 600, 45);
        submit_button.setFont(new Font("Arial", Font.BOLD, 30));
        submit_button.setBackground(Color.WHITE);
        submit_button.setForeground(Color.BLACK);
        submit_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        submit_button.addActionListener(new TestActionListener10());

        
        panel1.add(enrollment_form);
        panel1.add(student_name);
        panel1.add(student_email);
        panel1.add(student_phoneno);
        panel1.add(student_address);
        panel1.add(b_day_label);
        panel1.add(gender_label);
        panel1.add(submit_form_date);
        panel1.add(submit_form_month);
        panel1.add(submit_form_year);
        panel1.add(m_radio);
        panel1.add(f_radio);
        panel1.add(o_radio);
        panel1.add(student_qualification_label);
        panel1.add(student_qualifications_combobox);
        panel1.add(student_course_label);
        panel1.add(student_course_combobox);
        panel1.add(batch_label);
        panel1.add(student_batch);
        panel1.add(submit_button);

        add(panel1);
        setVisible(true);
    }
    
    public class TestFocusListener12 implements FocusListener{
        public void focusGained(FocusEvent f2){
            if(f2.getSource()==student_name){
                if(student_name.getText().equals(submit_placeholder1)){
                    student_name.setText("");
                }
            }
            else if(f2.getSource()==student_email){
                if(student_email.getText().equals(submit_placeholder2)){
                    student_email.setText("");
                }
            }
            else if(f2.getSource()==student_phoneno){
                if(student_phoneno.getText().equals(submit_placeholder3)){
                    student_phoneno.setText("");
                }
            }
            else if(f2.getSource()==student_address){
                if(student_address.getText().equals(submit_placeholder4)){
                    student_address.setText("");
                }
            }
        }
        public void focusLost(FocusEvent f2){
            if(f2.getSource()==student_name){
                if(student_name.getText().isEmpty()){
                    student_name.setText(submit_placeholder1);
                }
            }
            else if(f2.getSource()==student_email){
                if(student_email.getText().isEmpty()){
                    student_email.setText(submit_placeholder2);
                }
            }
            else if(f2.getSource()==student_phoneno){
                if(student_phoneno.getText().isEmpty()){
                    student_phoneno.setText(submit_placeholder3);
                }
            }
            else if(f2.getSource()==student_address){
                if(student_address.getText().isEmpty()){
                    student_address.setText(submit_placeholder4);
                }
            }
        }
    }
    
    public class TestActionListener10 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==submit_button){
                enroll_Jdbc_Function();
            }
        }
        public void enroll_Jdbc_Function(){
            String  url="jdbc:mysql://localhost:3306/studypoint_database",
                    username="root",
                    password="nisha@1979",
                    query1="insert into course_java_table(student_name, email, phone_number, city, dob, gender,   qualification, course, batch) values (?,?,?,?,?,?,?,?,?)",
                    
                    query2="insert into course_dsa_table(student_name, email, phone_number, city, dob, gender,   qualification, course, batch) values (?,?,?,?,?,?,?,?,?)",
                    
                    query3="insert into course_webtech_table(student_name, email, phone_number, city, dob, gender,qualification, course, batch) values (?,?,?,?,?,?,?,?,?)";

            //To fetch input date-
            //student_name, student_email, student_phoneno, student_address, submit_form_date, submit_form_year;
            String  enroll_name=student_name.getText(),
            enroll_email=student_email.getText(),
            enroll_city=student_address.getText();
            String enroll_phone=student_phoneno.getText();
            
            //DOB-
            String enroll_date=submit_form_date.getSelectedItem().toString();
            String enroll_month=submit_form_month.getSelectedItem().toString();
            String enroll_year=submit_form_year.getSelectedItem().toString();


            int month_value2=0;
            if(enroll_month.equals("January")){
                month_value2=1;
            }
            else if(enroll_month.equals("Februrary")){
                month_value2=2;
            }
            else if(enroll_month.equals("March")){
                month_value2=3;
            }
            else if(enroll_month.equals("April")){
                month_value2=4;
            }
            else if(enroll_month.equals("May")){
                month_value2=5;
            }
            else if(enroll_month.equals("June")){
                month_value2=6;
            }
            else if(enroll_month.equals("July")){
                month_value2=7;
            }
            else if(enroll_month.equals("August")){
                month_value2=8;
            }
            if(enroll_month.equals("September")){
                month_value2=9;
            }
            else if(enroll_month.equals("October")){
                month_value2=10;
            }
            else if(enroll_month.equals("November")){
                month_value2=11;
            }
            else if(enroll_month.equals("December")){
                month_value2=12;
            }


            String enorll_dob=enroll_year+"-"+month_value2+"-"+enroll_date;

            //gender- m_radio, f_radio, o_radio
            String enroll_gender="";
            if(m_radio.isSelected()){
                enroll_gender="male";
            }
            else if(f_radio.isSelected()){
                enroll_gender="female";
            }
            else if(o_radio.isSelected()){
                enroll_gender="other";
            }

            //qualification, course, batch-student_qualifications_combobox, student_course_combobox, student_batch
            String  enroll_qualification=student_qualifications_combobox.getSelectedItem().toString(),
                    enroll_course=student_course_combobox.getSelectedItem().toString();
            
            String enroll_batch=student_batch.getSelectedItem().toString();

            int batch_value=0;
            if(enroll_batch.equals("Batch1")){
                batch_value=1;
            }
            else if(enroll_batch.equals("Batch2")){
                batch_value=2;
            }
            else if(enroll_batch.equals("Batch3")){
                batch_value=3;
            }

            System.out.println(enroll_name+"\n"+enroll_email+"\n"+enroll_phone+"\n"+enroll_city+"\n"+enorll_dob+"\n"+enroll_gender+"\n"+enroll_qualification+"\n"+enroll_course+"\n"+enroll_batch);

            try{
                //step1: register & load the driver-
                //step2: create a connection-
                Connection conn3=DriverManager.getConnection(url, username, password);

                if(enroll_name.isEmpty() || enroll_email.isEmpty() || student_phoneno.getText().isEmpty() || 
                    enroll_city.isEmpty() || enroll_course.isEmpty() || enorll_dob.isEmpty() || enroll_gender.isEmpty()
                    || enroll_qualification.isEmpty() || enroll_batch.isEmpty()){

                    JOptionPane.showMessageDialog(null, "please fill form correctly", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                }
                else if(enroll_course.equals("Java Development")){
                    //step3: create the object of prepareStatement-
                    PreparedStatement ps1=conn3.prepareStatement(query1);
                    ps1.setString(1, enroll_name);
                    ps1.setString(2, enroll_email);
                    ps1.setString(3, enroll_phone);
                    ps1.setString(4, enroll_city);
                    ps1.setString(5, enorll_dob);
                    ps1.setString(6, enroll_gender);
                    ps1.setString(7, enroll_qualification);
                    ps1.setString(8, enroll_course);
                    ps1.setInt(9, batch_value);
    
                    //step4: execute the query-
                    int x=ps1.executeUpdate();
                    if(x>0){
                        submit_button.setBackground(Color.GREEN);
                        submit_button.setText("Submitted");

                        JOptionPane.showMessageDialog(null, "Hurray! Student Added in Java Course", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);


                        Show_Students show_java=new Show_Students();
                        Show_Students.Java_Batch java_batch=show_java.new Java_Batch();
                        java_batch.java_Batch_Content();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Failed to Enrolled in Java Course", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                    }
    
                    ps1.close();
                }
                else if(enroll_course.equals("Data Structures & Algorithms")){
                    //step3: create the object of prepareStatement-
                    PreparedStatement ps2=conn3.prepareStatement(query2);
                    ps2.setString(1, enroll_name);
                    ps2.setString(2, enroll_email);
                    ps2.setString(3, enroll_phone);
                    ps2.setString(4, enroll_city);
                    ps2.setString(5, enorll_dob);
                    ps2.setString(6, enroll_gender);
                    ps2.setString(7, enroll_qualification);
                    ps2.setString(8, enroll_course);
                    ps2.setInt(9, batch_value);
    
                    //step4: execute the query-
                    int y=ps2.executeUpdate();
                    if(y>0){
                        submit_button.setBackground(Color.GREEN);
                        submit_button.setText("Submitted");

                        JOptionPane.showMessageDialog(null, "Hurray! Student Added in DSA Course", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                        Show_Students show_dsa=new Show_Students();
                        Show_Students.DSA_Batch dsa_batch=show_dsa.new DSA_Batch();
                        dsa_batch.dsa_Batch_Content();
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Failed to Enrolled in DSA Course", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                    }
    
                    ps2.close();
                }
                else if(enroll_course.equals("Web Development")){
                    //step3: create the object of prepareStatement-
                    PreparedStatement ps3=conn3.prepareStatement(query3);
                    ps3.setString(1, enroll_name);
                    ps3.setString(2, enroll_email);
                    ps3.setString(3, enroll_phone);
                    ps3.setString(4, enroll_city);
                    ps3.setString(5, enorll_dob);
                    ps3.setString(6, enroll_gender);
                    ps3.setString(7, enroll_qualification);
                    ps3.setString(8, enroll_course);
                    ps3.setInt(9, batch_value);
    
                    //step4: execute the query-
                    int z=ps3.executeUpdate();
                    if(z>0){
                        submit_button.setBackground(Color.GREEN);
                        submit_button.setText("Submitted");

                        JOptionPane.showMessageDialog(null, "Hurray! Student added in Web Development Course", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);


                        Show_Students show_web=new Show_Students();
                        Show_Students.WebTech_Batch web_tech_batch=show_web.new WebTech_Batch();
                        web_tech_batch.webtech_Batch_Content();

                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Failed to Enrolled in Web Development Course", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                    }
    
                    ps3.close();
                }
                //step5: close the connection-
                conn3.close();
            }catch(SQLException sql){
                sql.printStackTrace();
            }
        }
    }

}

class Delete_Students extends Show_Students{
    String  url="jdbc:mysql://localhost:3306/studypoint_database",
            username="root",
            password="nisha@1979",

            
            java_query1="select id from course_java_table where id=?",
            java_query2="delete from course_java_table where id=?",

            
            dsa_query1="select id from course_dsa_table where id=?",
            dsa_query2="delete from course_dsa_table where id=?",


            web_query1="select id from course_webtech_table where id=?",
            web_query2="delete from course_webtech_table where id=?";

    public void delete_java_student(){
        String input_id_java=JOptionPane.showInputDialog(null, "enter student id", "Dialog", JOptionPane.QUESTION_MESSAGE);
        int java_student_id=Integer.parseInt(input_id_java);

        try{
            //JDBC code to check if java_student_id exists in course_java_table-
            Connection con_java=DriverManager.getConnection(url, username, password);
            
            PreparedStatement ps_java=con_java.prepareStatement(java_query1);
            ps_java.setInt(1, java_student_id);

            ResultSet rs_java=ps_java.executeQuery();

            if(rs_java.next()){
                System.out.println("Student exists");

                int selected_value1=JOptionPane.showConfirmDialog(null, "Are you sure want to delete?", "Dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);

                if(selected_value1==0){
                    try{
                        Connection con_java2=DriverManager.getConnection(url, username, password);
    
                        PreparedStatement ps_java2=con_java2.prepareStatement(java_query2);
                        ps_java2.setInt(1, java_student_id);
    
                        int a=ps_java2.executeUpdate();
                        if(a>0){
                            JOptionPane.showMessageDialog(null, "successfully deleted", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                            Show_Students.Java_Batch java_students=new Java_Batch();
                            java_students.java_Batch_Content();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "failed to delete", "Dialog Box", JOptionPane.ERROR_MESSAGE, null); 
                        }
    
                        con_java2.close();
                        ps_java2.close();
                    }
                    catch(SQLException s){
                        s.printStackTrace();
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Id", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);   
            }

            con_java.close();
            ps_java.close();
        }catch(SQLException s){
            s.printStackTrace();
        }
    }
    
    public void delete_dsa_students(){

        String input_id_dsa=JOptionPane.showInputDialog(null, "enter student id", "Dialog", JOptionPane.QUESTION_MESSAGE);
        int dsa_student_id=Integer.parseInt(input_id_dsa);

        try{
            //JDBC code to check if dsa_student_id exists in course_java_table-
            Connection con_dsa=DriverManager.getConnection(url, username, password);
            
            PreparedStatement ps_dsa=con_dsa.prepareStatement(dsa_query1);
            ps_dsa.setInt(1, dsa_student_id);

            ResultSet rs_dsa=ps_dsa.executeQuery();

            if(rs_dsa.next()){
                System.out.println("Student exists");

                int selected_value2=JOptionPane.showConfirmDialog(null, "Are you sure want to delete?", "Dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);

                if(selected_value2==0){
                    try{
                        Connection con_dsa2=DriverManager.getConnection(url, username, password);
    
                        PreparedStatement ps_dsa2=con_dsa2.prepareStatement(dsa_query2);
                        ps_dsa2.setInt(1, dsa_student_id);
    
                        int b=ps_dsa2.executeUpdate();
                        if(b>0){
                            JOptionPane.showMessageDialog(null, "successfully deleted", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                            Show_Students.DSA_Batch dsa_students=new DSA_Batch();
                            dsa_students.dsa_Batch_Content();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "failed to delete", "Dialog Box", JOptionPane.ERROR_MESSAGE, null); 
                        }
                        con_dsa2.close();
                        ps_dsa2.close();
                    }
                    catch(SQLException s){
                        s.printStackTrace();
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Id", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);   
            }
            con_dsa.close();
            ps_dsa.close();
        }
        catch(SQLException s){
            s.printStackTrace();
        }
    }
    
    public void delete_web_students(){

        String input_id_web=JOptionPane.showInputDialog(null, "enter student id", "Dialog", JOptionPane.QUESTION_MESSAGE);
        int dsa_student_web=Integer.parseInt(input_id_web);

        try{
            //JDBC code to check if dsa_student_web exists in course_java_table-
            Connection con_web=DriverManager.getConnection(url, username, password);
            
            PreparedStatement ps_web=con_web.prepareStatement(web_query1);
            ps_web.setInt(1, dsa_student_web);

            ResultSet rs_web=ps_web.executeQuery();

            if(rs_web.next()){
                System.out.println("Student exists");

                int selected_value3=JOptionPane.showConfirmDialog(null, "Are you sure want to delete?", "Dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);

                if(selected_value3==0){
                    try{
                        Connection con_web2=DriverManager.getConnection(url, username, password);
    
                        PreparedStatement ps_web2=con_web2.prepareStatement(web_query2);
                        ps_web2.setInt(1, dsa_student_web);
    
                        int c=ps_web2.executeUpdate();
                        if(c>0){
                            JOptionPane.showMessageDialog(null, "successfully deleted", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                            Show_Students.WebTech_Batch web_students=new WebTech_Batch();
                            web_students.webtech_Batch_Content();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "failed to delete", "Dialog Box", JOptionPane.ERROR_MESSAGE, null); 
                        }
                        con_web2.close();
                        ps_web2.close();
                    }
                    catch(SQLException s){
                        s.printStackTrace();
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Id", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);   
            }
            con_web.close();
            ps_web.close();
        }
        catch(SQLException s){
            s.printStackTrace();
        }
    }
}

class Update_Students extends Show_Students{
    String  url="jdbc:mysql://localhost:3306/studypoint_database",
            user_name="root",
            password="nisha@1979",

            
            query1_java="select id from course_java_table where id=?",
            query2_java="select * from course_java_table",
           
            query1_dsa="select id from course_dsa_table where id=?",
            query2_dsa="select * from course_dsa_table",

            
            query1_webtech="select id from course_webtech_table where id=?",
            query2_webtech="select * from course_webtech_table";
            
    
    public void update_Java_Students(){
        String input_id_java2=JOptionPane.showInputDialog(null, "enter student id", "Dialog", JOptionPane.QUESTION_MESSAGE);

        int id_value_java=Integer.parseInt(input_id_java2);

        //Jdbc code to check if id exists in the course_webtech_table-

        try{
            Connection con_java=DriverManager.getConnection(url, user_name, password);
            
            PreparedStatement ps_java=con_java.prepareStatement(query1_java);
            ps_java.setInt(1, id_value_java);

            ResultSet rs_java=ps_java.executeQuery();

            if(rs_java.next()){
                System.out.println("Student exists");

                String input_column_java=JOptionPane.showInputDialog(null, "enter column name", "Dialog", JOptionPane.QUESTION_MESSAGE);

                //jdbc code to check if input column exists in the course_webtech_table-
                try{    
                    Connection con_java2=DriverManager.getConnection(url, user_name, password);
                    
                    PreparedStatement ps_java2=con_java2.prepareStatement(query2_java);

                    ResultSet rs_java2=ps_java2.executeQuery();
                    
                    ResultSetMetaData rsmd_java=rs_java2.getMetaData();

                    if((rsmd_java.getColumnName(1).matches(input_column_java) || rsmd_java.getColumnName(2).matches(input_column_java) || rsmd_java.getColumnName(3).matches(input_column_java) || rsmd_java.getColumnName(4).matches(input_column_java) || rsmd_java.getColumnName(5).matches(input_column_java) || rsmd_java.getColumnName(6).matches(input_column_java) || rsmd_java.getColumnName(7).matches(input_column_java) || rsmd_java.getColumnName(8).matches(input_column_java) || rsmd_java.getColumnName(9).matches(input_column_java) || rsmd_java.getColumnName(10).matches(input_column_java))){

                        System.out.println("column exists");

                        String value_java=JOptionPane.showInputDialog(null, "enter the value", "Dialog", JOptionPane.QUESTION_MESSAGE);


                        //JDBC Code after comes to know that both id_value_java and input_column_java exists in the table to update record-
                        String query3_java="update course_java_table set "+input_column_java+"= ? where id=?";
                        try{
                            Connection con_java3=DriverManager.getConnection(url, user_name, password);
                            
                            PreparedStatement ps_java3=con_java3.prepareStatement(query3_java);
                            ps_java3.setString(1, value_java);
                            ps_java3.setInt(2, id_value_java);

                            int x=ps_java3.executeUpdate();

                            if(x>0){
                                JOptionPane.showMessageDialog(null, "successfully updated", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                                Show_Students.Java_Batch show_java_students=new Java_Batch();
                                show_java_students.java_Batch_Content();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "failed to update", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                            }

                            con_java3.close();
                            ps_java3.close();
                        }
                        catch(SQLException sql_exp){
                            sql_exp.printStackTrace();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "column not exists", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                    }
                    con_java2.close();
                    ps_java2.close();
                }
                catch(SQLException sql_exp){
                    sql_exp.printStackTrace();
                }  
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid ID", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
            }
            con_java.close();
            ps_java.close();
        }catch(SQLException sql_exp){
            sql_exp.printStackTrace();
        }
    }
    
    public void update_Dsa_Students(){
        String input_id_dsa2=JOptionPane.showInputDialog(null, "enter student id", "Dialog", JOptionPane.QUESTION_MESSAGE);

        int id_value_dsa=Integer.parseInt(input_id_dsa2);

        //Jdbc code to check if id exists in the course_webtech_table-

        try{
            Connection con_dsa=DriverManager.getConnection(url, user_name, password);
            
            PreparedStatement ps_dsa=con_dsa.prepareStatement(query1_dsa);
            ps_dsa.setInt(1, id_value_dsa);

            ResultSet rs_dsa=ps_dsa.executeQuery();

            if(rs_dsa.next()){
                System.out.println("Student exists");

                String input_column_dsa=JOptionPane.showInputDialog(null, "enter column name", "Dialog", JOptionPane.QUESTION_MESSAGE);

                //jdbc code to check if input column exists in the course_webtech_table-
                try{    
                    Connection con_dsa2=DriverManager.getConnection(url, user_name, password);
                    
                    PreparedStatement ps_dsa2=con_dsa2.prepareStatement(query2_dsa);

                    ResultSet rs_dsa2=ps_dsa2.executeQuery();
                    
                    ResultSetMetaData rsmd_dsa=rs_dsa2.getMetaData();

                    if((rsmd_dsa.getColumnName(1).matches(input_column_dsa) || rsmd_dsa.getColumnName(2).matches(input_column_dsa) || rsmd_dsa.getColumnName(3).matches(input_column_dsa) || rsmd_dsa.getColumnName(4).matches(input_column_dsa) || rsmd_dsa.getColumnName(5).matches(input_column_dsa) || rsmd_dsa.getColumnName(6).matches(input_column_dsa) || rsmd_dsa.getColumnName(7).matches(input_column_dsa) || rsmd_dsa.getColumnName(8).matches(input_column_dsa) || rsmd_dsa.getColumnName(9).matches(input_column_dsa) || rsmd_dsa.getColumnName(10).matches(input_column_dsa))){

                        System.out.println("column exists");

                        String value_dsa=JOptionPane.showInputDialog(null, "enter the value", "Dialog", JOptionPane.QUESTION_MESSAGE);


                        //JDBC Code after comes to know that both id_value_dsa and input_column_dsa exists in the table to update record-
                        String query3_dsa="update course_dsa_table set "+input_column_dsa+"= ? where id=?";
                        try{
                            Connection con_dsa3=DriverManager.getConnection(url, user_name, password);
                            
                            PreparedStatement ps_dsa3=con_dsa3.prepareStatement(query3_dsa);
                            ps_dsa3.setString(1, value_dsa);
                            ps_dsa3.setInt(2, id_value_dsa);

                            int y=ps_dsa3.executeUpdate();

                            if(y>0){
                                JOptionPane.showMessageDialog(null, "successfully updated", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                                Show_Students.DSA_Batch show_dsa_students=new DSA_Batch();
                                show_dsa_students.dsa_Batch_Content();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "failed to update", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                            }

                            con_dsa3.close();
                            ps_dsa3.close();
                        }
                        catch(SQLException sql_exp){
                            sql_exp.printStackTrace();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "column not exists", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                    }
                    con_dsa2.close();
                    ps_dsa2.close();
                }
                catch(SQLException sql_exp){
                    sql_exp.printStackTrace();
                }  
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid ID", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
            }
            con_dsa.close();
            ps_dsa.close();
        }catch(SQLException sql_exp){
            sql_exp.printStackTrace();
        }
    }
    
    public void update_Web_Students(){
        String input_id_web2=JOptionPane.showInputDialog(null, "enter student id", "Dialog", JOptionPane.QUESTION_MESSAGE);

        int id_value_web=Integer.parseInt(input_id_web2);

        //Jdbc code to check if id exists in the course_webtech_table-

        try{
            Connection con_web=DriverManager.getConnection(url, user_name, password);
            
            PreparedStatement ps_web=con_web.prepareStatement(query1_webtech);
            ps_web.setInt(1, id_value_web);

            ResultSet rs_web=ps_web.executeQuery();

            if(rs_web.next()){
                System.out.println("Student exists");

                String input_column_webtech=JOptionPane.showInputDialog(null, "enter column name", "Dialog", JOptionPane.QUESTION_MESSAGE);

                //jdbc code to check if input column exists in the course_webtech_table-
                try{    
                    Connection con_web2=DriverManager.getConnection(url, user_name, password);
                    
                    PreparedStatement ps_web2=con_web2.prepareStatement(query2_webtech);

                    ResultSet rs_web2=ps_web2.executeQuery();
                    
                    ResultSetMetaData rsmd_web=rs_web2.getMetaData();

                    if((rsmd_web.getColumnName(1).matches(input_column_webtech) || rsmd_web.getColumnName(2).matches(input_column_webtech) || rsmd_web.getColumnName(3).matches(input_column_webtech) || rsmd_web.getColumnName(4).matches(input_column_webtech) || rsmd_web.getColumnName(5).matches(input_column_webtech) || rsmd_web.getColumnName(6).matches(input_column_webtech) || rsmd_web.getColumnName(7).matches(input_column_webtech) || rsmd_web.getColumnName(8).matches(input_column_webtech) || rsmd_web.getColumnName(9).matches(input_column_webtech) || rsmd_web.getColumnName(10).matches(input_column_webtech))){

                        System.out.println("column exists");

                        String value_web=JOptionPane.showInputDialog(null, "enter the value", "Dialog", JOptionPane.QUESTION_MESSAGE);


                        //JDBC Code after comes to know that both id_value_web and input_column_webtech exists in the table to update record-
                        String query3_webtech="update course_webtech_table set "+input_column_webtech+"= ? where id=?";
                        try{
                            Connection con_web3=DriverManager.getConnection(url, user_name, password);
                            
                            PreparedStatement ps_web3=con_web3.prepareStatement(query3_webtech);
                            ps_web3.setString(1, value_web);
                            ps_web3.setInt(2, id_value_web);

                            int z=ps_web3.executeUpdate();

                            if(z>0){
                                JOptionPane.showMessageDialog(null, "successfully updated", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                                Show_Students.WebTech_Batch show_web_students=new WebTech_Batch();
                                show_web_students.webtech_Batch_Content();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "failed to update", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                            }

                            con_web3.close();
                            ps_web3.close();
                        }
                        catch(SQLException sql_exp){
                            sql_exp.printStackTrace();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "column not exists", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                    }
                    con_web2.close();
                    ps_web2.close();
                }
                catch(SQLException sql_exp){
                    sql_exp.printStackTrace();
                }  
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid ID", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
            }
            con_web.close();
            ps_web.close();
        }catch(SQLException sql_exp){
            sql_exp.printStackTrace();
        }
    }   
}


/*public class Student_Section{
    public static void main(String[] args){
        // Add_Students add=new Add_Students();
        // add.enrollment_Frame_Content();

        // Update_Students update=new Update_Students();
        // update.update_Students_Content();

        //Show_Students show=new Show_Students();
        // Show_Students.Java_Batch java_students=show.new Java_Batch();
        // java_students.java_Batch_Content();

        // Show_Students.DSA_Batch dsa_students=show.new DSA_Batch();
        // dsa_students.dsa_Batch_Content();

        // Show_Students.WebTech_Batch webtech_students=show.new WebTech_Batch();
        // webtech_students.webtech_Batch_Content();   
    }
}*/