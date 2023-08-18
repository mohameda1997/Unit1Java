import java.util.Scanner;

public class MarsExpedition {

    public MarsExpedition() throws InterruptedException {
        Scanner input = new Scanner(System.in);
        System.out.println("Mars Expedition Starting...");
        Thread.sleep(1000);
        System.out.println("Booting up...");
        Thread.sleep(1000);
        System.out.println("3...");
        Thread.sleep(1000);
        System.out.println("2...");
        Thread.sleep(1000);
        System.out.println("1...");
        Thread.sleep(1000);
        System.out.println("Ready!");
        Thread.sleep(1000);

        System.out.println("Please enter your name.");
        String name = input.nextLine();
        System.out.println("Hi "+name+"— Welcome to the Expedition prep program. Are you ready to head out into the new world? Type Y or N");
        String answer = input.nextLine();
        if(answer.equalsIgnoreCase("Y")) {
            System.out.println("I knew you would say that. You are team leader for a reason.");
        }
        else if(answer.equalsIgnoreCase("N")){
            System.out.println("Too bad you are team leader. You have to go.");
        }
        System.out.println("How many people do you want in your team?");
        int teamNum = input.nextInt();
        input.nextLine();

        if(teamNum > 2) {
            System.out.println("That’s way to many people. We can only send 2 more members.");
            teamNum = 2;
        }
        else if(teamNum < 2) {
            System.out.println("Not enough people, need 2 members.");
            teamNum = 2;
        }
        else if(teamNum == 2) {
            System.out.println("Great! Good amount of team members");
        }

        System.out.println("You are allowed to bring one snack with you. What do you want to bring?");
        String snack = input.nextLine();
        System.out.println("Nice choice, you will be bringing "+snack+" with you.");

        System.out.println("Please choose a vehicle from the following list:" + "\n A) Mars Rover " +  "\n B) Chevy Silverado" + "\n C) Honda Civic");
        String vehicle = input.nextLine();

        if(vehicle.equalsIgnoreCase("A")) {
            vehicle = "Mars Rover";
        } else if (vehicle.equalsIgnoreCase("B")) {
            vehicle = "Chevy Silverado";

        } else if (vehicle.equalsIgnoreCase("C")) {

            vehicle = "Honda Civic";
        }

        System.out.println("Welcome " +name+ " and " + teamNum + " new members. Enjoy your " + snack + ". Have a safe trip in your "+vehicle+".");
        System.out.println("Starting in 5...");
        System.out.println("4...");
        System.out.println("3...");
        System.out.println("2...");
        System.out.println("1...");
        System.out.println("READY SET GO!");
    }


}