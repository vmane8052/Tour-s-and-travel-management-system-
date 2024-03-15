/*package travel.management.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

import javax.swing.*;

public class AddCustomer extends JFrame implements ActionListener {
    JLabel labelusername,labelname;
    JComboBox addcombo;
    JTextField rnumber,country,addres,phone,email;
    JRadioButton rmale,rfemale;
    JButton add,back;
    String username;
    AddCustomer(String username ){
         this.username = username;
setBounds(300, 100, 850, 550);
setLayout(null);
getContentPane().setBackground(Color.WHITE);

JLabel addusername=new JLabel("Username");
addusername.setBounds(30, 50, 150, 25);
add(addusername);

 labelusername =new JLabel("");
labelusername.setBounds(220, 50, 150, 25);
add(labelusername);

JLabel addid=new JLabel("ID");
addid.setBounds(30, 90, 150, 25);
add(addid);

addcombo=new JComboBox<>(new String[]{"Passport","Adhar Card","Pan Card","Ration Card "});
addcombo.setBounds(220, 90, 150, 25);
addcombo.setBackground(Color.WHITE);
add(addcombo);

JLabel addnumber=new JLabel("Number");
addnumber.setBounds(30, 130, 150, 25);
add(addnumber);

rnumber=new JTextField();
rnumber.setBounds(220, 130, 150, 25);
add(rnumber);

JLabel addname=new JLabel("Name");
addname.setBounds(30, 170, 150, 25);
add(addname);

 labelname =new JLabel("");
labelusername.setBounds(220, 170, 150, 25);
add(labelusername);

JLabel addgender=new JLabel("Gender");
addgender.setBounds(30, 210, 150, 25);
add(addgender);


rmale=new JRadioButton("Mail");
rmale.setBounds(220, 210, 70, 25);
rmale.setBackground(Color.WHITE);
add(rmale);

rfemale=new JRadioButton("Femail");
rfemale.setBounds(300, 210, 70, 25);
rfemale.setBackground(Color.WHITE);
add(rfemale);

ButtonGroup bg =new ButtonGroup();
bg.add(rfemale);
bg.add(rmale);

JLabel addcountry=new JLabel("Country");
addcountry.setBounds(30, 250, 150, 25);
add(addcountry);

country=new JTextField();
country.setBounds(220, 250, 150, 25);
add(country);

JLabel addaddres=new JLabel("Addres");
addaddres.setBounds(30, 290, 150, 25);
add(addaddres);

addres=new JTextField();
addres.setBounds(220, 290, 150, 25);
add(addres);

JLabel addphone=new JLabel("Phone Number");
addphone.setBounds(30, 330, 150, 25);
add(addphone);

phone=new JTextField();
phone.setBounds(220, 330, 150, 25);
add(phone);

JLabel addemail=new JLabel("Email");
addemail.setBounds(30, 370, 150, 25);
add(addemail);

email=new JTextField();
email.setBounds(220,370 , 150, 25);
add(email);


add=new JButton("Add");
add.setBackground(Color.BLACK);
add.setForeground(Color.WHITE);
add.setBounds(70, 430, 100, 25);
add.addActionListener(this);
add(add);

back=new JButton("Back");
back.setBackground(Color.BLACK);
back.setForeground(Color.WHITE);
back.setBounds(230, 430, 100, 25);
back.addActionListener(this);
add(back);

ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
Image i2=i1.getImage().getScaledInstance(400, 500, Image.SCALE_DEFAULT);
ImageIcon i3=new ImageIcon(i2);
JLabel image=new JLabel(i3);
image.setBounds(400, 40, 450, 420);
add(image);

try{
    conn c=new conn();
    ResultSet rs=c.s.executeQuery("select * From acount Where username='"+username+"'");
    while(rs.next()) {

        labelusername.setText(rs.getString("username"));
        labelname.setText(rs.getString("name"));
   }
}catch(Exception e){
    e.printStackTrace();
}
setVisible(true);
    
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==add){

            String Username=labelusername.getText();
            String Id= (String) addcombo.getSelectedItem();
            String Number = rnumber.getText();
            String Name=labelname.getText();
            String Gender=null;
            if(rmale.isSelected()){
                Gender="Male";

            }else{
                Gender="Female";

            }
            String Country=country.getText();
            String Addres=addres.getText();
            String Phone=phone.getText();
            String Email=email.getText();
            
            try{
                conn c=new conn();
                 String query="insert into customer values('"+Username+"','"+Id+"','"+Number+"','"+Name+"','"+Gender+"','"+Country+"','"+Addres+"','"+ Phone+"','"+Email +"',)";
                 c.s.executeQuery(query);

                JOptionPane.showMessageDialog(null, "Customer Details added Sucesfully");
                setVisible(false);


            }catch(Exception e){
                e.printStackTrace();
            }

        }else{
            setVisible(false);
            
        }
    }
   public static void main(String[] args) {
       new AddCustomer("");
    
   }
    
}*/

package travel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class AddCustomer extends JFrame implements ActionListener {
   ButtonGroup gendergroup;
    JRadioButton male, female;
    JLabel lblusername ,  lblname ,  gender;
    JTextField tfNumber , tfphone , tfemail;
    JComboBox comboid,tfcountry;
    JButton back, add;

    JLabel labelname  , labelusername ; 
String username;
    AddCustomer(String username){
     this.username = username;
        setLayout(null);
       getContentPane().setBackground(Color.white);
        setBounds(300 , 200 , 850 , 450);

        lblusername = new JLabel("Username :");
        lblusername.setForeground(Color.BLACK);
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblusername.setBounds(50, 20, 300, 20);
        add(lblusername);

         labelusername = new JLabel();
        labelusername.setFont(new Font("Tahoma", Font.BOLD, 14));
        labelusername.setBounds(200, 20, 200, 20);
        add(labelusername);

        JLabel lblid = new JLabel("ID :");
        lblid.setForeground(Color.BLACK);
        lblid.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblid.setBounds(50, 60, 300, 20);
        add(lblid);

        comboid = new JComboBox(new String[] {"Aadhar Card" , "Passport", "Driving Licence" , "Others"  });
        comboid.setBounds(200, 60, 200, 20);
        comboid.setBackground(Color.white);
        add(comboid);


        JLabel lblnumber = new JLabel("ID Number:");
        lblnumber.setForeground(Color.BLACK);
        lblnumber.setFont((new Font("Tahoma", Font.PLAIN, 18)));
        lblnumber.setBounds(50, 100, 300, 20);
        add(lblnumber);

         tfNumber = new JTextField();
        tfNumber.setBounds(200, 100, 200, 20);
        tfNumber.setBackground(Color.white);
        add(tfNumber);

         lblname = new JLabel("Name :");
        lblname.setForeground(Color.BLACK);
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblname.setBounds(50, 140, 300, 20);
        add(lblname);

        labelname = new JLabel();
//     labelname = new JTextField();
        labelname.setBounds(200, 140, 200, 20);
        labelname.setFont(new Font("Tahoma", Font.BOLD, 14));
        add(labelname);

        //gender
        gender = new JLabel("Gender :");
        gender.setFont(new Font("Tahoma", Font.PLAIN, 18));
        gender.setBounds(50, 180, 300, 20);
        add(gender);

        male = new JRadioButton("Male");
        male.setFont(new Font( "Tahoma" , Font.PLAIN, 14));
        male.setBounds(200, 180, 100, 20);
        male.setBackground(Color.white);
        add(male);

        female = new JRadioButton("Female");
        female.setFont(new Font( "Tahoma" , Font.PLAIN, 14));
        female.setBounds(300, 180, 100, 20);
        female.setBackground(Color.white);
        add(female);


        gendergroup = new ButtonGroup();
        gendergroup.add(male);
        gendergroup.add(female);

        JLabel lblcountry = new JLabel("Country:");
        lblcountry.setForeground(Color.BLACK);
        lblcountry.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblcountry.setBounds(50, 220, 300, 20);
        add(lblcountry);
        
         tfcountry = new JComboBox(new String[] {" India" , "Amerika", "Rashiya " , "uren","Afrika" ,"chin","England","Japan","Other" });
        tfcountry.setBounds(200, 220, 200, 20);
        tfcountry.setBackground(Color.white);
        add(tfcountry);


      /* tfcountry = new JTextField();
        tfcountry.setBounds(200, 220, 200, 20);
        tfcountry.setBackground(Color.white);
        add(tfcountry);*/

        JLabel lblphone = new JLabel("Phone:");
        lblphone.setForeground(Color.BLACK);
        lblphone.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblphone.setBounds(50, 265, 300, 25);
        add(lblphone);

        tfphone = new JTextField();
     tfphone.setBounds(200, 265, 200, 20);
     tfphone.setBackground(Color.white);
        add(tfphone);

     JLabel lblemail = new JLabel("Email:");
     lblemail.setForeground(Color.BLACK);
     lblemail.setFont(new Font("Tahoma", Font.PLAIN, 18));
     lblemail.setBounds(50, 310, 300, 25);
     add(lblemail);

      tfemail = new JTextField();
     tfemail.setBounds(200, 310, 200, 20);
     tfemail.setBackground(Color.white);
     add(tfemail);

      add = new JButton("Add");
     add.setForeground(Color.white);
     add.setBackground(Color.black);
     add.setBounds(150 , 350 , 100 , 30);
     add.addActionListener(this);
     add(add);

     back = new JButton("Back");
     back.setForeground(Color.white);
     back.setBackground(Color.black);
     back.setBounds(450 , 350 , 100 , 30);
     back.addActionListener(this);
     add(back);

     // To show un-writable username and name

    try {
         conn c = new conn();
        ResultSet rs =  c.s.executeQuery("select* from acount where username = '"+username+"'");
        while (rs.next()){
         labelusername.setText(rs.getString("username"));
         labelname.setText(rs.getString("name"));
        }
     }
     catch (Exception e){
   e.printStackTrace();
     }

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/newcustomer.jpg"));
        Image i2 = i1.getImage().getScaledInstance(400,500 ,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(400,0,450,420);
        add(image);

        setVisible(true);
    }

 @Override
 public void actionPerformed(ActionEvent ae) {
          if(ae.getSource() == add){
            String username = labelusername.getText();
            String id = (String) comboid.getSelectedItem();
            String idNumber = tfNumber.getText();
            String name = labelname.getText();
            String  number = tfphone.getText();
            String email = tfemail.getText();
            String country =(String) tfcountry.getSelectedItem();
            String gender = null;
            if(male.isSelected()){
             gender = "Male";
            }
            else{
             gender = "Female";
            }

            try {
             conn c = new conn();
                String query = "insert into customerr values( '"+username+"',  '"+id+"',  '"+idNumber+"' , '"+name+"' ,  '"+gender+"',  '"+country+"',  '"+number+"'  , '"+email+"'  )";
                c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null , "Customer Details Added Successfully");
            setVisible(false);

            }
            catch (Exception e){
             e.printStackTrace();
            }

              }
          else {
               setVisible(false);

              }
    }

     public static void main(String[] args) {
        new AddCustomer("");
     }
}
