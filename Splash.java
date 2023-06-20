package electricity_billing_system;

import java.awt.*;
import javax.swing.*;

public class Splash extends JFrame {
    Splash(){
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon1/Splash.jpg"));
        Image i2 = i1.getImage().getScaledInstance(600, 400,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel imageLabel = new JLabel(i3);
        add(imageLabel);
        
        setSize(600,400);
        setLocation(500,200);
        setVisible(true);
        
        try{
            Thread.sleep(3000);
            setVisible(false);
            
            new Login();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    
    
    public static void main(String[] args){
        new Splash();
    }

   
}
