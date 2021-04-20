package exam_08;

public class Main {

    public static void main(String[] args) {
        WorkerComparator sa = new WorkerComparator();
        System.out.println(sa.compare(40,50));
        System.out.println(sa.compare(10,10));
        System.out.println(sa.compare(35,22));

    }
}