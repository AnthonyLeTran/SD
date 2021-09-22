/**
 * @Anthony Tran
 * 9/16/21
 * This class reads the input from the .txt file
 * Makes connection between rooms
 */

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.*;

public class Input {
    private static ArrayList<Rooms> rooms = new ArrayList<>();
    public static ArrayList<Rooms> getRooms() {
        try {

            List<String> lines = FileUtils.readLines(new File("Rooms.txt"), "UTF-8");
            //System.out.println(lines);

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                Rooms room = new Rooms();
                String[] roomdata = line.split(","); //splits by comma
                int j = 0;
                room.setRoomID(Integer.parseInt(roomdata[j])); //sets room ID
                j++;
                //room.setRoomName(roomdata[j]);
                ArrayList<String> roomName = new ArrayList<>(); //arraylist for Room Name
                String str1 = roomdata[j];
                   roomName.add(str1);
                   j++;
                   str1 = roomdata[j];

                room.setRoomName(roomName);
               // j++;

                str1 = roomdata[j];
                String str = roomdata[j];
                ArrayList<String> description = new ArrayList<>(); //Arraylist for room description
                while (str.compareTo("***") != 0) { //allows for longer room description
                    description.add(str);
                    j++;
                    str = roomdata[j];
                }
                room.setDescription(description);
                j++;
                room.setVisited(Boolean.parseBoolean(roomdata[j])); //sets isVisited
                j++;
                HashMap<String, Integer> neighbors = new HashMap<>(); //Setting up neighbors
                neighbors.put("north", Integer.parseInt(roomdata[j]));
                j++;
                neighbors.put("east", Integer.parseInt(roomdata[j]));
                j++;
                neighbors.put("south", Integer.parseInt(roomdata[j]));
                j++;
                neighbors.put("west", Integer.parseInt(roomdata[j]));
                room.setNeighbors(neighbors);
                rooms.add(room);
            }

        }catch (Exception e) {
            System.out.println("file not found");
        }
        return rooms;

    }
}
