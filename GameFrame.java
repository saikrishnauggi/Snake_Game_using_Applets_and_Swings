import javax.swing.JFrame;

public class GameFrame extends JFrame {
    GameFrame() {
        this.add(new GamePanel());
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        new GameFrame();
    }
}
//             g.setFont(new Font("Ink Free", Font.BOLD, 40));
//             g.drawString("Score: " + applesEaten, 10, 30);
//         } else {
//             gameOver(g); 