/**
 * @Anthony Tran
 * @9/16/2021
 * This class stores all the information for the room.
 */


import java.util.ArrayList;
import java.util.HashMap;

public class Rooms {
    private int roomID;
    private ArrayList<String> roomName;
    private ArrayList<String> description;
    private boolean visited;
    private HashMap<String, Integer> neighbors;
    private Puzzles puzzle;
    private ArrayList<Items> roomInventory;

    public Rooms() {
        neighbors = new HashMap<>();
        puzzle = new Puzzles();
        puzzle.setSolved(true);
        roomInventory = new ArrayList<>();
    }

    public int getRoomID() {
        return roomID;
    }

    public void setRoomID(int roomID) {
        this.roomID = roomID;
    }

    public ArrayList<String> getRoomName() {
        return roomName;
    }

    public void setRoomName(ArrayList<String> roomName) {
        this.roomName = roomName;
    }

    public ArrayList<String> getDescription() {
        return description;
    }

    public void setDescription(ArrayList<String> description) {
        this.description = description;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public HashMap<String, Integer> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(HashMap<String, Integer> neighbors) {
        this.neighbors = neighbors;
    }

    public Puzzles getPuzzle() {
        return puzzle;
    }

    public void setPuzzle(Puzzles puzzle) {
        this.puzzle = puzzle;
    }

    public ArrayList<Items> getRoomInventory() {
        return roomInventory;
    }

    public void setRoomInventory(ArrayList<Items> roomInventory) {
        this.roomInventory = roomInventory;
    }

    @Override
    public String toString() {
        return "Rooms{" +
                "roomID=" + roomID +
                ", roomName=" + roomName +
                ", description=" + description +
                ", visited=" + visited +
                ", neighbors=" + neighbors +
                ", puzzle=" + puzzle +
                ", roomInventory=" + roomInventory +
                '}';
    }

    public ArrayList<Items> getInventory() {
        return roomInventory;
    }
}