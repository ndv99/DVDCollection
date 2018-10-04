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

        // print DVD information. will make method for this later in DVD.
        System.out.println(ferrisBueller.getTitle());
        System.out.println(ferrisBueller.getDirector());
        System.out.println(ferrisBueller.getRunTime());
        System.out.println(ferrisBueller.getCost());
    }

    public Collection(){
    }
}
