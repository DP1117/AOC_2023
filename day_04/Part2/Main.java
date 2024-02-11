import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        HashMap<Integer, Integer> endList = new HashMap<>();
        int totalPoints = 0;
        int rem = 0;
        while(s.hasNextLine()){
            ArrayList<Integer> winningNumbers = new ArrayList<>();
            Scanner card = new Scanner(s.nextLine()); 
            int matching = 0;
            boolean barrier = false;
            card.next(); 
            int cardNum = Integer.parseInt(card.next().replace(":", ""));
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
            int temp = totalPoints + 1 - rem;
            totalPoints += temp;
            endList.put(cardNum + matching, endList.getOrDefault(cardNum + matching, 0) + temp);
            if(endList.containsKey(cardNum)){
                rem += endList.get(cardNum);
                endList.remove(cardNum);
            }
        }
        System.out.println(totalPoints);
    }
}