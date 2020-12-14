public class Fan {
    private int SLOW=1;
    private int MEDIUM=2;
    private int FAST=3;
    private int speed=SLOW;
    private int radius=5;
    private String color="blue";
    private boolean isOn=false;

    public int getSpeed() {
        return speed;
    }

    public int getRadius() {
        return radius;
    }

    public String getColor() {
        return color;
    }
    public boolean isOn(){
        return isOn;
    }

    public void setSpeed(int speed) {
        if (speed==SLOW) this.speed=SLOW;
        else if (speed==MEDIUM) this.speed=MEDIUM;
        else if (speed==FAST) this.speed=FAST;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        if (isOn) {
            return "Fan{" +
                    " speed=" + speed +
                    ", radius=" + radius +
                    ", color='" + color + '\'' +
                    ", isOn=" + isOn +
                    '}';
        }else {
            return "Fan{" +
                    " radius=" + radius +
                    ", color='" + color + '\'' +
                    ", isOn=" + isOn +
                    '}';
        }
    }
}
