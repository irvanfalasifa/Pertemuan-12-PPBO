package arrayTest;

public class ArrayExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dataProdi [] = {"Administrasi", "Agroteknologi", "Teknik Elektro",
								"Bahasa Arab", "Bahasa Inggris", "Teknik Informatika",
								"Fisika", "Kimia", "Biologi", "Managemen"};
		for(int i = 0; i<10; i++) {
			if(i==1||i==3||i==5)
				System.out.println(dataProdi[i]);
		}
		System.out.println();
		
		for(int i = 0; i<10; i++) {
			if(i==3)
				continue;

			System.out.println("["+i+"] "+dataProdi[i]);
		}
	}
}
