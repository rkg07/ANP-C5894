package Collection;
import java.util.LinkedList;
import java.util.Queue;
public class Qou {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);

        System.out.println("Queue elements after enqueue:");
        System.out.println(queue);

        // Dequeue elements
        while (!queue.isEmpty()) {
            int dequeuedElement = queue.poll();
            System.out.println("Dequeued: " + dequeuedElement);
            System.out.println("Queue elements after dequeue:");
            System.out.println(queue);
        }
    }
}
