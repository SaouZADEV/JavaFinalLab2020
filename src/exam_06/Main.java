package exam_06;

public class Main {

    public static void main(String[] args) {
        MyComputing    iobj = new MyComputing();
        double resultAdd = iobj.add(5.0,6.0);
        double resultSub = iobj.subtract(10.5,5.5);
        System.out.println("result of addition="+resultAdd);
        System.out.println("result of subtraction="+resultSub);



    }
}
