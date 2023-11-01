package Week5.FirstTask;

public class CivilService implements NationalService {
    private int daysLeft;
    CivilService(){
        this.daysLeft = 362;
    }
    public int getDaysLeft(){
        return this.daysLeft;
    }

    public void work() {
       this.daysLeft--;
    }
}
