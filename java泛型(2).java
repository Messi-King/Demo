/*
* 泛型的上界 extends x
*           T 实现了x这个接口  或者是x的子类或者是x本身
*
* */
class GenericAlg<T extends Comparable<T>> {
    public T maxValue(T[] array) {
        T max = array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}

class GenericAlg2 {
    //静态的泛型方法，直接用类名.方法，不需要new对象
    public static <T extends Comparable<T>> T maxValue(T[] array) {
        T max = array[0];
        for (int i = 1; i <array.length ; i++) {
            if(array[i].compareTo(max) > 0) {
                max = array[i];
            }
        }
        return max;
    }
}
class MyPrint<T> {
    public  void printf1(ArrayList<T> list) {
        for(T val:list) {
            System.out.println(val);
        }
    }
    /*
    * 通配符一般用于读取
    * 通配符有上界也有下界
    * */
    public  void printf(ArrayList<?> list) {
        for(Object val:list) {
            System.out.println(val);
        }
    }
}