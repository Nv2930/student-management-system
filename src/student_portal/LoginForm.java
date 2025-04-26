//Login_Form coding for student portal
package student_portal;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

class Login_FormCoding extends JFrame{
    ImageIcon logo;
    JLabel login_title, or_label, login_userName, login_password;
    JTextField u_name_field, hiddenField1;
    JPasswordField u_pass_field;
    JButton login_button, new_user;

    Login_FormCoding(){
        //---------------------Frame Coding--------------------------
        setTitle("StudyPoint");
        setSize(445, 550);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.ORANGE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);


        //-------------------To set logo-----------------------------
        logo=new ImageIcon("C:\\Google pics\\studypoint_logo2.png");
        setIconImage(logo.getImage());  
 
        //---------------------------Labels Coding------------------------
        login_title=new JLabel("Login Form");
        login_title.setBounds(130, 50, 230, 50);
        login_title.setFont(new Font("Arial", Font.BOLD, 35));
        login_title.setForeground(Color.BLACK);

        login_userName=new JLabel("email");
        login_userName.setBounds(60, 150, 150, 25);
        login_userName.setFont(new Font("Arial", Font.PLAIN, 25));
        login_userName.setForeground(Color.BLACK);

        login_password=new JLabel("password");
        login_password.setBounds(60, 225, 150, 25);
        login_password.setFont(new Font("Arial", Font.PLAIN, 25));
        login_password.setForeground(Color.BLACK);

        or_label=new JLabel("OR");
        or_label.setBounds(192, 360, 50, 35);
        or_label.setFont(new Font("Arial", Font.BOLD, 17));
        or_label.setForeground(Color.BLACK);


        add(login_title);
        add(login_userName);
        add(login_password);
        add(or_label);
       
        //-----------------------------Textfields coding--------------------------
        u_name_field=new JTextField();
        u_name_field.setBounds(60, 180, 300, 35);
        u_name_field.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        u_name_field.setFont(new Font("Arial", Font.PLAIN, 20));

        u_pass_field=new JPasswordField();
        u_pass_field.setBounds(60, 255, 300, 35);
        u_pass_field.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        u_pass_field.setFont(new Font("Arial", Font.PLAIN, 20));

        add(u_name_field);
        add(u_pass_field);

        //---------------Buttons Coding-------------------------------------
        login_button=new JButton("Login");
        login_button.setBounds(60, 325, 300, 35);
        login_button.setFont(new Font("Arial", Font.PLAIN, 20));
        login_button.setBackground(Color.WHITE);
        login_button.setForeground(Color.BLACK);
        login_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));


        new_user=new JButton("create new account");
        new_user.setBounds(60, 390, 300, 35);
        new_user.setBackground(Color.WHITE);
        new_user.setForeground(Color.BLACK);
        new_user.setFont(new Font("Arial", Font.PLAIN, 23));
        new_user.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        login_button.addActionListener(new TestActionListener2());
        new_user.addActionListener(new TestActionListener2());

        add(login_button);
        add(new_user);


        setVisible(true);
    }
    class TestActionListener2 implements ActionListener{        
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==new_user){
                Signup_Form_Coding signup_form=new Signup_Form_Coding();
            }
            else if(ae.getSource()==login_button){
                jdbc_function1();
            }   
        }
        public void jdbc_function1(){
            String url="jdbc:mysql://localhost:3306/studypoint_database";
            String username="root";
            String password="nisha@1979";
            String query="select email, passwords from student_table where email=? AND passwords=?";
            String input_userName=u_name_field.getText();
            String input_userPassword=new String(u_pass_field.getPassword());
            //jdbc steps-
            
            if(!(input_userName.isEmpty() || input_userPassword.isEmpty())){
                try{
                    //1. load & register the driver-
                    //2. create the connection-
                    Connection conn=DriverManager.getConnection(url, username, password);
        
                    //3. create the object of preparedStatement-
                    PreparedStatement ps=conn.prepareStatement(query);
                    ps.setString(1, input_userName);
                    ps.setString(2, input_userPassword);
        
                    String str1="student not found!";
                    //4. execute the qurey-
                    ResultSet r=ps.executeQuery();
                    if(r.next()){
                        Main_Window_Coding home=new Main_Window_Coding();
                    }else{
                        JOptionPane.showMessageDialog(null, str1, "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                    }
        
                    //5. close the connection-
                    conn.close();
    
                }catch(SQLException sql){
                    sql.printStackTrace();
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "user name or password is empty", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
            } 
        }
    }
}