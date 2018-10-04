public class DVD {
    private String title;
    private String director;
    private int runTime;
    private float cost;

    /**
     * Constructor method for DVD class. Objects created in this way should use setters to set field values.
     */
    public DVD() {
        title = "";
        director = "";
        runTime = 0; // in minutes
        cost = 0; // in Pounds.
    }

    /**
     * Second constructor method for DVD class. This one takes four args - one for each field.
     *
     * @param title String for the title of the film
     * @param director String for the director of the film.
     * @param runTime int for film runtime (minutes).
     * @param cost float for the cost of the film (pounds).
     */
    public DVD(String title, String director, int runTime, float cost) {
        this.title = title;
        this.director = director;
        this.runTime = runTime;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setAll(String title, String director, int runTime, float cost){
        setTitle(title);
        setDirector(director);
        setRunTime(runTime);
        setCost(cost);
    }
}
