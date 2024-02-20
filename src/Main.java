import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = (int) (Math.random()*100);

        int hak = 0;
        int selected;

        while(hak<5){
            System.out.println("Tahminini gir: ");
            selected = scanner.nextInt();
            if(selected == number){
                System.out.println("tebrikler doğru tahmin " + number);
                break;
            } else if(selected <0 || selected>100){
                System.out.println("0-100 arasında bir değer gir");
            }
            else if (selected<number) {
                System.out.println("Daha yüksek bir sayı giriniz");
            }else{
                System.out.println("Daha düşük bir sayı giriniz");
            }
            hak++;
        }

        System.out.println(number);
    }
}