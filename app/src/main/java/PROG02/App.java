/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package PROG02;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        new ThreadWithExtends("Kerosene").start();
        Runnable run = new ThreadWithImplements();
        new Thread(run,"Oxygen").start();
    }
}
