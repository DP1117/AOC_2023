import java.util.Scanner;
import java.io.File;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(new File("input.txt"));
        int safe = 0;
        while(s.hasNextLine()){
            String[] report = s.nextLine().split(" ");
            int level = Integer.parseInt(report[0]);
            boolean increasing = Integer.parseInt(report[1]) - Integer.parseInt(report[0]) > 0;
            boolean isSafe = true;
            for(int i = 1; i < report.length; i++){
                if(increasing && (Integer.parseInt(report[i]) - level > 3 || Integer.parseInt(report[i]) - level < 1)){
                    isSafe = false;
                    break;
                }
                if(!increasing && (Integer.parseInt(report[i]) - level < -3 || Integer.parseInt(report[i]) - level > -1)){
                    isSafe = false;
                    break;
                }
                level = Integer.parseInt(report[i]);
            }
            if(isSafe){
                safe++;
            }
        }
        System.out.println(safe);
    }
}