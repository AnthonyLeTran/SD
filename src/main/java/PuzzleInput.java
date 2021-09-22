import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PuzzleInput {
    private static ArrayList<Puzzles> puzzles = new ArrayList<>();
    public static ArrayList<Puzzles> getPuzzles() {
        try {

            List<String> lines = FileUtils.readLines(new File("Puzzles.txt"), "UTF-8");
            //System.out.println(lines);

            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                Puzzles puzzle = new Puzzles();
                String[] puzzleData = line.split(","); //splits by comma
                int j = 0;
                puzzle.setPuzzleName(puzzleData[j]);
                j++;
                puzzle.setPuzzleDescription(puzzleData[j]);
                j++;
                puzzle.setPuzzleAnswer(puzzleData[j]);
                j++;
                puzzle.setAttempts(Integer.parseInt(puzzleData[j]));
                j++;
                puzzle.setSolved(Boolean.parseBoolean(puzzleData[j]));
                j++;
                puzzle.setPuzzleRoomID(Integer.parseInt(puzzleData[j]));
                puzzles.add(puzzle);

            }

        }catch (Exception e) {
            System.out.println("Puzzles file not found");
           e.printStackTrace();
        }
        return puzzles;

    }
}
