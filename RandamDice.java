import java.util.Random;
public class RandamDice{
    public static void main(String[] args) {
            System.out.println("Rolling dice...");
            Random random = new Random();
            int die1 = random.nextInt(6) + 1;
            int die2 = random.nextInt(6) + 1;
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            int totalValue = die1 + die2;
            System.out.println("Total value: " + totalValue);
    }
}