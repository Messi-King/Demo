 /*堆排序
    * 时间复杂度：O(n*log(n)
    * 空间复杂度：O(1)
    * 不稳定
    * */
    public static void adjustDown(int[] array,int parent,int len) {
        int child = 2 * parent + 1;
        //首先判断是否有左孩子
        while (child < len) {
            //是否有右孩子 如果有 child保存左右孩子最大值的下标
            if (child+1 < len && array[child] < array[child + 1]) {
                child++;
            }
            //child 当中存的就是最大值
            if (array[child] > array[parent]) {
                int tmp = array[child];
                array[child] = array[parent];
                array[parent] = tmp;
                parent = child;
                child = 2 * parent + 1;
            } else {
                break;
            }
        }
    }
    public static void createHeap(int[] array) {
        for (int i = (array.length-1-1)/2; i>=0 ; i--) {
            adjustDown(array,0,array.length);
        }
    }
    public static void heapSort(int[] array)  {
        createHeap(array);
        int end = array.length-1;
        while(end > 0) {
            int tmp = array[0];
            array[0] = array[end];
            array[end] = tmp;
            adjustDown(array,0,end);
            end--;
        }
    }