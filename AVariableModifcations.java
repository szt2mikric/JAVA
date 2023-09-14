public class AVariableModifcations {
    public static void main(String[] args) {
        //Első feladat

        int a = 3;


        a += 10;


        System.out.println("Az új elem: " + a);

        //Második feladat
        int b = 100;
        b -= 7;
        System.out.println("b miután csökken 7-tel 7: " + b);

        //Harmadik feladat
        int c = 44;
        c *= 2;
        System.out.println("c duplázva: " + c);

        //Negyedik feladat
        int d = 125;
        d /= 5;
        System.out.println("d osztva 5: " + d);

        //Ötödik feladat
        int e = 8;
        e = e * e * e;
        System.out.println("e négyzeten: " + e);

        //Hatodik feladat
        int f1 = 123;
        int f2 = 345;
        boolean isF1GreaterThanF2 = f1 > f2;
        System.out.println("Az f1 nagyobb f2? " + isF1GreaterThanF2);

        //Hetedik feladat
        int g1 = 350;
        int g2 = 200;
        boolean isDoubleG2GreaterThanG1 = (2 * g2) > g1;
        System.out.println("G2 értékének kétszerese nagyobb, mint g1? " + isDoubleG2GreaterThanG1);

        //Nyolcadik feladat
        int h = 135798745;
        boolean isHDivisibleBy11 = h % 11 == 0;
        System.out.println("h osztható-e 11-gyel?" + isHDivisibleBy11);

        //Kilencedik feladat
        int i1 = 10;
        int i2 = 3;
        boolean isI1BetweenI2SquaredAndCubed = (i1 > (i2 * i2)) && (i1 < (i2 * i2 * i2));
        System.out.println(" " + isI1BetweenI2SquaredAndCubed);

        //Tizedik feladat
        int j = 1521;
        boolean isJDivisibleBy3Or5 = (j % 3 == 0) || (j % 5 == 0);
        System.out.println(" " + isJDivisibleBy3Or5);
    }
}
