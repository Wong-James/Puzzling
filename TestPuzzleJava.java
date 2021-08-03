import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
public class TestPuzzleJava {
    public static void main(String[] args) {
      PuzzleJava generator = new PuzzleJava();
      String randomRolls = generator.getTenRolls();
      String randomPass = generator.setPassword(8);
      System.out.println(randomRolls);
      System.out.println(randomPass);
  }
}
