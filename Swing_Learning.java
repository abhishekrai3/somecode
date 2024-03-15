import javax.swing.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Swing_Learning implements ActionListener{
 static JFrame window;
 static JFrame screen;
 static JButton but;
 static JButton butt;
     Swing_Learning() {
        window =new JFrame( "new");
        window.setLayout(null);
        window.setVisible(true);
        window.setSize(600, 600);
        window.setLocation(600,600);
        but = new JButton("click");
        but.setSize(100, 50);
        but.addActionListener(this);
        window.add(but);
        
        // screen = new JFrame("next");
        // screen.setVisible(true);

     }
     void fun(){}
     public static void main(String[] args){
     Swing_Learning obj= new Swing_Learning();
     obj.fun();
     }

    @Override
    public void actionPerformed(ActionEvent e) {
        String s= e.getActionCommand();
        if(s.equals("click")){
           window.getContentPane().setBackground(Color.blue);
        }
    }
}