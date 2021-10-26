public class Monster {
    private int monsterID;
    private String monsterName;
    private String monsterDescription;
    private int monsterAttack;
    private int monsterRandom;
    private boolean isDefeated;
    private int monsterRoomID;

    public int getMonsterID() {
        return monsterID;
    }

    public void setMonsterID(int monsterID) {
        this.monsterID = monsterID;
    }

    public String getMonsterName() {
        return monsterName;
    }

    public void setMonsterName(String monsterName) {
        this.monsterName = monsterName;
    }

    public String getMonsterDescription() {
        return monsterDescription;
    }

    public void setMonsterDescription(String monsterDescription) {
        this.monsterDescription = monsterDescription;
    }

    public int getMonsterAttack() {
        return monsterAttack;
    }

    public void setMonsterAttack(int monsterAttack) {
        this.monsterAttack = monsterAttack;
    }

    public int getMonsterRandom() {
        return monsterRandom;
    }

    public void setMonsterRandom(int monsterRandom) {
        this.monsterRandom = monsterRandom;
    }

    public boolean isDefeated() {
        return isDefeated;
    }

    public void setDefeated(boolean defeated) {
        isDefeated = defeated;
    }

    public int getMonsterRoomID() {
        return monsterRoomID;
    }

    public void setMonsterRoomID(int monsterRoomID) {
        this.monsterRoomID = monsterRoomID;
    }
    public Monster(){
    }

    @Override
    public String toString() {
        return "Monster{" +
                "monsterID=" + monsterID +
                ", monsterName='" + monsterName + '\'' +
                ", monsterDescription='" + monsterDescription + '\'' +
                ", monsterAttack=" + monsterAttack +
                ", monsterRandom=" + monsterRandom +
                ", isDefeated=" + isDefeated +
                ", monsterRoomID=" + monsterRoomID +
                '}';
    }
}
