import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int powerSum = 0;
        while(s.hasNextLine()){
            Scanner game = new Scanner(s.nextLine());
            game.next();
            game.next();
            int red = 0;
            int blue = 0;
            int green = 0;
            while(game.hasNext()){ 
                int num = game.nextInt();
                String color = game.next();
                if((color.contains("red") && num > red)){
                    red = num;
                }
                else if(color.contains("blue") && num > blue){
                     = num;
                }
                else if(color.contains("green") && num > green){
                    green = num;
                }
            }
            powerSum += red * blue * green;
        }
        System.out.println(powerSum);
    }
}