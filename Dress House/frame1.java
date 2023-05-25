

    import java.awt.*;
    import javax.swing.*;
    import java.awt.event.*;

    public class frame1 extends JFrame{
    JLabel l1,l2,l3,l4;
    JPanel p1,p2,p3;
    JTextField t1,t2;
    JButton b1,b2,b3,b4;



    public frame1(){

    
      this.setSize(330,400);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);

    
      
      
      p2=new JPanel();
      p2.setBounds(0,0,330,400);
      p2.setBackground(Color.decode(	"#E6E6FA"));
      p2.setLayout(null);
      this.add(p2); 
      

      l1 = new JLabel("DRESS HOUSE");
      l1.setBounds(110,0,150,100);
      l1.setFont(new Font("Algerian",Font.BOLD,15));
      p2.add(l1);
    
      l2=new JLabel("UserName");
      l2.setForeground(Color.black);
      l2.setBounds(20,85,80,55);
      p2.add(l2);
     
      

      l3=new JLabel("Password");
      l3.setForeground(Color.black);
      l3.setBounds(20,135,150,55);
      p2.add(l3);

      //textfiled
      t1 = new JTextField();
      t1.setBounds(90,100,150,25);
      p2.add(t1);
      
      t2 = new JTextField();
      t2.setBounds(92,150,150,25);
      p2.add(t2);
      //Button
      b1 = new JButton("Login");
      b1.setBounds(50,220,100,25);
      b1.setForeground(Color.white);
      b1.setBackground(Color.black);
      p2.add(b1);

      b2 = new JButton("Registration");
      b2.setForeground(Color.white);
      b2.setBackground(Color.black);
      b2.setBounds(170,220,120,25);
      p2.add(b2);


      b3 = new JButton("ADMIN LOGIN");
      b3.setForeground(Color.white);
      b3.setBackground(Color.black);
      b3.setBounds(100,265,120,25);
      p2.add(b3);


      



      b1.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
    

        if(ae.getSource()==b1){
          
            String  userName = t1.getText();
            String userPassword = t2.getText();
            frame3 h = new frame3(userName); 
            
            
            CreateUserAccount cua1 = new CreateUserAccount();
        
          
          if(cua1.getAccount(userName, userPassword)){
            ///JOptionPane.showMessageDialog(rootPane,"Login Successful");
           
          frame3 h1 = new frame3();
          
            setVisible(false);
            h1.setVisible(true);
            
          }
          else{JOptionPane.showMessageDialog(rootPane, "Invalid UserName/Password", "INVALID", JOptionPane.WARNING_MESSAGE);}
      }  }});

      b2.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent ae) {
    
            setVisible(false);
            frame2 frame = new  frame2();
            frame.setVisible(true);
        }
    });


    b3.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
  
          setVisible(false);
          adminlogin frame = new  adminlogin();
          frame.setVisible(true);
      }
  });

 

    }}
      












        




