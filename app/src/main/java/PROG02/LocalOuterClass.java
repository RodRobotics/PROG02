package PROG02;

import java.time.LocalDateTime;

public class LocalOuterClass {
    private String outerName = LocalOuterClass.class.getSimpleName();

    public void methodUsingLocalInnerClass() {
        String localVar = LocalDateTime.now().toString();
        class LocalInnerClass {
            private String innerName = LocalInnerClass.class.getSimpleName();
            public void info() {
                String info = outerName+"$"+innerName+"@"+localVar;
                System.out.println("Info from local inner class: " + info);
            }
        }
        // create instances of the local inner class and execute method
        LocalInnerClass inner = new LocalInnerClass();
        inner.info();
    }

}


