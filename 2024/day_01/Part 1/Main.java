import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(new File("input.txt"));
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        while(s.hasNextLine()){
            String[] dest = s.nextLine().split("   ");
            list1.add(Integer.parseInt(dest[0]));
            list2.add(Integer.parseInt(dest[1]));
        }
        list1.sort(null);
        list2.sort(null);
        int distance = 0;
        for(int i = 0; i < list1.size(); i++){
            distance += Math.abs(list1.get(i) - list2.get(i));
        }
        System.out.println(distance);
    }
}