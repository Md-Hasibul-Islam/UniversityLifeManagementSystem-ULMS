
package ulms;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;

public class Login extends JFrame implements ActionListener{

    JFrame f;
    JLabel l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;

    Login(){

        super("ULMS - Login");

        setBackground(Color.white);
        setLayout(null);

        l1 = new JLabel("Username");
        l1.setBounds(70,50,130,30);
        add(l1);
        
        l2 = new JLabel("Password");
        l2.setBounds(70,100,130,30);
        add(l2);
 
        t1=new JTextField();
        t1.setBounds(180,50,180,30);
        add(t1);

        t2=new JPasswordField();
        t2.setBounds(180,100,180,30);
        add(t2);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("ulms/images/Login.jpg"));
        Image i2 = i1.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon i3 =  new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(390,40,150,150);
        add(l3);


        b1 = new JButton("Login");
        b1.setBounds(85,170,120,30);
        b1.setFont(new Font("serif",Font.BOLD,15));
        b1.addActionListener(this);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        add(b1);

        b2=new JButton("Cancel");
        b2.setBounds(230,170,120,30);
        b2.setFont(new Font("serif",Font.BOLD,15));
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        add(b2);

        b2.addActionListener(this);
        
        getContentPane().setBackground(Color.WHITE);

        setVisible(true);
        setSize(600,300);
        setLocation(360,250);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1)
        {
            try{
                Conn c1 = new Conn();
                String u = t1.getText();
                String v = t2.getText();
            
                String q = "select * from login where username='"+u+"' and password='"+v+"'";
            
                ResultSet rs = c1.s.executeQuery(q); 
                if(rs.next()){
                    new Home().setVisible(true);
                    setVisible(false);
                }else{
                    JOptionPane.showMessageDialog(null, "Invalid Login.");
                    setVisible(false);
                }
            }catch(Exception e){
                e.printStackTrace();
            }
        }else if(ae.getSource() == b2){
            System.exit(0);           
        }
    }

    public static void main(String[] args){
        Login l = new Login();
    }   
}
