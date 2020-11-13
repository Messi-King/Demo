 /*归并排序
    *时间复杂度：O(n*logn)
    * 空间复杂度：O(n)
    *稳定
    * */
    public static void merge(int[] array,int low,int high,int mid) {
        int s1 = low;
        int s2 = mid+1;
        int[] tmpArr = new int[high-low+1];
        int k = 0;//数组tmp的下标
        //代表两个段都有数据
        while(s1 <= mid && s2 <= high) {
            if(array[s1] <= array[s2]) {
                tmpArr[k++] = array[s1++];
            }else {
                tmpArr[k++] = array[s2++];
            }
        }
        //第一个归并段还有若干个数据
        while(s1 <= mid) {
            tmpArr[k++] = array[s1++];
        }
        while(s2<= high) {
            tmpArr[k++] = array[s2++];
        }
        //tmpArr中存放的就是这次归并的有序之后的结果
        for (int i = 0; i <tmpArr.length ; i++) {
            array[low+i] = tmpArr[i];
        }
    }
    
  public static void mergeSortInternal(int[] array,int low,int high) {
        if(low >= high) {
            return;
        }
        int mid = (low + high)/2;
        mergeSortInternal(array,low,mid);
        mergeSortInternal(array,mid+1,high);
        //开始合并
        merge(array,low,high,mid);
    }
    public static void mergeSort(int[] array) {
        mergeSortInternal(array,0,array.length-1);
    }