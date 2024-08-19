package Day2;

public class ClassDay2Practice {

    //class variables;
    static int age = 30;

    // instance variables;
    String gender = "male";

    public static void main(String[] args) {
        // local variables;
        String firstName = "Ali";
        System.out.println( firstName);

        // syntax of creating new object;
        // nameOfTheClass nameOfObject = new.nameOfTheClass;

        ClassDay2Practice instanceObject = new ClassDay2Practice();
        System.out.println(instanceObject.gender);
        System.out.println( age);

        int num = 1;
        int num1 = 98;
        int num2 = num+num1;
        System.out.println(num2);



    }


}
