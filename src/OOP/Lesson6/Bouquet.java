//import java.util.ArrayList;
//import java.util.LinkedHashSet;
//
//public class Bouquet extends Present {
//    private ArrayList<Plant> plants;
//
//    public Bouquet() {
//        plants = new ArrayList<>();
//    }
//    public void addFlower(Flower flower) {
//        if(!plants.contains(flower)) {
//            plants.add(flower);
//        }
//    }
//    public void addDecore(Decor decor) {
//        if(!plants.contains(decor)) {
//            plants.add(decor);
//        }
//    }
//
//    public void sort() {
//        plants.sort(new PlantByNameComparator());
//    }
//
//    @Override
//    public String toString() {
//        String res = "{";
//        for(Plant plant: plants) {
//            res += plant.toString() + ", ";
//        }
//        return res + "}";
//    }
//}
