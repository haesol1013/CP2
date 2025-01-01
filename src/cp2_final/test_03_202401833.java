package cp2_final;

public class test_03_202401833 {
	public static void main(String[] args) {
		System.out.println("202401833_신해솔");

		FixedQUeue fq = new FixedQUeue(5);
		fq.enqueue(0);
		fq.enqueue(3);
		
		System.out.println(fq.size());
		System.out.println(fq.peek());
		
		System.out.println(fq.dequeue());
		System.out.println(fq.size());
		
		System.out.println(fq.dequeue());
		System.out.println(fq.dequeue());
		System.out.println(fq.peek());
		
		System.out.println("------------------------");
		ResizableQueue ra = new ResizableQueue(2);
		fq.enqueue(1);
		fq.enqueue(2);
		fq.enqueue(3);
		System.out.println(fq.size());
		
		fq.enqueue(3);
		System.out.println(fq.size());

	}
}

interface Queueinterface {
	void enqueue(int item);
	int dequeue();
	int peek();
	boolean isEmpty();
	int size();
}

class FixedQUeue implements Queueinterface {
	int size;
	int end = 0;
	int[] arr;
	public FixedQUeue(int size) {
		this.size = size;
		arr = new int[size];
	}
	
	@Override
	public void enqueue(int item) {
		if (end == size) {
			System.out.println("Queue is full!!");
		} else {
			arr[end++] = item;
		}
	}
	
	@Override
	public int dequeue() {
		int val = arr[0];
		if (this.isEmpty()) {
            return -1;
        }
        for (int i = 0; i < end - 1; i++) {
            arr[i] = arr[i+1];
        }
        arr[end--] = 0;
        return val;
	}
	
	@Override
	public int peek() {
		if (this.isEmpty()) {
			return -1;
		}
		return arr[0];
	}
	
	@Override
	public boolean isEmpty() {
		return end == 0;
	}
	
	@Override
	public int size() {
		return end;
	}
}

class ResizableQueue extends FixedQUeue {

	public ResizableQueue(int size) {
		super(size);
	}
	
	@Override
	public void enqueue(int item) {
		int newSize = size;
		
		if (end == size) {
			newSize *= 2;
			int[] newArr = new int[newSize];
			for(int i = 0; i < arr.length; i++) {
				newArr[i] = arr[i];
			}
			arr = newArr;
			arr[end++] = item;
		}
	}

}
