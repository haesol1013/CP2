package practice.week13;

import java.util.Scanner;

public class QueueTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("input size of queue: ");
        Queue queue = new MyQueue(sc.nextInt());

        System.out.println("==================================");
        System.out.println("1: insert\n2: delete\n3: display\n4: check empty\n5: exit");
        System.out.println("==================================");

        while (true) {
            System.out.print("input order: ");
            int order = sc.nextInt();
            switch (order) {
                case 1 -> {
                    System.out.print("input number: ");
                    queue.enqueue(sc.nextInt());
                }
                case 2 -> queue.dequeue();
                case 3 -> queue.display();
                case 4 -> System.out.println(queue.isEmpty());
                case 5 -> System.exit(0);
            }
        }
    }
}
