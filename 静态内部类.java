/*静态内部类
    * 不能访问外部类的非静态数据成员
    * 非要访问？
    * */
    /*class OuterClass{
        public int data1 = 100;
        public int data2 = 99;
        public static int data3 = 88;

        static class InnerClass {
            public int data4 = 4;
            public static int data5 = 5;

            OuterClass outerClass;

            public InnerClass(OuterClass out) {
                this.outerClass = out;
            }

            public void test() {
                System.out.println(data4);
                System.out.println(outerClass.data1);//非要访问
            }
        }
    }