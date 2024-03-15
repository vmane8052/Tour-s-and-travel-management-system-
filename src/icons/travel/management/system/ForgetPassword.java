package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class ForgetPassword  extends JFrame implements ActionListener{
    
    JTextField t1,t2,t3,t4,t5;
    JButton search,retrive,back;

    ForgetPassword(){
        setBounds(350, 200, 850, 350);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBounds(30, 30, 500, 250);
        add(p1);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/forgotpassword.jpg"));
        Image i2=i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel image=new JLabel(i3);
        image.setBounds(580, 70, 200, 200);
        add(image);
        
        JLabel l1=new JLabel("UserName");
        l1.setBounds(40, 20, 100, 25);
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(l1);
        
        t1=new JTextField();
        t1.setBounds(220, 20, 150, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);

        search=new JButton("search");
        search.setBackground(Color.GRAY);
        search.setForeground(Color.WHITE);
        search.setBounds(380, 20, 100, 25);
        search.addActionListener(this);
        p1.add(search);
        
        JLabel l2=new JLabel("Name");
        l2.setBounds(40, 60, 100, 25);
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(l2);
        
        t2=new JTextField();
        t2.setBounds(220, 60, 150, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);
        
        JLabel l3=new JLabel("Security Question");
        l3.setBounds(40, 100, 150, 25);
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(l3);
        
        t3=new JTextField();
        t3.setBounds(220, 100, 150, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);
        
        JLabel l4=new JLabel("Answer");
        l4.setBounds(40, 140, 100, 25);
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(l4);
        
        t4=new JTextField();
        t4.setBounds(220, 140, 150, 25);
        t4.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t4);
        
        retrive=new JButton("Retrive");
        retrive.setBackground(Color.GRAY);
        retrive.setForeground(Color.WHITE);
        retrive.setBounds(380, 140, 100, 25);
        retrive.addActionListener(this);
        p1.add(retrive);
        
        JLabel l5=new JLabel("Password");
        l5.setBounds(40, 180, 100, 25);
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        p1.add(l5);
        
        t5=new JTextField();
        t5.setBounds(220, 180, 150, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t5);
        
        back=new JButton("Back");
        back.setBackground(Color.GRAY);
        back.setForeground(Color.WHITE);
        back.setBounds(150, 220, 100, 25);
        back.addActionListener(this);
        p1.add(back);

        
       
        
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()==search){
            try{
                String query="select * from acount where username = '"+t1.getText()+"'";
                conn c=new conn();
                 ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                   t2.setText(rs.getString("name"));
                   t3.setText( rs.getString("question"));

                }
            }catch(Exception e){
            e.printStackTrace();
            }

        }else if(ae.getSource()==retrive){
            try{
                String query="Select * from acount where answer = '"+t4.getText()+"'AND username='"+t1.getText()+"'";
                conn c=new conn();
                
                ResultSet rs = c.s.executeQuery(query);
                while (rs.next()) {
                    t5.setText(rs.getString("password"));
                }
            }catch(Exception e){
            e.printStackTrace();
            }


        }else{
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new ForgetPassword();
    }
}
