
import java.util.ArrayList;

import javax.swing.JOptionPane;

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
        //location = 2; 
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

    if (tempprop.getName().equals("Community Chest")){
        
         int random = (int)(Math.random() * Board.communityChest.size()); 
           Cards c = Board.communityChest.get(random);
           //Cards c = Board.communityChest.get(3);
            Display.inform(c.getcardname());
        if(c.getfromeveryplayer() == false){
            Money += c.getget();
            Money -= c.getgive();

            Display.frame.repaint();
            Display.boardPanel.repaint();
        }
            if(c.getfromeveryplayer() == true){
               for(Player p: Monopoly.players){
                if(p != this){
                    p.Money += c.getgive();
                    p.Money -= c.getget();

                    Money += c.getget();
                    Money -= c.getgive();

                    Display.frame.repaint();
                    Display.boardPanel.repaint();
                }
               } 
            }
    }
}





}
