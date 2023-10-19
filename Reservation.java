import java.util.Random;






        interface ReservationInterface {
            String getReservationCode();
            String getDayOfWeek();
        }

        public class Reservation implements ReservationInterface {
            private String code;
            private String[] DOW = {"MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN"};

            public Reservation() {
                this.code = generateReservationCode();
            }


            private String generateReservationCode() {
                StringBuilder codeBuilder = new StringBuilder();
                Random random = new Random();
                String characters = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

                for (int i = 0; i < 8; i++) {
                    int index = random.nextInt(characters.length());
                    char randomChar = characters.charAt(index);
                    codeBuilder.append(randomChar);
                }

                return codeBuilder.toString();
            }


            @Override
            public String getReservationCode() {
                return code;
            }


            @Override
            public String getDayOfWeek() {
                Random random = new Random();
                int index = random.nextInt(DOW.length);
                return DOW[index];
            }

            public static void main(String[] args) {
                Reservation reservation = new Reservation();

                System.out.println("Booking#"+ reservation.getReservationCode()+"for"+reservation.getDayOfWeek());
                System.out.println("Booking#"+ reservation.getReservationCode()+"for"+reservation.getDayOfWeek());
                System.out.println("Booking#"+ reservation.getReservationCode()+"for"+reservation.getDayOfWeek());
                System.out.println("Booking#"+ reservation.getReservationCode()+"for"+reservation.getDayOfWeek());
                System.out.println("Booking#"+ reservation.getReservationCode()+"for"+reservation.getDayOfWeek());
                System.out.println("Booking#"+ reservation.getReservationCode()+"for"+reservation.getDayOfWeek());




            }
        }











