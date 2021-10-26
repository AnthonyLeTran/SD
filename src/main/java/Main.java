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
    private static Rooms currentItems;
    private static Player player;
    private static Monster monster;
    static Scanner keyboard = new Scanner(System.in); //User controller

    public static void main(String[] args) {

        rooms = Input.getRooms();
        puzzles = PuzzleInput.getPuzzles();
        for (int i = 0; i < puzzles.size(); i++) {
            Rooms room = rooms.get(puzzles.get(i).getPuzzleRoomID() - 1);
            room.setPuzzle(puzzles.get(i));
        }
        player = new Player();
        System.out.println("Welcome to the Mini Game");
        currentRoom = rooms.get(0); //starting point
        nextRoomID = 1;
        displayCurrentRoom();
        displayPuzzle();
        do {
            System.out.println("Which direction would you like to go? North, East, South, or West?");
            System.out.print(">");
            String command = keyboard.nextLine();
            processCommand(command);
            displayCurrentRoom();
            displayPuzzle();
            displayMonster();
        }
        while (gameFlag == true);
    }

    public static void processCommand(String command) {//Directions
        command = command.toLowerCase();
        String[] commandWords = command.split(" ");
        if (commandWords.length == 1) {
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
            } else if (command.compareTo("explore") == 0) {
                if (roomInventory.size() > 0) {
                    System.out.println("The items in the room are ");
                    for (int i = 0; i < roomInventory.size(); i++) {
                        System.out.println(roomInventory.get(i).getItemName());
                    }
                } else {
                    System.out.println("There are no items in the room.");
                }
            } else if (command.compareTo("inventory") == 0) {
                ArrayList<Items> playerInventory = player.getPlayerInventory();
                if (playerInventory.size() > 0) {
                    System.out.println("The player inventory has the following items ");

                    for (int i = 0; i < playerInventory.size(); i++) {
                        System.out.println(playerInventory.get(i).getItemName());
                    }
                } else {
                    System.out.println("You have not picked up any items yet!");
                }
            } else {
                System.out.println("Invalid command");
            }
        } else if (commandWords.length > 1) {
            if (commandWords[0].compareTo("pickup") == 0) {
                ArrayList<Items> roomInventory = currentRoom.getRoomInventory();
                for (int i = 0; i < roomInventory.size(); i++) {
                    if (commandWords[1].compareTo(roomInventory.get(i).getItemName()) == 0) {
                        player.getPlayerInventory().add(roomInventory.get(i));
                        roomInventory.remove(i);
                        System.out.println("Item has successfully been added to the player inventory");
                        return;
                    }
                }
                System.out.println("The item does not exist in this room");

            } else if (commandWords[0].compareTo("drop") == 0) {
                ArrayList<Items> roomInventory = currentRoom.getRoomInventory();
                ArrayList<Items> playerInventory = player.getPlayerInventory();
                for (int i = 0; i < playerInventory.size(); i++) {
                    if (commandWords[1].compareTo(player.getPlayerInventory().get(i).getItemName()) == 0) {
                        currentRoom.getRoomInventory().add(playerInventory.get(i));
                        playerInventory.remove(i);
                        System.out.println("Item has been dropped successfully from the player inventory and placed in the "
                                + currentRoom.getRoomName().get(0));
                        return;
                    }
                }
                System.out.println("item does not exist!");

            } else if (commandWords[0].compareTo("inspect") == 0) {
                ArrayList<Items> roomInventory = currentRoom.getRoomInventory();
                ArrayList<Items> playerInventory = player.getPlayerInventory();
                for (int i = 0; i < playerInventory.size(); i++) {
                    if (commandWords[1].compareTo(player.getPlayerInventory().get(i).getItemName()) == 0) {
                        System.out.println(playerInventory.get(i).getItemDescription());
                        return;
                    }
                }
                System.out.println("You have not picked up the item yet!");
            }
        } else
        if (commandWords[0].compareTo("explore monster") == 0) {
            System.out.println(currentRoom.getMonster().getMonsterDescription());
        }
         else{
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
    public static void displayMonster() {
        if(currentRoom.getMonster().isDefeated() == false) {
            System.out.println("There is a monster in this room");
        }
    }

}