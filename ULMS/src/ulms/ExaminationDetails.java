
package ulms;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.sql.*;
import java.awt.event.*;
import net.proteanit.sql.DbUtils;

public class ExaminationDetails extends JFrame implements ActionListener{
    
    private JPanel contentPane;
    private JTable table;
    private JTextField search;
    private JButton b1,b2,b3;

   
    public void Book() {
        try {
            Conn con = new Conn();
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {}

    }

   public ExaminationDetails() {

        super("ULMS - Examination Details"); 
        setBounds(90, 125, 930, 475);
        contentPane = new JPanel();
        contentPane.setBackground(Color.WHITE);
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(55, 133, 1080, 282);
        contentPane.add(scrollPane);

        table = new JTable();
        table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
               int row = table.getSelectedRow();
               search.setText(table.getModel().getValueAt(row, 10).toString());
            }
        });
       
        table.setBackground(new Color(240, 248, 255));
        table.setForeground(Color.DARK_GRAY);
        table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
        scrollPane.setViewportView(table);

        b1 = new JButton("Result");
        b1.addActionListener(this);
        b1.setBorder(new LineBorder(new Color(255, 73, 33), 2, true));
        b1.setForeground(new Color(28, 60, 68));
        b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        b1.setBounds(750, 85, 140, 35);
        contentPane.add(b1);

       
        JLabel l1 = new JLabel("Check Result");
        l1.setForeground(new Color(11, 11, 11));
        l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 30));
        l1.setBounds(500, 5, 400, 50);
        contentPane.add(l1);

        JLabel l2 = new JLabel("Student ID", SwingConstants.CENTER);
        l2.setForeground(new Color(11, 11, 11));
        l2.setBorder(new LineBorder(new Color(255, 73, 33), 2, true));
        l2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l2.setBounds(330, 85, 101, 35);
        contentPane.add(l2);
        
        search = new JTextField();
        search.setBackground(new Color(245, 203, 173));
        search.setBorder(new LineBorder(new Color(255, 73, 33), 2, true));
        search.setForeground(new Color(47, 79, 79));
        search.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 17));
        search.setBounds(430, 85, 300, 35);
        contentPane.add(search);
        search.setColumns(10);

        JLabel l3 = new JLabel("Back", SwingConstants.CENTER);
        l3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
            }
        });
        l3.setForeground(Color.DARK_GRAY);
        l3.setBorder(new LineBorder(new Color(0, 128, 128), 2, true));
        l3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
        l3.setBounds(60, 89, 72, 33);
        contentPane.add(l3);

        JPanel panel = new JPanel();
        panel.setBorder(new TitledBorder(new LineBorder(new Color(0, 128, 128), 3, true), " Book Details ",
        TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 128, 0)));
        panel.setBounds(45, 55, 1100, 370);
        contentPane.add(panel);
        panel.setBackground(Color.WHITE);
        Book();
        setSize(1200,500);
    }
   
    public void actionPerformed(ActionEvent ae){
        try{
            Conn con = new Conn();
            if(ae.getSource() == b1){            
                new Marks(search.getText()).setVisible(true);
                this.setVisible(false);
            };
        }
        catch(Exception e){}
    }

    public static void main(String[] args){
        new ExaminationDetails().setVisible(true);
    }
}
