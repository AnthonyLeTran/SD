import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class PlayerInput {
    private static ArrayList<Player> players = new ArrayList<>();
    public static ArrayList<Player> getPlayer() {
        try {

            List<String> lines = FileUtils.readLines(new File("Player.txt"), "UTF-8");
            //System.out.println(lines);

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                Player player = new Player();
                String[] playerData = line.split(","); //splits by comma
                int j = 0;
                player.setPlayerHealth(Integer.parseInt(playerData[j]));
                j++;
                player.setPlayerAttack(Integer.parseInt(playerData[j]));
                players.add(player);
            }

        }catch (Exception e) {
            System.out.println("Puzzles file not found");
            e.printStackTrace();
        }
        return players;

    }

}
