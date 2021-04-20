package exam_10;

public class Main {

    public static void main(String[] args) {


        IWorkerComparator iw =(a,b)-> {if((a-b)<0)
        {return -1;}
        else if ((a-b)==0)
        {return 0;}
            return 1; };
        Person w1 = new Worker("5010","W011","Bian",35, "44 Khon Kaen");
        Person w2 = new Worker("64010","W031","Ken",45, "64 Khon Kaen");
        System.out.println(iw.compare(w1.age, w2.age));
        System.out.println(iw.compare(w2.age, w1.age));

    }
}