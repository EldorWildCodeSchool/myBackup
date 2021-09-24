package wildcodeschool.quests.Java08.Interfaces;

public class Eagle extends Bird implements Fly {

    private boolean flying;
    private int altitude;

    public Eagle(String name) {
        super(name);
        this.flying = false;
        this.altitude = 0;
    }

    public Eagle(String name, boolean flying, int altitude) {
        super(name);
        this.flying = flying;
        this.altitude = altitude;
    }

    public int getAltitude() {
        return altitude;
    }

    public boolean isFlying() {
        return flying;
    }

    @Override
    public void takeOff() {
        if (!this.flying && this.altitude == 0) {
            this.flying = true;
            System.out.printf("%s takes off in the sky.%n", this.getName());
        }
    }

    @Override
    public int ascend(int meters){
        if(this.flying) {
            this.altitude = Math.max(this.altitude + meters, 0);
            System.out.printf("%s flies upward, altitude:  %d%n", this.getName(), this.getAltitude());
        }
        return this.altitude;
    }

    @Override
    public int descend(int meters){
        if(this.flying){
            this.altitude = Math.min(this.altitude - meters, 3800);
            System.out.printf("%s flies downward, altitude:  %d%n" , this.getName(), this.getAltitude());
        }
        return this.altitude;
    }

    @Override
    public void land(){
        if(!this.flying) {
            System.out.printf("Joker, the %s hasn't even started! %n", this.getName());
        }else{
            if(this.altitude <=1){
                System.out.printf("%s lands on the ground. %n", this.getName());
                this.flying = false;
                this.altitude = 0;
            }else {
                System.out.printf("%s is too high, it can't land. %n", this.getName());
            }
        }
    }

    @Override
    public String sing() {
        return "Screech!";
    }
}