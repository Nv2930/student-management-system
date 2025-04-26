//Signup_Form coding for students portal
package student_portal;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

class Signup_Form_Coding extends JFrame{
    String placeholder1="first name",
        placeholder2="last name",
        placeholder3="email id",
        placeholder4="new password",
        placeholder5="phone no",
        placeholder6="city";

    ImageIcon logo;
    JLabel text1, text2, b_day, gender, male, female, other;
    JTextField f_name, l_name, email_field, new_pass_field, phone_no, city, hiddenField;
    JComboBox<Integer>dd, yyyy;
    JComboBox<String>mm;
    JRadioButton m, f, o;
    JButton signup_button;

    Signup_Form_Coding(){
        //---------------------Frame Coding--------------------------
        setTitle("StudyPoint");
        setSize(600, 550);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.ORANGE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //-------------------To set logo-----------------------------
        logo=new ImageIcon("C:\\Google pics\\studypoint_logo2.png");
        setIconImage(logo.getImage());  


        //--------------------Labels Coding--------------------------
        text1=new JLabel("Signup at");
        text1.setBounds(100, 25, 200,50);
        text1.setFont(new Font("Arial", Font.BOLD, 40));
        text1.setForeground(Color.BLACK);

        text2=new JLabel(" StudyPoint ");
        text2.setBounds(300, 25, 200, 50);
        text2.setForeground(Color.RED);
        text2.setFont(new Font("Arial", Font.PLAIN, 35));
        text2.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        b_day=new JLabel("date of birth: ");
        b_day.setBounds(25, 300, 150, 35);
        b_day.setForeground(Color.BLACK);
        b_day.setFont(new Font("Arial", Font.PLAIN, 23));

        gender=new JLabel("gender: ");
        gender.setBounds(25, 365, 110, 25);
        gender.setFont(new Font("Arial", Font.PLAIN, 23));
        gender.setForeground(Color.BLACK);

        add(text1);
        add(text2);
        add(b_day);
        add(gender);


        //---------------------textfields coding-----------------------------
        f_name =new JTextField(placeholder1);
        f_name.setBounds(25, 120, 250, 45);
        f_name.setFont(new Font("Arial", Font.PLAIN, 25));
        f_name.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        add(f_name);
  
        l_name =new JTextField(placeholder2);
        l_name.setBounds(295, 120, 250, 45);
        l_name.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        l_name.setFont(new Font("Arial", Font.PLAIN, 25));

        email_field=new JTextField(placeholder3);
        email_field.setBounds(25, 180, 250, 45);
        email_field.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        email_field.setFont(new Font("Arial", Font.PLAIN, 25));

        new_pass_field=new JTextField(placeholder4);
        new_pass_field.setBounds(295, 180, 250, 45);
        new_pass_field.setFont(new Font("Arial", Font.PLAIN, 25));
        new_pass_field.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        phone_no=new JTextField(placeholder5);
        phone_no.setBounds(25, 240, 250, 45);
        phone_no.setFont(new Font("Arial", Font.PLAIN, 25));
        phone_no.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        city=new JTextField(placeholder6);
        city.setBounds(295, 240, 250, 45);
        city.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        city.setFont(new Font("Arial", Font.PLAIN, 25));

        hiddenField=new JTextField();
        hiddenField.setBounds(0, 0, 0, 0);
        add(hiddenField);

        f_name.addFocusListener(new TestFocusListener1());
        l_name.addFocusListener(new TestFocusListener1());
        email_field.addFocusListener(new TestFocusListener1());
        new_pass_field.addFocusListener(new TestFocusListener1());
        phone_no.addFocusListener(new TestFocusListener1());
        city.addFocusListener(new TestFocusListener1());


        //-------------------------JCombobox coding-------------------------------------------
        //------------Dates-----------
        Integer date[];
        date=new Integer[31];

        for(int j=0; j<31; j++){
            date[j]=j+1;
        }
        dd=new JComboBox<>(date);
        dd.setBounds(175, 305, 60, 30);
        dd.setFont(new Font("Arial", Font.PLAIN, 19));
        dd.setBackground(Color.WHITE);
        dd.setForeground(Color.BLACK);

        //--------------Months---------------
        String month[]={
            "January", "Februrary", "March", "April", "May", "June","July", "August", "September", "October", "November", "December"
        };
        mm=new JComboBox<>(month);
        mm.setBounds(265, 305, 125, 30);
        mm.setFont(new Font("Arial", Font.PLAIN, 19));
        mm.setBackground(Color.WHITE);
        mm.setForeground(Color.BLACK);

        //---------------year---------------
        Integer year[];
        year=new Integer[95];
        for(int k=0; k<95; k++){
            year[k]=k+1930;
        }
        yyyy=new JComboBox<>(year);
        yyyy.setBounds(415, 305, 100, 30);
        yyyy.setFont(new Font("Arial", Font.PLAIN, 19));
        yyyy.setBackground(Color.WHITE);
        yyyy.setForeground(Color.BLACK);


        //----------------------------JRadioButton coding----------------------------------
        m=new JRadioButton("Male");
        m.setBounds(175, 365, 70, 28);
        m.setFont(new Font("Arial", Font.PLAIN, 19));
        m.setBackground(Color.WHITE);
        m.setForeground(Color.BLACK);

        f=new JRadioButton("Female");
        f.setBounds(275, 365, 100, 28);
        f.setFont(new Font("Arial", Font.PLAIN, 19));
        f.setBackground(Color.WHITE);
        f.setForeground(Color.BLACK);
        
        o=new JRadioButton("Other");
        o.setBounds(415, 365, 100, 28);
        o.setFont(new Font("Arial", Font.PLAIN, 19));
        o.setBackground(Color.WHITE);
        o.setForeground(Color.BLACK);
        

        ButtonGroup bg=new ButtonGroup();
        bg.add(m);
        bg.add(f);
        bg.add(o);

        //-------------------Button Coding----------------------------
        signup_button=new JButton("Signup");
        signup_button.setBounds(20, 420, 530, 45);  
        signup_button.setFont(new Font("Arial", Font.BOLD, 27));
        signup_button.setForeground(Color.BLACK);
        signup_button.setBackground(Color.WHITE);
        signup_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        add(signup_button);

        signup_button.addActionListener(new TestActionListener3());

       
        add(f_name);
        add(l_name);
        add(email_field);
        add(new_pass_field);
        add(phone_no);
        add(city);
        add(dd);
        add(mm);
        add(yyyy);
        add(m);
        add(f);
        add(o);
        

        setVisible(true);
    }
    
    class TestFocusListener1 implements FocusListener{
        public void focusGained(FocusEvent f1){
            if(f1.getSource()==f_name){
                if(f_name.getText().equals(placeholder1)){
                    f_name.setText("");
                }
            }
            else if(f1.getSource()==l_name){
                if(l_name.getText().equals(placeholder2)){
                    l_name.setText("");
                }
            }
            else if(f1.getSource()==email_field){
                if(email_field.getText().equals(placeholder3)){
                    email_field.setText("");
                }
            }
            else if(f1.getSource()==new_pass_field){
                if(new_pass_field.getText().equals(placeholder4)){
                    new_pass_field.setText("");
                }
           }
           else if(f1.getSource()==phone_no){
                if(phone_no.getText().equals(placeholder5)){
                    phone_no.setText("");
                }
           }
           else if(f1.getSource()==city){
                if(city.getText().equals(placeholder6)){
                    city.setText("");
                }
            }
        }
        public void focusLost(FocusEvent f1){
            if(f1.getSource()==f_name){
                if(f_name.getText().isEmpty()){
                    f_name.setText(placeholder1);
                }
            }
            else if(f1.getSource()==l_name){
                if(l_name.getText().isEmpty()){
                    l_name.setText(placeholder2);
                }
            }
            else if(f1.getSource()==email_field){
                if(email_field.getText().isEmpty()){
                    email_field.setText(placeholder3);
                }
            }
            else if(f1.getSource()==new_pass_field){
                if(new_pass_field.getText().isEmpty()){
                    new_pass_field.setText(placeholder4);
                }
            }
            else if(f1.getSource()==phone_no){
                if(phone_no.getText().isEmpty()){
                    phone_no.setText(placeholder5);
                }
            }
            else if(f1.getSource()==city){
                if(city.getText().isEmpty()){
                    city.setText(placeholder6);
                }
            }
        }
    }
    
    class TestActionListener3 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==signup_button){
                signup_Function();
            }
        }
        
        public void signup_Function(){
            String url="jdbc:mysql://localhost:3306/studypoint_database";
            String username="root";
            String password="nisha@1979";
            String query="insert into student_table(first_name, last_name, email, passwords, phone_number, city, dob, gender) values (?,?,?,?,?,?,?,?)";


            // f_name, l_name, email_field, new_pass_field, phone_no, city;
            String input_f_name=f_name.getText();
            String input_l_name=l_name.getText();
            String input_email_signup=email_field.getText();
            String input_pass=new_pass_field.getText();
            String input_phone=phone_no.getText();
        
            String input_city=city.getText();

            //to get birthday-dd, mm, yyyy;
            int date=(int)dd.getSelectedItem();
            String month=mm.getSelectedItem().toString();
            int year=(int)yyyy.getSelectedItem();
            
            int month_value=0;
            if(month.equals("January")){
                month_value=1;
            }
            else if(month.equals("Februrary")){
                month_value=2;
            }
            else if(month.equals("March")){
                month_value=3;
            }
            else if(month.equals("April")){
                month_value=4;
            }
            else if(month.equals("May")){
                month_value=5;
            }
            else if(month.equals("June")){
                month_value=6;
            }
            else if(month.equals("July")){
                month_value=7;
            }
            else if(month.equals("August")){
                month_value=8;
            }
            if(month.equals("September")){
                month_value=9;
            }
            else if(month.equals("October")){
                month_value=10;
            }
            else if(month.equals("November")){
                month_value=11;
            }
            else if(month.equals("December")){
                month_value=12;
            }

            String date_of_birth=year+"-"+month_value+"-"+date;

            //to get the gender value- m, f, o;
            String input_gender="";
           
            if(m.isSelected()){
                input_gender="male";
            }
            else if(f.isSelected()){
                input_gender="female";
            }
            else if(o.isSelected()){
                input_gender="other";
            }
            

            if(!(input_f_name.isEmpty() || input_l_name.isEmpty() || input_email_signup.isEmpty() || input_pass.isEmpty() || input_phone.isEmpty() || input_city.isEmpty() || input_gender.isEmpty())){
                try{
                    //jdbc steps-
                    //1. load & register driver-
                    //2. create the connection-
                    Connection conn2=DriverManager.getConnection(url, username, password);
    
                        //3. create the object of prepareStatement-
                        PreparedStatement ps=conn2.prepareStatement(query);
                        ps.setString(1, input_f_name);
                        ps.setString(2, input_l_name);
                        ps.setString(3, input_email_signup);
                        ps.setString(4, input_pass);
                        ps.setString(5,   input_phone);
                        ps.setString(6, input_city);
                        ps.setString(7, date_of_birth);
                        ps.setString(8, input_gender);
    
                        //4. execute the query-
                        int x=ps.executeUpdate();
                        if(x>0){
                            JOptionPane.showMessageDialog(null, "Successfully Registered", "dialogbox", JOptionPane.INFORMATION_MESSAGE, null);

                            Login_FormCoding login_form=new Login_FormCoding(); 
                        }
                        
                        //5. close the connection-
                        conn2.close();
                        ps.close();
                }
                catch(SQLException sql){
                    sql.printStackTrace();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "please fill all the details", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
            }
        }
    }
}
/*public class SignupForm{
    public static void main(String[] args) {
        Signup_Form_Coding sign=new Signup_Form_Coding();
    }
}*/