package dk.clbo.Model;

public class TrafficLight {

    // Red = 0
    // Rød/Gul = 1
    // Grøn = 2
    // Gul = 3
    private int state;

    public TrafficLight() {
        this.state = 0;
    }

    public void shift() {

        if (this.state == 3) {
            this.state = 0;
        } else {
            this.state++;
        }
    }

    public int getState() {
        return state;
    }
}
