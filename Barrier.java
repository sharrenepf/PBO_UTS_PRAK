public class Barrier {
    public int strength;

    public Barrier(int strength) {
        this.strength = strength;
    }

    public void destroyed() {
        strength -= (strength * 0.36);
        if (strength < 0) strength = 0;
    }

    public boolean isDestroyed() {
        return strength <= 0;
    }

    public String getBarrierInfo() {
        return "Barrier Strength = " + strength + "\n";
    }
}