package day18_Nested_Loop;

public class NestedLoopIntro {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");  // 5 wooden spoon on the console
            // if we need to write 20 wooden spoon on the console we
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");  // 5 wooden spoon on the console
            // if we need to write 20 wooden spoon on the console we
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");  // 5 wooden spoon on the console
            // if we need to write 20 wooden spoon on the console we
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");  // 5 wooden spoon on the console
            // if we need to write 20 wooden spoon on the console we
        }
        // we write 20 times by using 4 same loop

        System.out.println("--------------------------------------------"        );

        // the responsibility of tehe outer loop is to repeat inner   loop this is nested loop
        for (int j = 0; j < 4; j++) {                // j: 0,1,2,3, we make 5*4 times writing
            for (int i = 0; i < 5; i++) {
                System.out.println("Wooden Spoon");  // 5 wooden spoon on the console
                // if we need to write 20 wooden spoon on the console we
            }

        }
    }
}
