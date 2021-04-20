package exam_01;

public class Person {
    private String id;
    protected String name;
    protected int age;
    public String address;

    public Person(){  }
    public Person(String id ,String name,  int age, String address){
        this.id=id;
        this.name=name;
        this.age =age;
        this.address = address;
    }
    public String getId(){
        return id;
    }

    public String getName(){ return name;}

    public String toString(){
        return id + ":" + name + " age:"+age + " address:"+address;
    }
    private String note(){
        return "my secrete";
    }
}