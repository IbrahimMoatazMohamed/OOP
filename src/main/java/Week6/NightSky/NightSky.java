package Week6.NightSky;

import java.util.Random;

public class NightSky {
    private int height;
    private int starsInLastPrint;
    private int width;
    private double density;
    public NightSky(double density){
        this.density = density;
    }
    public NightSky(int width, int height){
         this.width =  width;
         this.height = height;
     }

    public NightSky(double density, int width, int height) {
        this.height = height;
        this.density = density;
        this.width =  width;
    }
    public void printLine(){
        Random random = new Random();
        for(int i = 0; i < this.width; i++){
            if (random.nextDouble() <= this.density) {
                System.out.print("*");
                this.starsInLastPrint++;
            } else {
                System.out.print(" ");
            }
        }
    }
    public void print(){
        this.starsInLastPrint = 0;
        for(int j = 0; j < this.height; j++){
            printLine();
            System.out.println();
        }
    }
    public int starsInLastPrint(){
        return this.starsInLastPrint;
    }
}
