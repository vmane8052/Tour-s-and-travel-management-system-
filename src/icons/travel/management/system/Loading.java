package travel.management.system;

import java.awt.Color;
import java.awt.Font;

import javax.swing.*;

public class Loading  extends JFrame implements Runnable{
    Thread t;
    JProgressBar bar;
    String username;
public void run(){

    try{
        for(int i=1;i<=101;i++){
            int max=bar.getMaximum();
            int value=bar.getValue();

            if(value< max){
                bar.setValue(bar.getValue() + 1);
            }else{
                setVisible(false);
                new Dashboard(username);
            }
            Thread.sleep(50);
        }

    }catch(Exception e){
        e.printStackTrace();
    }
}

    Loading(String username){
        this.username=username;

        t=new Thread(this);
        
 setBounds(500, 200, 650, 400);
 getContentPane().setBackground(Color.WHITE);
 setLayout(null);

 JLabel text =new JLabel("Travel and Tourism Application");
text.setBounds(50, 20, 600, 40);
text.setForeground(Color.BLUE);
text.setFont(new Font("Tahoma",Font.BOLD,35));
add(text);

bar=new JProgressBar();
bar.setBounds(150, 100, 300, 35);
bar.setStringPainted(true);
add(bar);

 JLabel l2 =new JLabel("Loading and please wait");
l2.setBounds(230, 130, 150, 30);
l2.setForeground(Color.RED);
l2.setFont(new Font("Tahoma",Font.BOLD,16));
add(l2);

 JLabel username1 =new JLabel("Welcome "+username);
username1.setBounds(20, 310, 400, 40);
username1.setForeground(Color.RED);
username1.setFont(new Font("Tahoma",Font.BOLD,16));
add(username1);


t.start();
 setVisible(true);
    }
    public static void main(String[] args) {
        new Loading("");
    }
  
    
}
