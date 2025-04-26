//student portal main_window coding 
package student_portal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

class Main_Window_Coding extends JFrame{
    ImageIcon logo, lab_img, project_img, faculty_img;
    JPanel panel1;
    JLabel academy_name, course_label, label_lab, label_project, text_project1, text_project2, smart_class_label1, smart_class_label2, label_faculty, text_teacher1, text_teacher2;
    JMenu enroll_menu, courses_menu, about_menu, help_menu;
    JMenuItem enrol_item1, enrol_item2, course_java, course_dsa, course_web, course_c, course_cplus, about_academy,about_team, about_policies, help_FAQs, help_Contact;
    JMenuBar menubar;
    Main_Window_Coding(){
        //---------------------Frame Coding--------------------------
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
        panel1.setBackground(Color.WHITE);

        academy_name=new JLabel("  StudyPoint");
        academy_name.setBounds(50, 28, 140, 40);
        academy_name.setFont(new Font("Arial", Font.PLAIN , 23));
        academy_name.setBorder(BorderFactory.createLineBorder(Color.BLACK,2));
        academy_name.setForeground(Color.RED);

        menubar=new JMenuBar();
        menubar.setLayout(null);
        menubar.setBounds(350, 40, 750, 31);
        menubar.setBackground(Color.WHITE);


        enroll_menu=new JMenu("Enroll");
        enroll_menu.setBounds(50, 0, 70, 30);
        enroll_menu.setFont(new Font("Arial", Font.PLAIN, 20));
        enroll_menu.setForeground(Color.BLACK);

            enrol_item1=new JMenuItem("Take Admission");
            enrol_item1.setFont(new Font("Arial", Font.PLAIN, 20));
            enrol_item1.setForeground(Color.BLACK);

            enrol_item2=new JMenuItem("Available Courses");
            enrol_item2.setFont(new Font("Arial", Font.PLAIN, 20));
            enrol_item2.setForeground(Color.BLACK);

            enroll_menu.add(enrol_item1);
            enroll_menu.add(enrol_item2);

            //events-
            enrol_item1.addActionListener(new TestActionListener4());
            enrol_item2.addActionListener(new TestActionListener4());

        courses_menu=new JMenu("Courses");
        courses_menu.setBounds(200, 0, 90, 30);
        courses_menu.setFont(new Font("Arial", Font.PLAIN, 20));
        courses_menu.setForeground(Color.BLACK);
        
            course_java=new JMenuItem("Java Development");
            course_java.setForeground(Color.BLACK);
            course_java.setFont(new Font("Arial", Font.PLAIN, 20));

            course_dsa=new JMenuItem("Data Structures & Algorithms");
            course_dsa.setForeground(Color.BLACK);
            course_dsa.setFont(new Font("Arial", Font.PLAIN, 20));

            course_web=new JMenuItem("Web Development");
            course_web.setFont(new Font("Arial", Font.PLAIN, 20));
            course_web.setForeground(Color.BLACK);

            courses_menu.add(course_java);
            courses_menu.add(course_dsa);
            courses_menu.add(course_web);

            //events-
            course_java.addActionListener(new TestActionListener4());
            course_dsa.addActionListener(new TestActionListener4());
            course_web.addActionListener(new TestActionListener4());

        about_menu=new JMenu("About");
        about_menu.setBounds(390, 0, 70, 30);
        about_menu.setFont(new Font("Arial", Font.PLAIN, 20));

            about_academy=new JMenuItem("Our Academy");
            about_academy.setFont(new Font("Arial", Font.PLAIN, 20));
            about_academy.setForeground(Color.BLACK);

            about_team=new JMenuItem("Our Team");
            about_team.setForeground(Color.BLACK);
            about_team.setFont(new Font("Arial", Font.PLAIN, 20));

            about_policies=new JMenuItem("Our Terms & Policies");
            about_policies.setFont(new Font("Arial",Font.PLAIN, 20));
            about_policies.setForeground(Color.BLACK);

            
            about_menu.add(about_academy);
            about_menu.add(about_team);
            about_menu.add(about_policies);

            //events-
            about_academy.addActionListener(new TestActionListener4());
            about_team.addActionListener(new TestActionListener4());
            about_policies.addActionListener(new TestActionListener4());
            

        help_menu=new JMenu("Help & Support");
        help_menu.setBounds(550, 0, 150, 30);
        help_menu.setFont(new Font("Arial", Font.PLAIN, 20));
        
            help_FAQs=new JMenuItem("FAQs");
            help_FAQs.setForeground(Color.BLACK);
            help_FAQs.setFont(new Font("Arial", Font.PLAIN, 20));

            help_Contact=new JMenuItem("Contact us");
            help_Contact.setFont(new Font("Arial", Font.PLAIN, 20));
            help_Contact.setForeground(Color.BLACK);

            help_menu.add(help_FAQs);
            help_menu.add(help_Contact);

            //events-
            help_FAQs.addActionListener(new TestActionListener4());
            help_Contact.addActionListener(new TestActionListener4());

        menubar.add(enroll_menu);
        menubar.add(courses_menu);
        menubar.add(about_menu);
        menubar.add(help_menu);

        //Home Page images & labels coding-
        lab_img=new ImageIcon("C:\\Google pics\\lab0.jpeg");

        Image labImage=lab_img.getImage();
        Image scaled_labImage=labImage.getScaledInstance(450, 280, Image.SCALE_SMOOTH);
        Icon labIcon=new ImageIcon(scaled_labImage);

        label_lab=new JLabel(labIcon);
        label_lab.setBounds(40, 200, 450, 300);

        //project-
        project_img=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\project3.png");

        Image projectImage=project_img.getImage();
        Image scaled_projectImage=projectImage.getScaledInstance(200, 200, Image.SCALE_SMOOTH);
        Icon projectIcon=new ImageIcon(scaled_projectImage);

        label_project=new JLabel(projectIcon);
        label_project.setBounds(560, 250, 200, 200);

        //faculty-
        faculty_img=new ImageIcon("C:\\Google pics\\class1.jpg");

        Image facultyImage=faculty_img.getImage();
        Image scaled_facultyImage=facultyImage.getScaledInstance(470, 280, Image.SCALE_SMOOTH);
        Icon facultyIcon=new ImageIcon(scaled_facultyImage);

        label_faculty=new JLabel(facultyIcon);
        label_faculty.setBounds(870, 210, 470, 280);

        //labels-
        smart_class_label1=new JLabel("Smart Classes & Labs");
        smart_class_label1.setBounds(65, 490, 600, 50);
        smart_class_label1.setFont(new Font("Arial", Font.BOLD, 35));

        smart_class_label2=new JLabel("With 50+ Latest Computers");
        smart_class_label2.setBounds(35, 525, 600, 50);
        smart_class_label2.setFont(new Font("Arial", Font.BOLD, 35));

            smart_class_label1.addMouseListener(new TestMouseListener2());
            smart_class_label2.addMouseListener(new TestMouseListener2());

        text_project1=new JLabel("20+ Real-Time");
        text_project1.setBounds(570, 435, 250, 35);
        text_project1.setFont(new Font("arial", Font.BOLD, 30));

        text_project2=new JLabel("in Hand-Projects");
        text_project2.setBounds(550, 470, 250, 35);
        text_project2.setFont(new Font("Arial", Font.BOLD, 30));

        text_teacher1=new JLabel("Highly Skilled Facilties");
        text_teacher1.setFont(new Font("Arial", Font.BOLD, 30));
        text_teacher1.setBounds(910, 500, 450, 40);
        text_teacher1.setForeground(Color.BLACK);

        text_teacher2=new JLabel("with 3+ years Industry Experience");
        text_teacher2.setFont(new Font("Arial", Font.BOLD, 30));
        text_teacher2.setBounds(855, 540, 500, 40);
        text_teacher2.setForeground(Color.BLACK);

        label_lab.addMouseListener(new TestMouseListener2());
        label_project.addMouseListener(new TestMouseListener2());
        label_faculty.addMouseListener(new TestMouseListener2());

        
        panel1.add(smart_class_label1);
        panel1.add(smart_class_label2);
        panel1.add(text_project1);
        panel1.add(text_project2);
        panel1.add(text_teacher1);
        panel1.add(text_teacher2);


        panel1.add(academy_name);
        panel1.add(menubar);
        panel1.add(label_lab);
        panel1.add(label_project);
        panel1.add(label_faculty);

        add(panel1);
        setVisible(true);       //form visibility;
    }
    class TestMouseListener2 implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent e1){
            if(e1.getSource()==label_lab){
                label_lab.setBounds(40, 200, 470, 320);
                smart_class_label1.setBounds(70, 490, 650, 70);
                smart_class_label2.setBounds(40, 525, 650, 70);
            }
            else if(e1.getSource()==label_project){
                label_project.setBounds(560, 250, 250, 250);
                text_project1.setBounds(600, 435, 280, 80);
                text_project2.setBounds(580, 470, 280, 80);
            }
            else if(e1.getSource()==label_faculty){
                label_faculty.setBounds(870, 210, 500, 310);
                text_teacher1.setBounds(920, 510, 450, 40);
                text_teacher2.setBounds(870, 550, 500, 40);
            }
        }
        @Override
        public void mouseExited(MouseEvent e1){
            if(e1.getSource()==label_lab){
                label_lab.setBounds(40, 200, 450, 300);
                smart_class_label1.setBounds(65, 490, 600, 50);
                smart_class_label2.setBounds(35, 525, 600, 50);
            }
            else if(e1.getSource()==label_project){
                label_project.setBounds(560, 250, 200, 200);
                text_project1.setBounds(570, 435, 250, 35);
                text_project2.setBounds(550, 470, 250, 35);  
            }
            else if(e1.getSource()==label_faculty){
                label_faculty.setBounds(870, 210, 470, 280);
                text_teacher1.setBounds(910, 500, 450, 40);
                text_teacher2.setBounds(855, 540, 500, 40);
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
    class TestActionListener4 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==enrol_item1){
                Enrollment_Form_Coding enroll=new Enrollment_Form_Coding();  
                enroll.enrollment_Frame_Content(); 
            }
            else if(ae.getSource()==enrol_item2){
                CourseList list=new CourseList();               
                list.course_List_Content();
            }
            else if(ae.getSource()==course_java){
                Java_Course java_course=new Java_Course();
                java_course.java_Course_Content();
            }
            else if(ae.getSource()==course_dsa){
                DSA_Course dsa_Course=new DSA_Course();
                dsa_Course.dsa_Course_Content();
            }
            else if(ae.getSource()==course_web){
                Web_Development_Course web_Course=new Web_Development_Course();
                web_Course.web_Course_Content();
            }   
            else if(ae.getSource()==about_academy){
                About_Academy academy=new About_Academy();
                academy.about_Academy_Content();
            }
            else if(ae.getSource()==about_team){
                About_Team team=new About_Team();
                team.about_Team_Content();                
            }   
            else if(ae.getSource()==about_policies){
                About_Terms_Policies policies=new About_Terms_Policies();
                policies.about_Terms_Policies(); 
            }   
            else if(ae.getSource()==help_FAQs){
                Help_FAQ faq=new Help_FAQ();
                faq.Help_FAQ_Content();
            }   
            else if(ae.getSource()==help_Contact){
                Help_ContactUs contact=new Help_ContactUs();
                contact.Help_ContactUs_Content();
            }   
        }
    }
}
