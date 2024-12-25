
package ulms;

import java.awt.*;
import javax.swing.*;

public class ULMS {

    public static void main(String args[]){
        Frame f = new Frame("University Life Management System - ULMS"); 
        f.setVisible(true); 
        int i;
        int x=1;
        for(i=3;i<=500;i+=4,x+=1){
            f.setLocation(250, 100);
            f.setSize(800,500);
            //f.setSize(((i+3*x)-45), ((i+x/2)-12));
            
            try{
                Thread.sleep(0);
            }catch(Exception e) { }
        }
    }       
}

class Frame extends JFrame implements Runnable{
    Thread t1;
    Frame(String s){
        super(s);
        setLayout(new FlowLayout());
        ImageIcon c1 = new ImageIcon(ClassLoader.getSystemResource("ulms/images/Home.jpg"));
        Image i1 = c1.getImage().getScaledInstance(800, 500, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i1);
        
        JLabel m1 = new JLabel(i2);
        add(m1);
        t1 = new Thread(this);
        t1.start();
    }
    public void run(){
        try{
            Thread.sleep(0000);
            this.setVisible(false);
            Login f1 = new Login();
            
        }catch(Exception e){
            e.printStackTrace(); 
        }
    }
}
