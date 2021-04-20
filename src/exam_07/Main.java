package exam_07;

public class Main {

    public static void main(String[] args) {
        IAddition ia =(a,b)->(a+b);
        System.out.println(ia.add(15.5,4.5));
        ISubtraction is =(a,b)->(a-b);
        System.out.println(is.subtract(15.5,5.5));



    }
}