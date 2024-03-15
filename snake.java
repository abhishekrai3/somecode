import javax.swing.*;
public class snake extends JPanel{
    board Board;
    snake(){
        Board= new board();
        add(Board);
        pack();
        setResizable(false);
        setVisible(true);
    }
  
public static void main(String[] args){
     snake game= new snake();

   }
}