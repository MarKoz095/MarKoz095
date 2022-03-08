package pl.codegym.task.task05.task0526;

/* 
Mężczyzna i kobieta
*/

public class Solution {
    public static void main(String[] args) {
        //tutaj wpisz swój kod
        Mezczyzna mezczyzna1 = new Mezczyzna("Marcin", 26, "Polska");
        Mezczyzna mezczyzna2 = new Mezczyzna("Stefan", 15, "Chiny");
        System.out.println(mezczyzna1);
        System.out.println(mezczyzna2);

        Kobieta kobieta1 = new Kobieta("Wernionika", 26,  "Anglia");
        Kobieta kobieta2 = new Kobieta("Marta", 99, "Azja");
        System.out.println(kobieta1);
        System.out.println(kobieta2);
    }

    //tutaj wpisz swój kod
    public static class Mezczyzna{
        String imie;
        int wiek;
        String adres;

        public Mezczyzna(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }
        public String toString() {
            return (imie + " " + wiek + " " + adres);
        }
    }

    public static class Kobieta{
        String imie;
        int wiek;
        String adres;

        public Kobieta(String imie, int wiek, String adres) {
            this.imie = imie;
            this.wiek = wiek;
            this.adres = adres;
        }
        public String toString() {
            return (imie + " " + wiek + " " + adres);
        }
    }
}
