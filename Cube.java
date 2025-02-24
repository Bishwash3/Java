public class Cube {
    static int length;

    static int calculateVolumeOfCube(){
        return length*length*length;
    }

    public static void main(String[] args) {
        Cube.length = 20;
        int Length = Cube.calculateVolumeOfCube();
        System.out.println(Length);
    }
}
