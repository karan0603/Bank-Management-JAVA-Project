package bank.management.system;

import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,m1,m2;
    JButton next;
    JTextField textName,textFname,textEmail,textAddress,textCity,textPin,textState;
    JDateChooser dateChooser;
    Random ran =new Random();

    long first4 = (ran.nextLong() % 9000L)+ 1000L;

    String first = " "+Math.abs(first4);

     Signup(){
         super("APPLICATION FORM");

         ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
         Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
         ImageIcon i3 = new ImageIcon(i2);
         JLabel image = new JLabel(i3);
         image.setBounds(25,10,100,100);
         add(image);

            JLabel label1 = new JLabel("APPLICATION FORM NO."+first);
            label1.setBounds(160,20,600,40);
            label1.setFont(new Font("Raleway",Font.BOLD,38));
            add(label1);

            JLabel label2 = new JLabel("Page 1");
            label2.setFont(new Font("Raleway",Font.BOLD,22));
            label2.setBounds(350,70,600,30);
            add(label2);

            JLabel label3 = new JLabel("Personal Details");
            label3.setFont(new Font("Raleway",Font.BOLD,22));
            label3.setBounds(310,100,600,30);
            add(label3);

            JLabel labelName = new JLabel("Name :");
            labelName.setFont(new Font("Raleway",Font.BOLD,20));
            labelName.setBounds(100,170,100,30);
            add(labelName);

            textName = new JTextField();
            textName.setFont(new Font("Raleway",Font.BOLD,14));
            textName.setBounds(300,170,400,30);
            add(textName);

         JLabel labelFName = new JLabel("Father's Name :");
         labelFName.setFont(new Font("Raleway",Font.BOLD,20));
         labelFName.setBounds(100,220,200,30);
         add(labelFName);

         textFname = new JTextField();
         textFname.setFont(new Font("Raleway",Font.BOLD,14));
         textFname.setBounds(300,220,400,30);
         add(textFname);

         JLabel DOB = new JLabel("DATE OF BIRTH :");
         DOB.setFont(new Font("Raleway",Font.BOLD,20));
         DOB.setBounds(100,280,200,30);
         add(DOB);

         dateChooser = new JDateChooser();
         dateChooser.setForeground(new Color(105,105,105));
         dateChooser.setBounds(300,280,400,30);
         add(dateChooser);

         JLabel labelG = new JLabel("Gender :");
         labelG.setFont(new Font("Raleway",Font.BOLD,20));
         labelG.setBounds(100,340,200,30);
         add(labelG);

          r1 = new JRadioButton("Male");
          r1.setBackground(new Color(222,255,228));
          r1.setFont(new Font("Raleway",Font.BOLD,14));
         r1.setBounds(300,340,60,30);
         add(r1);

         r2 = new JRadioButton("Female");
         r2.setBackground(new Color(222,255,228));
         r2.setFont(new Font("Raleway",Font.BOLD,14));
         r2.setBounds(400,340,90,30);
         add(r2);

         r3 = new JRadioButton("Other");
         r3.setBackground(new Color(222,255,228));
         r3.setFont(new Font("Raleway",Font.BOLD,14));
         r3.setBounds(500,340,90,30);
         add(r3);

         ButtonGroup buttonGroup = new ButtonGroup();
         buttonGroup.add(r1);
         buttonGroup.add(r2);
         buttonGroup.add(r3);


         JLabel labelEmail = new JLabel("Email address :");
         labelEmail.setFont(new Font("Raleway",Font.BOLD,20));
         labelEmail.setBounds(100,400,200,30);
         add(labelEmail);

         textEmail = new JTextField();
         textEmail.setFont(new Font("Raleway",Font.BOLD,14));
         textEmail.setBounds(300,400,400,30);
         add(textEmail);

         JLabel labelMs = new JLabel("Married Status :");
         labelMs.setFont(new Font("Raleway",Font.BOLD,20));
         labelMs.setBounds(100,460,200,30);
         add(labelMs);

         m1 = new JRadioButton("Married");
         m1.setBackground(new Color(222,255,228));
         m1.setFont(new Font("Raleway",Font.BOLD,14));
         m1.setBounds(300,460,90,30);
         add(m1);

         m2 = new JRadioButton("Unmarried");
         m2.setBackground(new Color(222,255,228));
         m2.setFont(new Font("Raleway",Font.BOLD,14));
         m2.setBounds(400,460,120,30);
         add(m2);

         ButtonGroup buttonGroup1 = new ButtonGroup();
         buttonGroup1.add(m1);
         buttonGroup1.add(m2);

         JLabel labelAdd = new JLabel("Address :");
         labelAdd.setFont(new Font("Raleway",Font.BOLD,20));
         labelAdd.setBounds(100,520,200,30);
         add(labelAdd);

         textAddress = new JTextField();
         textAddress.setFont(new Font("Raleway",Font.BOLD,14));
         textAddress.setBounds(300,520,400,30);
         add(textAddress);

         JLabel labelCity = new JLabel("City :");
         labelCity.setFont(new Font("Raleway",Font.BOLD,20));
         labelCity.setBounds(100,580,200,30);
         add(labelCity);

         textCity = new JTextField();
         textCity.setFont(new Font("Raleway",Font.BOLD,14));
         textCity.setBounds(300,580,400,30);
         add(textCity);

         JLabel labelPin = new JLabel("PIN code :");
         labelPin.setFont(new Font("Raleway",Font.BOLD,20));
         labelPin.setBounds(100,640,200,30);
         add(labelPin);

         textPin = new JTextField();
         textPin.setFont(new Font("Raleway",Font.BOLD,14));
         textPin.setBounds(300,640,150,30);
         add(textPin);

         JLabel labelState = new JLabel("State :");
         labelState.setFont(new Font("Raleway",Font.BOLD,20));
         labelState.setBounds(470,640,200,30);
         add(labelState);

         textState = new JTextField();
         textState.setFont(new Font("Raleway",Font.BOLD,14));
         textState.setBounds(550,640,150,30);
         add(textState);

         next = new JButton("Next");
         next.setFont(new Font("Raleway",Font.BOLD,14));
         next.setBackground(Color.black);
         next.setForeground(Color.white);
         next.setBounds(620,710,80,30);
         next.addActionListener(this);
         add(next);



         getContentPane().setBackground(new Color(222,255,228));
         setLayout(null);
         setSize(850,800);
         setLocation(360,40);
         setVisible(true);


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if (r1.isSelected()){
            gender = "Male";
        } else if (r2.isSelected()) {
            gender ="Female";
        }
        else {
            gender = "other";
        }

        String email =textEmail.getText();
        String martial = null;
        if (m1.isSelected()){
            martial = "Married";
        }
        else if (m2.isSelected()){
            martial ="Unmarried";
        }
        String address = textAddress.getText();
        String city = textCity.getText();
        String pincode = textPin.getText();
        String state = textState.getText();

        try {
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }
            else {
                Con con1 = new Con();
                String q = "insert into SIGNUP values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+martial+"','"+address+"','"+city+"','"+pincode+"','"+state+"')";
                con1.statement.executeUpdate(q);
                new Signup2(formno);
                setVisible(false);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }

}
