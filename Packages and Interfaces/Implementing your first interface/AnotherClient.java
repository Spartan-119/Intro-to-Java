public class AnotherClient implements Callback{
    // implement callback's interface
    public void callback(int p) {
        System.out.println("Another version of callback");
        System.out.println("p squared is: " + (p * p));
    }
}
