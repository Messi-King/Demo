import java.util.*;

public class TestDemo1 {
    //将10万个数据，统计重复数字及出现的次数
    public static void main(String[] args) {
        HashMap<Integer,Integer> map = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <10_0000 ; i++) {
            int num = random.nextInt(10_0000);
            list.add(num);
        }
        //1.遍历list
        for (Integer key : list) {
            if(map.get(key) == null) {
                map.put(key,1);
            }else {
                int val = map.get(key);
                map.put(key,val+1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()) {
            if(entry.getValue() > 1) {
                System.out.println("重复的数字:"+entry.getKey()+"出现的次数是:"+entry.getValue());
            }
        }
    }

    

//List当中有10万个数据，找出第一个重复的数据
    public static void main2(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <10_0000 ; i++) {
            int num = random.nextInt(10_0000);
            list.add(num);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <10_0000 ; i++) {
            if(set.contains(list.get(i))) {
                System.out.println(list.get(i));
                return;
            }else {
                set.add(list.get(i));
            }
        }
    }
    

//list当中有10万个数据，把重复的数字全部都去重
    public static void main1(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <10_0000 ; i++) {
            int num = random.nextInt(10_0000);
            list.add(num);
        }
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i <10_0000 ; i++) {
            set.add(list.get(i));
        }
        //遍历set
        Iterator<Integer> it = set.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}