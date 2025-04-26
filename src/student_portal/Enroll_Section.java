package student_portal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

class Enrollment_Form_Coding extends JFrame{
    String submit_placeholder1="student name", submit_placeholder2="email", submit_placeholder3="phone number", submit_placeholder4="address/city";
    ImageIcon logo;
    JPanel panel1, enroll_underline;
    JLabel enrollment_form, b_day_label, gender_label, student_qualification_label, student_course_label, batch_label;
    JTextField submit_hiddenField, student_name, student_email, student_phoneno, student_address;    
    
    JRadioButton m_radio, f_radio, o_radio;
    JComboBox<String>submit_form_month, student_qualifications_combobox, student_course_combobox, student_batch;
    JComboBox<Integer>submit_form_date, submit_form_year;

    JButton submit_button;
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

        student_name.addFocusListener(new TestFocusListener1());
        student_email.addFocusListener(new TestFocusListener1());
        student_phoneno.addFocusListener(new TestFocusListener1());
        student_address.addFocusListener(new TestFocusListener1());

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
    class TestFocusListener1 implements FocusListener{
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
    class TestActionListener10 implements ActionListener{
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

                        JOptionPane.showMessageDialog(null, "Congrats! you are enrolled in java Course", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);   
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Failed to enrolled in Java Course", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
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

                        JOptionPane.showMessageDialog(null, "Congrats! you are enrolled in DSA Course", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Failed to enrolled in DSA Course", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
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

                        JOptionPane.showMessageDialog(null, "Congrats! you are enrolled in Web Development Course", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Failed to enrolled in Web Development Course", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
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
class CourseList extends Enrollment_Form_Coding{
    ImageIcon c_logo, cplus_logo, java_logo, html_logo, css_logo, js_logo, python_logo,ai_ml_logo, sql_logo, dsa_image_icon;
    JPanel underline, panel2, textcut;
    JLabel heading_text1, heading_text2, c_label, cplus_label, java_label, html_label, css_label, python_text, js_label, sql_label, python_label, ai_ml_label, dsa_label1, dsa_label2, algo_label;

    Image cImage, scaled_cImage, cplus_Image, scaled_cplus_Image, java_Image, scaled_java_Image, html_Image, 
    scaled_html_Image, css_Image, scaled_css_Image, js_Image, scaled_js_Image, python_Image, scaled_python_Image, ai_Image, scaled_ai_Image, sql_Image, scaled_sql_Image, dsa_Image, scaled_dsa_Image;

    Icon cIcon, cplus_Icon, java_Icon, html_Icon, css_Icon, js_Icon, python_Icon, ai_ml_Icon, sql_Icon, dsa_Icon;
    JButton dsa_button;

    public void course_List_Content(){
        enroll_Frame();

        panel2=new JPanel();
        panel2.setBounds(800, 120 ,530, 470);
        panel2.setLayout(null);
        panel2.setBackground(Color.WHITE);
        panel2.setBorder(BorderFactory.createLineBorder(Color.BLACK,3));


        //JLabels-
        heading_text1=new JLabel("Latest Tools & Technologies Available at ");
        heading_text1.setBounds(50, 50, 750, 50);
        heading_text1.setForeground(Color.BLACK);
        heading_text1.setFont(new Font("Arial", Font.PLAIN,40));
        
        heading_text2=new JLabel(" StudyPoint");
        heading_text2.setBounds(790, 50, 200, 50);
        heading_text2.setFont(new Font("Arial", Font.PLAIN,37));
        heading_text2.setForeground(Color.RED);

            underline=new JPanel();
            underline.setBounds(50, 100, 940, 3);
            underline.setBackground(Color.black);
            panel1.add(underline);
        
        python_text=new JLabel("python");
        python_text.setFont(new Font("Arial", Font.PLAIN, 23));
        python_text.setForeground(Color.BLACK);
        python_text.setBounds(220, 500, 100, 30 );

        dsa_label1=new JLabel("DATA STRUCTURES");
        dsa_label1.setBounds(20, 30, 500, 40);
        dsa_label1.setFont(new Font("Arial", Font.BOLD, 50));
        dsa_label1.setForeground(Color.BLACK);

        algo_label=new JLabel("& ALGORITHMS");
        algo_label.setBounds(85, 85, 400, 45);
        algo_label.setForeground(Color.BLACK);
        algo_label.setFont(new Font("Arial", Font.BOLD, 47));

        //icons-
        c_logo=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\C_icon.png");
        cImage=c_logo.getImage();
        scaled_cImage=cImage.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        cIcon=new ImageIcon(scaled_cImage);

        c_label=new JLabel(cIcon);
        c_label.setBounds(200, 140, 120, 120);

        //c++
        cplus_logo=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\c++_vector.png");
        cplus_Image=cplus_logo.getImage();
        scaled_cplus_Image=cplus_Image.getScaledInstance(105, 105, Image.SCALE_SMOOTH);
        cplus_Icon=new ImageIcon(scaled_cplus_Image);

        cplus_label=new JLabel(cplus_Icon);
        cplus_label.setBounds(400, 150, 100, 100);
        
        //java icon-
        java_logo=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\java2-removebg-preview.png");
        java_Image=java_logo.getImage();
        scaled_java_Image=java_Image.getScaledInstance(130, 130, Image.SCALE_SMOOTH);
        java_Icon=new ImageIcon(scaled_java_Image);

        java_label=new JLabel(java_Icon);
        java_label.setBounds(600, 130, 130, 130);

        //html icon-
        html_logo=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\HTML_Vector.png");
        html_Image=html_logo.getImage();
        scaled_html_Image=html_Image.getScaledInstance(90, 95, Image.SCALE_SMOOTH);
        html_Icon=new ImageIcon(scaled_html_Image);

        html_label=new JLabel(html_Icon);
        html_label.setBounds(210, 280, 90, 100);

        //css icon-
        css_logo=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\CSS_vector.png");
        css_Image=css_logo.getImage();
        scaled_css_Image=css_Image.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        css_Icon=new ImageIcon(scaled_css_Image);

        css_label=new JLabel(css_Icon);
        css_label.setBounds(400, 280, 110, 100);
        
        //js icon-
        js_logo=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\js_vector.png");
        Image js_Image=js_logo.getImage();
        Image scaled_js_Image=js_Image.getScaledInstance(107, 107, Image.SCALE_SMOOTH);
        Icon js_Icon=new ImageIcon(scaled_js_Image);

        js_label=new JLabel(js_Icon);
        js_label.setBounds(600, 280, 107, 107);

        //python icon-
        python_logo=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\python_vector.png");
        Image python_Image=python_logo.getImage();
        Image scaled_python_Image=python_Image.getScaledInstance(90, 90, Image.SCALE_SMOOTH);
        Icon python_icon=new ImageIcon(scaled_python_Image);

        python_label=new JLabel(python_icon);
        python_label.setBounds(210, 410, 100, 100);

        //ai & ml icon-
        ai_ml_logo=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\ai_vector.png");
        ai_Image=ai_ml_logo.getImage();
        scaled_ai_Image=ai_Image.getScaledInstance(120, 120, Image.SCALE_SMOOTH);
        ai_ml_Icon=new ImageIcon(scaled_ai_Image);

        ai_ml_label=new JLabel(ai_ml_Icon);
        ai_ml_label.setBounds(400, 415, 110, 100);

        //sql-
        sql_logo=new ImageIcon("C:\\Google pics\\mysql logo.png");
        sql_Image=sql_logo.getImage();
        scaled_sql_Image=sql_Image.getScaledInstance(150, 150, Image.SCALE_SMOOTH);
        sql_Icon=new ImageIcon(scaled_sql_Image);

        sql_label=new JLabel(sql_Icon);
        sql_label.setBounds(600, 380, 150, 150);

        //dsa-
        dsa_image_icon=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\dsa_tree.png");
        dsa_Image=dsa_image_icon.getImage();
        scaled_dsa_Image=dsa_Image.getScaledInstance(170, 200, Image.SCALE_SMOOTH);
        dsa_Icon=new ImageIcon(scaled_dsa_Image);

        dsa_label2=new JLabel(dsa_Icon);
        dsa_label2.setBounds(130, 160, 250, 200);

        //----------button coding----------------------
        dsa_button=new JButton("Enroll Now");
        dsa_button.setFont(new Font("Arial", Font.BOLD, 30));
        dsa_button.setBounds(15, 390, 500, 50);
        dsa_button.setForeground(Color.BLACK);
        dsa_button.setBackground(Color.YELLOW);
        dsa_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        dsa_button.addActionListener(new TestActionListener8());


        c_label.addMouseListener(new TestMouseListener2());
        cplus_label.addMouseListener(new TestMouseListener2());
        java_label.addMouseListener(new TestMouseListener2());
        html_label.addMouseListener(new TestMouseListener2());
        css_label.addMouseListener(new TestMouseListener2());
        js_label.addMouseListener(new TestMouseListener2());
        python_label.addMouseListener(new TestMouseListener2());
        ai_ml_label.addMouseListener(new TestMouseListener2());
        sql_label.addMouseListener(new TestMouseListener2());
        dsa_button.addMouseListener(new TestMouseListener2());

        panel1.add(heading_text1);
        panel1.add(heading_text2);
        panel2.add(dsa_label1);
        panel2.add(algo_label);
        panel1.add(c_label);
        panel1.add(cplus_label);
        panel1.add(java_label);
        panel1.add(html_label);
        panel1.add(css_label);
        panel1.add(js_label);
        panel1.add(python_label);
        panel1.add(python_text);
        panel1.add(ai_ml_label);
        panel1.add(sql_label);
        panel2.add(dsa_label2);
        panel2.add(dsa_button);
        panel1.add(panel2);

        panel2.addMouseListener(new TestMouseListener2());

        add(panel1);
        setVisible(true);
    }
    class TestMouseListener2 implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent e){
            if(e.getSource()==c_label){
                c_label.setSize(155, 155);
            }
            else if(e.getSource()==cplus_label){
                cplus_label.setBounds(410, 150, 125, 125);
            }
            else if(e.getSource()==java_label){
                java_label.setBounds(600, 130, 160, 160);
            }
            else if(e.getSource()==html_label){
                html_label.setBounds(210, 280, 150, 140);
            }
            else if(e.getSource()==css_label){
                css_label.setBounds(400, 280, 130, 130);
            }
            else if(e.getSource()==js_label){
                js_label.setBounds(600, 280, 150, 150);
            }
            else if(e.getSource()==python_label){
                python_label.setBounds(210, 410, 150, 150);
                python_text.setBounds(250, 530, 100, 30);
            }
            else if(e.getSource()==ai_ml_label){
                ai_ml_label.setBounds(400, 415, 135, 135);
            }
            else if(e.getSource()==sql_label){
                sql_label.setBounds(600, 380, 180, 180);
            }
            else if(e.getSource()==dsa_button){
                dsa_button.setBackground(Color.GREEN);
                panel2.setBackground(Color.ORANGE);
            }
            else if(e.getSource()==panel2){
                panel2.setBackground(Color.ORANGE);
            }
        }
        @Override
        public void mouseExited(MouseEvent e){
            if(e.getSource()==c_label){
                c_label.setSize(120, 120);
            }
            else if(e.getSource()==cplus_label){
                cplus_label.setBounds(400, 150, 100, 100);
            }
            else if(e.getSource()==java_label){
                java_label.setBounds(600, 130, 130, 130);
            }
            else if(e.getSource()==html_label){
                html_label.setBounds(210, 280, 90, 100);
            }
            else if(e.getSource()==css_label){
                css_label.setBounds(400, 280, 110, 100);
            }
            else if(e.getSource()==js_label){
                js_label.setBounds(600, 280, 107, 107);
            }
            else if(e.getSource()==python_label){
                python_label.setBounds(210, 410, 100, 100);
                python_text.setBounds(220, 500, 100, 30 );
            }
            else if(e.getSource()==ai_ml_label){
                ai_ml_label.setBounds(400, 415, 110, 100);
            }
            else if(e.getSource()==sql_label){
                sql_label.setBounds(600, 380, 150, 150);
            }
            else if(e.getSource()==dsa_button){
                dsa_button.setBackground(Color.YELLOW);
                panel2.setBackground(Color.ORANGE);
            }
            else if(e.getSource()==panel2){
                panel2.setBackground(Color.WHITE);
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
    class TestActionListener8 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==dsa_button){
                Enrollment_Form_Coding enrol=new Enrollment_Form_Coding();
                enrol.enrollment_Frame_Content();
            }
        }
    }
}