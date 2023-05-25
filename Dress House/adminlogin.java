import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class adminlogin extends JFrame {
    JLabel l1,l2,l3,l4;
    JPanel p1,p2,p3;
    JTextField t1,t2;
    JButton b1,b2,b3;
    ImageIcon im1,im2;


    adminlogin(){


    this.setSize(780,400);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);

    p1=new JPanel();
    p1.setBounds(0,0,450,400);
    p1.setBackground(Color.decode(	"#E6E6FA"));
    p1.setLayout(null);
    this.add(p1) ;

    JLabel createdByLabel = new JLabel("This Project is created by Najib Mahfuj");
    createdByLabel.setBounds(10, 0, 300, 25);
    p1.add(createdByLabel);

    l2 = new JLabel("and Jerin jaman  Kangkhita");
    l2.setBounds(10, 25, 300, 25);
    p1.add(l2);


    im2=new ImageIcon(getClass().getResource("Image/Owner/najib.jpg"));
    l3= new JLabel(im2);
    l3.setBounds(10, 40, 200, 300);
    p1.add(l3);

    im2=new ImageIcon(getClass().getResource("Image/Owner/kangkhita.jpg"));
    l4= new JLabel(im2);
    l4.setBounds(230, 40, 200, 300);
    p1.add(l4);
  
    l4 = new JLabel();
    //l4.setText("ADMIN LOGIN");
    l4.setBounds(150,10,100,50);
    p1.add(l4);

    
    p2=new JPanel();
    p2.setBounds(450,0,330,400);
    
    p2.setBackground(Color.decode("#87CEEB"));
    p2.setLayout(null);
    this.add(p2); 
    
    l1 = new JLabel();
    l1.setText("ADMIN LOGIN");
    l1.setBounds(550,0,150,100);
    p2.add(l1);
  
    l2=new JLabel("UserName");
    l2.setForeground(Color.black);
    l2.setBounds(460,70,150,55);
    p2.add(l2);

    l3=new JLabel("Password");
    l3.setForeground(Color.black);
    l3.setBounds(460,110,150,55);
    p2.add(l3);

    //textfiled
    t1 = new JTextField();
    t1.setBounds(530,85,150,25);
    p2.add(t1);
    
    t2 = new JTextField();
    t2.setBounds(530,125,150,25);
    p2.add(t2);

    //Button
    b1 = new JButton("Login"); 
    b1.setBounds(550,190,100,25);
    b1.setForeground(Color.white);
    b1.setBackground(Color.black);
    p2.add(b1);

    b2=new JButton("back");
    b2.setBounds(480,310,80,20);
    b2.setBackground(Color.black);
    b2.setForeground(Color.white);
    p2.add(b2);

    b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {

            String name = t1.getText();
		String password = t2.getText();

            
           if(name.equals("admin") && password.equals("admin") ){ 
     
            setVisible(false);
            adminpage frame = new  adminpage();
            frame.setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(rootPane,"Information is incorrect");
        }}

     });


    b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
     
            setVisible(false);
            frame1 frame = new  frame1();
            frame.setVisible(true);
        }
     });

    
}}
