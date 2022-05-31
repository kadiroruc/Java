import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		MineSweeper mineSweeper=new MineSweeper();
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("Oyun Zorluk Seviyesini Giriniz:\n\nKolay (4-4) -->1\nOrta (7-7) -->2\nZor (10-10) -->3\nUzman (16-16) -->4");
			int zorluk=scanner.nextInt();
			
			switch (zorluk) {
			case 1: 
				mineSweeper.setSatir_sayisi(4);
				mineSweeper.setSutun_sayisi(4);
				break;
			case 2:
				mineSweeper.setSatir_sayisi(7);
				mineSweeper.setSutun_sayisi(7);
				break;
			case 3:
				mineSweeper.setSatir_sayisi(10);
				mineSweeper.setSutun_sayisi(10);
				break;
			case 4:
				mineSweeper.setSatir_sayisi(16);
				mineSweeper.setSutun_sayisi(16);
				break;
			
			default:
				System.out.println("Hatalı Giriş Yaptınız:");
				continue;
			}
			break;
			
			
		}
		
		mineSweeper.run();
	}
}
