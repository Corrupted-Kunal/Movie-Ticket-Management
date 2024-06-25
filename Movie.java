import java.util.*;

public class Movie {

    public static void main(String[] args) {
        int choice = 0;
        int bookedMovie = 0;  
        int bookedTheater = 0;
        int bookedScreen = 0;
        Scanner sc = new Scanner(System.in);
        String name;

        System.out.println("*******************************");
        System.out.println("\tMovie Ticket Booking");
        System.out.println("*******************************");

        System.out.print("Enter your name: ");
        name = sc.next();

        System.out.println("**********************************************");
        System.out.println("Welcome " + name + " \n to our Movie Ticket Booking System!");
        System.out.println("**********************************************");

        do {
            System.out.println("Enter your choice: ");
            System.out.println("1. Book a ticket");
            System.out.println("2. Cancel a ticket");
            System.out.println("3. View list of movies");
            System.out.println("4. View booked movies");
            System.out.println("5. Exit");
            System.out.println("*******************************");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Please Select a Movie: ");
                    System.out.println("*******************************");
                    System.out.println("1. Avengers Endgame");
                    System.out.println("2. RRR");
                    System.out.println("3. The Lion King");
                    System.out.println("4. Spider-Man: No Way Home");
                    System.out.println("*******************************");
                    System.out.print("Enter the Serial number of the movie you want to book: ");
                    bookedMovie = sc.nextInt();

                    if (bookedMovie >= 1 && bookedMovie <= 4) {
                        System.out.println("Select Theater: ");
                        System.out.println("1. PVR");
                        System.out.println("2. INOX");
                        System.out.println("3. ESquare");
                        System.out.println("*******************************");
                        System.out.print("Enter the Serial number of the theater: ");
                        bookedTheater = sc.nextInt();

                        System.out.println("Select Screen number: ");
                        System.out.println("1. Screen 1");
                        System.out.println("2. Screen 2");
                        System.out.println("3. Screen 3");
                        System.out.println("*******************************");
                        System.out.print("Enter the Screen number: ");
                        bookedScreen = sc.nextInt();

                        if (bookedTheater >= 1 && bookedTheater <= 3 && bookedScreen >= 1 && bookedScreen <= 3) {
                            System.out.println("--------------------------------------");
                            System.out.println("You have booked " + getMovieName(bookedMovie) + " at " + getTheaterName(bookedTheater) + " in screen number " + bookedScreen);
                            System.out.println("--------------------------------------");
                        } else {
                            System.out.println("Invalid choice! Please try again.");
                            bookedMovie = 0; // Reset the booking if theater or screen choice is invalid
                        }
                    } else {
                        System.out.println("Invalid choice! Please try again.");
                        bookedMovie = 0; // Reset the booking if movie choice is invalid
                    }
                    break;

                case 2:
                    if (bookedMovie == 0) {
                        System.out.println("You have not booked any movie yet.");
                    } else {
                        bookedMovie = 0;
                        bookedTheater = 0;
                        bookedScreen = 0;
                        System.out.println("Your ticket has been cancelled.");
                    }
                    System.out.println("*******************************");
                    break;

                case 3:
                    System.out.println("List of Movies: ");
                    System.out.println("*******************************");
                    System.out.println("1. Avengers Endgame");
                    System.out.println("2. RRR");
                    System.out.println("3. The Lion King");
                    System.out.println("4. Spider-Man: No Way Home");
                    System.out.println("*******************************");
                    break;

                case 4:
                    System.out.println("--------------------------------------");
                    if (bookedMovie >= 1 && bookedMovie <= 4) {
                        System.out.println("You have booked " + getMovieName(bookedMovie) + " at " + getTheaterName(bookedTheater) + " in screen number " + bookedScreen);
                    } else {
                        System.out.println("You have not booked any movies yet.");
                    }
                    System.out.println("--------------------------------------");
                    break;

                case 5:
                    System.out.println("Thank you for using the Movie Ticket Booking System!");
                    break;

                default:
                    System.out.println("Wrong choice! Please try again.");
                    System.out.println("*******************************");
                    break;
            }

        } while (choice != 5);

        sc.close();
    }

    private static String getMovieName(int movieNumber) {
        switch (movieNumber) {
            case 1:
                return "Avengers Endgame";
            case 2:
                return "RRR";
            case 3:
                return "The Lion King";
            case 4:
                return "Spider-Man: No Way Home";
            default:
                return "";
        }
    }

    private static String getTheaterName(int theaterNumber) {
        switch (theaterNumber) {
            case 1:
                return "PVR";
            case 2:
                return "INOX";
            case 3:
                return "ESquare";
            default:
                return "";
        }
    }
}
