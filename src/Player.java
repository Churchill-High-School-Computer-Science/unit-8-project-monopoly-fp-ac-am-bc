
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

    public int rollDice(){
        int dice1=(int)(Math.random()*6+1);
        int dice2=(int)(Math.random()*6+1);
        int diceSum = dice1 + dice2;
        return diceSum;
    }

    public void playerMove(){
        location = rollDice() + location;
        location = location % 40;
       Display.frame.repaint();
        Display.boardPanel.repaint();
        
        Property tempprop = Board.propertiesMap.get(location);
       if(tempprop.ownable == true && tempprop.owner == null){
        int choice = Display.choice("Purchase", "do you want to buy?", new String[]{"yes", "no"});
        if(choice == 0 && Money >= tempprop.cost){
            Money -= tempprop.cost;
            tempprop.ownable = false;
            ownedproperties.add(tempprop);
            tempprop.owner =  this;
            Display.frame.repaint();
            Display.boardPanel.repaint();
        }
    } 
    
    if(tempprop.owner != null && !(tempprop.owner.equals(this))){
        Money -= tempprop.rent;
        Display.frame.repaint();
        Display.boardPanel.repaint();
    }
}





}
