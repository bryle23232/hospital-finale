/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hospitalsystem;



import javax.swing.*;
import java.awt.*;

import java.awt.event.*;
import java.util.ArrayList;



/**
 *
 * @author bryle
 */

class Patient extends JFrame implements ActionListener{
    
    
  
    JTextField t3, t4, t5, t6, t7, t8, t9;
    JComboBox cb1;
    JTextField c3, c4, c5, c6, c7, c8, c9, c10, c11;
    JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    JButton btnConfirm, btnClear, btnBack;
    
                    
   
   

  Patient(){
    setResizable(true);
    setLayout(null);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setExtendedState( JFrame.MAXIMIZED_BOTH);
    
    getContentPane().setBackground(new Color(255, 204, 204));
    
    
                
    
  
    
    
     l1 = new JLabel("HOSPITAL MANGEMENT SYSTEM");
     l1.setBounds(850, 20, 300, 50);
     l1.setFont(new Font("Rockwell", Font.BOLD, 15));
     add(l1);
     
     t3 = new JTextField ();
     t3.setBounds(180, 130, 300, 30);
     add(t3);
             
             
     l2 = new JLabel("Patient ID:");
     l2.setBounds(20, 20, 200, 250);
     l2.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l2);
     
     
      l3 = new JLabel("Patient name:");
     l3.setBounds(20, 20, 200, 450);
     l3.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l3);
     
     t5 = new JTextField ();
     t5.setBounds(180, 230, 300, 30);
     add(t5);
     
     l4 = new JLabel("Contact No:");
     l4.setBounds(20, 20, 200, 650);
     l4.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l4);
     
      t6 = new JTextField ();
     t6.setBounds(180, 335, 300, 30);
     add(t6);
     
     l5 = new JLabel("Blood Group:");
     l5.setBounds(20, 20, 200, 850);
     l5.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l5);
     
     t7 = new JTextField ();
     t7.setBounds(180, 435, 300, 30);
     add(t7);
     
     
     l6 = new JLabel("Age:");
     l6.setBounds(20, 20, 200, 1050);
     l6.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l6);
     
     t8 = new JTextField ();
     t8.setBounds(180, 535, 300, 30);
     add(t8);
     
  
     l7 = new JLabel("Gender:");
     l7.setBounds(20, 20, 200, 1250);
     l7.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l7);
     
     t9 = new JTextField ();
     t9.setBounds(180, 735, 300, 30);
     add(t9);
     
     
     l8 = new JLabel("Address:");
     l8.setBounds(20, 20, 200, 1450);
     l8.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l8);
     
     c3 = new JTextField ();
     c3.setBounds(180, 835, 300, 30);
     add(c3);
     
     
     
      l8 = new JLabel("Date of Birth:");
     l8.setBounds(20, 20, 200, 1650);
     l8.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l8);
     
     c4 = new JTextField ();
     c4.setBounds(180, 930, 300, 30);
     add(c4);
   
     
     l8 = new JLabel("Blood Group:");
     l8.setBounds(20, 20, 200, 1850);
     l8.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l8);
     
       c5 = new JTextField ();
     c5.setBounds(1143, 130, 300, 30);
     add(c5);
     
     
     l1 = new JLabel("Name of Tablets:");
     l1.setBounds(950,20,200,250);
     l1.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l1);
     
     c6 = new JTextField ();
     c6.setBounds(1143, 225, 300, 30);
     add(c6);
     
     l2 = new JLabel("Dose(mg):");
     l2.setBounds(950,20,200,450);
     l2.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l2);
     
     c7 = new JTextField ();
     c7.setBounds(1143, 330, 300, 30);
     add(c7);
     
     l3 = new JLabel("Number of Tablets:");
     l3.setBounds(950,20,200,650);
     l3.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l3);
     
      c8 = new JTextField ();
     c8.setBounds(1143, 430, 300, 30);
     add(c8);
     
     l4 = new JLabel("Issued Date:");
     l4.setBounds(950,20,200,850);
     l4.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l4);
     
     c9 = new JTextField ();
     c9.setBounds(1143, 530, 300, 30);
     add(c9);
     
     l5 = new JLabel("Exp Date:");
     l5.setBounds(950,20,200,1050);
     l5.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l5);
     
     c10 = new JTextField ();
     c10.setBounds(1143, 630, 300, 30);
     add(c10);
     
     l6 = new JLabel("Daily Dose:");
     l6.setBounds(950,20,200,1250);
     l6.setFont(new Font("Rockwell", Font.BOLD, 20));
     add(l6);
     
     btnConfirm = new JButton ("Confirm");
     btnConfirm.setVisible(true);
     btnConfirm.setBounds(1000, 965, 250, 30);
     add(btnConfirm);
     
     btnClear = new JButton ("Clear");
     btnClear.setVisible(true);
     btnClear.setBounds(1275, 965, 250, 30);
      btnClear.addActionListener(this);
     add(btnClear);
     
     btnBack = new JButton("Back to Homepage");
        btnBack.setVisible(true);
        btnBack.setBounds(1550, 965, 255, 30);
        btnBack.addActionListener(this);
        add(btnBack);
     
     
     
     String[] Gender = {"Male","Female","None"};
     cb1 = new JComboBox(Gender); 
     cb1.setBounds(180, 635, 300, 30);
     add(cb1);
     
      
     
  
    
  

  }

  
    public void actionPerformed(ActionEvent ae) {
       if(ae.getSource()==btnClear){
           
   
        t3.setText("");
        t5.setText("");
        t6.setText("");
        t7.setText("");
        t8.setText("");
        t9.setText("");
        c3.setText("");
        c4.setText("");
        c5.setText("");
        c6.setText("");
        c7.setText("");
        c8.setText("");
        c9.setText("");
        c10.setText("");
        c11.setText("");
        
        cb1.setSelectedIndex(0);
        
        t3.requestFocus();
        
        }
    
    
     else if (ae.getSource() == btnClear) {
            // ... (Previous code for the actionPerformed method)

        } else if (ae.getSource() == btnConfirm) {
            // ... (Previous code for the actionPerformed method)

        } else if (ae.getSource() == btnBack) {
            dispose();
            Homepage homepage = new Homepage();
            homepage.setVisible(true);
        }
    }
}