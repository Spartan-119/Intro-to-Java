public class Dog {
    private int size;

    int getSize() {
        return size;
    }

    void setSize(int s) {
        size = s;
    }

    void bark() {
        if (size > 60) { System.out.println("Woof! Woof!"); }
        else if (size > 30) { System.out.println("Ruff! Ruff!"); }
        else { System.out.println("Yip! Yip!"); }
    }
}
