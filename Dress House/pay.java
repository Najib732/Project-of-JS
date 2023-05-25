
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class pay extends JFrame  {
    
    JPanel p1,p2;
    JButton b1,b2,b3,b4,b5,b9,b10,b11; 
    ImageIcon im1,im2;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    JTextField a1, a2,a3,a4,a5,a6;
    JTextArea r1;
    JScrollPane jp1,jp2,jp3,jp4,jp5,jp6,jp7;
      
    pay (){
       

    this.setTitle("");
    this.setSize(700,580);
    this.setLocationRelativeTo(null);
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false); 

        

  
   
   p1=new JPanel();
   p1.setBounds(0,0,700,50);
   p1.setBackground(Color.white);
   p1.setLayout(null);
   this.add(p1);

   im1=new ImageIcon(getClass().getResource("Image/banner/n.png"));
   b11=new JButton(im1);  
   b11.setBounds(05,10,40,30);
   b11.setBorder(null);   
   b11.setBackground(Color.white);
   p1.add(b11);

   
   b1=new JButton("MEN");
   b1.setBounds(62,10,40,30);
   b1.setBorder(null);
   b1.setBackground(Color.white);
   b1.setFont(new Font("Aharoni",Font.PLAIN,15));
   p1.add(b1);

   b2=new JButton("Women");
   b2.setBounds(125,10,55,30);
   b2.setBorder(null);
   b2.setBackground(Color.white); 
   b2.setFont(new Font("Aharoni",Font.PLAIN,15));
   p1.add(b2);

   b3=new JButton("Children");
   b3.setBounds(200,10,60,30);
   b3.setFont(new Font("Aharoni",Font.PLAIN,15));
   b3.setBorder(null);
   b3.setBackground(Color.white);
   p1.add(b3);
   
  
   

   p2=new JPanel();  
   p2.setLayout(null);
   p2.setBackground(Color.decode("#87CEEB"));
   this.add(p2);


  
  
   l2=new JLabel("PAYMENT");
   l2.setBounds(300,40,100,50);
   l2.setFont(new Font("Cambria",Font.BOLD,20));
   l2.setForeground(Color.white);
   p2.add(l2);
   
   
   l3=new JLabel("Full Name");
   l3.setForeground(Color.white);
   l3.setFont(new Font("Cambria",Font.BOLD,15));
   l3.setBounds(20,100,80,20);
   p2.add(l3);
   
   a1=new JTextField();
   jp1=new JScrollPane(a1,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED) ;
   a1.setBounds(20,130,250,30);
   p2.add(a1);


   l4=new JLabel("ADDRESS");
   l4.setForeground(Color.white);
   l4.setFont(new Font("Cambria",Font.BOLD,15));
   l4.setBounds(20,170,80,20);
   p2.add(l4);
   
   a2=new JTextField();
   jp2=new JScrollPane(a2,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED) ;
   jp2.setBounds(20,200,250,30);
   p2.add(jp2);
   

   l5=new JLabel("MOBILE NO");
   l5.setForeground(Color.white);
   l5.setFont(new Font("Cambria",Font.BOLD,15));
   l5.setBounds(20,240,80,20);
   p2.add(l5);
   
   
   a3=new JTextField();
   //jp3=new JScrollPane(a3,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED) ;
   a3.setBounds(20,270,250,30);
   p2.add(a3);
   
   im2=new ImageIcon("Image/pay/MONEY.png");
   l6=new JLabel(im2);
   l6.setBounds(350,100,300,200);
   p2.add(l6);

   l7=new JLabel("Size");
   l7.setBounds(20,310,50,20);
   l7.setFont(new Font("Cambria",Font.BOLD,15));
   l7. setForeground(Color.white);
   p2.add(l7);

   a4=new JTextField();
   a4.setBounds(20,330,250,30);
   p2.add(a4);

   



   b4=new JButton();
   b4.setText("size details");
   b4.setBounds(180,360,100,30);
   b4.setBorder(null);
   b4.setBackground(getForeground());
   b4.setForeground(Color.white);
   b4.setFont(new Font("Cambria",Font.BOLD,12));
   p2.add(b4);


   l8=new JLabel("Order Note");
   l8.setBounds(20,390,100,20);
   l8.setFont(new Font("Cambria",Font.BOLD,15));
   l8. setForeground(Color.white);
   p2.add(l8);


   a5=new JTextField();
   jp4=new JScrollPane(a5,JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED) ;
   jp4.setBounds(20,420,250,40);
   p2.add(jp4);
   
   b5=new JButton("Confirm");
   b5.setBounds(300,480,100,30);
   b5.setBackground(Color.white);
   p2.add(b5);


   b1.addMouseListener(new MouseAdapter(){
      
    public void mouseEntered(MouseEvent evt){
     
      b1.setBackground(Color.decode("#87CEEB"));
  }	
  
  public void mouseExited(MouseEvent evt){
     
    b1.setBackground(Color.white);  
     
  }   
  });
  b2.addMouseListener(new MouseAdapter(){
      
    public void mouseEntered(MouseEvent evt){
     
      b2.setBackground(Color.decode("#87CEEB"));
  }	
  
  public void mouseExited(MouseEvent evt){
     
    b2.setBackground(Color.white);  
     
  }   
  });
  b3.addMouseListener(new MouseAdapter(){
      
    public void mouseEntered(MouseEvent evt){
     
      b3.setBackground(Color.decode("#87CEEB"));
  }	
  
  public void mouseExited(MouseEvent evt){
     
    b3.setBackground(Color.white);  
     
  }   
  });

  b5.addMouseListener(new MouseAdapter(){
      
    public void mouseEntered(MouseEvent evt){
     
      b5.setBackground(Color.decode("#87CEEB"));
  }	
  
  public void mouseExited(MouseEvent evt){
     
    b5.setBackground(Color.white);  
     
  }   
  });
  

      
   b11.addMouseListener(new MouseAdapter(){
      
    public void mouseEntered(MouseEvent evt){
     
      b11.setBackground(Color.decode("#87CEEB"));
  }	
  
  public void mouseExited(MouseEvent evt){
     
    b11.setBackground(Color.white);  
     
  }   
  });
  
  
      b1.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
       
              setVisible(false);
              frame4 frame = new  frame4();
              frame.setVisible(true);
          }
       
          
       });
       
       b2.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
       
              setVisible(false);
              frame9 frame = new  frame9();
              frame.setVisible(true);
          }
       
          
       });
  
       b3.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
       
              setVisible(false);
              frame14 frame = new  frame14();
              frame.setVisible(true);
          }
       
          
       });

   b4.addMouseListener(new MouseAdapter(){
      
    public void mouseEntered(MouseEvent evt){
     
      b4.setBackground(Color.blue);
  }	
  
  public void mouseExited(MouseEvent evt){
     
    b4.setBackground(Color.decode("#87CEEB"));
     
  }   


  public void mousePressed(MouseEvent evt){
    setVisible(false);
    frame19 f=new frame19();
    f.setVisible(true);
     
   
}
  });

  
  

  b5.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
      String s=a1.getText();
      String s1=a2.getText();
      String s2=a3.getText();
      String s3=a4.getText();
      String s4=a5.getText();
      if(s.isEmpty() ||  s1.isEmpty() || s2.isEmpty() || s3.isEmpty() || s4.isEmpty() )
      {
        JOptionPane.showMessageDialog(rootPane,"check");
     
        }
        else{
          setVisible(false);
        frame20 frame = new  frame20();
        frame.setVisible(true);

        }
    }
 
    
 });

 b11.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent ae) {

      setVisible(false);
      frame3  frame = new  frame3 ();
      frame.setVisible(true);
  }
});




    
   }

    }