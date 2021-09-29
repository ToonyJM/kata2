package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        int[] data = new int[15];
        for (int i = 0; i < data.length; i++) {
            data[i] = i+1;         
        }
        data[2] = 5;
        data[3] = 5;
        data[4] = 5;
        
        Map<Integer, Integer> histogram = new HashMap<Integer, Integer>();
        
        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
    }  
}
