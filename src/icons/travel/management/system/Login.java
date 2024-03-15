
package travel.management.system;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

import javax.swing.*;
import javax.swing.border.*;

public class Login extends JFrame implements ActionListener{

    JButton login1,sign1,fp;
    JTextField t1;
    JPasswordField t2;
    Login(){
        setSize(900, 400);
        setLocation(350, 200);
        setLayout(null);

        getContentPane().setBackground(Color.white);

        JPanel j1=new JPanel();
        j1.setBackground(new Color(131,193,233));
        j1.setBounds(0,0,400,400);
        j1.setLayout(null);
    
        add(j1);
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i2=i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT );
        ImageIcon i3=new ImageIcon(i2);
        JLabel Image=new JLabel(i3);
        Image.setBounds(100, 120, 200, 200);
        j1.add(Image);

        JPanel j2=new JPanel();
        j2.setLayout(null);
        j2.setBounds(400, 30, 450, 300);
        add(j2);

        JLabel j3=new JLabel("Username");
        j3.setBounds(60, 20, 100, 25);
        j3.setFont(new Font("San",Font.PLAIN,18));
        j2.add(j3);

         t1= new JTextField();
        t1.setBounds(60,60, 300, 30);
        t1.setBorder(BorderFactory.createEmptyBorder());
        j2.add(t1);

        JLabel j4=new JLabel("Password");
        j4.setBounds(60, 110, 100, 25);
        j4.setFont(new Font("San",Font.PLAIN,18));
        j2.add(j4);

         t2=new JPasswordField();
        t2.setBounds(60, 150, 300, 30);
         t2.setBorder(BorderFactory.createEmptyBorder());
         j2.add(t2);

         login1=new JButton("Login");
         login1.setBounds(60, 200, 130, 30);
         login1.setBackground(new Color(131,193,233));
         login1.setForeground(Color.WHITE);
         login1.setBorder(new LineBorder(new Color(133,193,233)));
         login1.addActionListener(this);
         j2.add(login1);

         sign1=new JButton("Signup");
         sign1.setBounds(230, 200, 130, 30);
         sign1.setBackground(new Color(131,193,233));
         sign1.setForeground(Color.WHITE);
         sign1.setBorder(new LineBorder(new Color(133,193,233)));
         sign1.addActionListener(this);
         j2.add(sign1);

         fp=new JButton("ForgetPassword");
         fp.setBounds(130, 250, 130, 30);
         fp.setBackground(new Color(131,193,233));
         fp.setForeground(Color.WHITE);
         fp.setBorder(new LineBorder(new Color(133,193,233)));
         fp.addActionListener(this);
         j2.add(fp);

         JLabel j5=new JLabel("Trouble in Login");
        j5.setBounds(300, 250, 150, 20);
        j5.setForeground(Color.RED);
        j2.add(j5);



        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){

        if(ae.getSource()== login1){
        try{
            String username=t1.getText();
            String password=t2.getText();

            String query="select * from acount where username='"+username+"'AND password='"+password+"'";
            conn c=new conn();
            ResultSet rs=c.s.executeQuery(query);
            
            if(rs.next()){
                setVisible(false);
                new Loading(username);

            }
            else{
                JOptionPane.showMessageDialog(null, "Incorect username or password ");

            }

        }catch(Exception e){
            e.printStackTrace();
        }

        }
        else if (ae.getSource()==sign1){
        setVisible(false);
        new signup();
        
        }
        else{
            setVisible(false);
            new ForgetPassword();
        }

    }
    public static void main(String[] args) {
        new Login();
    }    
}
