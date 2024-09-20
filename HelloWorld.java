import javax.swing.*;
import java.awt.*;

public class HelloWorld {
    public static void main(String[] args) {
        // Utilisation des constantes depuis la classe Constantes
        JFrame frame = new JFrame(Constantes.HELLO_WORLD_TITLE);
        frame.setSize(200, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création du label
        JLabel label = new JLabel(Constantes.HELLO_WORLD_TEXT, SwingConstants.CENTER);
        label.setOpaque(true);
        label.setBackground(Color.YELLOW);

        // Ajout du label à la fenêtre
        frame.add(label);

        // Affichage de la fenêtre
        frame.setVisible(true);
    }
}
