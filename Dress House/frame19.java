//size


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class frame19 extends JFrame {

JButton b1,b2,b3,b4,b11;
JPanel p1,p2;
JLabel l1,l2,l3,l4;
ImageIcon im1,im2,im3;

    frame19(){

        this.setVisible(true);
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

        ImageIcon im4=new ImageIcon(getClass().getResource("Image/banner/n.png"));
        b11=new JButton(im4);  
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
        p2.setBounds(0,0,700,380);
        p2.setBackground(new Color(230,230,250));
        p2.setLayout(null);
        this.add(p2);

        l1=new JLabel();
        l1.setBounds(0,0,700,380);
        l1.setBackground(Color.white);
        p2.add(l1);

        im1=new ImageIcon("Image/boy/ms.png");
        l2=new JLabel(im1); 
        l2.setBounds(40,100,200,150);
        p2.add(l2);

        im2=new ImageIcon("Image/children/cs.png");
        l3=new JLabel(im2); 
        l3.setBounds(250,100,200,200);
        p2.add(l3);

        im3=new ImageIcon("Image/girl/gs.png");
        l4=new JLabel(im3); 
        l4.setBounds(460,100,200,200);
        p2.add(l4);

        




        b4=new JButton();
        b4.setText("back");
        b4.setBounds(10,300,80,30);
        b4.setForeground(Color.black);
        b4.setBackground(Color.white);
        b4.setBorder(null);
        l1.add(b4);


       b11.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
     
            setVisible(false);
            frame3 frame = new  frame3();
            frame.setVisible(true);
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
            pay frame = new  pay();
            frame.setVisible(true);
        }
     
        
     });
     

    }

    
}
