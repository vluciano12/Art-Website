import java.util.ArrayList;

public class Tester{
    public static void main(String[] args) {
        ArrayList<Submission> test = new ArrayList<Submission>();

        Submission mona = new Submission("Mona Lisa", 1503, "DaVinci43", "Art");
        Art guy = new Art("Guy", 2009, "mariofan2003", "Digital");
        Animation dance = new Animation("dancing", 2012, "CoolGuy24", "Digital", 3);
        System.out.println(mona);
        test.add(mona);
        test.add(guy);
        test.add(dance);
        mona.addComment("CoolGuy24", "Wow! This is awesome!");
        mona.addComment("mariofan2003", "i like it");

        mona.printComments();
        System.out.println(guy);
        System.out.println(dance);
    }
}