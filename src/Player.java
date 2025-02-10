
import java.util.ArrayList;

import javafx.scene.paint.Color;

public class Player {

    
    private int Money;
    private String player;
    private ArrayList<Property> ownedproperties = new ArrayList<Property>();
    private int location = 0;

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
       if(tempprop.getOwnable() == true && tempprop.getOwner() == null){
        int choice = Display.choice("Purchase", "do you want to buy?", new String[]{"yes", "no"});
        if(choice == 0 && Money >= tempprop.getCost()){
            Money -= tempprop.getCost();
            tempprop.setOwnable(false);
            ownedproperties.add(tempprop);
            tempprop.setOwner(this);
            Display.frame.repaint();
            Display.boardPanel.repaint();
        }
    } 
    
    if(tempprop.getOwner() != null && !(tempprop.getOwner().equals(this))){
        Money -= tempprop.getRent();
        Display.frame.repaint();
        Display.boardPanel.repaint();
    }
}





}
