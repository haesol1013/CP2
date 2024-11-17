package practice.week10;

public class ECar {
    private int battery;
    private int distance;

    public static ECar getInstance() {
        return new ECar();
    }

    public void drive() {
        if (this.battery > 0) {
            this.distance += 1;
            this.battery -= 10;
        }
    }

    public void dispDistance() {
        System.out.printf("거리는 %dkm\n", this.distance);
    }

    public void dispBattery() {
        if (this.battery <= 0) {
            System.out.println("배터리가 끄적되었습니다.");
            return;
        }
        System.out.printf("배터리는 %d%%\n", this.battery);
    }

    public static void main(String[] args) {
        ECar car = ECar.getInstance();
        for (int i = 0 ; i < 5 ; i++) {
            car.drive();
        }
        car.dispDistance();
        car.dispBattery();
    }
}
