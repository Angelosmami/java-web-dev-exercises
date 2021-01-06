package exercises;
import java.util.Arrays;

public class DrSuess {
    public static void main(String[] args){
        String words = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] wordsArray = words.split("\\.");
        System.out.println(Arrays.toString(wordsArray));
    }
}
