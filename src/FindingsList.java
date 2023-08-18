import java.util.*;

public class FindingsList {

    public FindingsList() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back!");
        //Initialize an ArrayList
        ArrayList<String> rock = new ArrayList<String>();
        rock.add("rock");
        rock.add("weird rock");
        rock.add("smooth rock");
        rock.add("not rock");
        System.out.println("Download Successful! List of Rocks:");
        for(String element: rock) {
            System.out.println(element);
        }
        rock.remove("not rock");
        System.out.println("Perfect! List of Rocks:");
        for(String element: rock) {
            System.out.println(element);
        }
        Thread.sleep(1000);
        //Hashmap stores items in key/value pairs
        HashMap<String, String> fossil= new HashMap<>();
        fossil.put("Bird Fossil","The fossil has wings implying it was capable of flight");
        fossil.put("Fish Fossil","The fossil is vaguely fish shaped implies there was once water");
        fossil.put("Tooth Fossil","The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded.");
        System.out.println("Which of the fossils would you like to learn more about? (Bird, Fish, or Tooth)");
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        if(choice.equalsIgnoreCase("Bird")) {
            System.out.println("Fossil: " + choice + "\nDescription: " + fossil.get("Bird Fossil"));
        } else if (choice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + choice + "\nDescription: " + fossil.get("Fish Fossil"));
        } else if (choice.equalsIgnoreCase("Tooth")) {
            System.out.println("Fossil: " + choice + "\nDescription: " + fossil.get("Tooth Fossil"));
        }

        Thread.sleep(700);
        //HashSet is a collection of items where every item is unique
        HashSet<String> supplies = new HashSet<String>();
        supplies.add("Water");
        supplies.add("Med Kit");
        supplies.add("Protein Bar");
        // creates Iterator object.
        Iterator itr = supplies.iterator();
        while (itr.hasNext()) {
            System.out.println("Supplies Before Expedition:" + itr.next());
        }
        supplies.remove("Protein Bar");


        System.out.println("Supplies After Expedition:");
        for(String element: supplies) {
            System.out.println(element);
        }
    }
}
