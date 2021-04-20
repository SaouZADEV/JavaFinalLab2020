package exam_01;

public class Student extends Person {
    private double GPA;
    private String Sid;
    public Student(String id ,String Sid,String name,  int age, String address) {
        super(id,name,age,address);
        this.Sid = Sid;
    }
    @Override
    public String toString(){
        return "PID :"+super.getId() + "SID:"+Sid +" Name :"+ super.getName() +
                " age:"+super.age + " super.address:"+address + "GPA"+GPA;
    }
    public void setGPA(double GPA) {
        this.GPA = GPA;
    }
}