package dk.sdu.mmmi.cbse.common.bullet;

import dk.sdu.mmmi.cbse.common.data.Entity;

/**
 *
 * @author corfixen
 */
public class Bullet extends Entity {

    public static final double SPEED = 2.0;
    private int duration =5;

    public Bullet(){

    }



    public void update(){
        double DelX = Math.cos(Math.toRadians(getRotation()))*SPEED;
        double DelY = Math.sin(Math.toRadians(getRotation()))*SPEED;
        this.setX(this.getX()+DelX);
        this.setY(this.getY()+DelY);



    }



    public int getDuration(){
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
