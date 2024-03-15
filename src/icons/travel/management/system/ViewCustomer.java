package travel.management.system;
// lecture 10
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class ViewCustomer extends JFrame implements ActionListener {
        JButton back;
    JLabel labelusername , labelid , labelnumber , labelcountry , labelphone  , labelemail,labelgender ;
    String username;
    ViewCustomer(String username){
        this.username = username;
        setLayout(null);
       getContentPane().setBackground(Color.white);
        setBounds(300 , 150 , 850 , 500);

        JLabel lblusername = new JLabel("Username");
        lblusername.setBounds(30,30,150,25);
        lblusername.setFont(new Font("Tahoma", Font.PLAIN, 18));
        add(lblusername);

         labelusername  = new JLabel();
        labelusername.setBounds(200,30,150,20);
        labelusername.setFont(new Font("Railway", Font.PLAIN, 20));
        add(labelusername);

        
        JLabel lbld = new JLabel("ID");
        lbld.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbld.setBounds(30,80,150,25);
        add(lbld);

       labelid = new JLabel();
        labelid.setBounds(200,80,150,25);
        labelid.setFont(new Font("Railway", Font.PLAIN, 20));
        add(labelid);

        JLabel lblnumber = new JLabel("Id Number");
        lblnumber.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblnumber.setBounds(30,130,150,25);
        add(lblnumber);

        labelnumber = new JLabel();
        labelnumber.setBounds(200,130,150,25);
        labelnumber.setFont(new Font("Railway", Font.PLAIN, 20));
        add(labelnumber);

        JLabel lblname = new JLabel("Name");
        lblname.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblname.setBounds(400,30,150,25);
        add(lblname);

        JLabel labelname = new JLabel();
        labelname.setBounds(600,30,150,25);
        labelname.setFont(new Font("Railway", Font.PLAIN, 20));
        add(labelname);

       
        JLabel lblcountry = new JLabel("Country");
        lblcountry.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblcountry.setBounds(30,180,150,25);
        add(lblcountry);

        labelcountry = new JLabel();
        labelcountry.setBounds(200,180,150,25);
        labelcountry.setFont(new Font("Railway", Font.PLAIN, 20));
        add(labelcountry);



        JLabel lbphone = new JLabel("Phone");
        lbphone.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lbphone.setBounds(400,80,150,25);
        add(lbphone);

         labelphone = new JLabel();
        labelphone.setBounds(600,80,150,25);
        labelphone.setFont(new Font("Railway", Font.PLAIN, 20));
        add(labelphone);

        JLabel lblemail = new JLabel("Email");
        lblemail.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblemail.setBounds(400,130,150,25);
        add(lblemail);

        labelemail = new JLabel();
        labelemail.setBounds(600,130,150,25);
        labelemail.setFont(new Font("Railway", Font.PLAIN, 20));
        add(labelemail);

        JLabel lblgender = new JLabel("Gender");
        lblgender.setFont(new Font("Tahoma", Font.PLAIN, 18));
        lblgender.setBounds(400,180,150,25);

        add(lblgender);

        labelgender = new JLabel();
        labelgender.setBounds(600,180,150,25);
        labelgender.setFont(new Font("Railway", Font.PLAIN, 20));
        add(labelgender);


        back = new JButton("Back");
        back.setBackground(Color.black);
        back.setForeground(Color.white);
        back.setBounds(330,250,100,25);
        back.addActionListener(this);
        add(back);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(00,285,600,200);
        add(image);

         ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
        Image ii2 = ii1.getImage().getScaledInstance(600,200,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(i3);
        iimage.setBounds(580,285,600,200);
        add(iimage);

        try {

            conn conn = new conn();
            String  query = "select * from customerr where username = '"+username+"' ";
           ResultSet rs = conn.s.executeQuery(query);
           while (rs.next()){
               labelusername.setText(rs.getString("username"));
               labelid.setText(rs.getString("id"));
               labelnumber.setText(rs.getString("idNumber"));
               labelname.setText(rs.getString("name"));
               labelemail.setText(rs.getString("email"));
               labelgender.setText(rs.getString("gender"));
               labelcountry.setText(rs.getString("country"));
               labelphone.setText(rs.getString("number"));

           }
        }
        catch (Exception e){
            e.printStackTrace();;
        }

        setVisible(true);
    }



    public static void main(String[] args) {
        new ViewCustomer("");
    }

    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource() ==back ){
            setVisible(false);
     }
    }
}
