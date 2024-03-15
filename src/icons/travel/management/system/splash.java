
package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public  class splash extends JFrame implements Runnable{
    Thread thread;
    splash(){
       // setSize(1200, 600);
        setVisible(true);
        //setLocation(50, 50);
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("icons/splash.jpg"));
        Image i2=i1.getImage().getScaledInstance(1200,600,Image.SCALE_DEFAULT);
        ImageIcon i3 =new ImageIcon(i2);
        JLabel Image = new JLabel(i3);
        add(Image);
        
        thread=new Thread(this);
        thread.start();

    }
    public void run(){
        try{
            Thread.sleep(7000);
            setVisible(false);
            new Login();


        }catch(Exception e){

        }

    }
    public static void main(String[] args) {
         splash frame=new splash();
         int x=1;
         for(int i=1;i<500; x+=7,i+=6){
            frame.setLocation(750-(x+i)/2,400-(i/2));
            frame.setSize(x+i,i);

            try{
                Thread.sleep(50);
            }catch(Exception e){

            }
         }

        
    }
    
    
}
/*package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Splash {
    public static void main(String[] args){
        SplashFrame f1 = new SplashFrame();
        f1.setVisible(true);
        int i;
        int x=1;
        for(i=2; i<=600; i+=10, x+=7){
            f1.setLocation(900 - ((i+x)/2), 500 - (i/2));
            f1.setSize(i+x,i);
            try{
                Thread.sleep(10);
            }catch(Exception e){}
        }
        
    }
}
class SplashFrame extends JFrame implements Runnable{
    Thread t1;
    SplashFrame(){
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("Travel/Management/System/icons/splash.jpg"));
        Image i1 = c1.getImage().getScaledInstance(1030, 750,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel l1 = new JLabel(i2);
        add(l1);
        setUndecorated(true);
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(7000);
            this.setVisible(false);
            
            Login l = new Login();
            l.setVisible(true);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}*/