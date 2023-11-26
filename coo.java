public class Vecteur2D {
    private static int count = 0;
    private double x;
    private double y;

    public Vecteur2D(double x, double y) {
        this.x = x;
        this.y = y;
        count++;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        return "X = " + x + "; Y = " + y;
    }

    public boolean equals(Vecteur2D point) {
        return this.x == point.x && this.y == point.y;
    }

    public double norme() {
        return Math.sqrt(Math.pow(this.x, 2) + Math.pow(this.y, 2));
    }

    public static int getCount() {
        return count;
    }
}

public class Vecteur3D extends Vecteur2D {
    private double z;

    public Vecteur3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public String toString() {
        return "X = " + getX() + "; Y = " + getY() + "; Z = " + z;
    }

    public boolean equals(Vecteur3D point) {
        return super.equals(point) && this.z == point.z;
    }

    public double norme() {
        return Math.sqrt(Math.pow(getX(), 2) + Math.pow(getY(), 2) + Math.pow(z, 2));
    }
}

public class Main {
    public static void main(String[] args) {
        Vecteur2D v1 = new Vecteur2D(1.5, 2);
        Vecteur2D v2 = new Vecteur2D(1.5, 2);
        Vecteur3D v3 = new Vecteur3D(1.5, 2, 7);

        System.out.println("Number of Vecteur2D instances: " + Vecteur2D.getCount());

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("v3: " + v3);

        System.out.println("v1 equals v2: " + v1.equals(v2));
        System.out.println("v1 equals v3: " + v1.equals(v3));

        System.out.println("Norme of v1: " + v1.norme());
        System.out.println("Norme of v3: " + v3.norme());
    }
}