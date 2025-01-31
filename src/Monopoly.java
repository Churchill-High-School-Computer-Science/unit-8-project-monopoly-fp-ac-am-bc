import javax.swing.SwingUtilities;

public class Monopoly {
    public static void main(String[] args) {

        Board b = new Board();

        Player p1 = new Player("p1");
        Display.players.add(p1);

        Player p2 = new Player("p2");
        Display.players.add(p2);

        Player p3 = new Player("p3");
        Display.players.add(p3);

        Player p4 = new Player("p4");
        Display.players.add(p4);

        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
    }
}
