package exam_05;

public class Main {

    public static void main(String[] args) {
        IAddition    iobj = new MyComputing();
        double result = iobj.add(5.0,6.0);
        System.out.println("result="+result);
    }
}
