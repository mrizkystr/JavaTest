import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Buat frame utama
        JFrame frame = new JFrame("Lirik Lagu Hisatsu Teleport - JKT48");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        
        // Buat panel dengan latar belakang gambar
        BackgroundPanel panel = new BackgroundPanel();
        panel.setLayout(new BorderLayout());

        // Buat area teks untuk menampilkan lirik
        JTextArea textArea = new JTextArea();
        textArea.setText(
            "Di tepi jalan sepi yang penuh dengan sampah\n" +
            "Seorang gadis berdiri di sana\n" +
            "Dari telapak tangan yang kecil itu\n" +
            "Seakan menunggu sesuatu\n\n" +
            "Papan penunjuk jalan dan lampu lalu lintas\n" +
            "Semua tak ada yang berfungsi\n" +
            "Yang hanya berjalan itu\n" +
            "Seekor kucing yang kurus\n\n" +
            "Masa depan kita bagai apa?\n" +
            "Mungkin sudah tahu\n" +
            "Televisi di ruangan gelap\n" +
            "Hanya menyiarkan berita hoax\n\n" +
            "Hitotsu, futatsu...\n" +
            "Air mata yang jatuh\n" +
            "Hitotsu, futatsu...\n" +
            "Bercermin pada kubangan air\n" +
            "Lalu gadis itu\n" +
            "Menghilang entah ke mana\n" +
            "Teleport!\n\n" +
            "Di tepi jalan sepi yang penuh dengan sampah\n" +
            "Seorang gadis berdiri di sana\n" +
            "Dari telapak tangan yang kecil itu\n" +
            "Seakan menunggu sesuatu\n\n" +
            "Papan penunjuk jalan dan lampu lalu lintas\n" +
            "Semua tak ada yang berfungsi\n" +
            "Yang hanya berjalan itu\n" +
            "Seekor kucing yang kurus\n\n" +
            "Masa depan kita bagai apa?\n" +
            "Mungkin sudah tahu\n" +
            "Televisi di ruangan gelap\n" +
            "Hanya menyiarkan berita hoax\n\n" +
            "Hitotsu, futatsu...\n" +
            "Air mata yang jatuh\n" +
            "Hitotsu, futatsu...\n" +
            "Bercermin pada kubangan air\n" +
            "Lalu gadis itu\n" +
            "Menghilang entah ke mana\n" +
            "Teleport!"
        );
        textArea.setOpaque(false);
        textArea.setForeground(Color.WHITE);
        textArea.setFont(new Font("Serif", Font.BOLD, 20));
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        // Tambahkan area teks ke panel
        JScrollPane scrollPane = new JScrollPane(textArea);
        scrollPane.setOpaque(false);
        scrollPane.getViewport().setOpaque(false);
        panel.add(scrollPane, BorderLayout.CENTER);

        // Tambahkan panel ke frame
        frame.add(panel);
        frame.setVisible(true);
    }
}

class BackgroundPanel extends JPanel {
    private ImageIcon backgroundImage;

    public BackgroundPanel() {
        try {
            // Muat gambar latar belakang
            backgroundImage = new ImageIcon("space_background.gif");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (backgroundImage != null) {
            // Gambar latar belakang
            g.drawImage(backgroundImage.getImage(), 0, 0, getWidth(), getHeight(), this);
        }
    }
}
