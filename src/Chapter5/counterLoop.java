package Chapter5;

public class counterLoop {

    public static void main(String[] args) {

        for (int counter = 1; counter < 21; counter = counter + 3) {
            System.out.println(counter);
        }
        System.out.println("out of scope");

        String[] fruits = new String[]{"Orange", "Apple", "Pear", "Strawberry"};

        for (String i : fruits) {
            System.out.println(i);
            // fruit is an element of the `fruits` array.
        }
    }
}