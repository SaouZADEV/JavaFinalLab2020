package exam_09;

public class Main {

    public static void main(String[] args) {
        Anonymous anno = new Anonymous(){
            public int compare(double a,double b){
                if((a-b)<0)
                {return -1;}
                else if ((a-b)==0)
                {return 0;}
                return 1;
            }
        };
        System.out.println(anno.compare(5000,2000));


    }
}
