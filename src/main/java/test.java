//import org.apache.commons.io.FileUtils;
//
//import java.io.File;
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class test {
//    public static void main(String[] args) throws IOException {
//
//        List<String> lines = FileUtils.readLines(new File("Puzzles.txt"), "UTF-8");
//        //System.out.println(lines);
//
//        for (int i = 0; i < lines.size(); i++) {
//            String line = lines.get(i);
//            Puzzles poop = new Puzzles();
//            String[] puzzleData = line.split(","); //splits by comma
//            int j = 0;
//            poop.setPuzzleType((puzzleData[j]));
//            j++;
//            poop.setPuzzleDescription(puzzleData[j]);
//            j++;
//            poop.setPuzzleAnswer(puzzleData[j]);
//            j++;
//            poop.setAttempts(Integer.parseInt(puzzleData[j]));
//            j++;
//            poop.setSolved(Boolean.parseBoolean(puzzleData[j]));
//            System.out.println(poop);
//
//        }
//
//    }
//}