package student_portal;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.Desktop;        
import java.net.URI;          

class Help_FAQ extends JFrame{
    ImageIcon logo, right_symbol, down_symbol;
    Image right_image, scaled_right_image, down_image, scaled_down_image;
    Icon right_icon, down_icon;
    JPanel panel1, faq_head_underline, q1_panel, q2_panel, q3_panel, q4_panel, q5_panel, q6_panel, q7_panel, q8_panel, q9_panel, q10_panel;
    JLabel faq_head, q1, q2, q3, q4, q5, q6, q7, q8, q9, q10, right_label1, right_label2, right_label3, right_label4, right_label5, right_label6 ,right_label7, right_label8, right_label9, right_label10, down_label1,
    down_label2, down_label3, down_label4, down_label5, down_label6, down_label7, down_label8, down_label9, down_label10, ans_label1, ans_label2, ans_label3, ans_label4, ans_label5, ans_label6,ans_label7,ans_label8,ans_label9,ans_label10;
    String  q1_value="1. I don't know Coding, Can I still take this course?",
            q2_value="2. I am not a Computer Science student, Can I take this Course?",
            q3_value="3. Why should I learn Data Structures and Algorithms(DSA)?",
            q4_value="4. Is the course in Hindi or English?",
            q5_value="5. Will I get a Certificate of completion?",
            q6_value="6. Can I get a refund incase I change my mind?",
            q7_value="7. How much time will it take for me to understand coding?",
            q8_value="8. Do I need any prior knowledge of computers or programming to start?",
            q9_value="9. Are there real-world projects to practice on?",
            q10_value="10. How can I manage coding practice alongside my current studies or jobs",
           
            ans1="<html>Absolutely! This course is designed for both beginners and experienced learners. so you don't need any prior coding experience everything will be taught from the basics.</html>",

            ans2="<html>Yes, you can! This course is designed for anyone interested in learning coding, so you don't need to be a Computer Science student to benefit from this course.</html>",

            ans3="<html>Mastering DSA is crucial for writing an efficient code that performs all the tasks in minimum time. also Learning DSA helps you solve complex problems.</html>",

            ans4="<html>The course is conducted in English. All materials, lectures, and resources will be provided in English to ensure clarity and accessibility.</html>",

            ans5="<html>Yes, you will receive a Certificate of Completion upon finishing the course that can be a valuable addition to your professional credentials.</html>",

            ans6="<html>Yes 100%, you can request a refund, but this is only possible within one week of enrollment. After this period, refunds will not be available.</html>",

            ans7="<html>The learning pace varies for each individual, but with consistent effort and practice, most students start writing basic programs within 4-6 weeks.</html>",

            ans8="<html>No prior knowledge is required. we'll teach you everything from starting with fundamentals of computer knowledge and then moving into programming concepts </html>",

            ans9="<html>Yes, the system includes real-world coding projects to give you hands-on experience. which is essential for job opportunities.</html>",

            ans10="<html>Our courses offer flexible schedules and a structured approach to help you balance your learning with other commitments.</html>";
    
    public void Help_Frame(){
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
   
    public void Help_FAQ_Content(){
        Help_Frame();

        //JLabels-
        faq_head=new JLabel("Frequently Asked Question");
        faq_head.setBounds(50, 20, 550, 40);
        faq_head.setFont(new Font("Arial", Font.BOLD, 40));
        faq_head.setForeground(Color.BLACK);

            faq_head_underline=new JPanel();
            faq_head_underline.setBounds(50, 65, 530, 3);
            faq_head_underline.setBackground(Color.black);
            panel1.add(faq_head_underline);

        right_symbol=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\right_arrow.png");
        right_image=right_symbol.getImage();
        scaled_right_image=right_image.getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        right_icon=new ImageIcon(scaled_right_image);

        right_label1=new JLabel(right_icon);
        right_label1.setBounds(1050, 10, 20, 20);

        right_label2=new JLabel(right_icon);
        right_label2.setBounds(1050, 10, 20, 20);

        right_label3=new JLabel(right_icon);
        right_label3.setBounds(1050, 10, 20, 20);

        right_label4=new JLabel(right_icon);
        right_label4.setBounds(1050, 10, 20, 20);

        right_label5=new JLabel(right_icon);
        right_label5.setBounds(1050, 10, 20, 20);

        right_label6=new JLabel(right_icon);
        right_label6.setBounds(1050, 10, 20, 20);

        right_label7=new JLabel(right_icon);
        right_label7.setBounds(1050, 10, 20, 20);

        right_label8=new JLabel(right_icon);
        right_label8.setBounds(1050, 10, 20, 20);

        right_label9=new JLabel(right_icon);
        right_label9.setBounds(1050, 10, 20, 20);

        right_label10=new JLabel(right_icon);
        right_label10.setBounds(1050, 10, 20, 20);

        //down symbel-
        down_symbol=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\down (1).png");
        down_image=down_symbol.getImage();
        scaled_down_image=down_image.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
        down_icon=new ImageIcon(scaled_down_image);

        down_label1=new JLabel(down_icon);
        down_label2=new JLabel(down_icon);
        down_label3=new JLabel(down_icon);
        down_label4=new JLabel(down_icon);
        down_label5=new JLabel(down_icon);
        down_label6=new JLabel(down_icon);
        down_label7=new JLabel(down_icon);
        down_label8=new JLabel(down_icon);
        down_label9=new JLabel(down_icon);
        down_label10=new JLabel(down_icon);

        q1_panel=new JPanel();
        q1_panel.setBounds(100, 100, 1100, 40);
        q1_panel.setLayout(null);
        q1_panel.setBackground(Color.LIGHT_GRAY);

            q1=new JLabel(q1_value);
            q1.setBounds(20, 3, 700, 40);
            q1.setFont(new Font("Arial", Font.PLAIN, 25));
            q1.setForeground(Color.BLACK);
            q1_panel.add(q1);  
            q1_panel.add(right_label1);

        q2_panel=new JPanel();
        q2_panel.setBounds(100, 150, 1100, 40);
        q2_panel.setLayout(null);
        q2_panel.setBackground(Color.LIGHT_GRAY);
        q1=new JLabel(q1_value);

            q2=new JLabel(q2_value);
            q2.setBounds(20, 3, 750, 40);
            q2.setFont(new Font("Arial", Font.PLAIN, 25));
            q2.setForeground(Color.BLACK);
            q2_panel.add(right_label2);
            q2_panel.add(q2);
        

        q3_panel=new JPanel();
        q3_panel.setBounds(100, 200, 1100, 40);
        q3_panel.setLayout(null);
        q3_panel.setBackground(Color.LIGHT_GRAY);

            q3=new JLabel(q3_value);
            q3.setBounds(20, 3, 700, 40);
            q3.setFont(new Font("Arial", Font.PLAIN, 25));
            q3.setForeground(Color.BLACK);
            q3_panel.add(right_label3);
            q3_panel.add(q3);

        q4_panel=new JPanel();
        q4_panel.setBounds(100, 250, 1100, 40);
        q4_panel.setLayout(null);
        q4_panel.setBackground(Color.LIGHT_GRAY);

            q4=new JLabel(q4_value);
            q4.setBounds(20, 3, 550, 40);
            q4.setFont(new Font("Arial", Font.PLAIN, 25));
            q4.setForeground(Color.BLACK);
            q4_panel.add(right_label4);
            q4_panel.add(q4);

        q5_panel=new JPanel();
        q5_panel.setBounds(100, 300, 1100, 40);
        q5_panel.setLayout(null);
        q5_panel.setBackground(Color.LIGHT_GRAY);

            q5=new JLabel(q5_value);
            q5.setBounds(20, 3, 550, 40);
            q5.setFont(new Font("Arial", Font.PLAIN, 25));
            q5.setForeground(Color.BLACK);
            q5_panel.add(right_label5);
            q5_panel.add(q5);

        q6_panel=new JPanel();
        q6_panel.setBounds(100, 350, 1100, 40);
        q6_panel.setLayout(null);
        q6_panel.setBackground(Color.LIGHT_GRAY);

            q6=new JLabel(q6_value);
            q6.setBounds(20, 3, 550, 40);
            q6.setFont(new Font("Arial", Font.PLAIN, 25));
            q6.setForeground(Color.BLACK);
            q6_panel.add(right_label6);
            q6_panel.add(q6);

        q7_panel=new JPanel();
        q7_panel.setBounds(100, 400, 1100, 40);
        q7_panel.setLayout(null);
        q7_panel.setBackground(Color.LIGHT_GRAY);

            q7=new JLabel(q7_value);
            q7.setBounds(20, 3, 700, 40);
            q7.setFont(new Font("Arial", Font.PLAIN, 25));
            q7.setForeground(Color.BLACK);
            q7_panel.add(right_label7);
            q7_panel.add(q7);

        q8_panel=new JPanel();
        q8_panel.setBounds(100, 450, 1100, 40);
        q8_panel.setLayout(null);
        q8_panel.setBackground(Color.LIGHT_GRAY);

            q8=new JLabel(q8_value);
            q8.setBounds(20, 3, 800, 40);
            q8.setFont(new Font("Arial", Font.PLAIN, 25));
            q8.setForeground(Color.BLACK);
            q8_panel.add(right_label8);
            q8_panel.add(q8);

        q9_panel=new JPanel();
        q9_panel.setBounds(100, 500, 1100, 40);
        q9_panel.setLayout(null);
        q9_panel.setBackground(Color.LIGHT_GRAY);

            q9=new JLabel(q9_value);
            q9.setBounds(20, 3, 550, 40);
            q9.setFont(new Font("Arial", Font.PLAIN, 25));
            q9.setForeground(Color.BLACK);
            q9_panel.add(right_label9);
            q9_panel.add(q9);

        q10_panel=new JPanel();
        q10_panel.setBounds(100, 550, 1100, 40);
        q10_panel.setLayout(null);
        q10_panel.setBackground(Color.LIGHT_GRAY);

            q10=new JLabel(q10_value);
            q10.setBounds(20, 3, 850, 40);
            q10.setFont(new Font("Arial", Font.PLAIN, 25));
            q10.setForeground(Color.BLACK);
            q10_panel.add(right_label10);
            q10_panel.add(q10);

        //answers labels-
        ans_label1=new JLabel(ans1);
        ans_label1.setBounds(20, 30, 1000, 80);
        ans_label1.setFont(new Font("Arial", Font.PLAIN, 25));
        ans_label1.setForeground(Color.BLUE);

        ans_label2=new JLabel(ans2);
        ans_label2.setBounds(20, 30, 1000, 80);
        ans_label2.setFont(new Font("Arial", Font.PLAIN, 25));
        ans_label2.setForeground(Color.BLUE);

        ans_label3=new JLabel(ans3);
        ans_label3.setBounds(20, 30, 1000, 80);
        ans_label3.setFont(new Font("Arial", Font.PLAIN, 25));
        ans_label3.setForeground(Color.BLUE);

        ans_label4=new JLabel(ans4);
        ans_label4.setBounds(20, 30, 1000, 80);
        ans_label4.setFont(new Font("Arial", Font.PLAIN, 25));
        ans_label4.setForeground(Color.BLUE);

        ans_label5=new JLabel(ans5);
        ans_label5.setBounds(20, 30, 1000, 80);
        ans_label5.setFont(new Font("Arial", Font.PLAIN, 25));
        ans_label5.setForeground(Color.BLUE);

        ans_label6=new JLabel(ans6);
        ans_label6.setBounds(20, 30, 1000, 80);
        ans_label6.setFont(new Font("Arial", Font.PLAIN, 25));
        ans_label6.setForeground(Color.BLUE);

        ans_label7=new JLabel(ans7);
        ans_label7.setBounds(20, 30, 1000, 80);
        ans_label7.setFont(new Font("Arial", Font.PLAIN, 25));
        ans_label7.setForeground(Color.BLUE);

        ans_label8=new JLabel(ans8);
        ans_label8.setBounds(20, 30, 1000, 80);
        ans_label8.setFont(new Font("Arial", Font.PLAIN, 25));
        ans_label8.setForeground(Color.BLUE);

        ans_label9=new JLabel(ans9);
        ans_label9.setBounds(20, 30, 1000, 80);
        ans_label9.setFont(new Font("Arial", Font.PLAIN, 25));
        ans_label9.setForeground(Color.BLUE);


        ans_label10=new JLabel(ans10);
        ans_label10.setBounds(20, 30, 1000, 80);
        ans_label10.setFont(new Font("Arial", Font.PLAIN, 25));
        ans_label10.setForeground(Color.BLUE);



        q1_panel.addMouseListener(new TestMouseListener6());
        q2_panel.addMouseListener(new TestMouseListener6());
        q3_panel.addMouseListener(new TestMouseListener6());
        q4_panel.addMouseListener(new TestMouseListener6());
        q5_panel.addMouseListener(new TestMouseListener6());
        q6_panel.addMouseListener(new TestMouseListener6());
        q7_panel.addMouseListener(new TestMouseListener6());
        q8_panel.addMouseListener(new TestMouseListener6());
        q9_panel.addMouseListener(new TestMouseListener6());
        q10_panel.addMouseListener(new TestMouseListener6());


        panel1.add(faq_head);
        panel1.add(q1_panel);
        panel1.add(q2_panel);
        panel1.add(q3_panel);
        panel1.add(q4_panel);
        panel1.add(q5_panel);
        panel1.add(q6_panel);
        panel1.add(q7_panel);
        panel1.add(q8_panel);
        panel1.add(q9_panel);
        panel1.add(q10_panel);

        add(panel1);
        setVisible(true);
    }
    
    class TestMouseListener6 implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent e6){
            if(e6.getSource()==q1_panel){
                right_label1.setBounds(0, 0, 0, 0);
                down_label1.setBounds(1050, 10, 30, 30);
                q1_panel.add(down_label1);
                q1_panel.add(ans_label1);

                q1_panel.setBounds(100, 100, 1100, 100);
                q2_panel.setBounds(100, 210, 1100, 40);
                q3_panel.setBounds(100, 260, 1100, 40); 
                q4_panel.setBounds(100, 310, 1100, 40);  
                q5_panel.setBounds(100, 360, 1100, 40); 
                q6_panel.setBounds(100, 410, 1100, 40);  
                q7_panel.setBounds(100, 460, 1100, 40); 
                q8_panel.setBounds(100, 510, 1100, 40);   
                q9_panel.setBounds(100, 560, 1100, 40); 
                q10_panel.setBounds(100,610, 1100, 40);  
            } 
            else if(e6.getSource()==q2_panel){
                right_label2.setBounds(0, 0, 0, 0);
                down_label2.setBounds(1050, 10, 30, 30);
                q2_panel.add(down_label2);
                q2_panel.add(ans_label2);


                q1_panel.setBounds(100, 100, 1100, 40);
                q2_panel.setBounds(100, 150, 1100, 100);
                q3_panel.setBounds(100, 260, 1100, 40); 
                q4_panel.setBounds(100, 310, 1100, 40);  
                q5_panel.setBounds(100, 360, 1100, 40); 
                q6_panel.setBounds(100, 410, 1100, 40);  
                q7_panel.setBounds(100, 460, 1100, 40); 
                q8_panel.setBounds(100, 510, 1100, 40);   
                q9_panel.setBounds(100, 560, 1100, 40); 
                q10_panel.setBounds(100,610, 1100, 40);
            }
            else if(e6.getSource()==q3_panel){
                right_label3.setBounds(0, 0, 0, 0);
                down_label3.setBounds(1050, 10, 30, 30);
                q3_panel.add(down_label3);
                q3_panel.add(ans_label3);

                q1_panel.setBounds(100, 100, 1100, 40);
                q2_panel.setBounds(100, 150, 1100, 40);
                q3_panel.setBounds(100, 200, 1100, 100); 
                q4_panel.setBounds(100, 310, 1100, 40);  
                q5_panel.setBounds(100, 360, 1100, 40); 
                q6_panel.setBounds(100, 410, 1100, 40);  
                q7_panel.setBounds(100, 460, 1100, 40); 
                q8_panel.setBounds(100, 510, 1100, 40);   
                q9_panel.setBounds(100, 560, 1100, 40); 
                q10_panel.setBounds(100,610, 1100, 40);
            }
            else if(e6.getSource()==q4_panel){
                right_label4.setBounds(0, 0, 0, 0);
                down_label4.setBounds(1050, 10, 30, 30);
                q4_panel.add(down_label4);
                q4_panel.add(ans_label4);

                q1_panel.setBounds(100, 100, 1100, 40);
                q2_panel.setBounds(100, 150, 1100, 40);
                q3_panel.setBounds(100, 200, 1100, 40); 
                q4_panel.setBounds(100, 250, 1100, 100);  
                q5_panel.setBounds(100, 360, 1100, 40); 
                q6_panel.setBounds(100, 410, 1100, 40);  
                q7_panel.setBounds(100, 460, 1100, 40); 
                q8_panel.setBounds(100, 510, 1100, 40);   
                q9_panel.setBounds(100, 560, 1100, 40); 
                q10_panel.setBounds(100,610, 1100, 40);
                
            }
            else if(e6.getSource()==q5_panel){
                right_label5.setBounds(0, 0, 0, 0);
                down_label5.setBounds(1050, 10, 30, 30);
                q5_panel.add(down_label5);
                q5_panel.add(ans_label5);

                q1_panel.setBounds(100, 100, 1100, 40);
                q2_panel.setBounds(100, 150, 1100, 40);
                q3_panel.setBounds(100, 200, 1100, 40); 
                q4_panel.setBounds(100, 250, 1100, 40);  
                q5_panel.setBounds(100, 300, 1100, 100); 
                q6_panel.setBounds(100, 410, 1100, 40);  
                q7_panel.setBounds(100, 460, 1100, 40); 
                q8_panel.setBounds(100, 510, 1100, 40);   
                q9_panel.setBounds(100, 560, 1100, 40); 
                q10_panel.setBounds(100,610, 1100, 40);
            }
            else if(e6.getSource()==q6_panel){
                right_label6.setBounds(0, 0, 0, 0);
                down_label6.setBounds(1050, 10, 30, 30);
                q6_panel.add(down_label6);
                q6_panel.add(ans_label6);

                
                q1_panel.setBounds(100, 100, 1100, 40);
                q2_panel.setBounds(100, 150, 1100, 40);
                q3_panel.setBounds(100, 200, 1100, 40); 
                q4_panel.setBounds(100, 250, 1100, 40);  
                q5_panel.setBounds(100, 300, 1100, 40); 
                q6_panel.setBounds(100, 350, 1100, 100);  
                q7_panel.setBounds(100, 460, 1100, 40); 
                q8_panel.setBounds(100, 510, 1100, 40);   
                q9_panel.setBounds(100, 560, 1100, 40); 
                q10_panel.setBounds(100,610, 1100, 40);
            }
            else if(e6.getSource()==q7_panel){
                right_label7.setBounds(0, 0, 0, 0);
                down_label7.setBounds(1050, 10, 30, 30);
                q7_panel.add(down_label7);
                q7_panel.add(ans_label7);

                q1_panel.setBounds(100, 100, 1100, 40);
                q2_panel.setBounds(100, 150, 1100, 40);
                q3_panel.setBounds(100, 200, 1100, 40); 
                q4_panel.setBounds(100, 250, 1100, 40);  
                q5_panel.setBounds(100, 300, 1100, 40); 
                q6_panel.setBounds(100, 350, 1100, 40);  
                q7_panel.setBounds(100, 400, 1100, 100); 
                q8_panel.setBounds(100, 510, 1100, 40);   
                q9_panel.setBounds(100, 560, 1100, 40); 
                q10_panel.setBounds(100,610, 1100, 40);
            }
            else if(e6.getSource()==q8_panel){
                right_label8.setBounds(0, 0, 0, 0);
                down_label8.setBounds(1050, 10, 30, 30);
                q8_panel.add(down_label8);
                q8_panel.add(ans_label8);

                q1_panel.setBounds(100, 100, 1100, 40);
                q2_panel.setBounds(100, 150, 1100, 40);
                q3_panel.setBounds(100, 200, 1100, 40); 
                q4_panel.setBounds(100, 250, 1100, 40);  
                q5_panel.setBounds(100, 300, 1100, 40); 
                q6_panel.setBounds(100, 350, 1100, 40);  
                q7_panel.setBounds(100, 400, 1100, 40); 
                q8_panel.setBounds(100, 450, 1100, 100);   
                q9_panel.setBounds(100, 560, 1100, 40); 
                q10_panel.setBounds(100,610, 1100, 40);
            }
            else if(e6.getSource()==q9_panel){
                right_label9.setBounds(0, 0, 0, 0);
                down_label9.setBounds(1050, 10, 30, 30);
                q9_panel.add(down_label9);
                q9_panel.add(ans_label9);

                q1_panel.setBounds(100, 100, 1100, 40);
                q2_panel.setBounds(100, 150, 1100, 40);
                q3_panel.setBounds(100, 200, 1100, 40); 
                q4_panel.setBounds(100, 250, 1100, 40);  
                q5_panel.setBounds(100, 300, 1100, 40); 
                q6_panel.setBounds(100, 350, 1100, 40);  
                q7_panel.setBounds(100, 400, 1100, 40); 
                q8_panel.setBounds(100, 450, 1100, 40);   
                q9_panel.setBounds(100, 500, 1100, 100); 
                q10_panel.setBounds(100,610, 1100, 40);
            }   
            else if(e6.getSource()==q10_panel){
                right_label10.setBounds(0, 0, 0, 0);
                down_label10.setBounds(1050, 10, 30, 30);
                q10_panel.add(down_label10);
                q10_panel.add(ans_label10);

                q1_panel.setBounds(100, 100, 1100, 40);
                q2_panel.setBounds(100, 150, 1100, 40);
                q3_panel.setBounds(100, 200, 1100, 40); 
                q4_panel.setBounds(100, 250, 1100, 40);  
                q5_panel.setBounds(100, 300, 1100, 40); 
                q6_panel.setBounds(100, 350, 1100, 40);  
                q7_panel.setBounds(100, 400, 1100, 40); 
                q8_panel.setBounds(100, 450, 1100, 40);   
                q9_panel.setBounds(100, 500, 1100, 40); 
                q10_panel.setBounds(100,550, 1100, 100);
            }
        }
        @Override
        public void mouseExited(MouseEvent e6){
           if(e6.getSource()==q1_panel || e6.getSource()==q2_panel || e6.getSource()==q3_panel || e6.getSource()==q4_panel || 
                e6.getSource()==q5_panel || e6.getSource()==q6_panel || e6.getSource()==q7_panel || e6.getSource()==q8_panel || 
                e6.getSource()==q9_panel || e6.getSource()==q10_panel){
                if(e6.getSource()==q1_panel){
                    right_label1.setBounds(1050, 10, 20, 20);
                    down_label1.setBounds(0, 0, 0, 0);
                }
                else if(e6.getSource()==q2_panel){
                    right_label2.setBounds(1050, 10, 20, 20);
                    down_label2.setBounds(0, 0, 0, 0);
                }
                else if(e6.getSource()==q3_panel){
                    right_label3.setBounds(1050, 10, 20, 20);
                    down_label3.setBounds(0, 0, 0, 0);
                }
                else if(e6.getSource()==q4_panel){
                    right_label4.setBounds(1050, 10, 20, 20);
                    down_label4.setBounds(0, 0, 0, 0);
                }
                else if(e6.getSource()==q5_panel){
                    right_label5.setBounds(1050, 10, 20, 20);
                    down_label5.setBounds(0, 0, 0, 0);
                }
                else if(e6.getSource()==q6_panel){
                    right_label6.setBounds(1050, 10, 20, 20);
                    down_label6.setBounds(0, 0, 0, 0);
                }
                else if(e6.getSource()==q7_panel){
                    right_label7.setBounds(1050, 10, 20, 20);
                    down_label7.setBounds(0, 0, 0, 0);
                }
                else if(e6.getSource()==q8_panel){
                    right_label8.setBounds(1050, 10, 20, 20);
                    down_label8.setBounds(0, 0, 0, 0);
                }
                else if(e6.getSource()==q9_panel){
                    right_label9.setBounds(1050, 10, 20, 20);
                    down_label9.setBounds(0, 0, 0, 0);
                }
                else if(e6.getSource()==q10_panel){
                    right_label10.setBounds(1050, 10, 20, 20);
                    down_label10.setBounds(0, 0, 0, 0);
                }
                
                q1_panel.setBounds(100, 100, 1100, 40);
                q2_panel.setBounds(100, 150, 1100, 40);
                q3_panel.setBounds(100, 200, 1100, 40); 
                q4_panel.setBounds(100, 250, 1100, 40);  
                q5_panel.setBounds(100, 300, 1100, 40); 
                q6_panel.setBounds(100, 350, 1100, 40);  
                q7_panel.setBounds(100, 400, 1100, 40); 
                q8_panel.setBounds(100, 450, 1100, 40);   
                q9_panel.setBounds(100, 500, 1100, 40); 
                q10_panel.setBounds(100,550, 1100, 40);
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

}

class Help_ContactUs extends Help_FAQ{
    ImageIcon facebook_logo, insta_logo, twitter_logo;
    Image fb_image, scaled_fb_image, insta_image, scaled_insta_image, twitter_image, scaled_twitter_image;
    Icon fb_icon, insta_icon, twitter_icon;
    JLabel contact_head, contact_headline, contact_email, contact_phone, registered_address, follow_us, fb_label, insta_label, twitter_label, issue_label;
    JPanel contact_head_underline, contact_details_panel, white_line;
    String headline="We're here to help! Reach out to us for support, inquiries, or feedback. Our team will get back to you as soon as possible.",
    contact_email_content="<html><u>studypoint23@gmail.com</u></html>",
    contact_phone_content="Phone No: 1234567809",
    address="anand-vihar, noida, india",
    textarea_placeholder="Describe your issue...";

    JTextArea textarea1;
    JScrollPane textarea_scrollbar;
    JButton textarea_submit_button;
    
    public void Help_ContactUs_Content(){
        Help_Frame();

        //JPanel-
        contact_head_underline=new JPanel();
        contact_head_underline.setBounds(550, 70,200, 3);
        contact_head_underline.setBackground(Color.BLACK);
        contact_head_underline.setLayout(null);

        contact_details_panel=new JPanel();
        contact_details_panel.setBackground(Color.BLACK);
        contact_details_panel.setBounds(50, 150, 1200, 200);
        contact_details_panel.setLayout(null);
        
        white_line=new JPanel();
        white_line.setBounds(550, 30, 2, 150);
        white_line.setBackground(Color.WHITE);
        contact_details_panel.add(white_line);

        //Jlabels-
        contact_head =new JLabel("Contact Us");
        contact_head.setBounds(550, 30, 200, 40);
        contact_head.setFont(new Font("Arial", Font.PLAIN, 40));
        contact_head.setForeground(Color.BLACK);

        contact_headline=new JLabel(headline);
        contact_headline.setBounds(20, 80, 1350, 40);
        contact_headline.setFont(new Font("Arila", Font.ITALIC, 25));
        contact_headline.setForeground(Color.RED);

        contact_email=new JLabel(contact_email_content);
        contact_email.setBounds(20,30, 287, 40);
        contact_email.setForeground(Color.WHITE);
        contact_email.setFont(new Font("Arial", Font.PLAIN, 25));

        contact_phone=new JLabel(contact_phone_content);
        contact_phone.setBounds(20,80, 550, 40);
        contact_phone.setForeground(Color.WHITE);
        contact_phone.setFont(new Font("Arial", Font.PLAIN, 25));

        registered_address=new JLabel("on location: "+address);
        registered_address.setFont(new Font("Arial", Font.PLAIN, 25));
        registered_address.setBounds(20, 130, 550, 40);
        registered_address.setForeground(Color.WHITE);

        follow_us=new JLabel("Follow us on");
        follow_us.setFont(new Font("Arial", Font.PLAIN, 25));
        follow_us.setBounds(820, 30, 300, 40);
        follow_us.setForeground(Color.WHITE);

        issue_label=new JLabel("have an issue or feedback us?");
        issue_label.setBounds(50, 370, 400, 40);
        issue_label.setFont(new Font("Arial", Font.ITALIC, 20));
        issue_label.setForeground(Color.RED);

        //textarea & textfield-
        JTextField h_field=new JTextField();
        h_field.setBounds(0, 0, 0, 0);
        add(h_field);


        textarea1=new JTextArea(textarea_placeholder);
        textarea1.setPreferredSize(new Dimension(8000,5000));
        textarea1.setForeground(Color.BLACK);
        textarea1.setFont(new Font("Arial", Font.PLAIN, 25));
        textarea_scrollbar=new JScrollPane(textarea1);
        textarea_scrollbar.setBounds(50, 410, 500, 200);
        textarea_scrollbar.setBackground(Color.GRAY);

        textarea1.addFocusListener(new TestFocusListener());

        //button-
        textarea_submit_button=new JButton("SUBMIT");
        textarea_submit_button.setBounds(550, 620, 200, 40);
        textarea_submit_button.setFont(new Font("Arial", Font.BOLD, 25));
        textarea_submit_button.setForeground(Color.BLACK);
        textarea_submit_button.setBackground(Color.YELLOW);

        panel1.add(textarea_submit_button);
        textarea_submit_button.addMouseListener(new TestMouseListener7());
        textarea_submit_button.addActionListener(new TestActionListener_Textarea());

        //logo-
        facebook_logo=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\facebook.png");
        fb_image=facebook_logo.getImage();
        scaled_fb_image=fb_image.getScaledInstance(70, 70, Image.SCALE_SMOOTH);
        fb_icon=new ImageIcon(scaled_fb_image);
        fb_label=new JLabel("<html><a href='https://www.facebook.com/'>" + 
                      "<img src='file:///C:/Users/Lenovo/Downloads/facebook.png' width='70' height='70'></a></html>");
        fb_label.setBounds(740, 80, 70, 70);

        insta_logo=new ImageIcon("C:\\Users\\Lenovo\\Downloads\\insta.png");
        insta_image=insta_logo.getImage();
        scaled_insta_image=insta_image.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        insta_icon=new ImageIcon(scaled_insta_image);
        insta_label=new JLabel("<html><a href='https://www.instagram.com/'>" + 
                      "<img src='file:///C:/Users/Lenovo/Downloads/insta.png' width='75' height='75'></a></html>");
        insta_label.setBounds(850, 80, 75, 75);

        twitter_logo=new ImageIcon("C:\\Google pics\\x.jpg");
        twitter_image=twitter_logo.getImage();
        scaled_twitter_image=twitter_image.getScaledInstance(75, 75, Image.SCALE_SMOOTH);
        twitter_icon=new ImageIcon(scaled_twitter_image);
        twitter_label=new JLabel(twitter_icon);
        twitter_label=new JLabel("<html><a href='https://x.com/?lang=en'>" + 
                      "<img src='file:///C:\\Google pics\\x.jpg' width='75' height='75'></a></html>");
        twitter_label.setBounds(970, 80, 75, 75);

        fb_label.addMouseListener(new TestMouseListener7());
        insta_label.addMouseListener(new TestMouseListener7());
        twitter_label.addMouseListener(new TestMouseListener7());
        

        panel1.add(contact_head);
        panel1.add(contact_head_underline);
        panel1.add(contact_details_panel);
        panel1.add(contact_headline);
        contact_details_panel.add(contact_email);
        contact_details_panel.add(contact_phone);
        contact_details_panel.add(registered_address);
        contact_details_panel.add(follow_us);
        contact_details_panel.add(fb_label);
        contact_details_panel.add(insta_label);
        contact_details_panel.add(twitter_label);

        //events-
        contact_email.addMouseListener(new TestMouseListener7());

        panel1.add(issue_label);
        panel1.add(textarea_scrollbar);

        add(panel1);
        setVisible(true);
    }
    
    class TestMouseListener7 implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent e8) {
            if(e8.getSource()==contact_email){
                contact_email.setForeground(Color.GREEN);
            }
            else if(e8.getSource()==fb_label){
                fb_label.setBounds(740, 80, 90, 90);
            }
            else if(e8.getSource()==insta_label){
                insta_label.setBounds(850, 80, 90, 90);
            }
            else if(e8.getSource()==twitter_label){
                twitter_label.setBounds(970, 80, 90, 90);
            }
            else if(e8.getSource()==textarea_submit_button){
                textarea_submit_button.setBackground(Color.GREEN);
            }
        }
        @Override
        public void mouseExited(MouseEvent e8){
            if(e8.getSource()==contact_email){
                contact_email.setForeground(Color.WHITE);
            }
            else if(e8.getSource()==fb_label||e8.getSource()==insta_label||e8.getSource()==twitter_label){
                fb_label.setBounds(740, 80, 70, 70);
                insta_label.setBounds(850, 80, 75, 75);
                twitter_label.setBounds(970, 80, 75, 75);
            }
            else if(e8.getSource()==textarea_submit_button){
                textarea_submit_button.setBackground(Color.YELLOW);
            }
        }
        @Override
        public void mouseClicked(MouseEvent e8){
            if(e8.getSource()==contact_email){
                try{
                    Desktop.getDesktop().browse(new URI("mailto:nishantvats37@gmail.com"));
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
            if(e8.getSource()==fb_label){
                try {
                    // Open the Instagram link when the label is clicked
                    Desktop.getDesktop().browse(new URI("https://www.facebook.com/"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            else if(e8.getSource()==insta_label){
                try {
                    // Open the Instagram link when the label is clicked
                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
            else if(e8.getSource()==twitter_label){
                try {
                    // Open the Instagram link when the label is clicked
                    Desktop.getDesktop().browse(new URI("https://x.com/?lang=en"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        }
        @Override
        public void mousePressed(MouseEvent e) {
            
        }
        @Override
        public void mouseReleased(MouseEvent e) {
            
        }
    }
    
    class TestFocusListener implements FocusListener{
   
        public void focusGained(FocusEvent f){
            if(f.getSource()==textarea1){
                if(textarea1.getText().equals(textarea_placeholder)){
                    textarea1.setText("");
                }
            }
        }
        public void focusLost(FocusEvent f){
            if(f.getSource()==textarea1){
                if(textarea1.getText().isEmpty()){
                    textarea1.setText(textarea_placeholder);
                }
            }
        }
    }

    class TestActionListener_Textarea implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){

            if(e.getSource()==textarea_submit_button){
                String str_textarea=textarea1.getText();

                if(!(str_textarea.isEmpty() || str_textarea.equals(textarea_placeholder))){
                    System.out.println("your string- \n"+str_textarea);

                    //IO Handling code to store the content of textarea in a file-
                    try{

                        FileWriter fw=new FileWriter("C:\\coding journey\\college projects\\studypoint_management_system\\Messages.txt");
                        fw.write(str_textarea);

                        textarea_submit_button.setBackground(Color.GREEN);
                        textarea_submit_button.setText("Submitted");

                        JOptionPane.showMessageDialog(null, "Thanks For Submit", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);
                    
                        fw.close();
                    }
                    catch(IOException io_exp){
                        io_exp.printStackTrace();
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "please describe your issue before submit", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                }
            }
        }
    }
}



/*public class Help_Section{
    public static void main(String[] args){
        Help_ContactUs contact=new Help_ContactUs();
        contact.Help_ContactUs_Content();
    }
}*/