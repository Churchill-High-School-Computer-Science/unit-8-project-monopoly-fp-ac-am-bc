
import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Player {

    
    int Money;
    String player;
    ArrayList<Property> ownedproperties = new ArrayList<Property>();
    int location = 0;

    // make constructior
    public Player(String p){
    this.player = p;
    Money = 1500; 

    }
    
    
    public String getName(){
        return player;
    }

    
    public int getMoney(){
        return Money;
    }

    
    public ArrayList<Property> getProperties(){
        return ownedproperties;
    }

    public int getLocation(){
        return location;
    }
}
