package Java;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String []args){
        Map map=new HashMap();
        Map map1=new HashMap();
        map.put("one",new Integer(1));
        map.put("two",new Integer(2));
        map.put("three",new Integer(3));
        map1.put("A",new Integer(1));
        map1.put("B",new Integer(2));
        System.out.println(map.size());
        System.out.println(map.containsKey("one"));
        System.out.println(map1.containsValue(1));
        if(map.containsKey("two")){
            int i=((Integer)map.get("two")).intValue();
            System.out.println(i);
        }
        Map m3=new HashMap();
        Map map2=new HashMap(map);
        m3.putAll(map1);
        map2.putAll(map1);
        System.out.println(map2);
        System.out.println(m3);
    }
}
