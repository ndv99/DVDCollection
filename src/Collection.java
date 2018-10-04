public class Collection {
    /**
     * Class to hold DVD collection.
     *
     * @param args No params.
     */

    public static void main(String[] args){

        // new DVD for Ferris Bueller's day off.
        DVD ferrisBueller = new DVD();
        ferrisBueller.setTitle("Ferris Bueller's Day Off");
        ferrisBueller.setDirector("John Hughes");
        ferrisBueller.setRunTime(103);
        ferrisBueller.setCost(5);

        ferrisBueller.displayDetails();
    }

    public Collection(){
    }
}
