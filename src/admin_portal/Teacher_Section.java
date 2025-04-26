package admin_portal;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Show_Teachers extends JFrame{
    ImageIcon logo;
    JPanel panel1;
    
    String  url="jdbc:mysql://localhost:3306/studypoint_database",
            user_name="root",
            password="nisha@1979",

            teacher_fetch_query="select * from teachers_table";
    
    JLabel teacher_label;
    JPanel teacher_underline;
    JButton add_teacher_button, delete_teacher_button, update_teacher_button;

    JTable teacher_jtable;
    JTableHeader teacher_header;
    JScrollPane teacher_scroll;

    String teacher_name, teacher_email, teacher_phone, teacher_degree, teacher_subject, teacher_gender, teacher_id, teacher_salary;
    
    public void teachers_Frame(){
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
    
    public void teachers_section_Content(){
        teachers_Frame();
        
        //ui-
        teacher_label=new JLabel("All Available Teachers-");
        teacher_label.setBounds(50, 50, 450, 40);
        teacher_label.setFont(new Font("Arial", Font.BOLD, 40));
        teacher_label.setForeground(Color.BLACK);
        
            //underline-
            teacher_underline=new JPanel();
            teacher_underline.setBackground(Color.BLACK);
            teacher_underline.setBounds(50, 95, 430, 3);

        //buttons coding-
        add_teacher_button=new JButton("Add Teacher");
        add_teacher_button.setBounds(50, 500, 200, 40);
        add_teacher_button.setFont(new Font("Arial", Font.BOLD, 25));
        add_teacher_button.setBackground(Color.ORANGE);
        add_teacher_button.setForeground(Color.BLACK);
        add_teacher_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        delete_teacher_button=new JButton("Delete Teacher");
        delete_teacher_button.setBounds(550, 500, 250, 40);
        delete_teacher_button.setFont(new Font("Arial", Font.BOLD, 25));
        delete_teacher_button.setBackground(Color.ORANGE);
        delete_teacher_button.setForeground(Color.BLACK);
        delete_teacher_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));

        update_teacher_button=new JButton("Update Teacher");
        update_teacher_button.setBounds(1100, 500, 250, 40);
        update_teacher_button.setFont(new Font("Arial", Font.BOLD, 25));
        update_teacher_button.setBackground(Color.ORANGE);
        update_teacher_button.setForeground(Color.BLACK);
        update_teacher_button.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));


        //events-
        add_teacher_button.addMouseListener(new TestMouseListener_Teacher());
        delete_teacher_button.addMouseListener(new TestMouseListener_Teacher());
        update_teacher_button.addMouseListener(new TestMouseListener_Teacher());

        add_teacher_button.addActionListener(new TestActionListener_Teacher());
        delete_teacher_button.addActionListener(new TestActionListener_Teacher());
        update_teacher_button.addActionListener(new TestActionListener_Teacher());
        
        panel1.add(teacher_label);
        panel1.add(teacher_underline);
        panel1.add(add_teacher_button);
        panel1.add(delete_teacher_button);
        panel1.add(update_teacher_button);

        //To fetch teacher_table data and store it in JTable-
        fetch_Teacher_Record();

        add(panel1);
        setVisible(true);
    }
    
    public void fetch_Teacher_Record(){
        try{
            Connection con_teacher=DriverManager.getConnection(url, user_name, password);
            
            PreparedStatement ps_teacher=con_teacher.prepareStatement(teacher_fetch_query);

            ResultSet rs_teacher=ps_teacher.executeQuery();
            ResultSetMetaData rsmd_teacher=rs_teacher.getMetaData();

            int total_columns_teacher=rsmd_teacher.getColumnCount();   
            
            DefaultTableModel model_teacher=new DefaultTableModel();
            model_teacher.setRowCount(0);

            String columns[];
            columns=new String[total_columns_teacher];
            for(int i=0; i<total_columns_teacher; i++){
                columns[i]=rsmd_teacher.getColumnName(i+1);

                model_teacher.addColumn(columns[i]);
            }    

            teacher_jtable=new JTable(model_teacher);
            teacher_jtable.setRowHeight(30);
            teacher_jtable.setFont(new Font("Arial", Font.PLAIN, 20));
            teacher_header=teacher_jtable.getTableHeader();
            teacher_header.setBackground(Color.ORANGE);
            teacher_header.setFont(new Font("Arial", Font.BOLD, 20));
            teacher_scroll=new JScrollPane(teacher_jtable);
            teacher_scroll.setBounds(30, 150, 1300, 300);

            //to set column width
            TableColumnModel column_model=teacher_jtable.getColumnModel();
            column_model.getColumn(0).setPreferredWidth(5);
            column_model.getColumn(1).setPreferredWidth(100);
            
            column_model.getColumn(2).setPreferredWidth(200);
            column_model.getColumn(5).setPreferredWidth(150);

            while(rs_teacher.next()){
                teacher_id=rs_teacher.getString(1);
                teacher_name=rs_teacher.getString(2);
                teacher_email=rs_teacher.getString(3);
                teacher_phone=rs_teacher.getString(4);
                teacher_degree=rs_teacher.getString(5);
                teacher_subject=rs_teacher.getString(6);
                teacher_salary=rs_teacher.getString(7);
                teacher_gender=rs_teacher.getString(8);

                String row_teacher[]={
                    teacher_id, teacher_name, teacher_email, teacher_phone, teacher_degree, teacher_subject, teacher_salary, teacher_gender
                };

                model_teacher.addRow(row_teacher);
            }
            panel1.add(teacher_scroll);
            con_teacher.close();
            ps_teacher.close();
        }
        catch(SQLException sql){
            sql.printStackTrace();
        }
    }

    class TestMouseListener_Teacher implements MouseListener{
        @Override
        public void mouseEntered(MouseEvent e){
            if(e.getSource()==add_teacher_button){
                add_teacher_button.setBackground(Color.GREEN);
            }
            else if(e.getSource()==delete_teacher_button){
                delete_teacher_button.setBackground(Color.GREEN);
            }
            else if(e.getSource()==update_teacher_button){
                update_teacher_button.setBackground(Color.GREEN);
            }
        }
        @Override
        public void mouseExited(MouseEvent e){
            if(e.getSource()==add_teacher_button){
                add_teacher_button.setBackground(Color.ORANGE);
            }
            else if(e.getSource()==delete_teacher_button){
                delete_teacher_button.setBackground(Color.ORANGE);
            }
            else if(e.getSource()==update_teacher_button){
                update_teacher_button.setBackground(Color.ORANGE);
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
   
    class TestActionListener_Teacher implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent ae){
            if(ae.getSource()==add_teacher_button){
                Add_Teacher add=new Add_Teacher();
                add.add_Teacher_Content();
            }
            else if(ae.getSource()==delete_teacher_button){
                Delete_Teacher delete=new Delete_Teacher();
                delete.delete_Teacher_Content();
            }
            else if(ae.getSource()==update_teacher_button){
                Update_Teacher update=new Update_Teacher();
                update.update_Teacher_Content();
            }
        }
    }
}

class Add_Teacher extends Show_Teachers{

    String input_teacher_name, input_teacher_email, input_teacher_phone, input_teacher_degree, input_teacher_subject, input_teacher_salary, input_teacher_gender;

    String teacher_insert_query="insert into teachers_table(t_name, t_email, t_phoneno, t_degree, t_subject, t_salary, t_gender) values (?,?,?,?,?,?,?)";

    public void add_Teacher_Content(){

        input_teacher_name=JOptionPane.showInputDialog(null, "enter teacher name", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

        if(!(input_teacher_name.isEmpty())){
            input_teacher_email=JOptionPane.showInputDialog(null, "enter teacher email", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

            if(!(input_teacher_email.isEmpty())){
                input_teacher_phone=JOptionPane.showInputDialog(null, "enter teacher phone number", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

                if(!(input_teacher_phone.isEmpty())){
                    input_teacher_degree=JOptionPane.showInputDialog(null, "enter teacher degree", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

                    if(!(input_teacher_degree.isEmpty())){
                        input_teacher_subject=JOptionPane.showInputDialog(null, "enter teacher subject", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

                        if(!(input_teacher_subject.isEmpty())){
                            input_teacher_salary=JOptionPane.showInputDialog(null, "enter teacher salary", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

                            if(!(input_teacher_salary.isEmpty())){
                                input_teacher_gender=JOptionPane.showInputDialog(null, "enter teacher gender", "Dialog Box", JOptionPane.QUESTION_MESSAGE);

                                if(!(input_teacher_gender.isEmpty())){
                                    add_Teacher();
                                }
                            }
                        }
                    }
                }
            }
        }
    }
    
    public void add_Teacher(){
        //to check that values are succesfully read from user-

        System.out.println(input_teacher_name+"\n"+input_teacher_email+"\n"+input_teacher_phone+"\n"+input_teacher_degree+"\n"+input_teacher_subject+"\n"+input_teacher_salary+"\n"+input_teacher_gender);

        //JDBC Code to insert input data-
        try{
            Connection con_addTeacher=DriverManager.getConnection(url, user_name, password);

            PreparedStatement ps_addTeachers=con_addTeacher.prepareStatement(teacher_insert_query);
            ps_addTeachers.setString(1, input_teacher_name);
            ps_addTeachers.setString(2, input_teacher_email);
            ps_addTeachers.setString(3, input_teacher_phone);
            ps_addTeachers.setString(4, input_teacher_degree);
            ps_addTeachers.setString(5, input_teacher_subject);
            ps_addTeachers.setString(6, input_teacher_salary);
            ps_addTeachers.setString(7, input_teacher_gender);

            int inserted=ps_addTeachers.executeUpdate();

            if(inserted>0){
                JOptionPane.showMessageDialog(null, "successfully added", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                Show_Teachers show_my_teachers=new Show_Teachers();
                show_my_teachers.teachers_section_Content();
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

class Delete_Teacher extends Show_Teachers{
    String  url="jdbc:mysql://localhost:3306/studypoint_database",
            username="root",
            password="nisha@1979",

            teacher_query1="select t_id from teachers_table where t_id=?",
            teacher_query2="delete from teachers_table where t_id=?";

    public void delete_Teacher_Content(){
        String input_teacher_id=JOptionPane.showInputDialog(null, "enter teacher id", "Dialog", JOptionPane.QUESTION_MESSAGE);
        int teacher_id_value=Integer.parseInt(input_teacher_id);

        try{
            //JDBC code to check if teacher_id exists in teachers_table-
            Connection con_teacher=DriverManager.getConnection(url, username, password);
            
            PreparedStatement ps_teacher=con_teacher.prepareStatement(teacher_query1);
            ps_teacher.setInt(1, teacher_id_value);

            ResultSet rs_teacher=ps_teacher.executeQuery();

            if(rs_teacher.next()){
                System.out.println("teacher exists");

                int selected_value1=JOptionPane.showConfirmDialog(null, "Are you sure want to delete?", "Dialog", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);

                if(selected_value1==0){
                    try{
                        Connection con_teacher2=DriverManager.getConnection(url, username, password);
    
                        PreparedStatement ps_teacher2=con_teacher2.prepareStatement(teacher_query2);
                        ps_teacher2.setInt(1, teacher_id_value);
    
                        int d=ps_teacher2.executeUpdate();
                        if(d>0){
                            JOptionPane.showMessageDialog(null, "successfully deleted", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                            Show_Teachers show_my_teacher=new Show_Teachers();
                            show_my_teacher.teachers_section_Content();

                        }
                        else{
                            JOptionPane.showMessageDialog(null, "failed to delete", "Dialog Box", JOptionPane.ERROR_MESSAGE, null); 
                        }
    
                        con_teacher2.close();
                        ps_teacher2.close();
                    }
                    catch(SQLException s){
                        s.printStackTrace();
                    }
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Id", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);   
            }

            con_teacher.close();
            ps_teacher.close();
        }catch(SQLException s){
            s.printStackTrace();
        }
    }
}

class Update_Teacher extends Show_Teachers{
    String  url="jdbc:mysql://localhost:3306/studypoint_database",
            username="root",
            password="nisha@1979",
            
            update_teacher_query1="select t_id from teachers_table where t_id=?",
            update_teacher_query2="select * from teachers_table";

    public void update_Teacher_Content(){
        String input_id_teacher2=JOptionPane.showInputDialog(null, "enter teacher id", "Dialog", JOptionPane.QUESTION_MESSAGE);

        int id_value_teacher2=Integer.parseInt(input_id_teacher2);

        //Jdbc code to check if teacher_id exists in the teachers_table-
        try{
            Connection con_teacher=DriverManager.getConnection(url, user_name, password);
            
            PreparedStatement ps_teacher=con_teacher.prepareStatement(update_teacher_query1);
            ps_teacher.setInt(1, id_value_teacher2);

            ResultSet rs_teachers=ps_teacher.executeQuery();

            if(rs_teachers.next()){
                System.out.println("teacher exists");
                
                String input_column_teacher=JOptionPane.showInputDialog(null, "enter column name", "Dialog", JOptionPane.QUESTION_MESSAGE);

                //jdbc code to check if input column exists in the teachers_table-
                try{    
                    Connection con_teacher2=DriverManager.getConnection(url, user_name, password);
                    
                    PreparedStatement ps_teacher2=con_teacher2.prepareStatement(update_teacher_query2);

                    ResultSet rs_teachers2=ps_teacher2.executeQuery();
                    
                    ResultSetMetaData rsmd_teachers=rs_teachers2.getMetaData();

                    if((rsmd_teachers.getColumnName(1).matches(input_column_teacher) || rsmd_teachers.getColumnName(2).matches(input_column_teacher) || rsmd_teachers.getColumnName(3).matches(input_column_teacher) || rsmd_teachers.getColumnName(4).matches(input_column_teacher) || rsmd_teachers.getColumnName(5).matches(input_column_teacher) || rsmd_teachers.getColumnName(6).matches(input_column_teacher) || rsmd_teachers.getColumnName(7).matches(input_column_teacher) || rsmd_teachers.getColumnName(8).matches(input_column_teacher))){

                        System.out.println("column exists");

                        String value_teacher_cell=JOptionPane.showInputDialog(null, "enter the value", "Dialog", JOptionPane.QUESTION_MESSAGE);


                        //JDBC Code after comes to know that both id_value_teacher2 and input_column_teacher exists in the table to update record-
                        
                        String query3_teachers="update teachers_table set "+input_column_teacher+"= ? where t_id=?";
                        try{
                            Connection con_teacher3=DriverManager.getConnection(url, user_name, password);
                            
                            PreparedStatement ps_teacher3=con_teacher3.prepareStatement(query3_teachers);
                            ps_teacher3.setString(1, value_teacher_cell);
                            ps_teacher3.setInt(2, id_value_teacher2);

                            int e=ps_teacher3.executeUpdate();

                            if(e>0){
                                JOptionPane.showMessageDialog(null, "successfully updated", "Dialog Box", JOptionPane.INFORMATION_MESSAGE, null);

                                Show_Teachers show_my_teachers2=new Show_Teachers();
                                show_my_teachers2.teachers_section_Content();
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "failed to update", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                            }
                            con_teacher3.close();
                            ps_teacher3.close();
                        }
                        catch(SQLException sql_exp){
                            sql_exp.printStackTrace();
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "column not exists", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
                    }
                    con_teacher2.close();
                    ps_teacher2.close();
                }
                catch(SQLException sql_exp){
                    sql_exp.printStackTrace();
                }  
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid ID", "Dialog Box", JOptionPane.ERROR_MESSAGE, null);
            }
            con_teacher.close();
            ps_teacher.close();
        }catch(SQLException sql_exp){
            sql_exp.printStackTrace();
        }
    }
}


/*public class Teacher_Section{
    public static void main(String[] args){s
        Show_Teachers show_my_teachers=new Show_Teachers();
        show_my_teachers.teachers_section_Content();
    }
}*/