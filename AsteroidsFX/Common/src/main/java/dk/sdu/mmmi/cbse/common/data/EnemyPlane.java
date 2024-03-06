package dk.sdu.mmmi.cbse.common.data;




import java.util.Random;

public class EnemyPlane extends Entity {
    private final Random random = new Random();
    private double speed = 1.0;
    private int shootCooldown = 100;
    private int currentCooldown = 0;

    public EnemyPlane() {
        this.setX(random.nextDouble() * 10);
        this.setY(random.nextDouble() * 4);
        this.setRotation(random.nextDouble() * 180);
    }

    public double getSpeed() {
        return speed;
    }

    public void update() {
        if (random.nextInt(100) < 10) {
            this.setRotation(random.nextDouble() * 360);
        }
        double deltaX = Math.cos(Math.toRadians(getRotation())) * speed;
        double detlaY = Math.sin(Math.toRadians(getRotation())) * speed;
        this.setX(this.getX() + deltaX);
        this.setY(this.getY() + detlaY);


     /*

        //shoota
        if (currentCooldown <=0){
            shoot();
            currentCooldown = shootCooldown;
        }else {
            currentCooldown--;
        }

    }



    private void shoot() {

        Bullet bullet = new Bullet(this.getX(), this.getY(), this.getRotation());

    }

     */




    }
}