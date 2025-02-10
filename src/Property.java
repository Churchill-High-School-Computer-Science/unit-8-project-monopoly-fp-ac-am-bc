
import java.awt.Color;

public class Property {
    
    private Color c;
    private String name;
    private int cost;
    private int rent;
    private boolean ownable;
    private Player owner = null;

    // make constructior
    public Property(Color c, String n, int chaching, int r, boolean own){
    this.c = c;
    this.name = n;
    this.cost = chaching;
    this.rent = r;
    this.ownable = own;

    }

    //TODO fix
    public Color getColor(){
        return c;
    }

    //TODO fix
    public String getName(){
        return name;
    }

    //TODO fix
    public int getNumHouses(){
        return 0;
    }

    //TODO fix
    public Player getOwner(){
        return owner;
    }

    //TODO fix
    public int getRent(){
        return rent;
    }

    public int getCost(){
        return cost;
    }

    public boolean getOwnable(){
        return ownable;
    }

    public void setOwnable(boolean x){
        ownable = x;
    }

    public void setOwner(Player p){
        owner = p;
    }
}
