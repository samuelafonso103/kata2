package kata2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Kata2 {

    public static void main(String[] args) {
        /*
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(3, 4);
        hashMap.put(2, 4);
        hashMap.put(4, 4);
        hashMap.put(5, 8);
        
        //Metodo 1
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            System.out.println("La clave " + entry.getKey() + " corresponde al valor " + entry.getValue());
        }
        
        //Metodo 2
        for (Integer integer : hashMap.keySet()) {
            System.out.println("Hay una clave " + integer);
        }
        
        for (Integer value : hashMap.values()) {
            System.out.println("Hay un valor " + value);
        }
        
        //Metodo 3a
        Iterator<Map.Entry<Integer, Integer>> iterator = hashMap.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, Integer> next = iterator.next();
            System.out.println("La clave " + next.getKey() + " corresponde al valor " + next.getValue());
        }
        
        //Metodo 3b
        Iterator iterator2 = hashMap.entrySet().iterator();
        while(iterator2.hasNext()){
            Map.Entry entry = (HashMap.Entry) iterator2.next();
            Integer key = (Integer) entry.getKey();
            Integer value = (Integer) entry.getValue();
            
            System.out.println("La clave " + key + " corresponde al valor " + value);
        }
        
        //Metodo 4
        for (Integer key : hashMap.keySet()) {
            System.out.println("La clave " + key + " corresponde al valor " + hashMap.get(key));
        }
        */
        
        int [] data = new int[]{1, 2, 7, 5, 4, 1, 1, 1, 8 , 7, 2, 67, 87, 12, 15};
        HashMap<Integer, Integer> histogram = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            if(histogram.containsKey(data[i])){
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else{
                histogram.put(data[i], 1);
            }
            
        }
        
        for (Integer key : histogram.keySet()) {
            System.out.println(key + " ==> " + histogram.get(key));
        }
    }
    
   
    
}
