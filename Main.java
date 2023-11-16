import java.util.ArrayList;
import java.util.List;

class Noveny {
    protected String nev;
    protected int vizMennyiseg;

    public Noveny(String nev, int vizMennyiseg) {
        this.nev = nev;
        this.vizMennyiseg = vizMennyiseg;
    }

    public boolean vizreVanSzukseg() {
        return false;
    }

    public void ontz(int vizMennyiseg) {
        if (vizreVanSzukseg()) {
            int novekedes = (int) (vizMennyiseg * 0.75);
            this.vizMennyiseg += novekedes;
        }
    }

    public String toString() {
        return "A " + this.nev + " növénynek vízre van szüksége";
    }
}

class Virag extends Noveny {
    public Virag(String nev, int vizMennyiseg) {
        super(nev, vizMennyiseg);
    }

    @Override
    public boolean vizreVanSzukseg() {
        return this.vizMennyiseg < 5;
    }
}

class Fa extends Noveny {
    public Fa(String nev, int vizMennyiseg) {
        super(nev, vizMennyiseg);
    }

    @Override
    public boolean vizreVanSzukseg() {
        return this.vizMennyiseg < 10;
    }

    @Override
    public void ontz(int vizMennyiseg) {
        if (vizreVanSzukseg()) {
            int novekedes = (int) (vizMennyiseg * 0.4);
            this.vizMennyiseg += novekedes;
        }
    }
}

class Kert {
    private List<Noveny> novenyek;

    public Kert() {
        this.novenyek = new ArrayList<>();
    }

    public void novenyHozzaad(Noveny noveny) {
        this.novenyek.add(noveny);
    }

    public void kertAllapot() {
        for (Noveny noveny : this.novenyek) {
            System.out.println(noveny.toString());
        }
    }

    public void ontz(int vizMennyiseg) {
        for (Noveny noveny : this.novenyek) {
            noveny.ontz(vizMennyiseg);
        }
        System.out.println("\nÖntözés " + vizMennyiseg);
        kertAllapot();
    }
}

public class Main {
    public static void main(String[] args) {
        Kert kert = new Kert();

        Virag sargaVirag = new Virag("sárga virág", 3);
        Virag kekVirag = new Virag("kék virág", 6);
        Fa loncFa = new Fa("lonc fa", 8);
        Fa narancsFa = new Fa("narancs fa", 12);

        kert.novenyHozzaad(sargaVirag);
        kert.novenyHozzaad(kekVirag);
        kert.novenyHozzaad(loncFa);
        kert.novenyHozzaad(narancsFa);

        kert.kertAllapot();

        kert.ontz(40);
        kert.ontz(70);
    }
}



