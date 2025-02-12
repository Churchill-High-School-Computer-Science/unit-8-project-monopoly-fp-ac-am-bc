public class Cards {
    

    private String cardname;
    private int give;
    private int get;
    private boolean fromeveryplayer;
    
    public Cards(String cname, int pay, int receive, boolean fep){
        this.cardname = cname;
        this.give = pay;
        this.get = receive;
        this.fromeveryplayer = fep;
        }
    
        public String getcardname(){
            return cardname;
        }






}
