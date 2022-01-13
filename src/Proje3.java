import java.util.Scanner;

public class Proje3 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Üçgenin kenarlarını giriniz: ");
        int a,b,c,çevre;
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();

        çevre=a+b+c;
        double u=çevre/2;
        double alan=Math.sqrt(u* (u - a)* (u - b) * (u - c));
        System.out.println("Alan: "+alan);

    }
}
