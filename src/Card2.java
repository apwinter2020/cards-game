public abstract class Card2 {
    private String rank;
    private int value;
    private String[] ranks = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};

    public Card2(String rank) {
        this.rank = rank;
        handleValue();
    }

    private void handleValue() {
        switch (rank) {
            case "A":
                value = 2;
                break;
            case "2":
                value = 1;
                break;
            case "J":
                value = 3;
                break;
            default:
                value = 0;
        }
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
        handleValue();
    }

}
