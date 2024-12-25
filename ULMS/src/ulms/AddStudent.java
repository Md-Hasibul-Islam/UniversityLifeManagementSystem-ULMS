
package ulms;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;

public class AddStudent implements ActionListener{
    
    JFrame f;
    JLabel id,id1,id2,id3,id4,id5,id6,id7,id8,id9,id10,id11,id12,id15,id16,id17,lab,lab1,lab2;
    JTextField t,t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13;
    JButton b,b1,b2,b3;
    JComboBox c1,c2;
    
      
    Random ran = new Random();
    long first4 = (ran.nextLong() % 9000L) + 1000L;
    long first = Math.abs(first4);
    
    

    public AddStudent(){
        f = new JFrame("ULMS - Add Student");
        f.setBackground(Color.white);
        f.setLayout(null);

        id15=new JLabel();
        id15.setBounds(0,0,800,500);
        id15.setLayout(null);
        ImageIcon img = new ImageIcon(ClassLoader.getSystemResource("ulms/images/DetailForm.jpg"));
        Image i3 = img.getImage().getScaledInstance(800, 500,Image.SCALE_DEFAULT);
        ImageIcon icc3 = new ImageIcon(i3);
        id15.setIcon(icc3);

        id8 = new JLabel("New Student Details");
        id8.setBounds(225,10,500,50);
        id8.setFont(new Font("monospaced",Font.BOLD,30));
        id8.setForeground(Color.black);
        id15.add(id8);
        f.add(id15);

 
        id1 = new JLabel("Name");
        id1.setBounds(50,90,100,30);
        id1.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id1);

        t1=new JTextField();
        t1.setBounds(200,90,150,30);
        id15.add(t1);

        id2 = new JLabel("Father's Name");
        id2.setBounds(400,90,200,30);
        id2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id2);

        t2=new JTextField();
        t2.setBounds(600,90,150,30);
        id15.add(t2);

        id3= new JLabel("Age");
        id3.setBounds(50,140,100,30);
        id3.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id3);

        t3=new JTextField();
        t3.setBounds(200,140,150,30);
        id15.add(t3);

        id4= new JLabel("DOB (dd/mm/yyyy)");  
        id4.setBounds(400,140,200,30);
        id4.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id4);

        t4=new JTextField();
        t4.setBounds(600,140,150,30);
        id15.add(t4);

        id5= new JLabel("Address");
        id5.setBounds(50,190,100,30);
        id5.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id5);

        t5=new JTextField();
        t5.setBounds(200,190,150,30);
        id15.add(t5);

        id6= new JLabel("Mobile");
        id6.setBounds(400,190,100,30);
        id6.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id6);

        t6=new JTextField();
        t6.setBounds(600,190,150,30);
        id15.add(t6);

        id7= new JLabel("Email");
        id7.setBounds(50,240,100,30);
        id7.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id7);

        t7=new JTextField();
        t7.setBounds(200,240,150,30);
        id15.add(t7);

        id9= new JLabel("SSC(GPA)");
        id9.setBounds(400,240,130,30);
        id9.setFont(new Font("serif",Font.BOLD,20));    
        id15.add(id9);

        t8=new JTextField();
        t8.setBounds(600,240,150,30);
        id15.add(t8);

        id10= new JLabel("HSC(GPA)");
        id10.setBounds(50,290,130,30);
        id10.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id10);

        t9=new JTextField();
        t9.setBounds(200,290,150,30);
        id15.add(t9);


        id11= new JLabel("NID No");
        id11.setBounds(400,290,100,30);
        id11.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id11);

        t10=new JTextField();
        t10.setBounds(600,290,150,30);
        id15.add(t10);

        id12= new JLabel("Student ID");
        id12.setBounds(50,340,150,30);
        id12.setFont(new Font("serif",Font.BOLD,20));
        id15.add(id12);

        t11=new JTextField();   
        t11.setBounds(200,340,150,30);
        t11.setText("1533"+first);
        id15.add(t11);


        lab=new JLabel("Course");
        lab.setBounds(400,340,150,30);
	lab.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab);
            
        String course[] = {"BSc","BBA","BCom","BA","MSc","MBA","MA","MPhil","PhD"};
        c1 = new JComboBox(course);
        c1.setBackground(Color.WHITE);
        c1.setBounds(600,340,150,30);
        id15.add(c1);
        
        lab2=new JLabel("Department");
        lab2.setBounds(50,390,150,30);
	lab2.setFont(new Font("serif",Font.BOLD,20));
        id15.add(lab2);
        
        String branch[] = {"Architecture","Civil","CSE","EEE","Mechanical","IPE","Textile","Accounting","Management","Marketing","English","Bangla"};
        c2 = new JComboBox(branch);
        c2.setBackground(Color.WHITE);
        c2.setBounds(200,390,150,30);
        id15.add(c2);
        
        b = new JButton("Submit");
        b.setBackground(Color.BLACK);
        b.setForeground(Color.WHITE);
        b.setBounds(200,440,150,40);
        
        id15.add(b);

        b1=new JButton("Cancel");   
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(450,440,150,40);
        
        id15.add(b1);
        
        b.addActionListener(this);
        b1.addActionListener(this);
        
        f.setVisible(true);
        f.setSize(810,540);
        f.setLocation(250,100);
    }

    public void actionPerformed(ActionEvent ae){
        
        String a = t1.getText();
        String bb = t2.getText();
        String c = t3.getText();
        String d = t4.getText();
        String e = t5.getText();
        String ff = t6.getText();
        String g = t7.getText();
        String h = t8.getText();
        String i = t9.getText();
        String j = t10.getText();
        String k = t11.getText();
        String l = (String)c1.getSelectedItem();
        String m = (String)c2.getSelectedItem();
        
        if(ae.getSource() == b){
            try{
                Conn cc = new Conn();
                String q = "insert into student values('"+a+"','"+bb+"','"+c+"','"+d+"','"+e+"','"+ff+"','"+g+"','"+h+"','"+i+"','"+j+"','"+k+"','"+l+"','"+m+"')";
                cc.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Student Details Inserted Successfully.");
                f.setVisible(false);
            }catch(Exception ee){
                System.out.println("The error is : "+ee);
            }
        }else if(ae.getSource() == b1){
            f.setVisible(false);
            //new Home().setVisible(true);           
        }
    }
    public static void main(String[ ] args){
        new AddStudent().f.setVisible(true);
    }
}
