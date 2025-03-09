 class Shape{
    double length, breath, height;

    static class cube{
        static void volumeOfCube(double length){
             System.out.println(length*length*length);
        }
    }

    static class cuboid extends cube {
        static void volumeOfCuboid(double l, double b, double h){
            System.out.println(l*b*h);
        }
    }

 


    public static void main(String[] args) {
        Shape.cube.volumeOfCube(20);
        Shape.cuboid.volumeOfCuboid(20, 30, 40);

    }
 }

