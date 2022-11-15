package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeCalculator {
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<>();
        scores.addAll(Arrays.asList(100,90,75,85,65,55,45,65, 66, 61,73,73,25,35));
        // we want to know haw many A, how many B....

        ArrayList<Integer> gradeOfA = new ArrayList<>(scores); //90~100
        // we need to remove all the elements which are not matching grede A
        gradeOfA.removeIf(p-> !(p>=90&& p<=100));
        System.out.println(gradeOfA); //[100, 90]

        ArrayList<Integer> gradeOfB = new ArrayList<>(scores);//80~89
        gradeOfB.removeIf(p-> !(p>=80 && p<=89)); // we use !  because if the score is not B we remove that score
        System.out.println(gradeOfB); //[85]

        ArrayList<Integer> gradeOfC = new ArrayList<>(scores);//70~79
        gradeOfC.removeIf( p-> ! (p>=70 && p<=79));
        System.out.println(gradeOfC); //[75, 73, 73]

        ArrayList<Integer> gradeOfD = new ArrayList<>(scores);//60~69
        gradeOfD.removeIf(p-> !(p>=60 && p<=69));
        System.out.println(gradeOfD); //[65, 65, 66, 61]

        ArrayList<Integer> gradeOfF = new ArrayList<>(scores);//0~59

        gradeOfF.removeAll(gradeOfA);
        gradeOfF.removeAll(gradeOfB);
        gradeOfF.removeAll(gradeOfC);
        gradeOfF.removeAll(gradeOfD);
        System.out.println(gradeOfF); //[55, 45, 25, 35]

          /* ArrayList<Integer> gradeOfA = new ArrayList<>(); //90~100
        ArrayList<Integer> gradeOfB = new ArrayList<>();//80~89
        ArrayList<Integer> gradeOfC = new ArrayList<>();//70~79
        ArrayList<Integer> gradeOfD = new ArrayList<>();//60~69
        ArrayList<Integer> gradeOfF = new ArrayList<>();//0~59
        */
        System.out.println("Total number of A is :" + gradeOfA.size());
        System.out.println("Total number of B is :" + gradeOfB.size());
        System.out.println("Total number of C is :" + gradeOfC.size());
        System.out.println("Total number of D is :" + gradeOfD.size());
        System.out.println("Total number of F is :" + gradeOfF.size());
        /*
        Total number of A is :2
        Total number of B is :1
        Total number of C is :3
        Total number of D is :4
        Total number of F is :4
         */
    }
}
