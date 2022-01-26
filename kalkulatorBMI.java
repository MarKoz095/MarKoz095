import java.io.BufferedReader;
import java.io.InputStreamReader;


public class kalkulatorBMI {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Waga(kg): ");
        double waga = Double.parseDouble(br.readLine());

        System.out.println("Wzrost(metry): ");
        double wzrost = Double.parseDouble(br.readLine());

        obliczBMI(waga, wzrost);
    }

    public static void obliczBMI(double waga, double wzrost){
        double BMI = waga / (wzrost * wzrost);

        if(BMI < 18.5)
            System.out.println("Niedowaga. BMI wynosi: " + BMI);
        else if(BMI >= 18.5 && BMI < 25)
            System.out.println("Norma. BMI wynosi: " + BMI);
        else if(BMI >= 25 && BMI < 30)
            System.out.println("Nadwaga. BMI wynosi: " + BMI);
        else
            System.out.println("Otyłość. BMI wynosi: " + BMI);

    }
}



