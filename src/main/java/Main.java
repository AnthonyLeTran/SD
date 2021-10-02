/**
 * @Anthony Tran
 * @9/16/2021
 * This is use to run the game.
 */

import java.util.*;


/**
 *
 */

public class Main {
    private static ArrayList<Rooms> rooms;
    private static boolean gameFlag = true;
    private static Rooms currentRoom;
    private static int nextRoomID;
    private static ArrayList<Puzzles> puzzles;
    private static Puzzles currentPuzzles;
    private static ArrayList<Items> items;
    private static Items roomItems;
    private static ArrayList<Player> playerInventory;
    static Scanner keyboard = new Scanner(System.in); //User controller

    public static void main(String[] args) {

        rooms = Input.getRooms();
//        System.out.println(rooms);
        puzzles = PuzzleInput.getPuzzles();
        for (int i = 0; i < puzzles.size(); i++) {
            Rooms room = rooms.get(puzzles.get(i).getPuzzleRoomID() - 1);
            room.setPuzzle(puzzles.get(i));
        }

//        System.out.println(rooms);
//        System.out.println(items);


        System.out.println("Welcome to the Mini Game");
        currentRoom = rooms.get(0); //starting point
        nextRoomID = 1;
        displayCurrentRoom();
        do {
            System.out.println("Which direction would you like to go? North, East, South, or West?");
            System.out.print(">");
            String command = keyboard.nextLine();
            processCommand(command);
            displayCurrentRoom();
            displayPuzzle();
            displayItem();
//            pickupItems();
        }
        while (gameFlag == true);
    }


    public static void processCommand(String command) { //Directions
        command = command.toLowerCase();
        HashMap<String, Integer> neighbors = currentRoom.getNeighbors();
        ArrayList<Items> roomInventory = currentRoom.getInventory();
        if (command.compareTo("north") == 0 || command.compareTo("n") == 0) {
            nextRoomID = neighbors.get("north");
        } else if (command.compareTo("east") == 0 || command.compareTo("e") == 0) {
            nextRoomID = neighbors.get("east");
        } else if (command.compareTo("south") == 0 || command.compareTo("s") == 0) {
            nextRoomID = neighbors.get("south");
        } else if (command.compareTo("west") == 0 || command.compareTo("w") == 0) {
            nextRoomID = neighbors.get("west");
        } else if (command.compareTo("quit") == 0) {
            System.out.println("You have quit the game");
            gameFlag = false;
        } else {
            System.out.println("Invalid command");
        }
    }

    public static void displayCurrentRoom() {
        if (gameFlag == true) {
            if (nextRoomID == 0) { //arraylist has rooms set up where RoomID's correspond to direction for specific room.
                System.out.println("You cannot go that direction"); //0 means you cannot go that direction
            } else {
                currentRoom = rooms.get(nextRoomID - 1);
                if (currentRoom.isVisited() == true) {
                    System.out.println("This room looks familiar");
                } else {
                    currentRoom.setVisited(true); //Flag that room has been visited
                }
                for (int i = 0; i < currentRoom.getRoomName().size(); i++) { //prints out room name
                    System.out.println(currentRoom.getRoomName().get(i));
                }

                for (int i = 0; i < currentRoom.getDescription().size(); i++) { // prints out room description
                    System.out.println(currentRoom.getDescription().get(i));
                }

            }
        }
    }

    public static void displayPuzzle() {
        if (currentRoom.getPuzzle().isSolved() == false) {
            System.out.println("There is a puzzle in this room");
            System.out.println(currentRoom.getPuzzle().getPuzzleDescription());
            int attempts = currentRoom.getPuzzle().getAttempts();
            do {

                System.out.print(">");
                String command = keyboard.nextLine();
                if (command.compareTo(currentRoom.getPuzzle().getPuzzleAnswer()) == 0) {
                    System.out.println("Correct");
                    currentRoom.getPuzzle().setSolved(true);
                    return;
                }
                attempts--;
                if (attempts > 0) {
                    System.out.println("Your answer was incorrect. You have " + attempts + " number of attempts left");
                } else {
                    break;
                }

            } while (attempts > 0);
            System.out.println("You are out of attempts");
        }

    }

    private static void displayItem() {
        if (currentRoom.getRoomInventory().size() != 0) {
            ArrayList<Items> roomInventory = currentRoom.getInventory();
            for (int i = 0; i < roomInventory.size(); i++) {
                System.out.println("There is a " + roomInventory.get(i).getItemName() + " in this room");
            }
            System.out.print(">");
        }
    }
    private static void pickupItems() {
        ArrayList<Items> roomInventory = currentRoom.getRoomInventory();
        currentRoom.getRoomInventory().remove(items);
    }
}