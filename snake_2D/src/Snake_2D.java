import javax.swing.*;

public class Snake_2D extends JFrame {
    Board board;
    Snake_2D(){
        board=new Board();
        add(board);
        pack();
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }
    public static void main(String[] args) {
        Snake_2D snakeGame =new Snake_2D();

    }
}