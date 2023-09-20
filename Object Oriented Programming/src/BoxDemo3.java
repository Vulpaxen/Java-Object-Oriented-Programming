public class BoxDemo3 {

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        integerBox.add(new Integer(10));
        //integerBox.add("Hallo");
        Integer someInteger = integerBox.get(); // no need cast!
        System.out.println(someInteger);

		Box<String> stringBox = new Box<String>();
        stringBox.add("Hallo");
    }
}
