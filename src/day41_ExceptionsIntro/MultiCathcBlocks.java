package day41_ExceptionsIntro;

import day39_Inheritence_Encapsulation.cydeoTask.Employee;

public class MultiCathcBlocks {
    public static void main(String[] args) {


        Employee employee = null;

         /*
         try{
            System.out.println(employee.getSalary() ); // object is null we can not reach it
        } catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("second catch block");
            e.printStackTrace();
        } catch (RuntimeException e){
            System.out.println("Third catch");
            e.printStackTrace();
        }

            in the console

            Third catch
            java.lang.NullPointerException
                at day41_ExceptionsIntro.MultiCathcBlocks.main(MultiCathcBlocks.java:12)

            Process finished with exit code 0
             */


        try{
            System.out.println(employee.getSalary() ); // object is null we can not reach it NullPointerException
        } catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        } catch (ArithmeticException e){
            System.out.println("second catch block");
            e.printStackTrace();
        } catch (ClassCastException e){ // we give different class name and none of these catch blocks can find the bug
            System.out.println("Third catch");
            e.printStackTrace(); // these catch blocks can find the bug and we give one more catch block
        } catch (RuntimeException e){
            System.out.println("Fourth catch block");
            e.printStackTrace();
        }

        System.out.println("Test Completed"); // it will not write this. Program will terminated
        /*
        in the console it writes

        Exception in thread "main" java.lang.NullPointerException
        at day41_ExceptionsIntro.MultiCathcBlocks.main(MultiCathcBlocks.java:36)

        Process finished with exit code 1
         */

        /*
        after fourh  catch block it writes
        Fourth catch block
        Test Completed
        java.lang.NullPointerException
            at day41_ExceptionsIntro.MultiCathcBlocks.main(MultiCathcBlocks.java:36)

        Process finished with exit code 0
         */
    }
}
