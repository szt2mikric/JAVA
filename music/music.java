package music;

public class music {


    public abstract class Instrument {
        protected String name;

        public abstract void play();
    }

    public abstract class StringedInstrument extends Instrument {
        protected int numberOfStrings;

        public StringedInstrument(int numberOfStrings) {
            this.numberOfStrings = numberOfStrings;
        }

        public abstract void sound();
    }

    public class ElectricGuitar extends StringedInstrument {
        public ElectricGuitar() {
            super(6); // 6 húr
            this.name = "Electric Guitar";
        }

        @Override
        public void sound() {
            System.out.println("Electric Guitar sound: Twang");
        }

        @Override
        public void play() {
            System.out.print(name + " with " + numberOfStrings + " strings ");
            sound();
        }
    }

    public class BassGuitar extends StringedInstrument {
        public BassGuitar() {
            super(4); // 4 húr
            this.name = "Bass Guitar";
        }

        @Override
        public void sound() {
            System.out.println("Bass Guitar sound: Duum-duum-duum");
        }

        @Override
        public void play() {
            System.out.print(name + " with " + numberOfStrings + " strings ");
            sound();
        }
    }

    public class Violin extends StringedInstrument {
        public Violin() {
            super(4); // 4 húr
            this.name = "Violin";
        }

        @Override
        public void sound() {
            System.out.println("Violin sound: Screech");
        }

        @Override
        public void play() {
            System.out.print(name + " with " + numberOfStrings + " strings ");
            sound();
        }
    }



}
