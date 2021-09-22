import java.util.ArrayList;

public class Puzzles {
    private String puzzleName;
    private String puzzleDescription;
    private String puzzleAnswer;
    private int attempts;
    private boolean isSolved;
    private int puzzleRoomID;

//    public Puzzles(ArrayList puzzleType, String puzzleDescription, String puzzleAnswer, int attempts, boolean isSolved) {
//        this.puzzleType = puzzleType;
//        this.puzzleDescription = puzzleDescription;
//        this.puzzleAnswer = puzzleAnswer;
//        this.attempts = attempts;
//        this.isSolved = isSolved;
//    }

    public Puzzles() {
    }


    public String getPuzzleName() {
        return puzzleName;
    }

    public void setPuzzleName(String puzzleName) {
        this.puzzleName = puzzleName;
    }

    public String getPuzzleDescription() {
        return puzzleDescription;
    }

    public void setPuzzleDescription(String puzzleDescription) {
        this.puzzleDescription = puzzleDescription;
    }

    public String getPuzzleAnswer() {
        return puzzleAnswer;
    }

    public void setPuzzleAnswer(String puzzleAnswer) {
        this.puzzleAnswer = puzzleAnswer;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }

    public boolean isSolved() {
        return isSolved;
    }

    public void setSolved(boolean solved) {
        isSolved = solved;
    }

    public int getPuzzleRoomID() {
        return puzzleRoomID;
    }

    public void setPuzzleRoomID(int puzzleRoomID) {
        this.puzzleRoomID = puzzleRoomID;
    }

    @Override
    public String toString() {
        return "Puzzles{" +
                "puzzleName='" + puzzleName + '\'' +
                ", puzzleDescription='" + puzzleDescription + '\'' +
                ", puzzleAnswer='" + puzzleAnswer + '\'' +
                ", attempts=" + attempts +
                ", isSolved=" + isSolved +
                ", puzzleRoomID=" + puzzleRoomID +
                '}';
    }
}
