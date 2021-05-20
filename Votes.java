import java.util.Random;

public class Votes {

    //Declare Variables
    private String student1;
    private String student2;
    private String student3;
    private int votes1;
    private int votes2;
    private int votes3;
    private double totalVotes;
    private double averageVotes;

    //Constructor
    public Votes()
    {
        //Assign default values to variables on creation
        student1 = " ";
        student2 = " ";
        student3 = " ";
        votes1 = 0;
        votes2 = 0;
        votes3 = 0;
    }

    //Generates random reference number
    public int getReferenceNumber(){
        Random r = new Random();
        return r.nextInt(100 - 1) + 1;
    }

    //Prints the Report to the screen
    public void printReport(){
        System.out.println("STUDENT COUNCIL VOTING REPORT");
        System.out.println("*******************************");
        System.out.println("REF#: " + getReferenceNumber());
        System.out.println("STUDENT 1:" + getStudent1());
        System.out.println("VOTES: " + getVotes1());
        System.out.println("STUDENT 2: " + getStudent2());
        System.out.println("VOTES: " + getVotes2());
        System.out.println("STUDENT 3: " + getStudent3());
        System.out.println("VOTES 3: " + getVotes3());
        System.out.println("TOTAL VOTES: " + getTotalVotes());
        System.out.println("AVERAGE VOTES: " + getAverageVotes());
        System.out.println("*******************************");

        if(getTotalVotes() > 150){
            System.out.println("GOOD VOTING ATTENDANCE");
        }else
        {
            System.out.println("POOR VOTING ATTENDANCE");
        }

        System.out.println("*******************************");
    }

    /**
     *
     * Getters and Setters
     *
     */
    public String getStudent1() {
        return student1;
    }

    public void setStudent1(String student1) {
        this.student1 = student1;
    }

    public String getStudent2() {
        return student2;
    }

    public void setStudent2(String student2) {
        this.student2 = student2;
    }

    public String getStudent3() {
        return student3;
    }

    public void setStudent3(String student3) {
        this.student3 = student3;
    }

    public int getVotes1() {
        return votes1;
    }

    public void setVotes1(int votes1) {
        this.votes1 = votes1;
    }

    public int getVotes2() {
        return votes2;
    }

    public void setVotes2(int votes2) {
        this.votes2 = votes2;
    }

    public int getVotes3() {
        return votes3;
    }

    public void setVotes3(int votes3) {
        this.votes3 = votes3;
    }

    public double getTotalVotes() {
        return totalVotes;
    }

    public void setTotalVotes() {
        this.totalVotes = (votes1 + votes2 + votes3);
    }

    public double getAverageVotes() {
        return averageVotes;
    }

    public void setAverageVotes() {
        this.averageVotes = (getTotalVotes() / 3);
    }

}
