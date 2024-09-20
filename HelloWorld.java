import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame(Constantes.HELLO_WORLD_TITLE);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(Constantes.HELLO_WORLD_TEXT, SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.YELLOW);

        frame.add(label);
        frame.setVisible(true);
    }
}
