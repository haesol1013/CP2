package practice.week13;

interface Queue {
    void dequeue();
    void enqueue(int num);
    void display();
    boolean isEmpty();
}

class MyQueue implements Queue {
    public int end;
    public int size;
    private final int[] queue;

    public MyQueue(int size) {
        this.size = size;
        queue = new int[size];
    }

    @Override
    public boolean isEmpty() {
        return end == 0;
    }

    @Override
    public void enqueue(int num) {
        if (end == size) {
            System.out.println("Error: Out of range");
            return;
        }
        queue[end++] = num;
    }

    @Override
    public void dequeue() {
        if (this.isEmpty()) {
            System.out.println("Error: Queue is empty");
            return;
        }
        for (int i = 0; i < end - 1; i++) {
            queue[i] = queue[i+1];
        }
        queue[end--] = 0;
    }

    public void display() {
        System.out.print("[");
        for (int i = 0; i < end - 1; i++) {
            System.out.print(queue[i] + ", ");
        }
        if (end > 0) System.out.print(queue[end-1]);
        System.out.println("]");
    }


}