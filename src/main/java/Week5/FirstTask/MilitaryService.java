package Week5.FirstTask;

public class MilitaryService implements NationalService{
    private int daysLeft;
    MilitaryService(int days){
        this.daysLeft = days;
    }
    public int getDaysLeft(){
        return this.daysLeft;
    }

    public void work() {
        this.daysLeft--;
    }
}
