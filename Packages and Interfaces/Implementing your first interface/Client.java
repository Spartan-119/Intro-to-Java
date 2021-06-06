interface Callback {
    void callback(int param);
}

public class Client implements Callback{
    // implements Callback's interface
    public void callback(int p) {
        System.out.println("Callback called with " + p);
    }

    void nonIFaceMeth() {
        System.out.println("classes that implements interfaces" +
                "may also define other members, too.");
    }
}
