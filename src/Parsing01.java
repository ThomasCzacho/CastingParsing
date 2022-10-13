public class Parsing01 {
    public static void main(String[] args) {
        //Declare and intitialize 3 Strings: shirtPrice, taxRate, and gibberish
        String shirtPrice, taxRate, gibberish;
        shirtPrice = "15";
        taxRate = "0.05";
        gibberish = "887ds7nds87dsfs";


        //Parse shirtPrice and taxRate, and print the total tax
        int shirtPrice2=Integer.parseInt(shirtPrice);
        double taxRate2=Double.parseDouble(taxRate);
        double tax = shirtPrice2*taxRate2;

        System.out.println("Tax: "+tax);


        //Try to parse taxRate as an int

//        int taxRate3=Integer.parseInt(taxRate);

        //Try to parse gibberish as an int

//        int gibberish2=Integer.parseInt(gibberish);
    }

}
