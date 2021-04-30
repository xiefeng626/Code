package map;

import org.junit.Test;

import java.util.*;

public class MapBrower {
    @Test
    public void brower(){
        Map map = new HashMap<String,String>();
        map.put("1","a");
        map.put("2","b");
        map.put("3","c");

        keyset(map);

        entryset(map);

        entrysetfor(map);

        values(map);
    }

    /**
     * keyset
     * @param map
     */
    void keyset(Map map){
        System.out.println("keyset遍历：");
        Set<String> set = map.keySet();
        for(String a : set){
            System.out.println(a+"="+map.get(a));
        }
    }

    /**
     * entrykey+iterator
     * @param map
     */
    void entryset(Map map){
        System.out.println("entryset+iterator遍历：");
//        Set<Map.Entry<String,String>> set = map.entrySet();
//        Iterator<Map.Entry<String, String>> iterator = set.iterator();
//        while(iterator.hasNext()){
//            Map.Entry<String, String> next = iterator.next();
//            System.out.println(next.getKey()+"="+next.getValue());
//        }
        Iterator<Map.Entry<String,String>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String, String> next = iterator.next();
            System.out.println(next.getKey()+"="+next.getValue());
        }
    }

    /**
     * entrykey+for
     * @param map
     */
    void entrysetfor(Map map){
        System.out.println("entryset+for遍历:");
        Set<Map.Entry<String,String>> set = map.entrySet();
        for(Map.Entry<String,String> a :set){
            System.out.println(a.getKey()+"="+a.getValue());
        }

    }

    void values(Map map){
        System.out.println("values 遍历：");
        Collection<String> values = map.values();
        Iterator<String> iterator = values.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);

        }

    }

}
