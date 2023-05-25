
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class frame20 extends JFrame {

    JLabel l1;

    frame20(){
        this.setSize(500,200);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        JPanel p=new JPanel();
        p.setBounds(0,0,500,200);
        p.setLayout(null);
       
        this.add(p);

        l1=new JLabel("Your Payment Is Successful");
        l1.setBounds(170,20,200,50);
        p.add(l1);
        
        JButton b=new JButton("OK");
        b.setBounds(210,70,60,30);
        b.setBorder(null);
        p.add(b);

       

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
         
                setVisible(false);
                frame3 frame = new  frame3();
                frame.setVisible(true);
            }
         
            
         });
    

    }
    
}
