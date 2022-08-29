import java.util.*;

public class FruitCount {
    public Map<Fruit,Integer> map;

    public FruitCount(){
        map = new HashMap<>();
    }

    public void add(Fruit f) {
        if(!map.containsKey(f)) {
            map.put(f,1);
        }
        else{
            int val = map.get(f);
            map.put(f,val+1);
        }
    }

    public int get(Fruit f) {
        if(!map.containsKey(f)) {
            return 0;
        }
        return map.get(f);
    }

    public void harvest(Fruit f, int num) {
        if(!map.containsKey(f)) {
            map.put(f,num);
        }
        else {
            int val = map.get(f);
            map.put(f,val+num);
        }
    }
    public void delete(Fruit f) {
        map.remove(f);
    }

}
