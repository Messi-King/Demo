/*时间复杂度：最坏情况下：O(n^2)  数组是无序的；
                       最好情况：O(n) 数组有序
    * 空间复杂度：O(1)
    * */
    //稳定
    //插入排序  特点：越有序，越快
    public static void inserSort(int[] array) {
        for (int i = 1; i <array.length ; i++) {
            int tmp = array[i];
            int j = i-1;
            for (; j >= 0 ; j--) {
                if(array[j] > tmp) {
                    array[j+1] = array[j];
                }else {
                    //array[j + 1] = tmp;
                    break;
                }
            }
            array[j + 1] = tmp;
        }
    }

