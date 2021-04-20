package exam_11;

public class Main {
    public static void main(String[] args) {
        Monster  r = new Monster();
        Godzilla f = new Godzilla();

        r.decreaseHealth(10);
        f.Hit(23);
        f.attackOpponent(r);

        System.out.println( "Health score of r = " + r.getHealth());
        System.out.println( "Health score of f = " + f.getHealth());

    }
}
