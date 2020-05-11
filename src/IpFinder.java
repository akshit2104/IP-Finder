/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author admin
 */
import javax.swing.*;
import java.awt.event.*;
import java.net.*;
public class IpFinder extends JFrame implements ActionListener {
    JLabel l;
    JTextField tf;
    JButton b;
    IpFinder(){
    super("Ip finder in this section");
    l=new JLabel("Enter Address/URL");
    l.setBounds(50,70,150,20);
    tf= new JTextField();
    tf.setBounds(50,100,200,20);
    b= new JButton("Find Your IP");
    b.setBounds(50,150,100,20);
    b.addActionListener(this);
    add(l);
    add(tf);
    add(b);
    setSize(400,400);
    setLayout(null);
    setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
    String url= tf.getText();
    try{
        InetAddress ia= InetAddress.getByName(url);
        String ip= ia.getHostAddress();
        JOptionPane.showMessageDialog(this, ip);
    }
    catch(UnknownHostException e1){
    JOptionPane.showMessageDialog(this, e1.toString());
    }
    }
public static void main(String a[]){
new IpFinder();
}
}

