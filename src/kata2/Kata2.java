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
        
        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i]))  {
                histogram.put(data[i], histogram.get(data[i])+1);
            }else{
                histogram.put(data[i], 1);
            }       
        }
        
        for (Map.Entry<Integer, Integer> entry : histogram.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
    }  
}
