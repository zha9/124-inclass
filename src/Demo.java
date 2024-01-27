import java.util.Scanner;
public class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean chk = false;
        int x;
        double y;
        double z;
        Shape k;
        while(!chk) {
            System.out.println("--Choose a shape to create by typing a number--");
            System.out.println("1. Circle");
            System.out.println("2. Right Triangle");
            System.out.println("3. Rectangle");
            System.out.println("--Type any other number to exit the program--");
            x = sc.nextInt();
            if(x == 1) {
                System.out.println("Enter the radius in cm: ");
                y = sc.nextDouble();
                k = new Circle(y);
                k.info();
            }
            else if(x == 2) {
                System.out.println("Enter the width in cm: ");
                y = sc.nextDouble();
                System.out.println("Enter the height in cm: ");
                z = sc.nextDouble();
                k = new Triangle(y, z);
                k.info();
            }
            else if(x == 3) {
                System.out.println("Enter the width in cm: ");
                y = sc.nextDouble();
                System.out.println("Enter the height in cm: ");
                z = sc.nextDouble();
                k = new Rectangle(y, z);
                k.info();
            }
            else chk = true;
        }
        System.out.println("Goodbye!");
        sc.close();
    }
}
