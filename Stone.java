最后一块石头的重量
public int lastStoneWeight(int[] stones) {
        // 建立一个大根堆。
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> (o2 - o1));
        for (int i = 0; i < stones.length; i++) {
            priorityQueue.offer(stones[i]);
        }
        // 从中选出两块 最重的 石头
        while( priorityQueue.size() > 1 ) {
            int x = priorityQueue.poll();
            int y = priorityQueue.poll();
            // 新的石头重量写入 priorityQueue
            int ret = x - y;
            if ( ret != 0 ) priorityQueue.offer(ret);
        }
        // priorityQueue空 return 0
        if ( priorityQueue.size() == 0 ) return 0;

        return priorityQueue.peek();
    }