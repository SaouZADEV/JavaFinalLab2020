package exam_11;

class  Monster {
    protected String name;
    protected double health = 100.0;
    protected long experience = 0;
    protected int attackPower = 1;

    public Monster(){

    }

    public void decreaseHealth(double h){
        this.health = this.health-h;
    }

    public void attackOpponent(Monster opponent){
        opponent.decreaseHealth(attackPower);
    }

    public double getHealth() {
            return health;
    }
}