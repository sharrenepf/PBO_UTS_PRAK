public class Tester {
    public static void main(String[] args) {
        WalkingZombie wz = new WalkingZombie(100, 1);
        JumpingZombie jz = new JumpingZombie(100, 2);
        Barrier b = new Barrier(100);
        Plant p = new Plant();

        System.out.println(wz.getZombieInfo());
        System.out.println(jz.getZombieInfo());
        System.out.println(b.getBarrierInfo());
        System.out.println("------------------------");

        int round = 1;
        while (true) {
            System.out.println("Attack Round " + round + ":");
            p.doDestroy(wz);
            p.doDestroy(jz);
            p.doDestroy(b);

            System.out.println(wz.getZombieInfo());
            System.out.println(jz.getZombieInfo());
            System.out.println(b.getBarrierInfo());

            if (wz.isDead()) System.out.println("Walking Zombie is defeated!");
            if (jz.isDead()) System.out.println("Jumping Zombie is defeated!");
            if (b.isDestroyed()) System.out.println("Barrier is destroyed!");

            System.out.println("------------------------");

            if (wz.isDead() && jz.isDead() && b.isDestroyed()) {
                System.out.println("All enemies have been defeated!");
                break;
            }

            round++;
        }
    }
}