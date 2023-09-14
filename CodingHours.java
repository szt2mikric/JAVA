public class CodingHours {
    public static void main(String[] args) {

        int hoursPerDay = 6;
        int daysPerWeek = 5;
        int numberOfWeeksInSemester = 17;
        int averageWorkHoursWeekly = 52;


        int totalCodingHours = hoursPerDay * daysPerWeek * numberOfWeeksInSemester;

        double percentageOfCodingHours = ((double) totalCodingHours / averageWorkHoursWeekly) * 100;

        System.out.println("össz kódolási óra szemszteren: " + totalCodingHours + " óra");
        System.out.println("A kódolási órák százalékos aránya a heti átlagos munkaórákhoz viszonyítva: " + percentageOfCodingHours + "%");


    }
}
