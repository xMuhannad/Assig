
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Menu extends JFrame{
    int beef,Chicken,Fries,Drink;
    JLabel label1= new JLabel("      Beef Burger");
    JLabel label2= new JLabel("Chicken Burger");
    JLabel label4= new JLabel("       French Fries");
    JLabel label5= new JLabel("      Drinks");
    JLabel label11= new JLabel("               ");
    JLabel label22= new JLabel("                ");
    JLabel label33= new JLabel("                ");
    JLabel label44= new JLabel("                ");
    JLabel label55= new JLabel("                ");
    JLabel label8= new JLabel("*****************************************");
    JLabel label= new JLabel("Choose what u want");
    JTextField tf1 = new JTextField(3);
    JTextField tf2 = new JTextField(3);
    JTextField tf4 = new JTextField(3);
    JTextField tf5 = new JTextField(3);
    JPanel panel1 = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JPanel panel4 = new JPanel();
    JPanel panel5 = new JPanel();
    JPanel panel6 = new JPanel();
    JPanel panel7 = new JPanel();
    JPanel panel8 = new JPanel();
    JPanel panel9 = new JPanel();
    JPanel panel = new JPanel();
    JButton b1 = new JButton("+");
    JButton b2 = new JButton("-");
    JButton b3 = new JButton("+");
    JButton b4 = new JButton("-");
    JButton b7 = new JButton("+");
    JButton b8 = new JButton("-");
    JButton b9 = new JButton("+");
    JButton b10 = new JButton("-");
    JButton b13 = new JButton("Next");
    JButton b14 = new JButton("Back");
    String size1 []= {"-","Regular","Spicy"};
    String size3 []= {"-","Cola","Fanta","Mountain Dew","Diet Cola","Water"};
    JComboBox Size1 = new JComboBox(size1);
    JComboBox Size2 = new JComboBox(size1);
    JComboBox Size4 = new JComboBox(size1);
    JComboBox Size5 = new JComboBox(size3);


    public Menu(){
        setSize(400,500);
        setTitle("Menu");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout(FlowLayout.CENTER));
        tf1.setText("0");
        tf2.setText("0");
        tf4.setText("0");
        tf5.setText("0");
        tf1.setEnabled(false);
        tf2.setEnabled(false);
        tf4.setEnabled(false);
        tf5.setEnabled(false);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String i;

                i=tf1.getText();

                int co=Integer.parseInt(i);

                co++;

                tf1.setText(String.valueOf(co));
                beef=co;
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText("0");
                beef= 0;
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String i;

                i=tf2.getText();

                int co=Integer.parseInt(i);

                co++;

                tf2.setText(String.valueOf(co));
                Chicken=co;
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf2.setText("0");
                Chicken=0;
            }
        });
        
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String i;

                i=tf4.getText();

                int co=Integer.parseInt(i);

                co++;

                tf4.setText(String.valueOf(co)
                );
                Fries=co;
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf4.setText("0");
                Fries=0;
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String i;

                i=tf5.getText();

                int co=Integer.parseInt(i);

                co++;

                tf5.setText(String.valueOf(co)
                );
                Drink=co;
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf5.setText("0");
                Drink=0;
            }
        });
       

        panel.add(label);
        panel9.add(label8);

        panel1.add(label1);
        panel1.add(Size1);
        panel1.add(tf1);
        panel1.add(b1);
        panel1.add(b2);
        panel2.add(label2);
        panel2.add(Size2);
        panel2.add(tf2);
        panel2.add(b3);
        panel2.add(b4);
        panel4.add(label4);
        panel4.add(Size4);
        panel4.add(tf4);
        panel4.add(b7);
        panel4.add(b8);
        panel5.add(label5);
        panel5.add(Size5);
        panel5.add(tf5);
        panel5.add(b9);
        panel5.add(b10);
        add(panel);
        add(panel9);
        add(panel1);
        add(panel2);
        add(panel3);
        add(panel4);
        add(panel5);
        add(panel6);
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                order a = new order();
                a.cost(beef,Chicken,Fries,Drink);
                dispose();
            }
        });
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FoodApp a = new FoodApp();
                dispose();
            }
        });
        panel7.add(b14);
        panel7.add(b13);
        add(panel8);
        add(panel7);






        setLocationRelativeTo(null);
        setVisible(true);

    }


}



