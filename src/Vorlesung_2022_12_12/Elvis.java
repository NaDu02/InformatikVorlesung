package Vorlesung_2022_12_12;

public class Elvis {
    private Elvis() {
    }
    private static Elvis theOne = new Elvis();

    public static Elvis getInstance() {
        return theOne;
    }
    public void sing() {
        System.out.println("Elvis is singing");
    }

    public static void main(String[] args) {
        Elvis elvis = Elvis.getInstance();
        elvis.sing();
    }
}
