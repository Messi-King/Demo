package bit;

import java.util.Arrays;

class TestHeap {
     public int[] elem;
     public int usedSize;

     public TestHeap() {
         this.elem = new int[10];
     }
     //初始化
     public void initHeap(int[] array) {
         for (int i = 0; i < array.length; i++) {
             this.elem[i] = array[i];
             this.usedSize++;
         }
         //已知孩子节点求父亲节点(len-1-1)/2
         //建堆的时间复杂度是O(n*logn)
         for (int i = (this.usedSize-1-1)/2; i>=0 ; i--) {
             adjustDown(i,usedSize);//调整的时间复杂度O(logn)
         }
     }
     //向下调整 大根堆
     public void adjustDown(int parent,int len) {
         int child = 2 * parent + 1;
         //首先判断是否有左孩子
         while (child < len) {
             //是否有右孩子 如果有 child保存左右孩子最大值的下标
             if (child+1 < len && elem[child] < elem[child + 1]) {
                 child++;
             }
             //child 当中存的就是最大值
             if (elem[child] > elem[parent]) {
                 int tmp = elem[child];
                 elem[child] = elem[parent];
                 elem[parent] = tmp;
                 parent = child;
                 child = 2 * parent + 1;
             } else {
                 break;
             }
         }
     }


//向上调整
    public void adjustUp(int child) {
         int parent = (child-1)/2;
         while(child > 0) {
             if(elem[child] > elem[parent]) {
                 int tmp = elem[child];
                 elem[child] = elem[parent];
                 elem[parent] = tmp;
                 child = parent;
                 parent = (child-1)/2;
             }else {
                 break;
             }
         }
    }