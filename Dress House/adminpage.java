import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;


public class adminpage extends JFrame {
  JButton b9;
    adminpage(){
      this.setSize(700,400);
      this.setLocationRelativeTo(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setResizable(false);
       

      JPanel  servicePane = new JPanel();
	servicePane.setBounds(0,105,540,310);
	servicePane.setBackground(Color.decode("#129db3"));
	servicePane.setLayout(null);
	this.add(servicePane);
	  

  b9=new JButton("back");
      b9.setBounds(05,330,80,20);
      b9.setBorder(null);
      b9.setBackground(Color.black);
      b9.setForeground(Color.white);
     servicePane.add(b9);


     b9.addMouseListener(new MouseAdapter(){
      
      public void mouseEntered(MouseEvent evt){
       
        b9.setBackground(Color.decode("#87CEEB"));
    }	
    
    public void mouseExited(MouseEvent evt){
       
      b9.setBackground(Color.black);  
       
    }   
    });


     b9.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
   
          setVisible(false);
          adminlogin frame = new  adminlogin();
          frame.setVisible(true);
      }
   
      
   });
	
	
	
	JTextArea textArea = new JTextArea();
    textArea.setBounds(100,25,510,300);
    textArea.setEnabled(false);
        
		    try{
            BufferedReader br=null;
            FileReader fr=null;
            fr=new FileReader("Data/Users.txt");
            br =new BufferedReader(fr);
            String a="",temp;
			
            while((temp=br.readLine())!=null) {
              a=a+temp+"\n"+"\r";
			  
              textArea.setText(a);
              textArea.setLineWrap(true);
            }
		    }  
        catch(Exception e)
        {
          e.printStackTrace();
        }
		
        servicePane.add(textArea);
	



    }
    
}
