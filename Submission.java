public class Submission {
    private String name;
    private int year;
    private String user;
    private String type;

    public Submission(){
        name = "N/A";
        year = 0;
        user = "N/A";
        type = "N/A";
    }

    public Submission(String n, int y, String u, String t){
        name = n;
        year = y;
        user = u;
        type = t;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String toString() {
        return "This is a " + type + " submission called " + name + ". It was uploaded in " + year + " by " + user + ".";
    }

    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Submission)) {
            return false;
        }
        Submission submission = (Submission) o;
        return name.equals(submission.name) && year == submission.year && user.equals(submission.user) && type.equals(submission.type);
    }

    
}
