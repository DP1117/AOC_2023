import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int sum = 0;
        while(s.hasNext()){
            String value = s.nextLine();
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
}