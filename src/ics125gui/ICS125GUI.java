package ics125gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author C0450740
 */
public class ICS125GUI {
    JPanel p;
    JFrame f;
    JButton b;
    JLabel l;
    JTextField text;//define 1
    JTextField text2;
    
    public ICS125GUI(){
        //ICS125GUI window = new ICS125GUI();
        f = new JFrame ("Basic Test!");
        p = new JPanel();
        
        text = new JTextField("123");//initialize 2
        text2 = new JTextField("123");
        
        b = new JButton("New Document", new ImageIcon("images/g.png"));
        b.setRolloverEnabled(true);
        b.setRolloverIcon(new ImageIcon ("images/r.png"));
        
        b.addActionListener(new ButtonListener());
        l = new JLabel("Hello World!");
        p.add(b);
        p.add(l);
        p.add(text);//add stuff 3
        p.add(text2);
        f.getContentPane().add(p);
        
        //quit Java after closing the window
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(200, 200);//set size in pixels
        f.setVisible(true);//show the window
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // TODO code application logic here
        //create the window
//        System.out.println(args[0]);
//        System.out.println(args[1]);
        ICS125GUI gui = new ICS125GUI(); 
    }
    
    class ButtonListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            
            String textf = text.getText();
            int i = Integer.parseInt(textf);
            String textf2 = text2.getText();
            int j = Integer.parseInt(textf2);
            l.setText("The sum is: " + (i+j));
        }
        
    }
    
}
