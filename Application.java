import java.util.Random;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Votes votes = new Votes();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter first student name >> ");
        votes.setStudent1(input.next());
        System.out.println("How many votes did student " + votes.getStudent1() + " receive? ");
        votes.setVotes1(input.nextInt());

        System.out.println("Enter second student name >> ");
        votes.setStudent2(input.next());
        System.out.println("How many votes did student " + votes.getStudent2() + " receive? ");
        votes.setVotes2(input.nextInt());

        System.out.println("Enter third student name >> ");
        votes.setStudent3(input.next());
        System.out.println("How many votes did student " + votes.getStudent3() + " recieve? ");
        votes.setVotes3(input.nextInt());
        votes.setTotalVotes();
        votes.setAverageVotes();

        votes.printReport();

    }
}
