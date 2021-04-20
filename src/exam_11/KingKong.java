package exam_11;

public class KingKong extends Monster {
    int Hit;

    @Override
    public void attackOpponent(Monster opponent) {
        opponent.decreaseHealth( attackPower + Hit);
    }

    public void Hit(int i) {
        this.Hit = i;
    }

}
