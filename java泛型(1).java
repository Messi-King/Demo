/*1.自动进行类型转换
* 2.自动进行类型检查
* 泛型的一些重点：
*1.泛型是怎样编译的，擦除机制 -->Object
* 2.泛型的类型不参与类型的组成
*3.泛型的参数不能是简单类型
*
* */
class MyArrayList<T> {
    public T[] elem;
    public  int useSized;

    public MyArrayList() {
        this.elem = (T[])new Object[10];
    }
    public void push(T val) {
        this.elem[this.useSized] = val;
        this.useSized++;
    }
    public T get() {
        return this.elem[0];
    }
}


public class TestDemo {
    public static void main(String[] args) {
        MyArrayList<Integer> myArrayList = new MyArrayList<>();
        myArrayList.push(1);
        myArrayList.push(9);
        myArrayList.get();
        int val = myArrayList.get();
        System.out.println(val);
    }
}