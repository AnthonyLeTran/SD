public class Items {
    private int itemID;
    private String itemName;
    private String itemDescription;
    //private int itemRoomID;

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
                '}';
    }
}
