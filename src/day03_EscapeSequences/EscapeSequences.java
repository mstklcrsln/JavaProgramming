package day03_EscapeSequences;

import java.sql.SQLOutput;

public class EscapeSequences {
    public static void main(String[] args) {
        System.out.println("Java \nPyhtoh \nC# ");

        System.out.println("------------------------------------------");

        System.out.println("Hello Cydeo \nHow are you all today? \nIt's nice to see all you all! \nWhat class do we have next week? ");

        System.out.println("    Java is Cool Programming Language");

        System.out.println("-----------------------------");

        System.out.println("/ \\");
        System.out.println("----------------------");
        System.out.println("I like \"Java\"");
        System.out.println("My favorite TV show is \"Game of Thrones\"");

    }

}

/*
\ backword slash: it is only for escape sequences
   \n: starts a new line  n:new (önüne konulduğu karakterden sonra yeni satıra geçiyor)
   System.out.println("Java \nPyhtoh \nC# ");

   \t: paragraph space(tab) t:tab (\t kaç kere basarsan o kadar tab gider)

   \\ : single back slash (ters eğik çizgi)  (iki tane bundan koyarsan program bu işareti tek algılıyor)

   \" : double quote (çift tırnak) ("I like \"Java\""); in order to print double coute we need to use \"

   \\ backslash: (iki tane bundan koyarsan program bu işareti tek algılıyor)
    */