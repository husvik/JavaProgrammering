/**
 * Created by husvi on 27.05.2017.
 */
public class PhoneCard {
    private double credit;
    private double charge;
    private double minutes;
    private String id;

    public PhoneCard(){
        this(0.0, 0.0, "");
    }

    public PhoneCard(double credit, double charge, String id){
        setCredit(credit);
        setCharge(charge);
        setId(id);
        setMinutes(0.0);
    }

    public void setCredit(double credit){
        this.credit = credit;
    }

    public void setCharge(double charge){
        this.charge = charge;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setMinutes(double minutes){
        this.minutes = minutes;
    }

    public double getCredit(){
        return credit;
    }

    public double getCharge() {
        return charge;
    }

    public double getMinutes() {
        return minutes;
    }

    public String getId() {
        return id;
    }

    public String toString(){
        return "Credit: " + getCredit() + "\nCharge: " + getCharge() + "\nId: " + getId() + "\nMin:" + getMinutes();
    }

    public boolean equals(Object o){
        if(!(o instanceof PhoneCard))return false;
        if(o == this)return true;
        PhoneCard pc = (PhoneCard) o;
        return getId().equals(((PhoneCard) o).getId());
    }

    public double call(double minutes){
        double spent = minutes * charge;
        if(getCredit()>= spent){
            setCredit(getCredit() - spent);
            setMinutes(getMinutes() - minutes);
            return spent;
        } else {
            setMinutes(getMinutes() + getCredit() / getCharge());
            double rest = getCredit();
            setCredit(0);
            return rest;
        }

    }
}
