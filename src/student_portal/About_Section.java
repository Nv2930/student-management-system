package student_portal;
import java.awt.*;
import javax.swing.*;

class About_Academy extends JFrame{
    public String studypoint_description = "<html>"
    + "At <b>StudyPoint Academy</b>, we are shaping the future of aspiring tech professionals by providing dynamic "
    + "and practical education in some of the most sought-after fields. Our mission is to empower learners with the skills "
    + "and confidence they need to thrive in the fast-evolving tech landscape.<br><br>"
    + "<b>Here’s what we offer:</b><br>"
    + "<ul>"
    + "<li><b>Java Development:</b> Dive deep into the world of Java, mastering everything from core fundamentals to advanced concepts, "
    + "and become a pro at building robust applications.</li>"
    + "<li><b>DSA with Java:</b> Sharpen your problem-solving skills by learning Data Structures and Algorithms, the cornerstone of "
    + "competitive programming and software development.</li>"
    + "<li><b>Web Development:</b> Unleash your creativity and technical skills to build sleek, responsive websites and innovative "
    + "web applications using cutting-edge technologies.</li>"
    + "</ul>"
    + "Whether you're starting from scratch or looking to advance your skills, <b>StudyPoint Academy</b> is your trusted partner in achieving excellence. "
    + "Join us and turn your tech aspirations into reality!"
    + "</html>";

    public ImageIcon logo;
    public JPanel panel1, underline;
    public JLabel academy_head, academy_studypoint, academy_description;
    
    public void about_Academy_Frame(){
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
        panel1.setBackground(Color.white);
    }
    public void about_Academy_Content(){
        about_Academy_Frame();
        underline=new JPanel();
        underline.setBounds(57, 70, 660, 3);
        underline.setBackground(Color.black);
        panel1.add(underline);
        //JLabels-
        academy_head=new JLabel(" Welcome To                     Academy");
        academy_head.setBounds(50, 25, 700, 45);
        academy_head.setForeground(Color.BLACK);
        academy_head.setFont(new Font("Arial", Font.BOLD, 40));

        academy_studypoint=new JLabel(" StudyPoint");
        academy_studypoint.setBounds(299, 23, 250, 50);
        academy_studypoint.setFont(new Font("Arial", Font.BOLD,40));
        academy_studypoint.setForeground(Color.RED);
        
        academy_description=new JLabel(studypoint_description);
        academy_description.setBounds(60, -180, 1300, 1100);
        academy_description.setForeground(Color.BLACK);
        academy_description.setFont(new Font("Arial", Font.PLAIN, 30));

        panel1.add(academy_head);
        panel1.add(academy_studypoint);
        panel1.add(academy_description);
        
        add(panel1);
        setVisible(true);
    }
}
class About_Team extends About_Academy{
    public String team_description = "<html>"
        + "At StudyPoint Academy, our team consists of passionate educators, industry professionals, and innovators dedicated to "
        + "delivering the highest quality of education. We are united by a common goal: to empower students with the knowledge and skills "
        + "they need to succeed in their tech careers.<br><br>"
        + "Our team is composed of experienced instructors who bring a wealth of knowledge from diverse fields, including software development, "
        + "data science, web technologies, and more. With a blend of academic excellence and practical industry experience, we ensure our students "
        + "receive the best learning experience.<br><br>"
        + "We believe in continuous learning, which is why our instructors stay up-to-date with the latest trends and technologies to provide "
        + "relevant and cutting-edge content. Together, we are committed to making your learning journey both enriching and enjoyable!<br><br>"
        + "Join StudyPoint Academy and learn from experts who are as invested in your success as you are!"
        + "</html>";
    
    JLabel team_content, team_head;
    JPanel underline2;
    public void about_Team_Content(){
        about_Academy_Frame();
        underline2=new JPanel();
        underline2.setBounds(50, 95, 300, 3);
        underline2.setBackground(Color.black);
        panel1.add(underline2);

        team_head=new JLabel("Meet Our Team ");
        team_head.setBounds(50, 50, 700, 45);
        team_head.setForeground(Color.BLACK);
        team_head.setFont(new Font("Arial", Font.BOLD, 40));

        team_content=new JLabel(team_description);
        team_content.setFont(new Font("Arial", Font.PLAIN, 27));
        team_content.setBounds(100, -80, 1100, 900);
        team_content.setForeground(Color.BLACK);

        panel1.add(team_head);
        panel1.add(team_content);

        add(panel1);
        setVisible(true);
    }
}
class About_Terms_Policies extends About_Academy{
    public String terms_and_policies = "<html>"
        + "<ul>"
        + "<li><b>Course Enrollment:</b><br>"
        + "Users must create a valid account to enroll in courses.<br>"
        + "One active enrollment per course per student.</li><br>"
        
        + "<li><b>Course Completion & Certification:</b><br>"
        + "Completion of all modules, assignments, and exams is required to receive a certificate.<br>"
        + "Adhere to course deadlines.</li><br>"
        
        + "<li><b>User Conduct:</b><br>"
        + "Maintain professionalism; unethical behavior will lead to account suspension.</li><br>"
        
        + "<li><b>Account Security:</b><br>"
        + "Users must keep login details confidential.<br>"
        + "Notify support if account security is compromised.</li><br>"
        
        + "<li><b>Content Usage:</b><br>"
        + "Course materials are for personal use only.<br>"
        + "Redistribution or commercial use without permission is prohibited.</li>"
        + "</ul>"
        + "</html>";
    
    JLabel terms_policies_content, terms_policies_head;
    JPanel underline3;
    public void about_Terms_Policies(){
        about_Academy_Frame();

        terms_policies_head=new JLabel("StudyPoint Terms & Policies");
        terms_policies_head.setBounds(50, 20, 550, 45);
        terms_policies_head.setFont(new Font("Arial", Font.BOLD, 40));
        terms_policies_head.setForeground(Color.BLACK);

        underline3=new JPanel();
        underline3.setBounds(50, 65, 550, 3);
        underline3.setBackground(Color.black);
        panel1.add(underline3);

        terms_policies_content=new JLabel(terms_and_policies);
        terms_policies_content.setFont(new Font("Arial", Font.PLAIN, 27));
        terms_policies_content.setForeground(Color.BLACK);
        terms_policies_content.setBounds(100, -80, 1100, 900);

        panel1.add(terms_policies_head);
        panel1.add(terms_policies_content);

        add(panel1);
        setVisible(true);
    }
}