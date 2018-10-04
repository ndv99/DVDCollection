public class Collection {
    /**
     * Class to hold DVD collection.
     *
     * @param args No params.
     */

    DVD ferrisBueller = new DVD();
    DVD starWarsIV = new DVD();
    DVD darkKnight = new DVD();

    public static void main(String[] args){

//        test showing that DVD class construction works.
//        DVD ferrisBueller = new DVD();
//        ferrisBueller.setTitle("Ferris Bueller's Day Off");
//        ferrisBueller.setDirector("John Hughes");
//        ferrisBueller.setRunTime(103);
//        ferrisBueller.setCost(5);
//
//        ferrisBueller.displayDetails();
    }

    /**
     * Constructor for Collection. Creates three DVD's:
     * -Star Wars Episode IV
     * -Ferris Bueller's Day Off
     * -The Dark Knight
     */
    public Collection(){
        ferrisBueller.setAll("Ferris Bueller's Day Off", "John Hughes", 103, 5);
        starWarsIV.setAll("Star Wars - Episode IV: A new Hope", "George Lucas", 125, 5);
        darkKnight.setAll("The Dark Knight", "Christpher Nolan", 152, 5);
    }
}
