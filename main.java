import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean devamEt = true;

        
        while (devamEt) {
            System.out.print("Lütfen sıcaklığı girin (°C): ");
            int sicaklik = scanner.nextInt();

            String etkinlik = etkinlikOner(sicaklik);
            System.out.println("Önerilen etkinlik: " + etkinlik);

            System.out.print("Tekrar sıcaklık girmek ister misiniz? (E/H): ");
            char cevap = scanner.next().charAt(0);

            if (cevap == 'H' || cevap == 'h') {
                devamEt = false;
            }
        }

        System.out.println("Uygulamadan çıkılıyor. İyi günler!");
    }

    
    public static String etkinlikOner(int sicaklik){
        if (sicaklik < 0){
            return "Kayak yapabilirsiniz";
        } else if (sicaklik >=0 && sicaklik <=10){
            return "Sinema veya müze gezisi yapabilirsiniz";
        } else if (sicaklik >10 && sicaklik <=20){
            return "Doğa yürüyüşü yapabilirsiniz";
        } else if (sicaklik >20 && sicaklik <=40){
            return "Yüzmeye gidebiliriniz";
        } else{
            return "Sahil kenarında vakit geçirebilir veya serin bir içecek eşliğinde dinlenebilirsiniz.";

        }
    }
}