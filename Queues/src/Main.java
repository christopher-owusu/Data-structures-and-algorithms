import java.util.Arrays;

import static java.lang.Math.E;

public class Main {
    public static void main(String[] args) throws Exception {
        int queue_size = 10;
        ArrayBasedQueue<Integer> queue = new ArrayBasedQueue<>(queue_size);
        print(queue);

        // populate queue with random integers between 0 and 10 (inclusive)
//        int[] added_elements = new int[12];
//        for(int i = 0; i < 12; i++){
//            int element = (int) (Math.random() * 11);
//            added_elements[i] = element;
//            queue.enqueue(element);
//        }
//        print(queue);
//        print("Order of addition "+Arrays.toString(added_elements));
//
//        // repetitive removal
//        int[] removed = new int[queue.getSize()];
//        for(int i = 0; i < queue_size; i++){
//            int element = queue.dequeue();
//            removed[i] = element;
//        }
//        print(Arrays.toString(removed));

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        queue.enqueue(7);
        queue.enqueue(8);
        queue.enqueue(9);
        queue.enqueue(10);

        print(queue);

        print("Head: " +queue.first_element());
        print("Tail: " +queue.last_element());

        queue.dequeue();
        queue.dequeue();

        queue.enqueue(11);
        queue.enqueue(12);

        print(queue);

        /**
         * Print the elements of the queue in the right order
         * i.e. the head first, and the tail last.
         * In your codes to demonstrate your solution, ensure that
         * the head of the queue is in the middle of the array backing the queue.
         */
        //Put your codes here
    }

    public static void print(Object o){
        System.out.println(o.toString());
    }
}
