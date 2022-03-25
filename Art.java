public class Art extends Submission{
    private String medium;

    public Art(){
        super("N/A", 0, "N/A","N/A");
        medium = "N/A";
    }

    public Art(String n, int y, String u, String t){
        super(n, y, u,t);
    }
}
