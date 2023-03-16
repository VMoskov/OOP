import java.util.Objects;

class Player {
    private String firstName;
    private String lastName;
    private String playerID;
    private int rating;

    public Player(String firstName, String lastName, String playerID, int rating) {
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setPlayerID(playerID);
        this.setRating(rating);
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getPlayerID() {
        return playerID;
    }

    public void setPlayerID(String playerID) {
        this.playerID = playerID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Player))
            return false;
        if (obj == this)
            return true;

        return this.getPlayerID().equals(((Player) obj).getPlayerID());

    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getPlayerID());
    }
}