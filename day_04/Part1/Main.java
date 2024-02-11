import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int totalPoints = 0;
        while(s.hasNextLine()){
            ArrayList<Integer> winningNumbers = new ArrayList<>();
            Scanner card = new Scanner(s.nextLine()); 
            int matching = 0;
            boolean barrier = false;
            card.next(); 
            card.next();
            while(card.hasNext()){
                String num = card.next();
                if(!barrier && num.charAt(0) == '|'){
                    barrier = true;
                    num = card.next();
                } 
                if(!barrier){
                    winningNumbers.add(Integer.parseInt(num));
                }
                else if(winningNumbers.contains(Integer.parseInt(num))){
                    matching++;
                }
            }
            totalPoints += matching > 0 ? Math.pow(2, matching - 1): 0;
        }
        System.out.println(totalPoints);
    }
}