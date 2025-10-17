public class Zombie {
    public int health;
    public int level;

    public Zombie(int health, int level) {
        this.health = health;
        this.level = level;
    }

    public void destroyed() {
    }

    public boolean isDead() {
        return health <= 0;
    }

    public String getZombieInfo() {
        return "Health = " + health + "\nLevel = " + level + "\n";
    }
}
