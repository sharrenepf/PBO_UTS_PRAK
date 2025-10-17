public class WalkingZombie extends Zombie {

    public WalkingZombie(int health, int level) {
        super(health, level);
    }

    public void destroyed() {
        health -= (health * 0.58);
        if (health < 0) health = 0;
    }

    public String getZombieInfo() {
        return "Walking Zombie Data = \n" + super.getZombieInfo();
    }
}