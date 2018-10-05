import java.util.Scanner;

/**
 * Class to hold DVD collection.
 */
public class Collection {

    private DVD dvd1_ferrisBueller = new DVD();
    private DVD dvd2_starWarsIV = new DVD();
    private DVD dvd3_darkKnight = new DVD();

    /**
     * Main method for class. Creates a new collection and sets the details of every DVD.
     * Displays details of all DVDs.
     * Calls searchCollection.
     * Contains commented-out test code.
     * @param args args.
     */
    public static void main(String[] args){
        Collection myCollection = new Collection();
        myCollection.menu();

//        myCollection.displayDetails();
//
//        test showing that DVD class construction works.
//        DVD dvd1_ferrisBueller = new DVD();
//        dvd1_ferrisBueller.setTitle("Ferris Bueller's Day Off");
//        dvd1_ferrisBueller.setDirector("John Hughes");
//        dvd1_ferrisBueller.setRunTime(103);
//        dvd1_ferrisBueller.setCost(5);
//
//        dvd1_ferrisBueller.displayDetails();
    }

    /**
     * Constructor for Collection. Creates three DVD's:
     * -Star Wars Episode IV
     * -Ferris Bueller's Day Off
     * -The Dark Knight
     */
    public Collection(){
        setAll();
    }

    /**
     * Sets values of all three DVD's in collection.
     */
    public void setAll(){
        dvd1_ferrisBueller.setAll("Ferris Bueller's Day Off", "John Hughes", 103, 5);
        dvd2_starWarsIV.setAll("Star Wars - Episode IV: A new Hope", "George Lucas", 125, 5);
        dvd3_darkKnight.setAll("The Dark Knight", "Christpher Nolan", 152, 5);
    }

    /**
     * Displays details of all DVDs in collection.
     */
    public void displayDetails(){
        System.out.println("DVD 1:");
        dvd1_ferrisBueller.displayDetails();
        System.out.println("\nDVD 2:");
        dvd2_starWarsIV.displayDetails();
        System.out.println("\nDVD 3:");
        dvd3_darkKnight.displayDetails();
    }

    /**
     * Allows a user to search the collection from the console.
     */

    public void searchCollection(){
        Scanner searchScanner = new Scanner(System.in);
        System.out.println("Search for a movie title: ");
        String search = searchScanner.nextLine();
        String dvd1Title = dvd1_ferrisBueller.getTitle();
        String dvd2Title = dvd2_starWarsIV.getTitle();
        String dvd3Title = dvd3_darkKnight.getTitle();
        if (search.equals(dvd1Title)){
            System.out.println("Found: " + dvd1Title);
        }else if (search.equals(dvd2Title)){
            System.out.println("Found: " + dvd2Title);
        }else if (search.equals(dvd3Title)){
            System.out.println("Found: " + dvd3Title);
        }else{
            System.out.println("No results found.");
        }
    }

    /**
     * Calculates the total value of the collection in pounds.
     * @return float with the total value.
     */
    public float totalValue(){
        float dvd1_val = dvd1_ferrisBueller.getCost();
        float dvd2_val = dvd2_starWarsIV.getCost();
        float dvd3_val = dvd3_darkKnight.getCost();
        return dvd1_val + dvd2_val + dvd3_val;
    }

    /**
     * Calculates the total runtime of the collection in minutes.
     * @return int of total runtime.
     */
    public int totalRunTime(){
        int dvd1_run = dvd1_ferrisBueller.getRunTime();
        int dvd2_run = dvd2_starWarsIV.getRunTime();
        int dvd3_run = dvd3_darkKnight.getRunTime();
        return dvd1_run + dvd2_run + dvd3_run;
    }

    /**
     * Displays an in-console menu with four options:
     * -Display all DVDs
     * -Search DVDs
     * -Display total value
     * -Display total runtime
     */
    public void menu(){
        Scanner menuScanner = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println();
        System.out.println("1. Display all DVDs");
        System.out.println("2. Search DVDs");
        System.out.println("3. Display total value");
        System.out.println("4. Display total runtime");

        String menuChoice = menuScanner.nextLine();
        if (menuChoice.equals("1")){
            displayDetails();
            menu();
        } else if (menuChoice.equals("2")){
            searchCollection();
            menu();
        } else if (menuChoice.equals("3")){
            float totalVal = totalValue();
            System.out.println("Total value: £" + totalVal);
            menu();
        } else if (menuChoice.equals("4")){
            int totalRun = totalRunTime();
            System.out.println("Total runtime: " + totalRun + "minutes.");
            menu();
        } else{
            System.out.println("That input is invalid.");
            menu();
        }
    }
}
