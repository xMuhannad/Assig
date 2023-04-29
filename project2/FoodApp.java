import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.*;

public class FoodApp extends JFrame{
    JLabel label = new JLabel("Your name:");
    JTextField tf1 = new JTextField(10);
    JLabel label2 = new JLabel("Phone Number:");
    JTextField tf2 = new JTextField(10);
    JButton b1 = new JButton("Next");
    JPanel panel = new JPanel();
    JPanel panel2 = new JPanel();
    JPanel panel3 = new JPanel();
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;
    JMenuBar menuBar;
    JMenuItem exitItem;
    JMenuItem supportItem;
    

    public FoodApp(){
        setSize(700,200);
        setTitle("login");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        
        panel.add(label);
        panel.add(tf1);
        panel2.add(label2);
        panel2.add(tf2);
        panel3.add(panel);
        panel3.add(panel2);
        panel3.setBorder(BorderFactory.createEtchedBorder());
        panel3.setBorder(BorderFactory.createTitledBorder("Welcome to DemoBurger"));
        
        label.setForeground(Color.RED);
        label2.setForeground(Color.RED);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label2.setFont(new Font("MV Boli",Font.PLAIN,20));
        
        menuBar = new JMenuBar();
        
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        helpMenu = new JMenu("Help");
        
        
        
        
        exitItem = new JMenuItem("Exit");
        supportItem = new JMenuItem("Call Muhannad / Daleel");
        
        
       
        
    
        
        
        fileMenu.add(exitItem);
        helpMenu.add(supportItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);
        this.setJMenuBar(menuBar);
        
        supportItem.addActionListener(new ActionListener(){
        @Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==supportItem) {
                    JOptionPane.showMessageDialog(null,   "Call Muhannad: 0566710234\nCall Daleel: 0500000000" );
                }else if(e.getSource()==exitItem) {
                    
		System.exit(0);

		}
        }
        });
        exitItem.addActionListener(new ActionListener(){
        @Override
	public void actionPerformed(ActionEvent e) {
		
		//if(e.getSource()==exitItem) {
                    
		//System.exit(0);

		}
        }
        });

        

        add(b1,BorderLayout.SOUTH);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  
                   
                    if(tf1.getText().length()<=0 || tf2.getText().length()<10)
                    {
                        JOptionPane.showMessageDialog(null,"Fill it correct please");
                    }else{
           
                   String b = tf1.getText();
                   String c = tf2.getText();
                    file v = new file(b);
                   file2 d = new file2(c);
           
                   
            
                    Menu a = new Menu();
                    dispose();
                    }
                    

            }
        });
        
        
        
        
        
        add(panel3,BorderLayout.CENTER);

        setVisible(true);
    }




}
