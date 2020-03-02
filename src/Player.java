public class Player {
    private Hand playerHand;
    private String name;
    private int id;

    public Player(Hand playerHand, String name, int id) {
        this.playerHand = playerHand;
        this.name = name;
        this.id = id;
    }
    public Hand getPlayerHand() {
        return playerHand;
    }

    public void setPlayerHand(Hand playerHand) {
        this.playerHand = playerHand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
