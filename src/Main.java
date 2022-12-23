public class Main {
    public static void main(String[] args) {
        String helloWorld = "Hello World!";
        String firstHalf = helloWorld.substring(0, helloWorld.length()/2);
        String secondHalf = helloWorld.substring(helloWorld.length()/2);
        System.out.println(firstHalf);
        System.out.println(secondHalf);
    }
}