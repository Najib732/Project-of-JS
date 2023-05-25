import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;





public class frame2 extends JFrame {
    JPanel p1;
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4;
    JButton b1,b2;
	  JRadioButton r1,r2;
  
    frame2(){
 
    this.setTitle("REGISTRATION PAGE");
    this.setSize(370, 370);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);



    p1=new JPanel();
    p1.setSize(370,500);
    p1.setBackground(Color.decode(	"#E6E6FA"));
    p1.setLayout(null);
    this.add(p1);
    
    l2=new JLabel("Name:");
    l2.setBounds(80,60,50,30);
    p1.add(l2);

    l3=new JLabel("Password:");
    l3.setBounds(55,100,100,30);
    p1.add(l3);

    l4=new JLabel("Confirm Password:");
    l4.setBounds(10,140,120,30);
    p1.add(l4);

    l5=new JLabel("Mobile No:");
    l5.setBounds(55,180,100,30);
    p1.add(l5);

    l6=new JLabel("Gender:");
    l6.setBounds(50,220,100,30);
    p1.add(l6);



    t1=new JTextField();
    t1.setBounds(130,63,150,30);
    p1.add(t1);

    t2=new JTextField();
    t2.setBounds(130,100,150,30);
    p1.add(t2);

    t3=new JTextField();
    t3.setBounds(130,140,150,30);
    p1.add(t3); 

    t4=new JTextField();
    t4.setBounds(130,180,150,30);
    p1.add(t4); 
    
    ButtonGroup G = new ButtonGroup();

    r1=new JRadioButton("MALE");
    r1.setBounds(130,220,60,30);
    p1.add(r1);
    G.add(r1);

    r2=new JRadioButton("FEMALE");
    r2.setBounds(210,220,80,30);
    p1.add(r2);
    G.add(r2);


    b1 = new JButton("Sign up");
    b1.setBackground(Color.black);
    b1.setForeground(Color.white);
    b1.setBounds(130,270,100,25);
    p1.add(b1);

    b2 = new JButton("BACK");
    b2.setBackground(Color.black);
    b2.setForeground(Color.white);
    b2.setBounds(10,300,100,25);
    p1.add(b2);


    l1 = new JLabel();
    l1.setText("Registration");
    l1.setBounds(130,05,100,50);
    l1.setBackground(getForeground());
    l1.setFont(new Font("Serif",Font.BOLD,15));
    p1.add(l1); 


    b1.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent ae)
    {
      if(ae.getSource()==b1)
      {
          String fullName = t1.getText();
          String password = t2.getText();
          String confirmpassword = t3.getText();
          String mobileno = t4.getText();
         

          if(fullName.isEmpty() ||  password.isEmpty() || confirmpassword.isEmpty() || mobileno.isEmpty())
          {
              JOptionPane.showMessageDialog(rootPane, "Fill your informations", "MISSING INFORMATION",JOptionPane.WARNING_MESSAGE);
          }
          else if(password.equals(confirmpassword))
          {
            CreateUserAccount cua1 = new CreateUserAccount(fullName, password, confirmpassword, mobileno);
            
             try {
              cua1.addAccount();
            } catch (IOException e) {
              
              e.printStackTrace();
            }
          
              JOptionPane.showMessageDialog(rootPane, "Account Added");
             
      
         setVisible(false);
         frame1 l1 = new frame1();
         l1.setVisible(true);
      
          }
          else{JOptionPane.showMessageDialog(rootPane, "Check Password");}   }
        }});

        b2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent ae) {
       
              setVisible(false);
              frame1 frame = new  frame1();
              frame.setVisible(true);
          }
       });

          
      }
}