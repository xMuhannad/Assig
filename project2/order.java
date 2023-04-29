import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class order extends JFrame {
    JPanel panel = new JPanel();
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel10 = new JPanel();
    JPanel panel11 = new JPanel();
    JPanel panel12 = new JPanel();
    Random rand = new Random();
    int x = rand.nextInt(9999);
    file4 bb = new file4(x);
    JButton B = new JButton("NEXT");
    JButton B1 = new JButton("BACK");
     JLabel lable = new JLabel("                                                order number :" + bb + "                          ");
    JLabel lable2 = new JLabel("order name :");
    JLabel lable3 = new JLabel("quantity");
    JLabel lable4 = new JLabel("        food");
    JLabel lable5 = new JLabel("                                                   TOTAL PRICE");
    JLabel lable6 = new JLabel("0");
    JLabel lable7 = new JLabel("0");
    JLabel lable9 = new JLabel(" 0");
    JLabel lable10 = new JLabel("0");
    JLabel lable12 = new JLabel("Beef Burger");
    JLabel lable13 = new JLabel("       Chicken Burger");
    JLabel lable15 = new JLabel("French Fries");
    JLabel lable16 = new JLabel("           Drinks");
    JLabel lable17 = new JLabel("                                    price           ");
    file yy = new file();
    JLabel lable19 = new JLabel(yy.toString());
    JLabel lable20 = new JLabel("                  ");
    JLabel lable21 = new JLabel("                      20                      ");
    JLabel lable22 = new JLabel("              18                      ");
    JLabel lable24 = new JLabel("                      7                        ");
    JLabel lable25 = new JLabel("                              3                       ");
    JLabel lable29 = new JLabel("   0                                                  ");
    JLabel lable30 = new JLabel("                                                  ");

    public order() {
        setSize(400, 500);
        setTitle("order");
        setDefaultCloseOperation(3);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout(FlowLayout.CENTER));
        panel.add(lable20);
        add(panel);
        panel1.add(lable2);
        panel1.add(lable19);
        add(panel1);
        add(panel2);
        panel3.add(lable4);
        panel3.add(lable17);
        panel3.add(lable3);
        add(panel3);
        panel4.add(lable12);
        panel4.add(lable21);
        panel4.add(lable6);
        add(panel4);
        panel5.add(lable13);
        panel5.add(lable22);
        panel5.add(lable7);
        add(panel5);
   
        add(panel6);
        panel7.add(lable15);
        panel7.add(lable24);
        panel7.add(lable9);
        add(panel7);
        panel8.add(lable16);
        panel8.add(lable25);
        panel8.add(lable10);
        add(panel8);
        add(panel9);
        add(panel10);
        panel11.add(lable5);
        panel11.add(lable30);
        panel11.add(lable29);
        add(panel11);
        panel12.add(B1);
        panel12.add(B);
        add(panel12);
        B.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                JOptionPane.showMessageDialog(null,        "Thank your for ordering , Now give the casheir your name" );
                file a = new file();
                file2 b = new file2();
                file4 D = new file4();
                JOptionPane.showMessageDialog(null,        a.toString() + "          "  + b.toString()  +"          " + D.toString() );
                
                dispose();
            }
        });
        B1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu a = new Menu();
                dispose();
            }
        });


        setVisible(true);
    }
    public void cost (int a, int b, int d, int e){
        lable6.setText(a+"");
        lable7.setText(b+"");
        lable9.setText(d+"");
        lable10.setText(e+"");


        int cost = a*20 + b*18 + d*7 + 3 * e;
        lable29.setText("   "+cost+"                                                  ");
    }

}