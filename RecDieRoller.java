import java.util.Random;

public class RecDieRoller {

    Random random = new Random();

    public int roll() {
        int dieRoll = random.nextInt(6) + 1;  
        System.out.println("Rolled: " + dieRoll);
      
        if (dieRoll == 2) {
            return 1;  
        } else {
            return 1 + roll();  
        }
    }
}