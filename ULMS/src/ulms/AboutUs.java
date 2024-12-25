
package ulms;

import java.awt.*;
import javax.swing.*;

public class AboutUs extends JFrame{

	private JPanel contentPane;
        //JButton b;

        public static void main(String[] args) {
            new AboutUs().setVisible(true);			
	}
    
        public AboutUs() {
            
            super("ULMS - About Us");
            setBackground(new Color(173, 216, 230));
            setBounds(350, 125, 700, 550);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("ulms/images/education.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(400, 20, 250, 200);
            contentPane.add(l1);
            
            JLabel l3 = new JLabel("University Life");
            l3.setForeground(new Color(45, 112, 129));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD, 34));
            l3.setBounds(110, 40, 400, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Management System");
            l4.setForeground(new Color(55, 180, 205));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);          
                        
            JLabel l18 = new JLabel("(ULMS)");
            l18.setForeground(new Color(45, 112, 129));
            l18.setFont(new Font("Trebuchet MS", Font.BOLD, 34));
            l18.setBounds(170, 130, 400, 55);
            contentPane.add(l18);

            JLabel l6 = new JLabel("Developed by,");
            l6.setForeground(new Color(255, 129, 93));
            l6.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
            l6.setBounds(100, 220, 200, 34);
            contentPane.add(l6);
            
            JLabel l5 = new JLabel("Md. Hasibul Islam");
            l5.setForeground(Color.DARK_GRAY);
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
            l5.setBounds(100, 265, 200, 21);
            contentPane.add(l5);
            
            JLabel l14 = new JLabel("Developing platform,");
            l14.setForeground(new Color(255, 129, 93));
            l14.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 20));
            l14.setBounds(100, 340, 250, 34);
            contentPane.add(l14);
            
            JLabel l15 = new JLabel("IDE          : NetBeans IDE 8.2");
            l15.setForeground(Color.DARK_GRAY);
            l15.setFont(new Font("Trebuchet MS", Font.BOLD , 16));
            l15.setBounds(100, 380, 220, 25);
            contentPane.add(l15);
            
            JLabel l16 = new JLabel("Concept  : Java Swing");
            l16.setForeground(Color.DARK_GRAY);
            l16.setFont(new Font("Trebuchet MS", Font.BOLD , 16));
            l16.setBounds(100, 400, 200, 25);
            contentPane.add(l16);
            
            JLabel l17 = new JLabel("Database : MySQL (WampServer)");
            l17.setForeground(Color.DARK_GRAY);
            l17.setFont(new Font("Trebuchet MS", Font.BOLD , 16));
            l17.setBounds(100, 420, 250, 25);
            contentPane.add(l17);
                
                
            contentPane.setBackground(Color.WHITE);
	}
        

}


