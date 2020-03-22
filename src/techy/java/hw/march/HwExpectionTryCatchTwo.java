package techy.java.hw.march;

public class HwExpectionTryCatchTwo {


    public static void main (String [] args){
        try {
            String[] nam = {"Shakib", "Mashrafe", "Mushfiq", "Tamim"};
            System.out.println(nam[5]);
        } catch (Exception e) {

            System.out.println("Check your code....Something went worng");
        } finally {
            System.out.println("The 'try catch' is finished.");

        }
    }

}
