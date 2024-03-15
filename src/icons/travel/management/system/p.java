package travel.management.system;
import java.awt.*;
import javax.swing.*;


public class p extends JFrame{
    p(){
         setBounds(0, 0, 1200, 650);
        getContentPane().setBackground(Color.WHITE);
        
        
        JLabel p1=new JLabel("my name is");
       p1. setBounds(50,0,200,25);
        p1.setFont(new Font("tahoma",Font.BOLD,18));
       add(p1);
       
       JTextField t1=new JTextField();
       t1.setBounds (250,0,300,25);
       add(t1);
       
        JLabel p2=new JLabel("name");
       p2. setBounds(50,20,200,25);
        p2.setFont(new Font("tahoma",Font.BOLD,18));
       add(p2);
       
       Choice c1=new Choice();
       c1.add("hii kay karatay");
       c1.add("hii mg karatay");
       c1.add("hii kava karatay");
       c1.add("hii kas karatay");
       c1.setBounds(250, 20, 300, 25);
       add(c1);
       
        JLabel p3=new JLabel("name");
       p3. setBounds(50,40,200,25);
        p3.setFont(new Font("tahoma",Font.BOLD,18));
       add(p3);
       
       JRadioButton ri=new JRadioButton("male");
       ri.setBounds(250,40,70,25);
       ri.setBackground(Color.WHITE);
       add(ri);
       
       JRadioButton j=new JRadioButton("female");
       j.setBounds(320,40,300,25);
       j.setBackground(Color.WHITE);
       add(j);
       
     

       
               
        JLabel p4=new JLabel("name");
       p4. setBounds(50,60,200,25);
        p4.setFont(new Font("tahoma",Font.BOLD,18));
       add(p4);
               
 

               


        setVisible (true);
        
    }
    
    public static void main(String[] arg){
        new p();
    }
    
}
