package Hospitalsystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;


/**
 *
 * @author bryle
 */



    
public class Login extends JFrame{
    JTextField t1, t2;
    JButton b1;
    JLabel l1, l2, l3, l4;
    
    Login(){
        setLayout(null);
        setResizable(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState( JFrame.MAXIMIZED_BOTH);
        
         getContentPane().setBackground(new Color(240, 247, 255));
        
        
          l1 = new JLabel("Login");
        l1.setFont(new Font("Rockwell", Font.BOLD, 25));
        l1.setForeground(Color.black);
        l1.setBounds(950, 10, 900, 30);
        add(l1);
        
        l2 = new JLabel("");
        l2.setBounds(890, 400, 300, 30);
        add(l2);
        
        l3 = new JLabel ("Username: ");
        l3.setBounds(647, 450, 200, 30);
        l3.setFont(new Font("Rockwell", Font.BOLD, 20));
        add(l3);
        
        l4 = new JLabel ("Password: ");
        l4.setBounds(650, 550, 200, 30);
        l4.setFont(new Font("Rockwell", Font.BOLD, 20));
        add(l4);
        
        t1 = new JTextField();
        t2 = new JPasswordField();
        b1 = new JButton("Login");
        
        
        t1.setBounds(755, 450, 500, 30);               
        t2.setBounds(755, 550, 500, 30);
        b1.setBounds(850, 680, 250, 30);
        
        
        add(t1);
        add(t2);
        add(b1);
        
        
       
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent ae){
               if(t1.getText().toString().equals("hospital")&& t2.getText().toString().equals("admin"))
               {                  
                   dispose();
                   Homepage H = new Homepage();
                   H.setVisible(true);
                                    
               }
                  else
                   l2.setText("Invalid Username or Password");
            }
        });
        
        
           }           
        }
    

