package kata2;

import java.util.HashMap;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        String[] data = {"Rosa", "Pepe","María","Rosa","Rosa","María","Pepe","Pepe","Juan"}; 
        Histogram histo = new Histogram(data);
        Map<String,Integer> histogr = histo.getHistogram();
        
        for (Map.Entry<String, Integer> entry : histogr.entrySet()) {
            System.out.println(entry.getKey() + "==>" + entry.getValue());
        }
    }  
}
