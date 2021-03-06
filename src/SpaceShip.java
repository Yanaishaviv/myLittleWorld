package GitDir.mylittleworld.src;

public class SpaceShip extends Planet {
    public double speed = 0;
    public double direction = 90;

    public SpaceShip(double speed) {
        super();
        this.speed = speed;
    }

    /**
     * return the angle between the movement of the spaceship and the location of
     * the planet.
     * 
     * @param pla the second planet
     * @return the angle in degrees
     */
    public double angle(Planet pla) {
        double xDif = this.xLoc - pla.xLoc;
        double yDif = this.yLoc - pla.yLoc;
        double ang = Math.atan2(yDif, xDif);
        ang = Math.toDegrees(ang);
        ang = this.direction - ang;
        return ang;
    }

}