public class RecDieRollerDriver {
    public static void main(String[] args) {
        RecDieRoller dieRoller = new RecDieRoller();
        int rollTimes = 0;
        int iterate = 1000;  
    
        for (int i = 0; i < iterate; i++) {
            rollTimes += dieRoller.roll();
        }

        double averageRolls = (double) rollTimes / iterate;
        System.out.println("Avg # of rolls to get a 2: " + averageRolls);
    }
}