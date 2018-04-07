import java.awt.*;  
import javax.swing.JButton;
import javax.swing.JFrame;  
  
public class graphplot extends Canvas{  
      int u1=0,u2=0,o1=0,o2=0;Thread t=null;JButton b; JFrame f;  JTextField tf1,tf2;
      graphplot()
      {
         f=new JFrame();  
      
    t = new Thread(this);  
        t.start();  
      
    b=new JButton();  
        b.setBounds(100,100,100,50);  
       tf1=new JTextField();  
        tf1.setBounds(50,50,150,20);  
        tf2=new JTextField();  
        tf2.setBounds(50,100,150,20);
    f.add(b);  
    f.setSize(300,400);  
    f.setLayout(null);  
    f.setVisible(true);  
}  
    public void paint(Graphics g) {   
        g.drawOval(u1,u2,2, 2);  
        drawLine(o1, o2, u1, u2)  
          
    }  
