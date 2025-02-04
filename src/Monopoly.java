import javax.swing.SwingUtilities;

public class Monopoly {

    static int turn = 1;
    static Player p1 = new Player("p1");
    static Player p2 = new Player("p2");
    static Player p3 = new Player("p3");
    static Player p4 = new Player("p4");
    public static void main(String[] args) {

        Board b = new Board();

    
        Display.players.add(p1);
        
        Display.players.add(p2);
        
        Display.players.add(p3);

        Display.players.add(p4);

        //Graphics!
        SwingUtilities.invokeLater(() -> Display.setupFrame());
    }
}
