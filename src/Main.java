import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scanner sınıfını başlatma
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan dik kenarların uzunluklarını alma
        System.out.print("Birinci dik kenarın uzunluğunu girin: ");
        double sideA = scanner.nextDouble();

        System.out.print("İkinci dik kenarın uzunluğunu girin: ");
        double sideB = scanner.nextDouble();

        // Pythagoras teoremi ile hipotenüs hesaplama: hipotenüs = √(a² + b²)
        double hypotenuse = Math.sqrt(Math.pow(sideA, 2) + Math.pow(sideB, 2));

        // Sonucu gösterme
        System.out.printf("Hipotenüs: %.2f\n", hypotenuse);

        // Scanner'ı kapatma
        scanner.close();
    }
}