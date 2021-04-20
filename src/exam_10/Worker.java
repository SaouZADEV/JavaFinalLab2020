package exam_10;


public class Worker extends Person {
    private double rate;
    private int day;
    private String Sid;
    public Worker(String id ,String Sid,String name,  int age, String address) {
        super(id,name,age,address);
        this.Sid = Sid;
    }

    @Override
    public String toString(){
        String address;
        return "PID :" + super.getId()
                + "SID:" +  Sid + 
                " Name :" + super.getName() +
                " age:" + super.age + 
                "address:" + super.address +
                "Rate:" + rate + " baht/day "+
                "Days:" + day;
    }
    public void setRate(double rate) {
        this.rate = rate;
    }
    public void setDays(int day) {
        this.day = day;
    }
}
