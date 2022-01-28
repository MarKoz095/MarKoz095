import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Kalkulator {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Wybierz operacje:\n 1. Dodawanie \n 2. Odejmowanie \n 3. Mnożenie \n 4. Dzielenie \n");
        int wybor = Integer.parseInt(reader.readLine());

        System.out.println("Podaj pierwszą libczę: ");
        int num1 = Integer.parseInt(reader.readLine());

        System.out.println("Podaj drugą liczbę: ");
        int num2 = Integer.parseInt(reader.readLine());


        if(wybor == 1)
            System.out.println("Wynik to: " + (num1+num2));
        else if(wybor == 2)
            System.out.println("Wynik to: " + (num1-num2));
        else if(wybor == 3)
            System.out.println("Wynik to: " + (num1*num2));
        else if(wybor == 4 && num2 != 0)
            System.out.println("Wynik to: " + (num1/(double)num2));
        else System.out.println("Wybierz poprawne działanie");

    }
}
