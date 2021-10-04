import java.util.ArrayList;

public class Player {
private ArrayList<Items> playerInventory;
public Player() {
    playerInventory = new ArrayList<>();
}

    public ArrayList<Items> getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(ArrayList<Items> playerInventory) {
        this.playerInventory = playerInventory;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerInventory=" + playerInventory +
                '}';
    }
}
