
package ulms;

import javax.swing.*;
import java.awt.*;

public class FeeStructure extends JFrame{
    
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
    JLabel i1;
    JLabel b1,b2,b3,b4,b5,b6,b7,b8;
    JLabel bb1,bb2,bb3,bb4,bb5,bb6,bb7,bb8,bb9,bb10,bb11,bb12,bb13,bb14,bb15,bb16;
    JLabel ba1,ba2,ba3,ba4,ba5,ba6,ba7,ba8;
    JLabel m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12;
    
    public FeeStructure(){
        
        super("ULMS - Fee Structure");
        setSize(1200,700);
        setLocation(90,15);
        setLayout(null);
        
        i1 = new JLabel("Fee Structure");
        i1.setFont(new Font("serif",Font.BOLD | Font.ITALIC,56));
        i1.setBounds(450,0,400,70);
        add(i1);
        
        l1 = new JLabel("Course");
        l1.setBounds(100,100,100,40);
        l1.setFont(new Font("serif",Font.BOLD,16));
        add(l1);
        
        l10 = new JLabel("Semester 1");
        l10.setBounds(100,150,150,40);
        l10.setFont(new Font("serif",Font.BOLD,16));
        add(l10);
        
        l11 = new JLabel("Semester 2");
        l11.setBounds(100,200,150,40);
        l11.setFont(new Font("serif",Font.BOLD,16));
        add(l11);
        
        l12 = new JLabel("Semester 3");
        l12.setBounds(100,250,150,40);
        l12.setFont(new Font("serif",Font.BOLD,16));
        add(l12);
        
        l13 = new JLabel("Semester 4");
        l13.setBounds(100,300,150,40);
        l13.setFont(new Font("serif",Font.BOLD,16));
        add(l13);
        
        l14 = new JLabel("Semester 5");
        l14.setBounds(100,350,150,40);
        l14.setFont(new Font("serif",Font.BOLD,16));
        add(l14);
        
        l15 = new JLabel("Semester 6");
        l15.setBounds(100,400,150,40);
        l15.setFont(new Font("serif",Font.BOLD,16));
        add(l15);
        
        l16 = new JLabel("Semester 7");
        l16.setBounds(100,450,150,40);
        l16.setFont(new Font("serif",Font.BOLD,16));
        add(l16);
        
        l17 = new JLabel("Semester 8");
        l17.setBounds(100,500,150,40);
        l17.setFont(new Font("serif",Font.BOLD,16));
        add(l17);
        
        l2 = new JLabel("BSc");
        l2.setBounds(225,100,100,40);
        l2.setFont(new Font("serif",Font.BOLD,16));
        add(l2);
        
        b1 = new JLabel("42000/-");
        b1.setBounds(225,150,100,40);
        b1.setFont(new Font("serif",Font.PLAIN,16));
        add(b1);
        
        b2 = new JLabel("42000/-");
        b2.setBounds(225,200,100,40);
        b2.setFont(new Font("serif",Font.PLAIN,16));
        add(b2);
        
        b3 = new JLabel("42000/-");
        b3.setBounds(225,250,100,40);
        b3.setFont(new Font("serif",Font.PLAIN,16));
        add(b3);
        
        b4 = new JLabel("42000/-");
        b4.setBounds(225,300,100,40);
        b4.setFont(new Font("serif",Font.PLAIN,16));
        add(b4);
        
        b5 = new JLabel("42000/-");
        b5.setBounds(225,350,100,40);
        b5.setFont(new Font("serif",Font.PLAIN,16));
        add(b5);
        
        b6 = new JLabel("42000/-");
        b6.setBounds(225,400,100,40);
        b6.setFont(new Font("serif",Font.PLAIN,16));
        add(b6);
        
        b7 = new JLabel("42000/-");
        b7.setBounds(225,450,100,40);
        b7.setFont(new Font("serif",Font.PLAIN,16));
        add(b7);
        
        b8 = new JLabel("42000/-");
        b8.setBounds(225,500,100,40);
        b8.setFont(new Font("serif",Font.PLAIN,16));
        add(b8);
        
        l3 = new JLabel("BBA");
        l3.setBounds(350,100,100,40);
        l3.setFont(new Font("serif",Font.BOLD,16));
        add(l3);
        
        bb1 = new JLabel("32000/-");
        bb1.setBounds(350,150,100,40);
        bb1.setFont(new Font("serif",Font.PLAIN,16));
        add(bb1);
        
        bb2 = new JLabel("32000/-");
        bb2.setBounds(350,200,100,40);
        bb2.setFont(new Font("serif",Font.PLAIN,16));
        add(bb2);
        
        bb3 = new JLabel("32000/-");
        bb3.setBounds(350,250,100,40);
        bb3.setFont(new Font("serif",Font.PLAIN,16));
        add(bb3);
        
        bb4 = new JLabel("32000/-");
        bb4.setBounds(350,300,100,40);
        bb4.setFont(new Font("serif",Font.PLAIN,16));
        add(bb4);
        
        bb5 = new JLabel("32000/-");
        bb5.setBounds(350,350,100,40);
        bb5.setFont(new Font("serif",Font.PLAIN,16));
        add(bb5);
        
        bb6 = new JLabel("32000/-");
        bb6.setBounds(350,400,100,40);
        bb6.setFont(new Font("serif",Font.PLAIN,16));
        add(bb6);
        
        bb7 = new JLabel("32000/-");
        bb7.setBounds(350,450,100,40);
        bb7.setFont(new Font("serif",Font.PLAIN,16));
        add(bb7);
        
        bb8 = new JLabel("32000/-");
        bb8.setBounds(350,500,100,40);
        bb8.setFont(new Font("serif",Font.PLAIN,16));
        add(bb8);
        
        l4 = new JLabel("BCom");
        l4.setBounds(475,100,100,40);
        l4.setFont(new Font("serif",Font.BOLD,16));
        add(l4);
        
        bb9 = new JLabel("32000/-");
        bb9.setBounds(475,150,100,40);
        bb9.setFont(new Font("serif",Font.PLAIN,16));
        add(bb9);
        
        bb10 = new JLabel("32000/-");
        bb10.setBounds(475,200,100,40);
        bb10.setFont(new Font("serif",Font.PLAIN,16));
        add(bb10);
        
        bb11 = new JLabel("32000/-");
        bb11.setBounds(475,250,100,40);
        bb11.setFont(new Font("serif",Font.PLAIN,16));
        add(bb11);
        
        bb12 = new JLabel("32000/-");
        bb12.setBounds(475,300,100,40);
        bb12.setFont(new Font("serif",Font.PLAIN,16));
        add(bb12);
        
        bb13 = new JLabel("32000/-");
        bb13.setBounds(475,350,100,40);
        bb13.setFont(new Font("serif",Font.PLAIN,16));
        add(bb13);
        
        bb14 = new JLabel("32000/-");
        bb14.setBounds(475,400,100,40);
        bb14.setFont(new Font("serif",Font.PLAIN,16));
        add(bb14);
        
        bb15 = new JLabel("32000/-");
        bb15.setBounds(475,450,100,40);
        bb15.setFont(new Font("serif",Font.PLAIN,16));
        add(bb15);
        
        bb16 = new JLabel("32000/-");
        bb16.setBounds(475,500,100,40);
        bb16.setFont(new Font("serif",Font.PLAIN,16));
        add(bb16);        
                        
        l5 = new JLabel("BA");
        l5.setBounds(600,100,100,40);
        l5.setFont(new Font("serif",Font.BOLD,16));
        add(l5);
        
        ba1 = new JLabel("25000/-");
        ba1.setBounds(600,150,100,40);
        ba1.setFont(new Font("serif",Font.PLAIN,16));
        add(ba1);
        
        ba2 = new JLabel("25000/-");
        ba2.setBounds(600,200,100,40);
        ba2.setFont(new Font("serif",Font.PLAIN,16));
        add(ba2);
        
        ba3 = new JLabel("25000/-");
        ba3.setBounds(600,250,100,40);
        ba3.setFont(new Font("serif",Font.PLAIN,16));
        add(ba3);
        
        ba4 = new JLabel("25000/-");
        ba4.setBounds(600,300,100,40);
        ba4.setFont(new Font("serif",Font.PLAIN,16));
        add(ba4);
        
        ba5 = new JLabel("25000/-");
        ba5.setBounds(600,350,100,40);
        ba5.setFont(new Font("serif",Font.PLAIN,16));
        add(ba5);
        
        ba6 = new JLabel("25000/-");
        ba6.setBounds(600,400,100,40);
        ba6.setFont(new Font("serif",Font.PLAIN,16));
        add(ba6);
        
        ba7 = new JLabel("25000/-");
        ba7.setBounds(600,450,100,40);
        ba7.setFont(new Font("serif",Font.PLAIN,16));
        add(ba7);
        
        ba8 = new JLabel("25000/-");
        ba8.setBounds(600,500,100,40);
        ba8.setFont(new Font("serif",Font.PLAIN,16));
        add(ba8);

        l6 = new JLabel("MSc");
        l6.setBounds(725,100,100,40);
        l6.setFont(new Font("serif",Font.BOLD,16));
        add(l6);
        
        m1 = new JLabel("65000/-");
        m1.setBounds(725,150,150,40);
        m1.setFont(new Font("serif",Font.PLAIN,16));
        add(m1);
        
        m2 = new JLabel("65000/-");
        m2.setBounds(725,200,150,40);
        m2.setFont(new Font("serif",Font.PLAIN,16));
        add(m2);
        
        m3 = new JLabel("65000/-");
        m3.setBounds(725,250,150,40);
        m3.setFont(new Font("serif",Font.PLAIN,16));
        add(m3);        
                
        l7 = new JLabel("MBA");
        l7.setBounds(850,100,100,40);
        l7.setFont(new Font("serif",Font.BOLD,16));
        add(l7);
        
        m4 = new JLabel("55000/-");
        m4.setBounds(850,150,150,40);
        m4.setFont(new Font("serif",Font.PLAIN,16));
        add(m4);

        m5 = new JLabel("55000/-");
        m5.setBounds(850,200,150,40);
        m5.setFont(new Font("serif",Font.PLAIN,16));
        add(m5);
        
        m6 = new JLabel("55000/-");
        m6.setBounds(850,250,150,40);
        m6.setFont(new Font("serif",Font.PLAIN,16));
        add(m6);                
        
        l8 = new JLabel("MA");
        l8.setBounds(975,100,100,40);
        l8.setFont(new Font("serif",Font.BOLD,16));
        add(l8);
        
        m7 = new JLabel("45000/-");
        m7.setBounds(975,150,150,40);
        m7.setFont(new Font("serif",Font.PLAIN,16));
        add(m7);
        
        m8 = new JLabel("45000/-");
        m8.setBounds(975,200,150,40);
        m8.setFont(new Font("serif",Font.PLAIN,16));
        add(m8);                                              
                        
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new FeeStructure().setVisible(true);
    }
}
