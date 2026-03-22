package Evaluasi_Ekspresi;
import java.util.Scanner;

public class Evaluasi_Expresi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Masukkan nilai x: ");
        double x = scanner.nextDouble();
        
        // Menghitung x^2
        double x_squared = Math.pow(x, 2);
        
        // Menghitung cos(45 derajat) - 45 derajat = PI/4 radian
        double cos_45 = Math.cos(Math.PI / 4);
        
        // Menghitung akar(e)
        double sqrt_e = Math.sqrt(Math.E);
        
        // Menghitung ekspresi: x^2 * cos(45) + akar(e)
        double expression = x_squared * cos_45 + sqrt_e;
        
        // Menghitung nilai mutlak (absolut)
        double result = Math.abs(expression);
        
        // Output hasil
        System.out.println(result);
        
        scanner.close();
    }
}
