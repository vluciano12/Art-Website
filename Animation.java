public class Animation extends Art {
    private int length;

    public Animation(){
        super("N/A", 0, "N/A", "N/A");
        length = 0;
    }

    public Animation(String n, int y, String u, String m, int l){
        super(n, y, u, m);
        length = l;
    }

    public String toString(){
        return super.toString() + " It is " + length + " minutes in length.";
    }
}
