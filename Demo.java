import java.util.*;

public class TestDemo {
    public static void main2(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("abcd");
        set.add("abcd");
        set.add("ooo");
        System.out.println(set);

        Iterator<String> it = set.iterator();//迭代器，遍历集合
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public static void main1(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("及时雨","宋江");
        System.out.println(map.get("及时雨"));
        for (Map.Entry<String,String> entry : map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
}