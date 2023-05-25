
   import java.awt.*;
   import java.awt.event.*;
   import javax.swing.*;


   public class frame3 extends JFrame  {
   JLabel l1,l2,l3,l4,l5;
   JPanel p1,p2;
   ImageIcon im1,im3;
   JButton b1,b2,b3,b4,b5,b9,b10,b11,b12; 
   static String  name;
  


      
   frame3(String Name){
      this.name =Name;
   }
   
   frame3(){
     
     
      this.setTitle("");
      this.setSize(700,380);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);
      
      p1=new JPanel();
      p1.setBounds(0,0,700,50);
      p1.setBackground(Color.white);
      p1.setLayout(null);
      this.add(p1);


     


      b1=new JButton("Men");
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


      JLabel j=new JLabel("hi "+ name +"!");
      j.setBounds(350, 10, 160, 30);
      j.setForeground(Color.blue);
      p1.add(j);

      b4=new JButton("LOGOUT");
      b4.setBounds(560,10,100,30);
      b4.setFont(new Font("Aharoni",Font.PLAIN,15));
      b4.setBorder(null);
      b4.setBackground(Color.white);
      p1.add(b4);

      
      
   im1=new ImageIcon(getClass().getResource("Image/banner/banner.jpeg")); 

   p2=new JPanel();
   p2.setBounds(0,50,700,380);
   p2.setLayout(null);
   this.add(p2);
   
   l4=new JLabel(im1);
   l4.setBounds(0,50,700,350);
   p2.add(l4);



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


   b4.addMouseListener(new MouseAdapter(){
      
      public void mouseEntered(MouseEvent evt){
      
      b4.setBackground(Color.decode("#87CEEB"));
         
   }	

   public void mouseExited(MouseEvent evt){
      b4.setBackground(Color.white);  
      
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

   b4.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {

         setVisible(false);
         frame1 frame = new  frame1();
         frame.setVisible(true);
      }  
   });


   }

  

}


  