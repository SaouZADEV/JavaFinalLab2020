package exam_09;

public class WorkerComparator implements IWorkerComparator{
    @Override
    public int compare(int a, int b) {
        if((a-b)<0)
            {return -1;}
        else if ((a-b)==0)
                {return 0;}
        return 1;
    }
}
