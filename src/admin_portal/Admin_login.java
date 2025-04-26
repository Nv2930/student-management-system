package admin_portal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Admin_login extends JFrame{
    ImageIcon logo;
    JLabel login_title, login_adminName, login_admin_password;
    JTextField admin_name_field, admin_pass_field;
    JButton admin_login_button;
    String  admin_userName, admin_pass, 
            url="jdbc:mysql://localhost:3306/studypoint_database",
            user_name="root",
            password="nisha@1979",
            admin_query="select * from admin_table where admin_name=? And admin_password=?";

    
    public void admin_login_Content(){
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

        login_adminName=new JLabel("admin email");
        login_adminName.setBounds(60, 150, 150, 25);
        login_adminName.setFont(new Font("Arial", Font.PLAIN, 25));
        login_adminName.setForeground(Color.BLACK);

        login_admin_password=new JLabel("password");
        login_admin_password.setBounds(60, 225, 150, 25);
        login_admin_password.setFont(new Font("Arial", Font.PLAIN, 25));
        login_admin_password.setForeground(Color.BLACK);


        add(login_title);
        add(login_adminName);
        add(login_admin_password);
        
        //-----------------------------Textfields coding--------------------------
        admin_name_field=new JTextField();
        admin_name_field.setBounds(60, 180, 300, 35);
        admin_name_field.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        admin_name_field.setFont(new Font("Arial", Font.PLAIN, 20));

        admin_pass_field=new JTextField();
        admin_pass_field.setBounds(60, 255, 300, 35);
        admin_pass_field.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        admin_pass_field.setFont(new Font("Arial", Font.PLAIN, 20));

        add(admin_name_field);
        add(admin_pass_field);

        //---------------Buttons Coding-------------------------------------
        admin_login_button=new JButton("Login");
        admin_login_button.setBounds(60, 325, 300, 35);
        admin_login_button.setFont(new Font("Arial", Font.PLAIN, 20));
        admin_login_button.setBackground(Color.WHITE);
        admin_login_button.setForeground(Color.BLACK);
        admin_login_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        admin_login_button.addActionListener(new TestActionListener_2());

        add(admin_login_button);
        setVisible(true);
    }

    class TestActionListener_2 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==admin_login_button){

                admin_userName=admin_name_field.getText();
                admin_pass=admin_pass_field.getText();

                if(!(admin_userName.isEmpty() || admin_pass.isEmpty())){

                    System.out.println(admin_userName+" "+admin_pass);
                    //jdbc code to check if admin exists in table-

                    try{
                        Connection admin_con=DriverManager.getConnection(url, user_name, password);

                        PreparedStatement admin_ps=admin_con.prepareStatement(admin_query);
                        admin_ps.setString(1, admin_userName);
                        admin_ps.setString(2, admin_pass);

                        ResultSet rs_admin=admin_ps.executeQuery();

                        if(rs_admin.next()){
                            System.out.println("exists");
                            Admin_Main_Window_Coding admin_homepage=new Admin_Main_Window_Coding();
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "admin not exists", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                        }

                        admin_con.close();
                        admin_ps.close();
                    }
                    catch(SQLException sql){
                       sql.printStackTrace();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "admin_email or password is empty", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                }
            }   
        }
    }
}

/*public class Admin_login{
    public static void main(String[] args) {
        Admin_Login_Form log=new Admin_Login_Form();
    }
}*/