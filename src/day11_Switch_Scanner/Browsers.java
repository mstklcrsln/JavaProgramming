package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {

        String browserName = "firefox";
        String result = "";

        boolean validBrowser = browserName== "chrome" || browserName =="firefox" || browserName== "opera"
                                                || browserName == "safari" || browserName== "edge";

            if (validBrowser) { // if this is true then we have 5 possibilities.
                if (browserName== "chrome") {
                    result= "Chrome browser is selected";
                } else if (browserName == "firefox") {
                    result= "Firefox browser is selected";
                }else if (browserName== "opera") {
                    result= "Opera browser is selected";
                }else if (browserName== "safari") {
                    result= "Safari browser is selected";
                }else {
                    result= "Edge browser is selected";
            }
            }else {
               result = "Invalid Browser Name";
            }
                System.out.println(result);


}
}

