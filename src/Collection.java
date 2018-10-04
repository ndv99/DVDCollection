/**
 * Class to hold DVD collection.
 */
public class Collection {

    private DVD dvd1_ferrisBueller = new DVD();
    private DVD dvd2_starWarsIV = new DVD();
    private DVD dvd3_darkKnight = new DVD();

    /**
     * Main method for class. Contains commented-out test code.
     * @param args args.
     */
    public static void main(String[] args){

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
        System.out.println("DVD 3:");
        dvd3_darkKnight.displayDetails();
    }
}
