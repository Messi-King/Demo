import java.util.Comparator;
import java.util.PriorityQueue;

public class TOPK {
    public static void topK(int[] array, int K) {
        //取前K个最小的元素
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        for (int i = 0; i < array.length; i++) {
            if (maxHeap.size() < K) {
                maxHeap.offer(array[i]);
            } else {
                int tmp = maxHeap.peek();
                if (array[i] < tmp) {
                    maxHeap.poll();
                    maxHeap.offer(array[i]);
                }
            }
        }
        System.out.println(maxHeap);
    }


    public static void main(String[] args) {
        int[] array = {12, 45, 2, 7, 10, 8, 19, 56, 32};
        topK(array,5);
    }
}
