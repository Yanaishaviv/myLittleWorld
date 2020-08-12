package GitDir.mylittleworld.src;

public class Planet {
    public double radius = 5;
    public double mass = 10;
    public double xLoc = 0;
    public double yLoc = 0;

    public Planet(double radius, double mass, double xLoc, double yLoc) {
        this.radius = radius;
        this.mass = mass;
        this.yLoc = yLoc;
        this.xLoc = xLoc;
    }
    
    public Planet(){
        
    }

    public double distance(Planet sec) {
        double x = this.xLoc - sec.xLoc;
        double y = this.yLoc - sec.yLoc;
        x *= x;
        y *= y;
        return Math.sqrt(x+y);
    }

    public 
}