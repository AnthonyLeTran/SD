import java.util.ArrayList;

public class Items {
    private int itemID;
    private String itemName;
    private String itemDescription;
    //private int itemRoomID;
//    private ArrayList<String> room1Inventory;
//    private ArrayList<String> room2Inventory;
//    private ArrayList<String> room3Inventory;
//    private ArrayList<String> room4Inventory;
//    private ArrayList<String> room5Inventory;
//    private ArrayList<String> room6Inventory;

    public Items() {
    }

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }
//
//    public ArrayList<String> getRoom1Inventory() {
//        return room1Inventory;
//    }
//
//    public void setRoom1Inventory(ArrayList<String> room1Inventory) {
//        this.room1Inventory = room1Inventory;
//    }
//
//    public ArrayList<String> getRoom2Inventory() {
//        return room2Inventory;
//    }
//
//    public void setRoom2Inventory(ArrayList<String> room2Inventory) {
//        this.room2Inventory = room2Inventory;
//    }
//
//    public ArrayList<String> getRoom3Inventory() {
//        return room3Inventory;
//    }
//
//    public void setRoom3Inventory(ArrayList<String> room3Inventory) {
//        this.room3Inventory = room3Inventory;
//    }
//
//    public ArrayList<String> getRoom4Inventory() {
//        return room4Inventory;
//    }
//
//    public void setRoom4Inventory(ArrayList<String> room4Inventory) {
//        this.room4Inventory = room4Inventory;
//    }
//
//    public ArrayList<String> getRoom5Inventory() {
//        return room5Inventory;
//    }
//
//    public void setRoom5Inventory(ArrayList<String> room5Inventory) {
//        this.room5Inventory = room5Inventory;
//    }
//
//    public ArrayList<String> getRoom6Inventory() {
//        return room6Inventory;
//    }
//
//    public void setRoom6Inventory(ArrayList<String> room6Inventory) {
//        this.room6Inventory = room6Inventory;
//    }
    //    public int getItemRoomID() {
//        return itemRoomID;
//    }

//    public void setItemRoomID(int itemRoomID) {
//        this.itemRoomID = itemRoomID;
//    }


    @Override
    public String toString() {
        return "Items{" +
                "itemID=" + itemID +
                ", itemName='" + itemName + '\'' +
                ", itemDescription='" + itemDescription + '\'' +
//                ", room1Inventory=" + room1Inventory +
//                ", room2Inventory=" + room2Inventory +
//                ", room3Inventory=" + room3Inventory +
//                ", room4Inventory=" + room4Inventory +
//                ", room5Inventory=" + room5Inventory +
//                ", room6Inventory=" + room6Inventory +
                '}';
    }
}
