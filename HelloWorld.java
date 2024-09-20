import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        JFrame frame = new JFrame(Constantes.HELLO_WORLD_TITLE);
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel label = new JLabel(Constantes.HELLO_WORLD_TEXT, SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.GREEN); // Changement du fond en vert
        label.setForeground(Color.BLACK); // Ajout de cette ligne pour mettre le texte en bleu

        frame.add(label);
        frame.setVisible(true);
    }
}
