import java.util.Scanner;

public class AvarageOfInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Add meg az első számot: ");
        int elso = scanner.nextInt();

        System.out.print("Add meg a második számot: ");
        int masodik = scanner.nextInt();

        System.out.print("Add meg a harmadik számot: ");
        int harmadik = scanner.nextInt();

        System.out.print("Add meg a negyedik számot: ");
        int negyedik = scanner.nextInt();

        System.out.print("Add meg az ötödik számot: ");
        int otodik = scanner.nextInt();

        int ossz = (elso + masodik + harmadik + negyedik + otodik);
        int atlag = (ossz / 5);

        System.out.println("A megadott számok összege:"+ossz+" "+"átlaga pedig:"+atlag);


    }
}
