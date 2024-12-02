import java.util.Scanner;
import java.util.ArrayList;
import java.io.File;

public class Main{
    public static void main(String[] args) throws Exception{
        Scanner s = new Scanner(new File("input.txt"));
        int safe = 0;
        while(s.hasNextLine()){
            String[] input = s.nextLine().split(" ");
            ArrayList<Integer> report = new ArrayList<>();
            for(int i = 0; i < input.length; i++){
                report.add(Integer.parseInt(input[i]));
            }
            if(tryAllPos(report)){
                safe++;
            }
        }
        System.out.println(safe);
    }
    public static boolean tryAllPos(ArrayList<Integer> report){
        for(int i = 0; i < report.size(); i++){
            ArrayList<Integer> copy = new ArrayList<>(report);
            copy.remove(i);
            if(isSafe(copy)){
                return true;
            }
        }
        return false;
    }
    public static boolean isSafe(ArrayList<Integer> report){
        int level = report.get(0);
        boolean increasing = report.get(1) - report.get(0) > 0;
        for(int i = 1; i < report.size(); i++){
            if((increasing && (report.get(i) - level > 3 || report.get(i) - level < 1)) || (!increasing && (report.get(i) - level < -3 || report.get(i) - level > -1))){
                return false;
            }
            level = report.get(i);
        }
        return true;
    }
}