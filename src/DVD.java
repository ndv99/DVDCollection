public class DVD {
    private String title;
    private String director;
    private int runTime;
    private float cost;

    public DVD() {
        title = "";
        director = "";
        runTime = 0; // in minutes
        cost = 0; // in Pounds.
    }

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
}
