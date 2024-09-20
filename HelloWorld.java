import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {
    public static void main(String[] args) {
        // Création de la fenêtre
        JFrame frame = new JFrame(Constantes.HELLO_WORLD_TITLE);

        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Création du panneau pour contenir les labels
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // Label "HelloWorld"
        JLabel helloLabel = new JLabel(Constantes.HELLO_WORLD_TEXT, SwingConstants.CENTER);
        helloLabel.setOpaque(true);
        helloLabel.setBackground(Color.CYAN); // Changement du fond en cyan
        helloLabel.setForeground(Color.WHITE); // Texte en blanc

        // Création du label pour la date actuelle
        String currentDate = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        JLabel dateLabel = new JLabel(" Date : " + currentDate, SwingConstants.CENTER);
        dateLabel.setOpaque(true);
        dateLabel.setBackground(Color.YELLOW); // Fond jaune pour la date
        dateLabel.setForeground(Color.BLACK); // Texte noir pour la date

        // Ajouter les deux labels au panneau
        panel.add(helloLabel, BorderLayout.NORTH); // "HelloWorld" en haut
        panel.add(dateLabel, BorderLayout.SOUTH);  // Date en bas

        // Ajouter le panneau à la fenêtre
        frame.add(panel);
        frame.setVisible(true);
    }
}
