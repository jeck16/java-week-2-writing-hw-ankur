package java_week_2_writing_hw_ankur;
/**
 * Write a Java programme using the following steps.
 * 3.1 Declare one instance and one static variable.
 * 3.2 Declare one instance method.
 * 3.3 Declare one static method.
 * 3.4 Call both instance and static variables into both instance and static methods inside the print statement.
 * 3.5 Declare the Main method.
 * 3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Programme_3 {
    //3.1 Declare one instance and one instance variable.
    String name = "Prime";
    static String surename = "Testing";

    //3.2 Declare one instance method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public void instanceMethod() {
        System.out.println(name);
        System.out.println(Programme_3.surename);
    }

    //3.3 Declare one static method.
    //3.4 Call both instance and static variables into both instance and static methods inside the print statement.
    public static void staticMethod() {
        ;
        System.out.println(surename);
    }

    //3.5 Declare the Main method.
    //3.6 Call both instance and static methods into the Main method and run the programme.
    public static void main(String[] args) {
        Programme_3 programme_3 = new Programme_3();
        programme_3.instanceMethod();
        staticMethod();
    }
}