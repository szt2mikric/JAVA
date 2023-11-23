class Plant {
    String name;
    int waterLevel;

    public Plant(String name) {
        this.name = name;
        this.waterLevel = 0;
    }

    public void water(int amount) {
        this.waterLevel += amount;
    }
}

class Flower extends Plant {
    public Flower(String name) {
        super(name);
    }
}

class Tree extends Plant {
    public Tree(String name) {
        super(name);
    }
}

class Garden {
    Flower yellowFlower;
    Flower blueFlower;
    Tree pineTree;
    Tree orangeTree;

    public Garden() {
        yellowFlower = new Flower("Sárga Virág");
        blueFlower = new Flower("Kék virág");
        pineTree = new Tree("Lonc Fa");
        orangeTree = new Tree("Narancs Fa");
    }

    public void addPlantsToGarden() {

        System.out.println("Növények elültetése a kertbe:");
        System.out.println(yellowFlower.name + " Elülteve.");
        System.out.println(blueFlower.name + " Elülteve.");
        System.out.println(pineTree.name + " Elülteve.");
        System.out.println(orangeTree.name + " Elülteve.");
    }

    public void printGardenStatus() {

        System.out.println("\nKert jelenlegi állapota:");
        System.out.println(yellowFlower.name + " Víz szintje: " + yellowFlower.waterLevel);
        System.out.println(blueFlower.name + " Víz szintje: " + blueFlower.waterLevel);
        System.out.println(pineTree.name + " Víz szintje: " + pineTree.waterLevel);
        System.out.println(orangeTree.name + " Víz szintje: " + orangeTree.waterLevel);
    }

    public void waterGarden(int amount) {

        System.out.println("\nMeglocsolva " + amount + " liternyi vízzel:");
        yellowFlower.water(amount);
        blueFlower.water(amount);
        pineTree.water(amount);
        orangeTree.water(amount);
    }
}

public class Main {
    public static void main(String[] args) {

        Garden myGarden = new Garden();
        myGarden.addPlantsToGarden();


        myGarden.printGardenStatus();


        myGarden.waterGarden(40);


        myGarden.printGardenStatus();


        myGarden.waterGarden(70);


        myGarden.printGardenStatus();
    }
}
