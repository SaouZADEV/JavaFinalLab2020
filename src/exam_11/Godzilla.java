package exam_11;

public class Godzilla extends KingKong {
    int KongHit;

    @Override
    public void attackOpponent(Monster oppenent) {
        oppenent.decreaseHealth(attackPower + Hit + KongHit);
    }

    public void Hit(int i) {
        this.KongHit = i;
    }

}