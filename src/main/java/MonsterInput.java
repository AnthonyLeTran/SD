import org.apache.commons.io.FileUtils;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class MonsterInput {
    private static ArrayList<Monster> monsters = new ArrayList<>();
    public static ArrayList<Monster> getMonster() {
        try {

            List<String> lines = FileUtils.readLines(new File("Monster.txt"), "UTF-8");
            //System.out.println(lines);

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                Monster monster = new Monster();
                String[] monsterData = line.split(","); //splits by comma
                int j = 0;
                monster.setMonsterID(Integer.parseInt(monsterData[j]));
                j++;
                monster.setMonsterName(monsterData[j]);
                j++;
                monster.setMonsterAttack(Integer.parseInt(monsterData[j]));
                j++;
                monster.setMonsterRandom(Integer.parseInt(monsterData[j]));
                j++;
                monster.setDefeated(Boolean.parseBoolean(monsterData[j]));
                j++;
                monster.setMonsterRoomID(Integer.parseInt(monsterData[j]));
                monsters.add(monster);


            }

        }catch (Exception e) {
            System.out.println("Puzzles file not found");
            e.printStackTrace();
        }
        return monsters;

    }
}
