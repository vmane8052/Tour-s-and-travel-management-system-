

package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.sql.*;

public class signup extends JFrame implements ActionListener {
    JButton create,back;
    JTextField t1,t2,t3,t5;
    Choice t4;
    signup(){
        setBounds(350, 200, 900, 360);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setBackground(new Color(133,193,233));
        p1.setBounds(0, 0, 500, 400);
        p1.setLayout(null);
        add(p1);

        JLabel l1=new JLabel("UserName");
        l1.setFont(new Font("Tahoma",Font.BOLD,14));
        l1.setBounds(50, 20, 125, 25);
        p1.add(l1);

        t1=new JTextField();
        t1.setBounds(190, 20, 180, 25);
        t1.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t1);
        
        JLabel l2=new JLabel("Name");
        l2.setFont(new Font("Tahoma",Font.BOLD,14));
        l2.setBounds(50, 60, 125, 25);
        p1.add(l2);

        t2=new JTextField();
        t2.setBounds(190, 60, 180, 25);
        t2.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t2);

         JLabel l3=new JLabel("PassWord");
        l3.setFont(new Font("Tahoma",Font.BOLD,14));
        l3.setBounds(50, 100, 125, 25);
        p1.add(l3);

        t3=new JTextField();
        t3.setBounds(190, 100, 180, 25);
        t3.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t3);

        JLabel l4=new JLabel("Security question");
        l4.setFont(new Font("Tahoma",Font.BOLD,14));
        l4.setBounds(50, 140, 125, 25);
        p1.add(l4);

        t4=new Choice();
        t4.add("Your lucky number");
        t4.add("your bast friend name");
        t4.add("your favirate fruit");
        t4.add("childhood best hero");
        t4.setBounds(190, 140, 180, 25);
        p1.add(t4);

        JLabel l5=new JLabel("Answer");
        l5.setFont(new Font("Tahoma",Font.BOLD,14));
        l5.setBounds(50, 180, 125, 25);
        p1.add(l5);

        t5=new JTextField();
        t5.setBounds(190, 180, 180, 25);
        t5.setBorder(BorderFactory.createEmptyBorder());
        p1.add(t5);
   
        create=new JButton("Create");
        create.setBackground(Color.WHITE);
        create.setForeground(new Color(133,193,233));
        create.setFont(new Font("Tahoma",Font.BOLD,14));
        create.setBounds(80, 250, 100, 30);
        create.addActionListener(this);
        p1.add(create);

        back=new JButton("Back");
        back.setBackground(Color.WHITE);
        back.setForeground(new Color(133,193,233));
        back.setFont(new Font("Tahoma",Font.BOLD,14));
        back.setBounds(250, 250, 100, 30);
        back.addActionListener(this);
        p1.add(back);

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/signup.png"));
        Image i2=i1.getImage().getScaledInstance(250, 250,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel Image=new JLabel(i3);
        Image.setBounds(580, 50, 250, 250);
        add(Image);



        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==create){
            String username=t1.getText();
            String name=t2.getText();
            String password=t3.getText();
             String question =t4.getSelectedItem();
              String answer=t5.getText();
             String query ="insert into acount values('"+username+"', '"+name+"', '"+password+"', '"+question+"', '"+answer+"')";
             try{
                 
                conn c=new conn();
                c.s.executeUpdate(query);
                JOptionPane.showMessageDialog(null,"Account created sucessfully");
                setVisible(false);
                new Login();
             }catch(Exception e){
                 e.printStackTrace();
             }
    }
        else if(ae.getSource()==back){
            setVisible(false);
            new Login();
            
        }}
    public static void main(String[] args) {
        
        signup s1=new signup();
    }
    
}
