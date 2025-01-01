package practice.week06;

class Box {
    public int width;
    public int depth;
    public int height;

    public int getVolume() {return width*depth*height;}
    public String toString() {return "hello I'm box";}
}

public class BoxTest {
    public static void main(String[] args) {
        Box box = new Box();
        box.width = 20;
        box.depth = 20;
        box.height = 30;

        System.out.printf("상자의 가로, 세로, 높이는 %d, %d, %d입니다\n", box.width, box.depth, box.height);
        int volume = box.getVolume();
        System.out.printf("상자의 부피는 %d입니다.\n", volume);
    }
}
