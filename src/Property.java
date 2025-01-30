
import java.awt.Color;

public class Property {
    
    Color c;
    String name;
    int cost;
    int rent;

    // make constructior
    public Property(Color c, String n, int chaching, int r){
    this.c = c;
    this.name = n;
    this.cost = chaching;
    this.rent = r;

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
    public String getOwner(){
        return "no one";
    }

    //TODO fix
    public int getRent(){
        return 20;
    }
}
