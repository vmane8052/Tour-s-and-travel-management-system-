package travel.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
  String username;
JButton addpersonaldetail,calculator,notpad,bookpackage,about,payment,checkpackage,delatepersonaldetail,updatepersonaldetail,viewpersonaldetail,viewpackage,viewhotel,bookhotel,viewbookhotel,destination;

    Dashboard(String username){
      this.username=username;

       // setBounds(20, 150, 0, 0);
       setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(null);

        JPanel p1=new JPanel();
        p1.setLayout(null);
        p1.setBackground(new Color(0,0,102));
        p1.setBounds(0, 0, 1600, 65);
        add(p1);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/dashboard.png"));
        Image i2= i1.getImage().getScaledInstance(70, 70, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel icon=new JLabel(i3);
        icon.setBounds(5, 0, 70, 70);
        p1.add(icon);
        
        JLabel heading=new JLabel("Dashboard");
        heading.setBounds(80, 10, 300, 40);
        heading.setForeground(Color.WHITE);
        heading.setFont(new Font("thoma",Font.BOLD,30));
        p1.add(heading);

         JPanel p2=new JPanel();
        p2.setLayout(null);
        p2.setBackground(new Color(0,0,102));
        p2.setBounds(0, 65, 300, 900);
        add(p2);
        
        addpersonaldetail=new JButton("Add Personal Details");
        addpersonaldetail.setBounds(0, 0, 300, 50);
        addpersonaldetail.setBackground(new Color(0,0,102));
        addpersonaldetail.setForeground(Color.WHITE);
        addpersonaldetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        addpersonaldetail.setMargin(new Insets(0, 0, 0, 60));
        addpersonaldetail.addActionListener(this);
        p2.add(addpersonaldetail);

         updatepersonaldetail=new JButton("Update Personal Details");
        updatepersonaldetail.setBounds(0, 40, 300, 50);
        updatepersonaldetail.setBackground(new Color(0,0,102));
        updatepersonaldetail.setForeground(Color.WHITE);
        updatepersonaldetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        updatepersonaldetail.setMargin(new Insets(0, 0, 0, 30));
        updatepersonaldetail.addActionListener(this);
        p2.add(updatepersonaldetail);

         viewpersonaldetail=new JButton("View Details");
        viewpersonaldetail.setBounds(0, 80, 300, 50);
        viewpersonaldetail.setBackground(new Color(0,0,102));
        viewpersonaldetail.setForeground(Color.WHITE);
        viewpersonaldetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpersonaldetail.setMargin(new Insets(0, 0, 0, 130));
        viewpersonaldetail.addActionListener(this);
        p2.add(viewpersonaldetail);
        
          delatepersonaldetail=new JButton("Delate Personal Details");
        delatepersonaldetail.setBounds(0, 120, 300, 50);
        delatepersonaldetail.setBackground(new Color(0,0,102));
        delatepersonaldetail.setForeground(Color.WHITE);
        delatepersonaldetail.setFont(new Font("Tahoma",Font.PLAIN,20));
        delatepersonaldetail.setMargin(new Insets(0, 0, 0, 40));
        delatepersonaldetail.addActionListener(this);
        p2.add(delatepersonaldetail);
        
          checkpackage=new JButton("Check Package");
        checkpackage.setBounds(0, 160, 300, 50);
        checkpackage.setBackground(new Color(0,0,102));
        checkpackage.setForeground(Color.WHITE);
        checkpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        checkpackage.setMargin(new Insets(0, 0, 0, 110));
        checkpackage.addActionListener(this);
        p2.add(checkpackage);
        
          bookpackage=new JButton("Book Package");
        bookpackage.setBounds(0, 200, 300, 50);
        bookpackage.setBackground(new Color(0,0,102));
        bookpackage.setForeground(Color.WHITE);
        bookpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookpackage.setMargin(new Insets(0, 0, 0, 120));
        bookpackage.addActionListener(this);
        p2.add(bookpackage);
        
          viewpackage=new JButton("View Package");
        viewpackage.setBounds(0, 240, 300, 50);
        viewpackage.setBackground(new Color(0,0,102));
        viewpackage.setForeground(Color.WHITE);
        viewpackage.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewpackage.setMargin(new Insets(0, 0, 0, 120));
        viewpackage.addActionListener(this);
        p2.add(viewpackage);
        
         viewhotel=new JButton("View Hotel");
        viewhotel.setBounds(0, 280, 300, 50);
        viewhotel.setBackground(new Color(0,0,102));
        viewhotel.setForeground(Color.WHITE);
        viewhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewhotel.setMargin(new Insets(0, 0, 0, 130));
        viewhotel.addActionListener(this);
        p2.add(viewhotel);
        
         bookhotel=new JButton("Book Hotel");
        bookhotel.setBounds(0, 320, 300, 50);
        bookhotel.setBackground(new Color(0,0,102));
        bookhotel.setForeground(Color.WHITE);
        bookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        bookhotel.setMargin(new Insets(0, 0, 0, 140));
        bookhotel.addActionListener(this);
        p2.add(bookhotel);
        
         viewbookhotel=new JButton("View Booked Hotel");
        viewbookhotel.setBounds(0, 360, 300, 50);
        viewbookhotel.setBackground(new Color(0,0,102));
        viewbookhotel.setForeground(Color.WHITE);
        viewbookhotel.setFont(new Font("Tahoma",Font.PLAIN,20));
        viewbookhotel.setMargin(new Insets(0, 0, 0, 70));
        viewbookhotel.addActionListener(this);
        p2.add(viewbookhotel);
        
         destination=new JButton("Destination");
        destination.setBounds(0, 400, 300, 50);
        destination.setBackground(new Color(0,0,102));
        destination.setForeground(Color.WHITE);
        destination.setFont(new Font("Tahoma",Font.PLAIN,20));
        destination.setMargin(new Insets(0, 0, 0,125));
        destination.addActionListener(this);
        p2.add(destination);
        
         payment=new JButton("Payment");
        payment.setBounds(0, 440, 300, 50);
        payment.setBackground(new Color(0,0,102));
        payment.setForeground(Color.WHITE);
        payment.setFont(new Font("Tahoma",Font.PLAIN,20));
        payment.setMargin(new Insets(0, 0, 0, 155));
        payment.addActionListener(this);
        p2.add(payment);
        
         calculator=new JButton("calculator");
        calculator.setBounds(0, 480, 300, 50);
        calculator.setBackground(new Color(0,0,102));
        calculator.setForeground(Color.WHITE);
        calculator.setFont(new Font("Tahoma",Font.PLAIN,20));
        calculator.setMargin(new Insets(0, 0, 0, 145));
        calculator.addActionListener(this);
        p2.add(calculator);

         notpad=new JButton("Notapad");
        notpad.setBounds(0, 520, 300, 50);
        notpad.setBackground(new Color(0,0,102));
        notpad.setForeground(Color.WHITE);
        notpad.setFont(new Font("Tahoma",Font.PLAIN,20));
        notpad.setMargin(new Insets(0, 0, 0, 155));
        notpad.addActionListener(this);
        p2.add(notpad);
        
         about=new JButton("About");
        about.setBounds(0,560, 300, 50);
        about.setBackground(new Color(0,0,102));
        about.setForeground(Color.WHITE);
        about.setFont(new Font("Tahoma",Font.PLAIN,20));
        about.setMargin(new Insets(0, 0, 0, 175));
        about.addActionListener(this);
        p2.add(about);


        ImageIcon i4=new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i5=i4.getImage().getScaledInstance(1650, 1000, Image.SCALE_DEFAULT);
        ImageIcon i6=new ImageIcon(i5);
        JLabel image1=new JLabel(i6);
        image1.setBounds(0, 0, 1650, 1000);
        add(image1);
        
        

        JLabel text=new JLabel("Travel and Tourism Manegement System");
        text.setBounds(400, 70, 1000, 70);
        text.setForeground(Color.YELLOW);
        text.setFont(new Font("tahoma",Font.BOLD,40));
        image1.add(text);
        
          JLabel t=new JLabel("Created by Ganesh Sutar ");
        t.setBounds(1000, 600, 1000, 70);
        t.setForeground(Color.white);
        t.setFont(new Font("tahoma",Font.BOLD,20));
        image1.add(t);
        
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
      if (ae.getSource()== addpersonaldetail){
        new AddCustomer(username);
      }
      else if (ae.getSource()==updatepersonaldetail){
          new UpdateCustomer(username);
       
      }
      else if(ae.getSource()==viewpersonaldetail){
      new ViewCustomer(username);
      }
      else if(ae.getSource()==checkpackage){
        new CheckPackage();
      }
      else if(ae.getSource()==delatepersonaldetail){
        new DeleteCustomerDetails(username);
      }
      
     else if(ae.getSource()==bookpackage){
        new  BookPackage (username);
      }
      else if(ae.getSource()==viewpackage){
        new ViewPackage (username);
      }
       else if(ae.getSource()==bookhotel){
        new BookHotels (username);
      }
       else if(ae.getSource()==viewbookhotel){
        new ViewBookHotels (username);
      }
       else if(ae.getSource()==destination){
        new Destination ();
      }
       else if(ae.getSource()==about){
        new About();
      }
      
       else if(ae.getSource()==viewhotel){
        new viewhotel();
      }
      
       else if(ae.getSource()==payment){
        new Payment();
      }
       else if(ae.getSource()==notpad){
           
            try{
          Runtime.getRuntime().exec("notepad.exe");
      }catch(Exception e){
          e.printStackTrace();
          
      }
        
      }
       else if(ae.getSource()==calculator){
      try{
          Runtime.getRuntime().exec("calc.exe");
      }catch(Exception e){
          e.printStackTrace();
          
      }
       }


     
     
      }
    public static void main(String[] args) {
        new Dashboard("");
    }
  
    
}
