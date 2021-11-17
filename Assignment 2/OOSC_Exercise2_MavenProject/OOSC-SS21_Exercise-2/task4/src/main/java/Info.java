public class Info extends Student{
    public Info() {
    }

//    public Info(Year year) {
//        super(year);
//    }

    @Override
    public void info() {
        System.out.println("I am a Info student");
        getYear().info();
    }
}
