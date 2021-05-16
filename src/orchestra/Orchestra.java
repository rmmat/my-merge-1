package orchestra;

public class Orchestra {
    private void print() {
        System.out.println("===== Orchestra Members =====");
        System.out.println("Conductor");
    }

    public static void main(String[] args) {
        Orchestra orchestra = new Orchestra();

        orchestra.print();
    }
}
