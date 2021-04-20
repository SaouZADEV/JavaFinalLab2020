package exam_06;

public class MyComputing implements IAddition,ISubtraction{
    @Override
    public double add(double x, double y) {
        return x+y;
    }

    @Override
    public double subtract(double x, double y) {
        return x-y;
    }
}
