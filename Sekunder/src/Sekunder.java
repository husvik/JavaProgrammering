public class Sekunder{
    private int timer;
    private int min;
    private int sek;

    public Sekunder(int timer, int min, int sek){
        setTimer(timer);
        setMin(min);
        setSek(sek);
    }

    //set og get metoder

    public void setSek(int sek) {
        this.sek = sek;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setTimer(int timer) {
        this.timer = timer;
    }

    public int getMin() {
        return min;
    }

    public int getSek() {
        return sek;
    }

    public int getTimer() {
        return timer;
    }


    public String toString(){
      String retur = "antall sekunder: " + (getTimer() * 60 * 60 + getMin() * 60 + getSek());
        return retur;
    }

    public static void main(String[] args) {
        Test a = new Test(24,0,0);
        System.out.println(a);
    }

}
