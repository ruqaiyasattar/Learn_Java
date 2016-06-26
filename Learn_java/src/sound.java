public class sound {
    public static void main(String args[]) {


        int fuelPerLitre = 100;
        if (fuelPerLitre <=100 && fuelPerLitre <= 150){
            System.out.println("Your fuel charges for 5litres will be in between Rs. 500 and Rs. 750");
        }
        else if (fuelPerLitre <=90 && fuelPerLitre<=100){
            System.out.println("Your fuel charges for 5litres will be in between Rs. 450 and Rs. 500");
        }
        else if (fuelPerLitre !=90 && fuelPerLitre!=100){
            System.out.println("Your fuel charges for 5 litres fuel is not decided yet");
        }

    }}