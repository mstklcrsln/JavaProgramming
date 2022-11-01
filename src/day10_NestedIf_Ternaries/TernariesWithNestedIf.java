package day10_NestedIf_Ternaries;

public class TernariesWithNestedIf {
    public static void main(String[] args) {
        int n =25;

        String result = (n>=0 && n<=100)? (n>=60)? "Passed" : "Failed" : "Invalid";
        System.out.println(result);



    }}

  /*      int s= 85;

            String reslt =  (s<=0 && s<=100)? (s>60) ? "Passed" : "Failed": "Invalid Score";

            System.out.println(reslt);}}
      /*} else {
            System.out.println("Invalid Score");
        }
    }
}

  int score= 59;

        if (score >=0 && score<=100) {
            if (score>=60) {
                System.out.println("Passed");}
            else {
                System.out.println("Failed");}
        }

        else {
            System.out.println("null number");
        }
 */