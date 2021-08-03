import java.util.Random;
import java.util.Arrays;

public class PuzzleJava{
  Random randMachine = new Random();  
  public String[] alpha = {
      "a", "b", "c", "d", "e",
      "f", "g", "h", "i", "j",
      "k", "l", "m", "n", "o",
      "p", "q", "r", "s", "t",
      "u", "v", "w", "x", "y", "z",
  };
  public String getRandomLetter(){
    return alpha[randMachine.nextInt(26)];
  }
  public String getTenRolls(){
    String[] arr = new String[10];
    for(int i=0; i < 10; i++){
      arr[i] = getRandomLetter();
    }
    return Arrays.toString(arr);
  }
  
  public String setPassword(int length){
    String[] password = new String[length];
    for(int i = 0; i < password.length; i++){
      password[i] = getRandomLetter();
    }
    return Arrays.toString(password);
  }
}
