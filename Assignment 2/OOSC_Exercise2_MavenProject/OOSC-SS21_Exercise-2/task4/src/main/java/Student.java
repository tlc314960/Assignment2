public class Student {
    private Year year = new Year();

    public Student() {
    }

    public Student(Year year) {
        this.year = year;
    }

    public void info() {
        System.out.println("I am a student");
        year.info();
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
}
