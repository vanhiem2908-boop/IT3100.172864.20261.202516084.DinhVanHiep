
public class DigitalVideoDisc {
    private String title;
    private String category;
    private String director;
    private int length;
    private double cost;

    private static int nbDigitalVideoDiscs = 0;
    private int id;

    public DigitalVideoDisc(String title) {
        this(title, null, null, 0, 0.0);
    }

    public DigitalVideoDisc(String category, String title, double cost) {
        this(title, category, null, 0, cost);
    }

    public DigitalVideoDisc(String director, String category,
                            String title, double cost) {
        this(title, category, director, 0, cost);
    }

    public DigitalVideoDisc(String title, String category,
                            String director, int length, double cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;

        nbDigitalVideoDiscs++;
        this.id = nbDigitalVideoDiscs;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public double getCost() {
        return cost;
    }

    public int getId() {
        return id;
    }

    public static int getNbDigitalVideoDiscs() {
        return nbDigitalVideoDiscs;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}

