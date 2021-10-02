import java.util.ArrayList;

public class Player {
private ArrayList<String> playerInventory;

    public ArrayList<String> getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(ArrayList<String> playerInventory) {
        this.playerInventory = playerInventory;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerInventory=" + playerInventory +
                '}';
    }
}
