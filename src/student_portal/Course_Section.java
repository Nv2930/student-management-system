package student_portal;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class Java_Course extends JFrame{
    ImageIcon logo;
    JLabel java_head;
    JPanel panel1, java_underline, java_panel;
    JLabel course_name3, course_tech3, course_seats_batch, course_duration3, course_price3, value9, value10, value11, java_content, value12, java_basics, java_control_statments, java_functions, java_array, java_string,
    java_objects, java_inheritance, java_polymorphism, java_abstraction, java_encapsulation, java_multithreading, java_exception_handling, java_io, java_awt_events, java_swing, java_sql, java_jdbc, java_projects;
    JButton buy_java_course;
    Enrollment_Form_Coding enroll;

    public void course_Frame(){
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
    public void java_Course_Content(){
        course_Frame();

        java_panel=new JPanel();
        java_panel.setBounds(50, 300 ,1100, 280);
        java_panel.setLayout(null);
        java_panel.setBackground(Color.LIGHT_GRAY);
        panel1.add(java_panel);

        java_underline=new JPanel();
        java_underline.setBounds(50, 100 ,500, 3);
        java_underline.setLayout(null);
        java_underline.setBackground(Color.BLACK);

        //-------------------labels-----------------
        java_head=new JLabel("Java Development Course");
        java_head.setFont(new Font("Arial", Font.BOLD, 40));
        java_head.setBounds(50, 50, 550, 45);
        java_head.setForeground(Color.BLACK);

        course_name3=new JLabel("Course Name: ");
        course_name3.setBounds(100, 120, 230, 45);
        course_name3.setFont(new Font("Arial", Font.BOLD, 28));
            
            value9=new JLabel("Java");
            value9.setBounds(350, 120, 230, 45);
            value9.setFont(new Font("Arial", Font.PLAIN, 27));
            value9.setForeground(Color.RED);

        course_tech3=new JLabel("Technologies: ");
        course_tech3.setBounds(800, 120, 230, 45);
        course_tech3.setFont(new Font("Arial", Font.BOLD, 28));

            value10=new JLabel("core java, mysql, jdbc");
            value10.setBounds(1050, 120, 500, 45);
            value10.setFont(new Font("Arial", Font.PLAIN, 28));
            value10.setForeground(Color.RED);

        course_duration3=new JLabel("Duration: ");
        course_duration3.setBounds(100, 175, 230, 45);
        course_duration3.setFont(new Font("Arial", Font.BOLD, 28));

            value11=new JLabel("6-Months");
            value11.setBounds(350, 175, 200, 45);
            value11.setFont(new Font("Arial", Font.PLAIN, 27));
            value11.setForeground(Color.RED);

        course_price3=new JLabel("price: ");
        course_price3.setBounds(800, 175, 230, 45);
        course_price3.setFont(new Font("Arial", Font.BOLD, 28));

            value12=new JLabel("RS.30,000");
            value12.setBounds(1050, 175, 150, 45);
            value12.setFont(new Font("Arial", Font.PLAIN, 25));
            value12.setForeground(Color.RED);
    
        java_content=new JLabel(" Course Content");
        java_content.setBounds(440, 245, 250, 45);
        java_content.setFont(new Font("Arial", Font.BOLD, 30));
        java_content.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        java_content.setForeground(Color.BLACK);

        java_basics=new JLabel("1. Introduction To java");
        java_basics.setFont(new Font("Arial", Font.PLAIN, 25));
        java_basics.setBounds(20, 10, 400, 30);
        java_basics.setForeground(Color.BLACK);

        java_control_statments=new JLabel("2. Java Control Statements");
        java_control_statments.setFont(new Font("Arial", Font.PLAIN, 25));
        java_control_statments.setBounds(20, 45, 500, 30);
        java_control_statments.setForeground(Color.BLACK);

        java_functions=new JLabel("3. Java Methods");
        java_functions.setFont(new Font("Arial", Font.PLAIN, 25));
        java_functions.setBounds(20, 80, 200, 30);
        java_functions.setForeground(Color.BLACK);

        java_array=new JLabel("4. Java Array");
        java_array.setFont(new Font("Arial", Font.PLAIN, 25));
        java_array.setBounds(20, 115, 150, 30);
        java_array.setForeground(Color.BLACK);
        
        java_string=new JLabel("5. Java String");
        java_string.setFont(new Font("Arial", Font.PLAIN, 25));
        java_string.setBounds(20, 150, 150, 30);
        java_string.setForeground(Color.BLACK);

        java_objects=new JLabel("6. Java Objects & Classes");
        java_objects.setFont(new Font("Arial", Font.PLAIN, 25));
        java_objects.setBounds(20, 185, 300, 30);
        java_objects.setForeground(Color.BLACK);

        java_inheritance=new JLabel("7. Java Inheritance");
        java_inheritance.setFont(new Font("Arial", Font.PLAIN, 25));
        java_inheritance.setBounds(20, 220, 350,30);
        java_inheritance.setForeground(Color.BLACK);

        java_polymorphism=new JLabel("8. Java Polymorphism");
        java_polymorphism.setFont(new Font("Arial", Font.PLAIN, 25));
        java_polymorphism.setBounds(355, 10, 250, 30);
        java_polymorphism.setForeground(Color.BLACK);

        java_abstraction=new JLabel("9. Java Abstraction");
        java_abstraction.setFont(new Font("Arial", Font.PLAIN, 25));
        java_abstraction.setBounds(355,45, 270, 30);
        java_abstraction.setForeground(Color.BLACK);

        java_encapsulation=new JLabel("10. Java Encapsulation");
        java_encapsulation.setFont(new Font("Arial", Font.PLAIN, 25));
        java_encapsulation.setBounds(350, 80, 270, 30);
        java_encapsulation.setForeground(Color.BLACK);

        java_multithreading=new JLabel("11. Java Multithreading");
        java_multithreading.setFont(new Font("Arial", Font.PLAIN, 25));
        java_multithreading.setBounds(350, 115, 270, 30);
        java_multithreading.setForeground(Color.BLACK);

        java_exception_handling=new JLabel("12. Java Exception Handling");
        java_exception_handling.setFont(new Font("Arial", Font.PLAIN, 25));
        java_exception_handling.setBounds(350, 150, 350, 30);
        java_exception_handling.setForeground(Color.BLACK);

        java_io=new JLabel("13. Java I/O & Stream");
        java_io.setFont(new Font("Arial", Font.PLAIN, 25));
        java_io.setBounds(350, 185, 350, 30);
        java_io.setForeground(Color.BLACK);

        java_awt_events=new JLabel("14. Java AWT & Event Handling");
        java_awt_events.setFont(new Font("Arial", Font.PLAIN, 25));
        java_awt_events.setBounds(350, 220, 450, 30);
        java_awt_events.setForeground(Color.BLACK);

        java_swing=new JLabel("15. Java Swing");
        java_swing.setFont(new Font("Arial", Font.PLAIN, 25));
        java_swing.setBounds(750, 10, 350, 30);
        java_swing.setForeground(Color.BLACK);

        java_sql=new JLabel("16. MySQL Database");
        java_sql.setFont(new Font("Arial", Font.PLAIN, 25));
        java_sql.setBounds(750, 45, 350, 30);
        java_sql.setForeground(Color.BLACK);

        java_jdbc=new JLabel("17. JDBC");
        java_jdbc.setFont(new Font("Arial", Font.PLAIN, 25));
        java_jdbc.setBounds(750, 80, 350, 30);
        java_jdbc.setForeground(Color.BLACK);

        java_projects=new JLabel(">Working on Projects");
        java_projects.setFont(new Font("Arial", Font.PLAIN, 25));
        java_projects.setBounds(750, 150, 300, 30);
        java_projects.setForeground(Color.BLACK);
    
        //buy button-
        buy_java_course=new JButton("Enroll Now");
        buy_java_course.setFont(new Font("Arial", Font.BOLD, 25));
        buy_java_course.setBounds(1100, 600, 170, 45);
        buy_java_course.setBackground(Color.YELLOW);
        buy_java_course.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel1.add(buy_java_course);

        buy_java_course.addMouseListener(new TestMouseListener3());
        buy_java_course.addActionListener(new TestActionListener5());

    
        java_panel.add(java_basics);
        java_panel.add(java_control_statments);
        java_panel.add(java_functions);
        java_panel.add(java_array);
        java_panel.add(java_string);
        java_panel.add(java_objects);
        java_panel.add(java_inheritance);
        java_panel.add(java_polymorphism);
        java_panel.add(java_abstraction);
        java_panel.add(java_encapsulation);
        java_panel.add(java_multithreading);
        java_panel.add(java_exception_handling);
        java_panel.add(java_io);
        java_panel.add(java_awt_events);
        java_panel.add(java_swing);
        java_panel.add(java_sql);
        java_panel.add(java_jdbc);
        java_panel.add(java_projects);

        panel1.add(java_head);
        panel1.add(java_underline);
        panel1.add(java_panel);
        panel1.add(course_name3);
        panel1.add(course_tech3);
        panel1.add(course_duration3);
        panel1.add(course_price3);
        panel1.add(value9);
        panel1.add(value10);
        panel1.add(value11);
        panel1.add(value12);

        panel1.add(java_content);
        add(panel1);
        setVisible(true);
    }
    class TestMouseListener3 implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent e3) {
            if(e3.getSource()==buy_java_course){
                buy_java_course.setBackground(Color.GREEN);
            }
        }
        @Override
        public void mouseExited(MouseEvent e3){
            if(e3.getSource()==buy_java_course){
                buy_java_course.setBackground(Color.YELLOW);
            }
        }
        @Override
        public void mouseClicked(MouseEvent e) {
            
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
    class TestActionListener5 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            enroll=new Enrollment_Form_Coding();
            enroll.enrollment_Frame_Content();
        }
    }
}
class DSA_Course extends Java_Course{
    JLabel DSA_Head;
    JPanel DSA_Underline, DSA_Panel;
    JLabel course_name5, course_tech5, course_seats_batch, course_duration5, course_price5, value17, value18, value19, DSA_content, value20, ds_java_basics, ds_java, ds_java_OOPs, ds_java_threading, ds_java_exception, dsa_intro, ds_array, ds_list, ds_stack, ds_queue,ds_tree, ds_graph, ds_sorting, ds_searching, ds_heap, ds_hashing, ds_algo, ds_advanced, ds_projects;
    JButton buy_dsa_course;

    public void dsa_Course_Content(){
        course_Frame();

        DSA_Panel=new JPanel();
        DSA_Panel.setBounds(50, 300 ,1200, 280);
        DSA_Panel.setLayout(null);
        DSA_Panel.setBackground(Color.LIGHT_GRAY);
        panel1.add(DSA_Panel);

        DSA_Underline=new JPanel();
        DSA_Underline.setBounds(50, 100 ,500, 3);
        DSA_Underline.setLayout(null);
        DSA_Underline.setBackground(Color.BLACK);

        //-------------------labels-----------------
        DSA_Head=new JLabel("DSA with Java");
        DSA_Head.setFont(new Font("Arial", Font.BOLD, 40));
        DSA_Head.setBounds(50, 50, 300, 45);
        DSA_Head.setForeground(Color.BLACK);

        course_name5=new JLabel("Course Name: ");
        course_name5.setBounds(100, 120, 230, 45);
        course_name5.setFont(new Font("Arial", Font.BOLD, 28));
            
            value17=new JLabel("DSA with Java");
            value17.setBounds(350, 120, 300, 45);
            value17.setFont(new Font("Arial", Font.PLAIN, 27));
            value17.setForeground(Color.RED);

        course_tech5=new JLabel("Technologies: ");
        course_tech5.setBounds(800, 120, 230, 45);
        course_tech5.setFont(new Font("Arial", Font.BOLD, 28));

            value18=new JLabel("core java, dsa");
            value18.setBounds(1050, 120, 300, 45);
            value18.setFont(new Font("Arial", Font.PLAIN, 28));
            value18.setForeground(Color.RED);

        course_duration5=new JLabel("Duration: ");
        course_duration5.setBounds(100, 175, 230, 45);
        course_duration5.setFont(new Font("Arial", Font.BOLD, 28));

            value19=new JLabel("6-Months");
            value19.setBounds(350, 175, 200, 45);
            value19.setFont(new Font("Arial", Font.PLAIN, 27));
            value19.setForeground(Color.RED);

        course_price5=new JLabel("price: ");
        course_price5.setBounds(800, 175, 230, 45);
        course_price5.setFont(new Font("Arial", Font.BOLD, 28));

            value20=new JLabel("RS.30,000");
            value20.setBounds(1050, 175, 150, 45);
            value20.setFont(new Font("Arial", Font.PLAIN, 25));
            value20.setForeground(Color.RED);
    
        DSA_content=new JLabel(" Course Content");
        DSA_content.setBounds(440, 245, 250, 45);
        DSA_content.setFont(new Font("Arial", Font.BOLD, 30));
        DSA_content.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        DSA_content.setForeground(Color.BLACK);

        ds_java=new JLabel("1. Introduction to Java");
        ds_java.setBounds(20, 20, 550, 40);
        ds_java.setFont(new Font("Arial", Font.PLAIN, 27));
        ds_java.setForeground(Color.BLACK);

        ds_java_basics=new JLabel("2. Java Basics");
        ds_java_basics.setBounds(20, 55, 200, 40);
        ds_java_basics.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_java_basics.setForeground(Color.BLACK);

        ds_java_OOPs=new JLabel("3. Java OOPs");
        ds_java_OOPs.setBounds(20, 90, 250, 40);
        ds_java_OOPs.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_java_OOPs.setForeground(Color.BLACK);

        ds_java_threading=new JLabel("4. Java Multithreading");
        ds_java_threading.setBounds(20, 125, 250, 40);
        ds_java_threading.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_java_threading.setForeground(Color.BLACK);

        ds_java_exception=new JLabel("5. Java Exception Handling");
        ds_java_exception.setBounds(20, 160, 300, 40);
        ds_java_exception.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_java_exception.setForeground(Color.BLACK);

        dsa_intro=new JLabel("6. Introduction to DSA");
        dsa_intro.setBounds(20,195, 350, 40);
        dsa_intro.setFont(new Font("Arial", Font.PLAIN, 25));
        dsa_intro.setForeground(Color.BLACK);

        ds_array=new JLabel("7. DS Array");
        ds_array.setBounds(20, 230, 150, 40);
        ds_array.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_array.setForeground(Color.BLACK);

        ds_list=new JLabel("8. DS Linked List");
        ds_list.setBounds(400, 20, 250, 40);
        ds_list.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_list.setForeground(Color.BLACK);

        ds_stack=new JLabel("9. DS Stack");
        ds_stack.setBounds(400, 55, 150, 40);
        ds_stack.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_stack.setForeground(Color.BLACK);
        
        ds_queue=new JLabel("10. DS Queue");
        ds_queue.setBounds(395, 90, 200, 40);
        ds_queue.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_queue.setForeground(Color.BLACK);

        ds_tree=new JLabel("11. DS Tree");
        ds_tree.setBounds(395, 125, 150, 40);
        ds_tree.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_tree.setForeground(Color.BLACK);

        ds_graph=new JLabel("12. DS Graph");
        ds_graph.setBounds(395, 160, 150, 40);
        ds_graph.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_graph.setForeground(Color.BLACK);

        ds_sorting=new JLabel("13. DS Sorting Techniques");
        ds_sorting.setBounds(395, 195, 350, 40);
        ds_sorting.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_sorting.setForeground(Color.BLACK);

        ds_searching=new JLabel("14. DS Searching Techniques");
        ds_searching.setBounds(395, 230, 350, 40);
        ds_searching.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_searching.setForeground(Color.BLACK);

        ds_heap=new JLabel("15. DS Heap");
        ds_heap.setBounds(800, 20, 150, 40);
        ds_heap.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_heap.setForeground(Color.BLACK);

        ds_hashing=new JLabel("16. DS Hashing");
        ds_hashing.setBounds(800, 55, 200, 40);
        ds_hashing.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_hashing.setForeground(Color.BLACK);

        ds_algo=new JLabel("17. Algorithm Design Techniques");
        ds_algo.setBounds(800, 90, 550, 40);
        ds_algo.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_algo.setForeground(Color.BLACK);

        ds_advanced=new JLabel("18. DS Advanced Topics");
        ds_advanced.setBounds(800, 125, 350, 40);
        ds_advanced.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_advanced.setForeground(Color.BLACK);

        ds_projects=new JLabel("19. Practice set + Projects");
        ds_projects.setBounds(800, 160, 550, 40);
        ds_projects.setFont(new Font("Arial", Font.PLAIN, 25));
        ds_projects.setForeground(Color.BLACK);

        DSA_Panel.add(ds_java);
        DSA_Panel.add(ds_java_basics);
        DSA_Panel.add(ds_java_OOPs);
        DSA_Panel.add(ds_java_exception);
        DSA_Panel.add(ds_java_threading);
        DSA_Panel.add(dsa_intro);
        DSA_Panel.add(ds_array);
        DSA_Panel.add(ds_list);
        DSA_Panel.add(ds_stack);
        DSA_Panel.add(ds_queue);
        DSA_Panel.add(ds_tree);
        DSA_Panel.add(ds_graph);
        DSA_Panel.add(ds_sorting);
        DSA_Panel.add(ds_searching);
        DSA_Panel.add(ds_heap);
        DSA_Panel.add(ds_hashing);
        DSA_Panel.add(ds_algo);
        DSA_Panel.add(ds_advanced);
        DSA_Panel.add(ds_projects);

        //buy button-
        buy_dsa_course=new JButton("Enroll Now");
        buy_dsa_course.setFont(new Font("Arial", Font.BOLD, 25));
        buy_dsa_course.setBounds(1100, 600, 170, 45);
        buy_dsa_course.setBackground(Color.YELLOW);
        buy_dsa_course.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        panel1.add(buy_dsa_course);

        buy_dsa_course.addMouseListener(new TestMouseListener4());
        buy_dsa_course.addActionListener(new TestActionListener6());

        panel1.add(DSA_Head);
        panel1.add(DSA_Underline);
        panel1.add(DSA_Panel);
        panel1.add(course_name5);
        panel1.add(course_tech5);
        panel1.add(course_duration5);
        panel1.add(course_price5);
        panel1.add(value17);
        panel1.add(value18);
        panel1.add(value19);
        panel1.add(value20);

        panel1.add(DSA_content);
        add(panel1);
        setVisible(true);
    }
    class TestMouseListener4 implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent e3) {
            if(e3.getSource()==buy_dsa_course){
                buy_dsa_course.setBackground(Color.GREEN);
            }
        }
        @Override
        public void mouseExited(MouseEvent e3){
            if(e3.getSource()==buy_dsa_course){
                buy_dsa_course.setBackground(Color.YELLOW);
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
            // TODO Auto-generated method stub;
        }
    }
    class TestActionListener6 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==buy_dsa_course){
                enroll=new Enrollment_Form_Coding();
                enroll.enrollment_Frame_Content(); 
            }
        }
    }
}
class Web_Development_Course extends Java_Course{
    JLabel web_head;
    JPanel web_panel1, web_underline, html_panel, css_panel, js_panel, web_java_panel, framework_panel;
    
    JLabel course_name4, course_tech4, course_seats_batch, course_duration4, course_price4, value13, value14, value15, value16, web_content, html_tags, html_list, html_table, html_form_element, html_semantic_elements,html_entities, html_meta_tags, css_font, css_colors, css_selectors, css_specificity, css_border, css_padding_margin, css_element_type, css_pseudo_classes, css_pseudo_element, css_units, js_basics, js_control_statmenets, js_function, js_array, js_string, js_dom, js_bom, js_objects, js_object_class, js_inheritance, js_polymorphism, js_abstraction, js_encapsulation, js_exception, web_java_basics, web_java_control_statements, web_java_functions,
    web_java_array, web_java_string, web_java_objects, web_java_inheritance, web_java_polymorphism, web_java_abstraction, web_java_encapsulation, web_java_multithreading, web_java_exception_handling, web_java_io, web_mysql, bootstrap, react, node_js, jsp_servelet, spring, springboot;

    JScrollPane web_panel1_scroll, html_scroll, css_scroll, framework_scroll ,js_scroll, web_java_scroll;
    JButton buy_js_course;

    public void web_Course_Content(){
        course_Frame();

        //panel1 coding-
        web_panel1=new JPanel();
        web_panel1.setPreferredSize(new Dimension(1380, 1100));
        web_panel1.setBackground(Color.white);
        web_panel1.setLayout(null);
        web_panel1_scroll=new JScrollPane(web_panel1);
        web_panel1_scroll.setBounds(50, 50 ,1380, 675);
        add(web_panel1_scroll);
        
        

        html_panel=new JPanel();
        html_panel.setPreferredSize(new Dimension(350, 400));
        html_panel.setLayout(null);
        html_panel.setBackground(Color.LIGHT_GRAY);
        html_scroll=new JScrollPane(html_panel);
        html_scroll.setBounds(50, 250, 300, 400);

        web_panel1.add(html_scroll);

        css_panel=new JPanel();
        css_panel.setPreferredSize(new Dimension(500, 400));
        css_panel.setLayout(null);
        css_panel.setBackground(Color.LIGHT_GRAY);
        css_scroll=new JScrollPane(css_panel);
        css_scroll.setBounds(450, 250 ,400, 400);

        web_panel1.add(css_scroll);

        js_panel=new JPanel();
        js_panel.setLayout(null);
        js_panel.setBackground(Color.LIGHT_GRAY);
        js_panel.setPreferredSize(new Dimension(400, 600));
        js_scroll=new JScrollPane(js_panel);
        js_scroll.setBounds(930, 250 ,400, 400);

        web_panel1.add(js_scroll);
        
        web_java_panel=new JPanel();
        web_java_panel.setLayout(null);
        web_java_panel.setBackground(Color.LIGHT_GRAY);
        web_java_panel.setPreferredSize(new Dimension(690, 300));
        web_java_scroll=new JScrollPane(web_java_panel);
        web_java_scroll.setBounds(50, 750 ,500, 300);

        web_panel1.add(web_java_scroll);

        web_underline=new JPanel();
        web_underline.setBounds(50, 60 ,500, 3);
        web_underline.setLayout(null);
        web_underline.setBackground(Color.BLACK);

        //-------------------labels-----------------
        web_head=new JLabel("Web Development Course");
        web_head.setFont(new Font("Arial", Font.BOLD, 40));
        web_head.setBounds(50, 20, 550, 40);
        web_head.setForeground(Color.BLACK);

        course_name4=new JLabel("Course Name: ");
        course_name4.setBounds(50, 70, 230, 45);
        course_name4.setFont(new Font("Arial", Font.BOLD, 28));
            
            value13=new JLabel("Full Stack Web Development");
            value13.setBounds(350, 70, 500, 45);
            value13.setFont(new Font("Arial", Font.PLAIN, 27));
            value13.setForeground(Color.RED);

        course_tech4=new JLabel("Technologies: ");
        course_tech4.setBounds(800, 70, 230, 45);
        course_tech4.setFont(new Font("Arial", Font.BOLD, 28));

            value14=new JLabel("HTML, CSS, JAVA SCRIPT");
            value14.setBounds(1020, 70, 400, 45);
            value14.setFont(new Font("Arial", Font.PLAIN, 25));
            value14.setForeground(Color.RED);

        course_duration4=new JLabel("Duration: ");
        course_duration4.setBounds(50, 120, 230, 45);
        course_duration4.setFont(new Font("Arial", Font.BOLD, 28));

            value15=new JLabel("6-Months");
            value15.setBounds(350, 120, 200, 45);
            value15.setFont(new Font("Arial", Font.PLAIN, 27));
            value15.setForeground(Color.RED);

        web_content=new JLabel(" Course Content");
        web_content.setBounds(550, 190, 250, 45);
        web_content.setFont(new Font("Arial", Font.BOLD, 30));
        web_content.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        web_content.setForeground(Color.BLACK);
    

        course_price4=new JLabel("price: ");
        course_price4.setBounds(800, 120, 230, 45);
        course_price4.setFont(new Font("Arial", Font.BOLD, 28));

            value16=new JLabel("RS.30,000");
            value16.setBounds(1050, 120, 150, 45);
            value16.setFont(new Font("Arial", Font.PLAIN, 25));
            value16.setForeground(Color.RED);

        //html panel content-
        html_tags=new JLabel("1, HTML Tags");
        html_tags.setBounds(10, 20, 200, 45);
        html_tags.setFont(new Font("Arial", Font.PLAIN, 25));
        html_tags.setForeground(Color.BLACK);

        html_list=new JLabel("2. HTML List");
        html_list.setBounds(10, 65, 200, 45);
        html_list.setFont(new Font("Arial", Font.PLAIN, 25));
        html_tags.setForeground(Color.BLACK);

        html_table=new JLabel("3. HTML Table");
        html_table.setBounds(10, 110, 200, 45);
        html_table.setFont(new Font("Arial", Font.PLAIN, 25));
        html_table.setForeground(Color.BLACK);

        html_form_element=new JLabel("4. HTML Form Elements");
        html_form_element.setBounds(10, 155, 400, 45);
        html_form_element.setFont(new Font("Arial", Font.PLAIN, 25));
        html_form_element.setForeground(Color.BLACK);

        html_semantic_elements=new JLabel("5. HTML Semantic Elements");
        html_semantic_elements.setBounds(10, 203, 400, 45);
        html_semantic_elements.setFont(new Font("Arial", Font.PLAIN, 25));
        html_semantic_elements.setForeground(Color.BLACK);

        html_entities=new JLabel("6. HTML Entities");
        html_entities.setBounds(10, 250, 195, 45);
        html_entities.setFont(new Font("Arial", Font.PLAIN, 25));
        html_entities.setForeground(Color.BLACK);

        html_meta_tags=new JLabel("7. HTML META TAGS");
        html_meta_tags.setBounds(10, 300, 345, 45);
        html_meta_tags.setFont(new Font("Arial", Font.PLAIN, 25));
        html_meta_tags.setForeground(Color.BLACK);


        html_panel.add(html_tags);
        html_panel.add(html_list);
        html_panel.add(html_table);
        html_panel.add(html_form_element);
        html_panel.add(html_semantic_elements);
        html_panel.add(html_entities);
        html_panel.add(html_meta_tags);


        //css panel content-
        css_font=new JLabel("1. CSS Font");
        css_font.setBounds(10, 20, 200, 45);
        css_font.setFont(new Font("Arial", Font.PLAIN, 25));
        css_font.setForeground(Color.BLACK);

        css_colors=new JLabel("2. CSS Color");
        css_colors.setBounds(10, 60, 200, 45);
        css_colors.setFont(new Font("Arial", Font.PLAIN, 25));
        css_colors.setForeground(Color.BLACK);

        css_selectors=new JLabel("3. CSS Selectors");
        css_selectors.setBounds(10, 100, 200, 45);
        css_selectors.setFont(new Font("Arial", Font.PLAIN, 25));
        css_selectors.setForeground(Color.BLACK);

        css_specificity=new JLabel("4. CSS Specificity");
        css_specificity.setBounds(10, 140, 400, 45);
        css_specificity.setFont(new Font("Arial", Font.PLAIN, 25));
        css_specificity.setForeground(Color.BLACK);

        css_border=new JLabel("5. CSS Border");
        css_border.setBounds(10, 180, 400, 45);
        css_border.setFont(new Font("Arial", Font.PLAIN, 25));
        css_border.setForeground(Color.BLACK);

        css_padding_margin=new JLabel("6. CSS Box Model- Padding & Margin");
        css_padding_margin.setBounds(10, 220, 450, 45);
        css_padding_margin.setFont(new Font("Arial", Font.PLAIN, 25));
        css_padding_margin.setForeground(Color.BLACK);

        css_element_type=new JLabel("7. CSS Block, Inline, Inline-Block Elements");
        css_element_type.setBounds(10, 260, 500, 45);
        css_element_type.setFont(new Font("Arial", Font.PLAIN, 25));
        css_element_type.setForeground(Color.BLACK);

        css_pseudo_classes=new JLabel("8. CSS Pseudo Classes");
        css_pseudo_classes.setBounds(10, 300, 400, 45);
        css_pseudo_classes.setFont(new Font("Arial", Font.PLAIN, 25));
        css_pseudo_classes.setForeground(Color.BLACK);

        css_pseudo_element=new JLabel("9. CSS Pseudo Elements");
        css_pseudo_element.setBounds(10, 340, 400, 45);
        css_pseudo_element.setFont(new Font("Arial", Font.PLAIN, 25));
        css_pseudo_element.setForeground(Color.BLACK);

        css_panel.add(css_font);
        css_panel.add(css_colors);
        css_panel.add(css_selectors);
        css_panel.add(css_specificity);
        css_panel.add(css_border);
        css_panel.add(css_padding_margin);
        css_panel.add(css_element_type);

        css_panel.add(css_pseudo_classes);
        css_panel.add(css_pseudo_element);

        //JS Content-
        js_basics=new JLabel("1, Introduction to JavaScript");
        js_basics.setBounds(20, 20, 500, 40);
        js_basics.setFont(new Font("Arial", Font.PLAIN, 25));
        js_basics.setForeground(Color.BLACK);

        js_control_statmenets=new JLabel("2. Javascript Control Statements");
        js_control_statmenets.setBounds(20, 60, 500, 40);
        js_control_statmenets.setFont(new Font("Arial", Font.PLAIN, 25));
        js_control_statmenets.setForeground(Color.BLACK);

        js_function=new JLabel("3. Javascript Function");
        js_function.setBounds(20, 100, 500, 40);
        js_function.setFont(new Font("Arial", Font.PLAIN, 25));
        js_function.setForeground(Color.BLACK);

        js_array=new JLabel("4. Javascript Array");
        js_array.setBounds(20, 140, 500, 40);
        js_array.setFont(new Font("Arial", Font.PLAIN, 25));
        js_array.setForeground(Color.BLACK);

        js_string=new JLabel("5. Javascript String");
        js_string.setBounds(20, 180, 500, 40);
        js_string.setFont(new Font("Arial", Font.PLAIN, 25));
        js_string.setForeground(Color.BLACK);

        js_objects=new JLabel("6. Javascript Objects");
        js_objects.setBounds(20, 220, 500, 40);
        js_objects.setFont(new Font("Arial", Font.PLAIN, 25));
        js_objects.setForeground(Color.BLACK);

        js_dom=new JLabel("7. Javascript DOM");
        js_dom.setBounds(20, 260, 500, 40);
        js_dom.setFont(new Font("Arial", Font.PLAIN, 25));
        js_dom.setForeground(Color.BLACK);

        js_bom=new JLabel("8. Javascript BOM");
        js_bom.setBounds(20, 300, 500, 40);
        js_bom.setFont(new Font("Arial", Font.PLAIN, 25));
        js_bom.setForeground(Color.BLACK);

        js_object_class=new JLabel("9. Javascript Object & Class");
        js_object_class.setBounds(20, 340, 500, 40);
        js_object_class.setFont(new Font("Arial", Font.PLAIN, 25));
        js_object_class.setForeground(Color.BLACK);

        js_inheritance=new JLabel("10. Javascript Inheritance");
        js_inheritance.setBounds(20, 380, 500, 40);
        js_inheritance.setFont(new Font("Arial", Font.PLAIN, 25));
        js_inheritance.setForeground(Color.BLACK);

        js_polymorphism=new JLabel("11. Javascript Polymorphism");
        js_polymorphism.setBounds(20, 420, 500, 40);
        js_polymorphism.setFont(new Font("Arial", Font.PLAIN, 25));
        js_polymorphism.setForeground(Color.BLACK);

        js_abstraction=new JLabel("12. Javascript Abstraction");
        js_abstraction.setBounds(20, 460, 500, 40);
        js_abstraction.setFont(new Font("Arial", Font.PLAIN, 25));
        js_abstraction.setForeground(Color.BLACK);
        
        js_encapsulation=new JLabel("13. Javascript Encapsulation");
        js_encapsulation.setBounds(20, 500, 500, 40);
        js_encapsulation.setFont(new Font("Arial", Font.PLAIN, 25));
        js_encapsulation.setForeground(Color.BLACK);


        js_exception=new JLabel("14. Javascript Exception Handling");
        js_exception.setBounds(20, 540, 500, 40);
        js_exception.setFont(new Font("Arial", Font.PLAIN, 25));
        js_exception.setForeground(Color.BLACK);

        //web_java_panel content-
        web_java_basics=new JLabel("1. Introduction To java");
        web_java_basics.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_basics.setBounds(20, 10, 400, 30);
        web_java_basics.setForeground(Color.BLACK);

        web_java_control_statements=new JLabel("2. Java Control Statements");
        web_java_control_statements.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_control_statements.setBounds(20, 45, 500, 30);
        web_java_control_statements.setForeground(Color.BLACK);

        web_java_functions=new JLabel("3. Java Methods");
        web_java_functions.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_functions.setBounds(20, 80, 200, 30);
        web_java_functions.setForeground(Color.BLACK);

        web_java_array=new JLabel("4. Java Array");
        web_java_array.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_array.setBounds(20, 115, 150, 30);
        web_java_array.setForeground(Color.BLACK);
        
        web_java_string=new JLabel("5. Java String");
        web_java_string.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_string.setBounds(20, 150, 150, 30);
        web_java_string.setForeground(Color.BLACK);

        web_java_objects=new JLabel("6. Java Objects & Classes");
        web_java_objects.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_objects.setBounds(20, 185, 300, 30);
        web_java_objects.setForeground(Color.BLACK);

        web_java_inheritance=new JLabel("7. Java Inheritance");
        web_java_inheritance.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_inheritance.setBounds(20, 220, 350, 30);
        web_java_inheritance.setForeground(Color.BLACK);

        web_java_polymorphism=new JLabel("8. Java Polymorphism");
        web_java_polymorphism.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_polymorphism.setBounds(350, 10, 250, 30);
        web_java_polymorphism.setForeground(Color.BLACK);

        web_java_abstraction=new JLabel("9. Java Abstraction");
        web_java_abstraction.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_abstraction.setBounds(350,45, 270, 30);
        web_java_abstraction.setForeground(Color.BLACK);

        web_java_encapsulation=new JLabel("10. Java Encapsulation");
        web_java_encapsulation.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_encapsulation.setBounds(350, 80, 270, 30);
        web_java_encapsulation.setForeground(Color.BLACK);

        web_java_multithreading=new JLabel("11. Java Multithreading");
        web_java_multithreading.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_multithreading.setBounds(350, 115, 270, 30);
        web_java_multithreading.setForeground(Color.BLACK);

        web_java_exception_handling=new JLabel("12. Java Exception Handling");
        web_java_exception_handling.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_exception_handling.setBounds(350, 150, 350, 30);
        web_java_exception_handling.setForeground(Color.BLACK);

        web_java_io=new JLabel("13. Java I/O & Stream");
        web_java_io.setFont(new Font("Arial", Font.PLAIN, 25));
        web_java_io.setBounds(350, 185, 350, 30);
        web_java_io.setForeground(Color.BLACK);

        web_java_panel.add(web_java_basics);
        web_java_panel.add(web_java_control_statements);
        web_java_panel.add(web_java_functions);
        web_java_panel.add(web_java_array);
        web_java_panel.add(web_java_string);
        web_java_panel.add(web_java_objects);
        web_java_panel.add(web_java_inheritance);
        web_java_panel.add(web_java_polymorphism);
        web_java_panel.add(web_java_abstraction);
        web_java_panel.add(web_java_encapsulation);
        web_java_panel.add(web_java_multithreading);
        web_java_panel.add(web_java_exception_handling);
        web_java_panel.add(web_java_io);


        //framework panel-
        framework_panel=new JPanel();
        framework_panel.setPreferredSize(new Dimension(200, 300));
        framework_panel.setLayout(null);
        framework_panel.setBackground(Color.LIGHT_GRAY);
        framework_scroll=new JScrollPane(framework_panel);
        framework_scroll.setBounds(650, 750 ,200, 200);

        web_panel1.add(framework_scroll);
        //framework content-

        web_mysql=new JLabel("1. MySQL");
        web_mysql.setForeground(Color.BLACK);
        web_mysql.setBounds(20, 20, 150, 40);
        web_mysql.setFont(new Font("Arial", Font.PLAIN, 25));

        bootstrap=new JLabel("2. Bootstrap");
        bootstrap.setForeground(Color.BLACK);
        bootstrap.setBounds(20, 55, 150, 40);
        bootstrap.setFont(new Font("Arial", Font.PLAIN, 25));

        react=new JLabel("3. React");
        react.setForeground(Color.BLACK);
        react.setFont(new Font("Arial", Font.PLAIN, 25));
        react.setBounds(20, 90, 100, 40);

        node_js=new JLabel("4. Node.js");
        node_js.setForeground(Color.BLACK);
        node_js.setFont(new Font("Arial", Font.PLAIN, 25));
        node_js.setBounds(20, 125, 150, 40);

        jsp_servelet=new JLabel("5. JSP-Servelet");
        jsp_servelet.setForeground(Color.BLACK);
        jsp_servelet.setFont(new Font("Arial", Font.PLAIN, 25));
        jsp_servelet.setBounds(20, 160, 300, 40);

        spring=new JLabel("6. Spring");
        spring.setForeground(Color.BLACK);
        spring.setFont(new Font("Arial", Font.PLAIN, 25));
        spring.setBounds(20, 195, 195, 40);

        springboot=new JLabel("7. Springboot");
        springboot.setForeground(Color.BLACK);
        springboot.setFont(new Font("Arial", Font.PLAIN, 25));
        springboot.setBounds(20, 230, 150, 40);

        framework_panel.add(web_mysql);
        framework_panel.add(bootstrap);
        framework_panel.add(react);
        framework_panel.add(node_js);
        framework_panel.add(jsp_servelet);
        framework_panel.add(spring);
        framework_panel.add(springboot);
    
        //buy button-
        buy_js_course=new JButton("Enroll Now");
        buy_js_course.setFont(new Font("Arial", Font.BOLD, 25));
        buy_js_course.setBounds(1100, 1000, 170, 45);
        buy_js_course.setBackground(Color.YELLOW);
        buy_js_course.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2));
        web_panel1.add(buy_js_course);

        buy_js_course.addMouseListener(new TestMouseListener5());
        buy_js_course.addActionListener(new TestActionListener7());

        js_panel.add(js_basics);
        js_panel.add(js_control_statmenets);
        js_panel.add(js_function);
        js_panel.add(js_array);
        js_panel.add(js_string);
        js_panel.add(js_objects);
        js_panel.add(js_dom);
        js_panel.add(js_bom);
        js_panel.add(js_object_class);
        js_panel.add(js_inheritance);
        js_panel.add(js_polymorphism);
        js_panel.add(js_abstraction);
        js_panel.add(js_encapsulation);
        js_panel.add(js_exception);
     
        web_panel1.add(web_head);
        web_panel1.add(web_underline);
        web_panel1.add(course_name4);
        web_panel1.add(course_tech4);
        web_panel1.add(course_duration4);
        web_panel1.add(course_price4);
        web_panel1.add(value13);
        web_panel1.add(value14);
        web_panel1.add(value15);
        web_panel1.add(value16);
        web_panel1.add(web_content);

        setVisible(true);
    }
    class TestMouseListener5 implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent e4) {
            if(e4.getSource()==buy_js_course){
                buy_js_course.setBackground(Color.GREEN);
            }
        }
        @Override
        public void mouseExited(MouseEvent e4){
            if(e4.getSource()==buy_js_course){
                buy_js_course.setBackground(Color.YELLOW);
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
    class TestActionListener7 implements ActionListener{
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==buy_js_course){
                enroll=new Enrollment_Form_Coding();
                enroll.enrollment_Frame_Content(); 
            }
        }
    }
}