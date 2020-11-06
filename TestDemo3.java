import java.util.LinkedList;
import java.util.Queue;

//顺序栈 +  链式队列
class Node {
    public int val;
    public Node next;

    public Node(int val) {
        this.val = val;
    }
}

class MyQueue {
    public Node head;
    public Node tail;

    public void offer(int val) {
        Node node = new Node(val);
        if(this.head == null) {
            this.head = node;
            this.tail = node;
            return;
        }
        this.tail.next = node;
        this.tail = node;
    }

    public int poll() {
        if(this.head == null) {
            throw new RuntimeException("队列为空\n");
        }
        int oldData = this.head.val;
        if(this.head.next == null) {
            this.head = null;
            this.tail = null;
        }else {
            this.head = this.head.next;
        }
        return oldData;
    }

    public int peek() {
        if(this.head == null) {
            throw new RuntimeException("队列为空\n");
        }
        return this.head.val;
    }

    public boolean isEmpty() {
        if(this.head == null) {
            return true;
        }
        return false;
    }

}


public class TestDemo3 {

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue();
        myQueue.offer(1);
        myQueue.offer(2);
        myQueue.offer(3);
        myQueue.offer(4);
        System.out.println(myQueue.peek());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());
        System.out.println(myQueue.poll());

    }
    public static void main1(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
       /* queue.add(1);
        queue.add(2);
        queue.add(3);*/
        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        //弹出
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue);
        System.out.println(queue.isEmpty());
    }
}
