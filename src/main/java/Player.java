import java.util.ArrayList;

public class Player {
private ArrayList<Items> playerInventory;
private int playerHealth;
private int playerAttack;
public Player() {
    playerInventory = new ArrayList<>();
}

    public ArrayList<Items> getPlayerInventory() {
        return playerInventory;
    }

    public void setPlayerInventory(ArrayList<Items> playerInventory) {
        this.playerInventory = playerInventory;
    }

    public int getPlayerHealth() {
        return playerHealth;
    }

    public void setPlayerHealth(int playerHealth) {
        this.playerHealth = playerHealth;
    }

    public int getPlayerAttack() {
        return playerAttack;
    }

    public void setPlayerAttack(int playerAttack) {
        this.playerAttack = playerAttack;
    }


    @Override
    public String toString() {
        return "Player{" +
                "playerInventory=" + playerInventory +
                ", playerHealth=" + playerHealth +
                ", playerAttack=" + playerAttack +
                '}';
    }
}
