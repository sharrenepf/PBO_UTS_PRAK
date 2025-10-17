public class JumpingZombie extends Zombie {

    public JumpingZombie(int health, int level) {
        super(health, level);
    }

    public void destroyed() {
        health -= (health * 0.34);
        if (health < 0) health = 0;
    }

    public String getZombieInfo() {
        return "Jumping Zombie Data = \n" + super.getZombieInfo();
    }
}