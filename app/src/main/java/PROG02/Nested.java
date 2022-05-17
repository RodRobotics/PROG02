package PROG02;

import java.time.LocalDateTime;

public class Nested {
    private final String outerName = Nested.class.getSimpleName();
    private int counter = 0;
    private MemberInnerClass inner = new MemberInnerClass();



    private class MemberInnerClass {
        private final String innerName = MemberInnerClass.class.getSimpleName();
        public void info() {
            String timestamp = LocalDateTime.now().toString();
            System.out.println("Info from member inner class: "+outerName+"$"+innerName+"@"+timestamp);
            counter++; // update outer instance variable
        }
    }
    public void methodAccessingMemberInnerClass() {
        inner.info();
    }
    public int getCounter() { return counter; }
}









