package admin_portal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Admin_Main_Window_Coding extends JFrame{
    ImageIcon logo, group_study_pic;
    JMenuBar admin_menubar;         
    JMenu student_item, teacher_item, course_item;      //menu;
    JMenuItem java_batch, dsa_batch, webtech_batch, view_teachers, view_course;

    Admin_Main_Window_Coding(){
        setTitle("StudyPoint");
        setSize(900, 500);
        setLayout(null);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.ORANGE);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        //-------------------To set logo-----------------------------
        logo=new ImageIcon("C:\\Google pics\\studypoint_logo2.png");
        setIconImage(logo.getImage());

        //image-
        group_study_pic=new ImageIcon("C:\\Google pics\\group study.jpg");
        Image students_pic=group_study_pic.getImage();
        Image scaled_students_pic=students_pic.getScaledInstance(900, 350, Image.SCALE_SMOOTH);
        Icon study_icon=new ImageIcon(scaled_students_pic);
        JLabel study_label=new JLabel(study_icon);
        study_label.setBounds(40, 90 ,800, 350);
        
        add(study_label);

        //menubar, menu, menuitems coding-
        admin_menubar=new JMenuBar();
        admin_menubar.setBounds(40, 30, 800, 40);
        admin_menubar.setLayout(null);
        admin_menubar.setFont(new Font("Arial", Font.PLAIN, 25));
        admin_menubar.setBackground(Color.WHITE);

        //menu-
        student_item=new JMenu("Manage Students");
        student_item.setBounds(20, 5, 200, 30);
        student_item.setFont(new Font("Arial", Font.PLAIN, 25));

            //menuitems-
            java_batch=new JMenuItem("Java Batch");
            java_batch.setFont(new Font("Arial", Font.PLAIN, 20));

            dsa_batch=new JMenuItem("DSA Batch");
            dsa_batch.setFont(new Font("Arial", Font.PLAIN, 20));

            webtech_batch=new JMenuItem("Web-Tech Batch");
            webtech_batch.setFont(new Font("Arial", Font.PLAIN, 20));

            student_item.add(java_batch);
            student_item.add(dsa_batch);
            student_item.add(webtech_batch);

            //events-
            java_batch.addActionListener(new TestActionListener_1());
            dsa_batch.addActionListener(new TestActionListener_1());
            webtech_batch.addActionListener(new TestActionListener_1());


        teacher_item=new JMenu("Manage Teachers");
        teacher_item.setBounds(290, 5, 200, 30);
        teacher_item.setFont(new Font("Arial", Font.PLAIN, 25));

            view_teachers=new JMenuItem("view all");
            view_teachers.setFont(new Font("Arial", Font.PLAIN, 23));

            teacher_item.add(view_teachers);

            //events-
            view_teachers.addActionListener(new TestActionListener_1());

        course_item=new JMenu("Manage Courses");
        course_item.setBounds(560, 5, 200, 30);
        course_item.setFont(new Font("Arial", Font.PLAIN, 25));
            

            view_course=new JMenuItem("view all");
            view_course.setFont(new Font("Arial", Font.PLAIN, 23));

            course_item.add(view_course);

            //evetns-
            view_course.addActionListener(new TestActionListener_1());

        admin_menubar.add(student_item);
        admin_menubar.add(teacher_item);
        admin_menubar.add(course_item);

        add(admin_menubar);
        setVisible(true);
    }
   
    class TestActionListener_1 implements ActionListener{
        
        Show_Students show;
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==java_batch){
                show =new Show_Students();
                Show_Students.Java_Batch java_students=show.new Java_Batch();
                java_students.java_Batch_Content();
            }
            else if(ae.getSource()==dsa_batch){
                show =new Show_Students();
                Show_Students.DSA_Batch dsa_students=show.new DSA_Batch();
                dsa_students.dsa_Batch_Content();
            }
            else if(ae.getSource()==webtech_batch){
                show =new Show_Students();
                Show_Students.WebTech_Batch webtech_students=show.new WebTech_Batch();
                webtech_students.webtech_Batch_Content();
            }
            else if(ae.getSource()==view_teachers){
                Show_Teachers show_my_teachers=new Show_Teachers();
                show_my_teachers.teachers_section_Content();
            }
            else if(ae.getSource()==view_course){
                Show_Courses show_course=new Show_Courses();
                show_course.courses_section_Content();
            }
        }
    }
}

/*public class Admin_MainWindow{
        public static void main(String[] args){
        Admin_Main_Window_Coding admin_homepage=new Admin_Main_Window_Coding();
    }
}*/