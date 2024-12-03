import java.util.Scanner;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("input.txt"));
        int sum = 0;
        while(s.hasNextLine()){
            String input = s.nextLine();
            for(int i = 0; i < input.length() - 3; i++){
                String sub = input.substring(i, i + 3);
                if(sub.equals("mul")){
                    int end = input.substring(i + 3, input.length()).indexOf(")");
                    if(end != -1){
                        sum += getMulti(input.substring(i + 3, i + 4 + end));
                    }
                }
            }
        }
        System.out.println(sum);
    }
    public static int getMulti(String s){
        if(s.charAt(0) != '(' || !s.contains(",") || s.charAt(s.length() - 1) != ')' || s.length() > 9){
            return 0;
        }
        String[] nums = s.substring(1, s.length() - 1).split(",");
        if(nums.length != 2){
            return 0;
        }
        return Integer.parseInt(nums[0]) * Integer.parseInt(nums[1]);
    }
}