public class CodingHours {
    public static void main(String[] args) {

        int hoursPerDay = 6;
        int daysPerWeek = 5;
        int numberOfWeeksInSemester = 17;
        int averageWorkHoursWeekly = 52;


        int totalCodingHours = hoursPerDay * daysPerWeek * numberOfWeeksInSemester;

        double percentageOfCodingHours = ((double) totalCodingHours / averageWorkHoursWeekly) * 100;

        System.out.println("Total coding hours in the semester: " + totalCodingHours + " hours");
        System.out.println("Percentage of coding hours relative to the average work hours weekly: " + percentageOfCodingHours + "%");


    }
}
