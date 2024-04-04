abstract class Shape {
    abstract double area();
    abstract double volume();
}

class Sphere extends Shape {
    private double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return 4 * Math.PI * radius * radius;
    }

    @Override
    double volume() {
        return (4/3) * Math.PI * radius * radius * radius;
    }
}

class Cone extends Shape {
    private double radius;
    private double height;

    Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return Math.PI * radius * (radius + Math.sqrt(radius * radius + height * height));
    }

    @Override
    double volume() {
        return (1/3) * Math.PI * radius * radius * height;
    }
}

class Cylinder extends Shape {
    private double radius;
    private double height;

    Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    @Override
    double area() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

class areavolume{
    public static void main(String[] args) {
        Sphere sphere = new Sphere(5);
        System.out.println("Area of Sphere: " + sphere.area());
        System.out.println("Volume of Sphere: " + sphere.volume());

        Cone cone = new Cone(3, 4);
        System.out.println("Area of Cone: " + cone.area());
        System.out.println("Volume of Cone: " + cone.volume());

        Cylinder cylinder = new Cylinder(2, 6);
        System.out.println("Area of Cylinder: " + cylinder.area());
        System.out.println("Volume of Cylinder: " + cylinder.volume());
    }
}

