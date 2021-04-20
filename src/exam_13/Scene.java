package exam_13;

import java.util.ArrayList;
import java.util.List;
public class Scene {
    List<Monster> Mon = new ArrayList<Monster>();
    public void addMonster(Monster mon){
        Mon.add(mon);
    }
    public void attackAll() {
        for (Monster mon : Mon) {
            System.out.println(mon.attack());

            }
        }
    }