//package Part2;
import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;

        while(s.hasNext()){
            String value = convert(s.nextLine());
            int first = -1;
            int last = -1;
            for(int i = 0; i < value.length(); i++){
                if(Character.isDigit(value.charAt(i))){
                    if(first == -1){
                        first = value.charAt(i) - '0';
                    }
                    last = value.charAt(i) - '0';
                }
            }
            int combine = first * 10 + last;
            sum += combine;
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