import java.awt.Color;
public class Board {
    Property[][] properties = new Property [11][11];

    public Board(){

        Display.properties = properties;

        properties[0][0] = new Property(new Color(0, 255, 0), "Go", 0, 0);
        properties[0][1] = new Property(new Color(102, 51, 0), "Mediterranean Ave", 60, 2);
        properties[0][2] = new Property(new Color(255, 255, 255), "Community Chest", 0, 0);
        properties[0][3] = new Property(new Color(102, 51, 0), "Baltic Ave", 60, 4);
        properties[0][4] = new Property(new Color(255, 255, 255), "Income Tax", 0, 0);
        properties[0][5] = new Property(new Color(0, 0, 0), "Reading RR", 200, 25);
        properties[0][6] = new Property(new Color(0, 153, 204), "Oriental Ave", 100, 6);
        properties[0][7] = new Property(new Color(255, 255, 255), "Chance", 0, 0);
        properties[0][8] = new Property(new Color(0, 153, 204), "Vermont Ave", 100, 6);
        properties[0][9] = new Property(new Color(0, 153, 204), "Connecticut Ave", 120, 8);
        properties[0][10] = new Property(new Color(255, 255, 255), "Jail", 0, 0);

        properties[1][10] = new Property(new Color(204, 68, 204), "St. Charles Place", 140, 10);
        properties[2][10] = new Property(new Color(255, 255, 255), "Electric Company", 150, 0);
        properties[3][10] = new Property(new Color(204, 68, 204), "States Ave", 140, 10);
        properties[4][10] = new Property(new Color(204, 68, 204), "Virginia Ave", 160, 12);
        properties[5][10] = new Property(new Color(0, 0, 0), "Pennsylvania RR", 200, 25);
        properties[6][10] = new Property(new Color(255, 76, 38), "St. James Place", 180, 14);
        properties[7][10] = new Property(new Color(255, 255, 255), "Community Chest", 0, 0);
        properties[8][10] = new Property(new Color(255, 76, 38), "Tennessee Ave", 180, 14);
        properties[9][10] = new Property(new Color(255, 76, 38), "New York Ave", 200, 16);
        properties[10][10] = new Property(new Color(255, 255, 255), "Free Parking", 0, 0);
        
        properties[10][9] = new Property(new Color(255, 0, 0), "Kentucky Ave", 220, 18);
        properties[10][8] = new Property(new Color(255, 255 ,255), "Chance", 0, 0);
        properties[10][7] = new Property(new Color(255, 0, 0), "Indiana Ave", 220, 18);
        properties[10][6] = new Property(new Color(255, 0, 0), "Illinois Ave", 240, 20);
        properties[10][5] = new Property(new Color(0, 0, 0), "B&O RR", 200, 25);
        properties[10][4] = new Property(new Color(255, 255, 51), "Atlantic Ave", 260, 22);
        properties[10][3] = new Property(new Color(255, 255, 51), "Ventnor Ave", 260, 22);
        properties[10][2] = new Property(new Color(255, 255, 255), "Water Works", 150, 0);
        properties[10][1] = new Property(new Color(255, 255, 51), "Marvin Gardens", 280, 24);
        properties[10][0] = new Property(new Color(255, 255, 255), "Go To Jail", 0, 0);

        properties[9][0] = new Property(new Color(51, 153, 51), "Pacific Ave", 300, 26);
        properties[8][0] = new Property(new Color(51, 153, 51), "North Carolina Ave", 300, 26);
        properties[7][0] = new Property(new Color(255, 255, 255), "Community Chest", 0, 0);
        properties[6][0] = new Property(new Color(51, 153, 51), "Pennsylvania Ave", 320, 28);
        properties[5][0] = new Property(new Color(0, 0, 0), "Short Line RR", 200, 25);
        properties[4][0] = new Property(new Color(255, 255, 255), "Chance", 0, 0);
        properties[3][0] = new Property(new Color(46, 57, 248), "Park Place", 350, 35);
        properties[2][0] = new Property(new Color(255, 255, 255), "Luxury Tax", 0, 0);
        properties[1][0] = new Property(new Color(46, 57, 248), "Board Walk", 400, 50);
    }
}

