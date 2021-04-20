package exam_13;

public class Main {

    public static void main(String[] args) {
        Scene  s = new Scene();
        s.addMonster(new Godzilla());
        s.addMonster(new KingKong());
        s.addMonster(new Godzilla());
        s.attackAll();


    }
}
