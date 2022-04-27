package CoreLesson3;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList <T> box = new ArrayList<>();

    public Box(){}

    public float getWeight(){
        float weight = 0.0f;
        for (int i = 0; i < box.size(); i++) {
            weight = weight + box.get(i).getWeight();
        } return weight;
    }

    public boolean compare(Box<? extends Fruit> simpleBox) {
        return getWeight() == simpleBox.getWeight();
//        if(getWeight() == simpleBox.getWeight()) {
//            return true;
//        } else {
//            return false;
//        }
    }

    public void transferFruit (Box <T> anotherBox){
        anotherBox.box.addAll(box);
        box.clear();
    }

    public void addFruit(T fruit, int quantity){
        for(int i = 0; i < quantity; i++){
            box.add (fruit);
        }
    }
}