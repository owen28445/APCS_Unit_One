import java.util.InputMismatchException;
import java.util.Scanner;

public class PaintingARoom {

    public static void main(String[] args) {
        double feetpergallon = 350;
        double areaofdoor = 15;
        double areaofwindow = 10;
        Scanner scan = new Scanner(System.in);
        System.out.println("input the room length: ");
        double rooom = scan.nextDouble();
        System.out.println("input the room width: ");
        double wiiddth = scan.nextDouble();
        System.out.println("input the room height ");
        double hhhight = scan.nextDouble();
        System.out.println("input the number of window: ");
        int W = scan.nextInt();
        System.out.println("input the number of doors: ");
        int D = scan.nextInt();
        double areaneedpainted = rooom * wiiddth + rooom * hhhight * 4 - areaofdoor * W - areaofwindow * D;
        int total = (int)(areaneedpainted/feetpergallon) + 1;
        System.out.println(total);
    }

}











