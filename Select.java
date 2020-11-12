/*选择排序
    *时间复杂度：O(n^2)
    * 空间复杂度：O(1)
    * 不稳定
    * */
    public static void selectSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
    }