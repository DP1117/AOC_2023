//package Part2;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;

        while(s.hasNext()){
            String value = convert(s.nextLine());
            sum += (value.charAt(0) - '0') * 10 + (value.charAt(value.length()-1) - '0');
        }
        System.out.println(sum);
    }
    public static String convert(String value){
        HashMap<String, String> digits = new HashMap<>();
        digits.put("one", "1");
        digits.put("two", "2");
        digits.put("three", "3");
        digits.put("four", "4");
        digits.put("five", "5");
        digits.put("six", "6");
        digits.put("seven", "7");
        digits.put("eight", "8");
        digits.put("nine", "9");
        String newValue = "";
        String digit = "";
        for(int i = 0; i < value.length(); i++){
            char curr = value.charAt(i);
            digit += curr;
            if(Character.isDigit(curr)){
                newValue += curr;
            }
            for(String d : digits.keySet()){
                if(digit.contains(d)){
                    newValue += digits.get(d);
                    digit = digit.substring(digit.length()-1);
                    break;
                }
            }
        }
        return newValue;
    }
}