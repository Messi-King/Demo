import java.util.Arrays;

public class TestDemo2 {

    public static String myToString(int[] array) {
        if(array == null) {
            return "";
        }
        if(array.length == 0) {
            return "[]";
        }
        String ret = "[ ";
        for (int i = 0; i < array.length; i++) {
            ret = ret + array[i];//[ 1,
            //当时最后一个元素的时候，不加,
            if(i != array.length-1) {
                ret += ", ";
            }
        }
        ret += " ]";
        return ret;
    }

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(myToString(array));
        System.out.println(myToString(null));

        int[] array2 = {};
        System.out.println(myToString(array2));

    }

    public static int[] func2(int[] array) {
        int[] tmp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[i];
        }
        //tmp当中 存放的就是拷贝后的数据
        for (int i = 0; i < tmp.length ; i++) {
            tmp[i] = tmp[i]*2;
        }
        return tmp;
    }

    public static int[] func3(int[] array) {
        //tmp当中 存放的就是拷贝后的数据
        for (int i = 0; i < array.length ; i++) {
            array[i] = array[i]*2;
        }
        return array;
    }

    public static void main9(String[] args) {
        int[] array = {1,2,3,4,5};
        int[] ret = func3(array);
        System.out.println(Arrays.toString(ret));
        System.out.println(Arrays.toString(array));
    }


    public static void main8(String[] args) {
        int a = 0;
        //代表array不指向任何对象
        int[] array = null;
        //注意事项：静态初始化，定义的同时要进行初始化
        array = new int[]{1,2,3,4,5,6};
        System.out.println(array[0]);
        System.out.println(array.length);
    }


    public static void func(int num) {
        num = 10;
        System.out.println("num="+num);//10
    }

    public static void func(int[] array) {
        array[0] = 999;
    }
    public static void main7(String[] args) {
        int[] array1 = {1,2,3,4,5};
        System.out.println(Arrays.toString(array1));
        //1 2 3 4 5
        func(array1);
        System.out.println(Arrays.toString(array1));
        //999 2 3 4 5

     /*   int num = 70;
        func(num);
        System.out.println("num2="+num);//70*/
    }


    public static void printArray(int[] array2) {
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]+" ");
        }
        System.out.println();
    }
    public static void main6(String[] args) {
        int[] array1 = {1,2,3,4,5};
        printArray(array1);
    }


    public static void main5(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[]{1,2,3,4,5};
        int[] array3 = new int[5];//定义了一个数组
        int a = 10;//局部变量--》方法内的变量  栈
    }

    public static void main4(String[] args) {
        int[] array1 = new int[5];//5个0
        for (int i = 0; i <array1.length; i++) {
            System.out.println(array1[i]);
        }
    }

    public static void main3(String[] args) {
        int[] array1 = {};//数组长度为0
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println("============");
        System.out.println(array1[0]);
    }


    public static void main2(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int value = array1[4];
        System.out.println(value);

        System.out.println("========for========");
        for (int i = 0; i < array1.length; i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();
        System.out.println("=========foreach=========");
        for (int x : array1) {
            System.out.print(x+" ");
        }
        System.out.println();
        System.out.println("========使用工具类=========");
        /*String str = Arrays.toString(array1);
        //将当前数组array1，转换为字符串
        System.out.println(str);*/
        //[1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(array1));

    }

    public static void main1(String[] args) {
        int a1;//定义
        a1 = 10;//初始化
        int a2 = 12;
        //数组：相同数据类型的一组数据
        int[] array1 = {1,2,3,4,5};
        int[] array2 = new int[]{1,2,3,4,5};
        int[] array3 = new int[5];//定义了一个数组
        for (int i = 0; i < array3.length; i++) {
            array3[i] = i;
        }

    }
}
