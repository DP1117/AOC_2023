import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] rows = {s.nextLine(), s.nextLine(), s.nextLine()};
        int partSum = 0;
        while(true){
            for(int i = 0; i < rows[1].length(); i++){
                char curr = rows[1].charAt(i);
                if(curr != '.' && !Character.isDigit(curr)){
                    partSum += getNums(rows[0], i) + getNums(rows[1], i) + getNums(rows[2], i);
                }
            }
            if(!s.hasNextLine()){
                break;
            }
            rows[0] = rows[1];
            rows[1] = rows[2];
            rows[2] = s.nextLine();
        }
        System.out.println(partSum);
    }
    public static int getNums(String row, int partPos){
        int rowSum = 0;
        int digit = 0;
        boolean isPart = false;
        for(int i = 0; i < row.length(); i++){
            char curr = row.charAt(i);
            if(Character.isDigit(curr)){
                digit = digit * 10 + (curr - '0');
                if(Math.abs(partPos - i) <= 1){
                    isPart = true;
                }
            }
            if(!Character.isDigit(curr) || i == row.length() - 1){
                if(isPart){
                    rowSum += digit;
                }
                digit = 0;
                isPart = false;
            }
        }
        return rowSum;
    }
}