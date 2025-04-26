package student_portal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import admin_portal.*;

class EntryPoint extends JFrame{
    ImageIcon logo;
    JPanel panel1;
    JButton admin_button, student_button;
    public void entryPoint_Frame(){
        setTitle("StudyPoint");
        setSize(600, 500);
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
        panel1.setBounds(20, 20 ,545,425);
        panel1.setLayout(null);
        panel1.setBackground(Color.WHITE);
    }

    public void EntryPoint_Content(){
        entryPoint_Frame();

        admin_button=new JButton("Log in as Admin");
        admin_button.setBounds(120, 100, 280, 50);
        admin_button.setFont(new Font("Arial", Font.PLAIN, 30));
        admin_button.setForeground(Color.BLACK);
        admin_button.setBackground(Color.LIGHT_GRAY);
        admin_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        student_button=new JButton("Log in as Student");
        student_button.setBounds(120, 200, 280, 50);
        student_button.setFont(new Font("Arial", Font.PLAIN, 30));
        student_button.setForeground(Color.BLACK);
        student_button.setBackground(Color.LIGHT_GRAY);
        student_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));

        student_button.addActionListener(new TestAcionListener1());
        admin_button.addActionListener(new TestAcionListener1());

        panel1.add(admin_button);
        panel1.add(student_button);
        add(panel1);
        setVisible(true);
    }
    
    class TestAcionListener1 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==student_button){
                Login_FormCoding login_form=new Login_FormCoding();   
            }
            else if(ae.getSource()==admin_button){
                System.out.println("Hello admin");

                Admin_login admin_login=new Admin_login();
                admin_login.admin_login_Content();

                System.out.println("admin entered");
            }
        }
    }
}

public class Entry_point{
    public static void main(String[] args){
        EntryPoint entry=new EntryPoint();
        entry.EntryPoint_Content();
    }
}