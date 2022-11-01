package day21_ForEachLoop;

public class Initials {
    public static void main(String[] args) {

        //initialize for each students ==> first letters
        String [] words = {"Gunay Demir", "Anna Kesut ", "Zuhal mete ", "Ahmet basak ", "Maria derin ", "Sinema gunay ", "gunay Deniz", "anna initial ", "zuhal loop ", "ahmet DEmiroz", "maria Maria", "sinem Sinem"};


        for (String each :words ) {
            String initial = each.charAt(0)+ "."  + each.charAt( each.indexOf(" ")+1  );

            System.out.println(initial);         }
            /*
            G.D
A.K
Z.m
A.b
M.d
S.g
g.D
a.i
z.l
a.D
m.M
s.S*/




    }
}
