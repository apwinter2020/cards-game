public class Card {

    /**
     * encapsulation
     * composition
     */

    private String rank;
    private String suite;


    // constructor
    public Card(String rank, String suite) {
        this.rank = rank;
        this.suite = suite;
    }

    //getters and setters

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuite() {
        return suite;
    }

    public void setSuite(String suite) {
        this.suite = suite;
    }

}
