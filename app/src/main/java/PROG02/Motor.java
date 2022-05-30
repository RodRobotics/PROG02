package PROG02;

public class Motor {
    Auto auto = new Auto();
    int seilzug;
    boolean engineon = false;
public Motor(){



}
public void setgaspedal(){
    this.seilzug = auto.getPedalPosition();
}


    public void motorlauft(int a){

        if (a == 5){
            this.engineon = true;
        }else {
            this.engineon = false;
        }



    }
    public boolean getstatus(){

    return engineon;

    }
}
