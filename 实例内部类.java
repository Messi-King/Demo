class OuterClass{
    public int data1 = 100;
    public int data2 = 99;
    public static int data3 = 88;
    /*
    * 拿到实例内部类对象的方式
    * 不能在实例内部类定义静态的变量 加final
    * 面试问题：实例内部类是否有额外的开销？ 有
    * this是静态的，可以通过类名.
    * 内部类产生的字节码文件  外部类名$内部类名.class
    * */
    //实例内部类
    /*class InnerClass {
        public  int data1 = 33;
        public int data4 = 4;
        public static final int data5 = 5;
        public void test() {
            System.out.println(data4);
            System.out.println(data1);//33
            System.out.println(OuterClass.this.data1);//100
            System.out.println(data2);
            System.out.println(data3);
        }
    }