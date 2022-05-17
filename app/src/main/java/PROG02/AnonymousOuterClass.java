package PROG02;

import java.time.LocalDateTime;

abstract class AnonymousClass {
    public abstract void info();
}
public class AnonymousOuterClass {
    private String outerName = AnonymousOuterClass.class.getSimpleName();

    private AnonymousClass anonymousInstance = new AnonymousClass()
    {
        private String innerName = this.getClass().getSimpleName();
        public void info() {
            String info = outerName+"$"+innerName+"@"+ LocalDateTime.now().toString();
            System.out.println("Info from member anonymous class: " + info);
        }
    };
    public void methodUsingAnonymousClass() {
        // execute info method of the anonymous class instance
        anonymousInstance.info();
    }
}
