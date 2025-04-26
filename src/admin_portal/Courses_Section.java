package admin_portal;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Show_Courses extends JFrame{
    ImageIcon logo;
    JPanel panel1;
    
    String  url="jdbc:mysql://localhost:3306/studypoint_database",
            user_name="root",
            password="nisha@1979",

            courses_fetch_query="select * from course_table";
    
    JLabel course_label;
    JPanel course_underline;
    JButton add_course_button, delete_course_button, update_course_button;

    JTable course_jtable;
    JTableHeader course_header;
    JScrollPane course_scroll;

    String course_id, course_name, course_duration, course_batches, course_fee;
    
    public void courses_Frame(){
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
    
    public void courses_section_Content(){
        courses_Frame();

        //ui-
        course_label=new JLabel("All Available courses-");
        course_label.setBounds(50, 50, 450, 40);
        course_label.setFont(new Font("Arial", Font.BOLD, 40));
        course_label.setForeground(Color.BLACK);
        
            //underline-
            course_underline=new JPanel();
            course_underline.setBackground(Color.BLACK);
            course_underline.setBounds(50, 95, 430, 3);

        //buttons coding-
        add_course_button=new JButton("Add course");
        add_course_button.setBounds(50, 500, 200, 40);
        add_course_button.setFont(new Font("Arial", Font.BOLD, 25));
        add_course_button.setBackground(Color.ORANGE);
        add_course_button.setForeground(Color.BLACK);
        add_course_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        delete_course_button=new JButton("Delete course");
        delete_course_button.setBounds(550, 500, 250, 40);
        delete_course_button.setFont(new Font("Arial", Font.BOLD, 25));
        delete_course_button.setBackground(Color.ORANGE);
        delete_course_button.setForeground(Color.BLACK);
        delete_course_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        update_course_button=new JButton("Update course");
        update_course_button.setBounds(1100, 500, 250, 40);
        update_course_button.setFont(new Font("Arial", Font.BOLD, 25));
        update_course_button.setBackground(Color.ORANGE);
        update_course_button.setForeground(Color.BLACK);
        update_course_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        //events-
        add_course_button.addMouseListener(new TestMouseListener_course());
        delete_course_button.addMouseListener(new TestMouseListener_course());
        update_course_button.addMouseListener(new TestMouseListener_course());

        add_course_button.addActionListener(new TestActionListener_course());
        delete_course_button.addActionListener(new TestActionListener_course());
        update_course_button.addActionListener(new TestActionListener_course());
        
        panel1.add(course_label);
        panel1.add(course_underline);
        panel1.add(add_course_button);
        panel1.add(delete_course_button);
        panel1.add(update_course_button);

        //To fetch course_table data and store it in JTable-
        fetch_course_Record();

        add(panel1);
        setVisible(true);
    }
   
    public void fetch_course_Record(){
        try{
            Connection con_course=DriverManager.getConnection(url, user_name, password);
            
            PreparedStatement ps_course=con_course.prepareStatement(courses_fetch_query);

            ResultSet rs_course=ps_course.executeQuery();
            ResultSetMetaData rsmd_course=rs_course.getMetaData();

            int total_columns_course=rsmd_course.getColumnCount();  
            
            DefaultTableModel model_course=new DefaultTableModel();
            model_course.setRowCount(0);

            String columns[];
            columns=new String[total_columns_course];
            for(int i=0; i<total_columns_course; i++){
                columns[i]=rsmd_course.getColumnName(i+1);

                System.out.println(columns[i]);
                model_course.addColumn(columns[i]);
            }    

            course_jtable=new JTable(model_course);
            course_jtable.setRowHeight(30);
            course_jtable.setFont(new Font("Arial", Font.PLAIN, 20));
            course_header=course_jtable.getTableHeader();
            course_header.setBackground(Color.ORANGE);
            course_header.setFont(new Font("Arial", Font.BOLD, 20));
            course_scroll=new JScrollPane(course_jtable);
            course_scroll.setBounds(30, 150, 1300, 300);

            //to set column width
            TableColumnModel column_model=course_jtable.getColumnModel();
            column_model.getColumn(0).setPreferredWidth(5);
            column_model.getColumn(1).setPreferredWidth(100);
            
            column_model.getColumn(2).setPreferredWidth(200);
            column_model.getColumn(3).setPreferredWidth(150);

            while(rs_course.next()){
                course_id=rs_course.getString(1);
                course_name=rs_course.getString(2);
                course_duration=rs_course.getString(3);
                course_batches=rs_course.getString(4);
                course_fee=rs_course.getString(5);

                String row_course[]={
                    course_id, course_name, course_duration, course_batches, course_fee
                };

                model_course.addRow(row_course);
            }
            panel1.add(course_scroll);
            con_course.close();
            ps_course.close();
        }
        catch(SQLException sql){
            sql.printStackTrace();
        }
    }
    
    class TestMouseListener_course implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent e){
            if(e.getSource()==add_course_button){
                add_course_button.setBackground(Color.GREEN);
            }
            else if(e.getSource()==delete_course_button){
                delete_course_button.setBackground(Color.GREEN);
            }
            else if(e.getSource()==update_course_button){
                update_course_button.setBackground(Color.GREEN);
            }
        }
        @Override
        public void mouseExited(MouseEvent e){
            if(e.getSource()==add_course_button){
                add_course_button.setBackground(Color.ORANGE);
            }
            else if(e.getSource()==delete_course_button){
                delete_course_button.setBackground(Color.ORANGE);
            }
            else if(e.getSource()==update_course_button){
                update_course_button.setBackground(Color.ORANGE);
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
    
    class TestActionListener_course implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
           if(ae.getSource()==add_course_button){
                Add_Course c_add=new Add_Course();
                c_add.add_Course_Content();
           }
           else if(ae.getSource()==delete_course_button){
                Delete_Course delete=new Delete_Course();
                delete.delete_Course_Content();
           }
           else if(ae.getSource()==update_course_button){
                Update_Course update=new Update_Course();
                update.update_Course_Content();
           }
        }
    }
}

class Add_Course{
    
    String  url="jdbc:mysql://localhost:3306/studypoint_database",
            user_name="root",
            password="nisha@1979";

    String input_course_name, input_course_duration, input_course_batch, input_course_fee;

    String course_insert_query="insert into course_table(c_name, c_duration, available_batches, c_fee) values (?,?,?,?)";

    public void add_Course_Content(){
        input_course_name=JOptionPane.showInputDialog(null, "enter course name", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

        if(!(input_course_name.isEmpty())){
            input_course_duration=JOptionPane.showInputDialog(null, "enter course duration", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

            if(!(input_course_duration.isEmpty())){
                input_course_batch=JOptionPane.showInputDialog(null, "enter total available batches for course?", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

                if(!(input_course_batch.isEmpty())){
                    input_course_fee=JOptionPane.showInputDialog(null, "enter course fee", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

                    if(!(input_course_fee.isEmpty())){
                        add_New_Course();
                    }
                }
            }
        }
    }
    
    public void add_New_Course(){
        //to check that values are succesfully read from user-

        System.out.println(input_course_name+"\n"+input_course_duration+"\n"+input_course_batch);

        //JDBC Code to insert input data-
        try{
            Connection con_addCourse=DriverManager.getConnection(url, user_name, password);

            PreparedStatement ps_addCourse=con_addCourse.prepareStatement(course_insert_query);
            ps_addCourse.setString(1, input_course_name);
            ps_addCourse.setString(2, input_course_duration);
            ps_addCourse.setString(3, input_course_batch);
            ps_addCourse.setString(4, input_course_fee);
            
            int inserted_Course=ps_addCourse.executeUpdate();

            if(inserted_Course>0){
                JOptionPane.showMessageDialog(null, "successfully added", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                Show_Courses show_my_course=new Show_Courses();
                show_my_course.courses_section_Content();
            }
            else{
                JOptionPane.showMessageDialog(null, "failed to add", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
            }
        }
        catch(SQLException sql){
            sql.printStackTrace();
        }
    }
}

class Delete_Course{
   String  url="jdbc:mysql://localhost:3306/studypoint_database",
            username="root",
            password="nisha@1979",

            course_query1="select c_id from course_table where c_id=?",
            course_query2="delete from course_table where c_id=?";

    public void delete_Course_Content(){
        String input_course_id=JOptionPane.showInputDialog(null, "enter course id", "Dialog", JOptionPane.QUESTION_MESSAGE);

        int course_id_value=Integer.parseInt(input_course_id);

        try{
            //JDBC code to check if course_id exists in course_table-
            Connection con_course=DriverManager.getConnection(url, username, password);
            
            PreparedStatement ps_course=con_course.prepareStatement(course_query1);
            ps_course.setInt(1, course_id_value);

            ResultSet rs_course=ps_course.executeQuery();

            if(rs_course.next()){
                System.out.println("course exists");

                int selected_value1_course=JOptionPane.showConfirmDialog(null, "Are you sure want to delete?", "Dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);

                if(selected_value1_course==0){
                    try{
                        Connection con_course2=DriverManager.getConnection(url, username, password);
    
                        PreparedStatement ps_course2=con_course2.prepareStatement(course_query2);
                        ps_course2.setInt(1, course_id_value);
    
                        int d=ps_course2.executeUpdate();
                        if(d>0){
                            JOptionPane.showMessageDialog(null, "successfully deleted", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);
                            
                            Show_Courses show_my_course=new Show_Courses();
                            show_my_course.courses_section_Content();

                        }
                        else{
                            JOptionPane.showMessageDialog(null, "failed to delete", "Dialog Box", JOptionPane.ERROR_MESSAGE, null); 
                        }
    
                        con_course2.close();
                        ps_course2.close();
                    }
                    catch(SQLException s){
                        s.printStackTrace();
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Id", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);   
            }

            con_course.close();
            ps_course.close();
        }catch(SQLException s){
            s.printStackTrace();
        }
    }
}

class Update_Course{
    String  url="jdbc:mysql://localhost:3306/studypoint_database",
            user_name="root",
            password="nisha@1979",
            
            update_course_query1="select c_id from course_table where c_id=?",
            update_course_query2="select * from course_table";

    public void update_Course_Content(){
        String input_id_course2=JOptionPane.showInputDialog(null, "enter course id", "Dialog", JOptionPane.QUESTION_MESSAGE);

        int id_value_courses2=Integer.parseInt(input_id_course2);

        //Jdbc code to check if teacher_id exists in the course_table-
        try{
            Connection con_courses=DriverManager.getConnection(url, user_name, password);
            
            PreparedStatement ps_courses=con_courses.prepareStatement(update_course_query1);
            ps_courses.setInt(1, id_value_courses2);

            ResultSet rs_courses=ps_courses.executeQuery();

            if(rs_courses.next()){
                System.out.println("course exists");
                
                String input_column_courses=JOptionPane.showInputDialog(null, "enter column name", "Dialog", JOptionPane.QUESTION_MESSAGE);

                //jdbc code to check if input column exists in the course_table-
                try{    
                    Connection con_courses2=DriverManager.getConnection(url, user_name, password);
                    
                    PreparedStatement ps_courses2=con_courses2.prepareStatement(update_course_query2);

                    ResultSet rs_courses2=ps_courses2.executeQuery();
                    
                    ResultSetMetaData rsmd_courses=rs_courses2.getMetaData();

                    if((rsmd_courses.getColumnName(1).matches(input_column_courses) || rsmd_courses.getColumnName(2).matches(input_column_courses) || rsmd_courses.getColumnName(3).matches(input_column_courses) || rsmd_courses.getColumnName(4).matches(input_column_courses) || rsmd_courses.getColumnName(5).matches(input_column_courses))){

                        System.out.println("column exists");

                        String value_course_cell=JOptionPane.showInputDialog(null, "enter the value", "Dialog", JOptionPane.QUESTION_MESSAGE);


                        //JDBC Code after comes to know that both id_value_courses2 and input_column_courses exists in the table to update record-
                        
                        String query3_course="update course_table set "+input_column_courses+"= ? where c_id=?";
                        try{
                            Connection con_courses3=DriverManager.getConnection(url, user_name, password);
                            
                            PreparedStatement ps_courses3=con_courses3.prepareStatement(query3_course);
                            ps_courses3.setString(1, value_course_cell);
                            ps_courses3.setInt(2, id_value_courses2);

                            int e=ps_courses3.executeUpdate();

                            if(e>0){
                                JOptionPane.showMessageDialog(null, "successfully updated", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                                Show_Courses show_course=new Show_Courses();
                                show_course.courses_section_Content();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "failed to update", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                            }
                            con_courses3.close();
                            ps_courses3.close();
                        }
                        catch(SQLException sql_exp){
                            sql_exp.printStackTrace();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "column not exists", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                    }
                    con_courses2.close();
                    ps_courses2.close();
                }
                catch(SQLException sql_exp){
                    sql_exp.printStackTrace();
                }  
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid ID", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
            }
            con_courses.close();
            ps_courses.close();
        }catch(SQLException sql_exp){
            sql_exp.printStackTrace();
        }
    }
}

/*public class Courses_Section{
    public static void main(String[] args){
        Show_Courses show_course=new Show_Courses();
        show_course.courses_section_Content();
    }
}*/