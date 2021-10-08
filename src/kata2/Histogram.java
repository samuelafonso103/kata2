package kata2;

import java.util.HashMap;
import java.util.Map;

public class Histogram <T>{
    private final T [] data;

    public T[] getData() {
        return data;
    }

    public Histogram(T[] data) {
        this.data = data;
    }
    
    public Map getHistogram(){
        HashMap<T, Integer> histogram = new HashMap<>();
        for (T key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        return histogram; 
    }
}
