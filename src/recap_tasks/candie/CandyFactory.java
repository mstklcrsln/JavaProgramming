package recap_tasks.candie;

import recap_tasks.candie.Candie;

import java.util.ArrayList;
import java.util.Arrays;

public class CandyFactory {
    public static void main(String[] args) {


        Candie candie = new Candie("Mest", 2,0, false);
        Candie candie1 = new Candie("Cand", 3,6, true);
        Candie candie2 = new Candie("ASL", 4,7, false);
        Candie candie3 = new Candie("ikt", 5,8, true);
        Candie candie4 = new Candie("Vlad", 6,9, false);

        ArrayList <Candie> candies = new ArrayList<>();
        candies.addAll(Arrays.asList(candie1,candie2,candie3,candie4,candie));


        for (Candie candy : candies) {
            System.out.println(candy.getBrand()+" : "+ candy.getPrice());
        }



    }
}
