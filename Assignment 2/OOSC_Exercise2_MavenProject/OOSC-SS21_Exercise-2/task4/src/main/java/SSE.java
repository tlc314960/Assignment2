public class SSE extends Student{
    public SSE() {
    }

//    public SSE(Year year) {
//        super(year);
//    }

    @Override
    public void info() {
        System.out.println("I am a SSE student");
        getYear().info();
    }
}
