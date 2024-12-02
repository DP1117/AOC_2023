import java.io.File;
import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("input.txt"));
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        while(s.hasNextLine()){
            String[] dest = s.nextLine().split("   ");
            list.add(Integer.parseInt(dest[0]));
            map.put(Integer.parseInt(dest[1]), map.getOrDefault(Integer.parseInt(dest[1]), 0) + 1);
        }
        int similarity = 0;
        for(int i = 0; i < list.size(); i++){
            if(map.containsKey(list.get(i))){
                similarity += list.get(i) * map.get(list.get(i));
            }
        }
        System.out.println(similarity);
    }
}
