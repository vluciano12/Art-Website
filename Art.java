public class Art extends Submission{
    private String medium;

    public Art(){
        super("N/A", 0, "N/A","Art");
        medium = "N/A";
    }

    public Art(String n, int y, String u, String m){
        super(n, y, u, "Art");
        medium = m;
    }

    public String toString(){
        return super.toString() + " It is a " + medium + " project.";
    }
}
