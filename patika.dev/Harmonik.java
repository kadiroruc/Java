import java.util.Scanner;
import java.util.ArrayList;
public class Harmonik {
		public static void main(String[] args) {
			ArrayList<Integer> list=new ArrayList<Integer>();
			Scanner scanner=new Scanner(System.in);
			int i=1;
			Integer girdi=0;
			
			while(true) {
				System.out.println("Listenin "+i+". elemanını giriniz(Bitirmek için:-1):");
				i++;
				girdi=scanner.nextInt();
				if(girdi==-1) {
					System.out.println("Eleman girme işlemi tamamlandı!");
					break;
				}
				
				list.add(girdi);
			}
			
			Double harmonik=0.0;
			for(int j=0;j<list.size();j++) {
				harmonik+=1.0/list.get(j);
			}
			
			System.out.println("Harmonik Ortalama:"+list.size()/harmonik);
				
		}
}
			
		
			

