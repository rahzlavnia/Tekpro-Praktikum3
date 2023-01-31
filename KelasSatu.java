
public class KelasSatu {
	
	{
		//non static block initialization
		//dikonstruksikan kedua setelah statik dan bisa dikonstruksikan berkali-kali saat main membuat
		//objek baru kembali dari class ini
		System.out.println(11);
	}
		
		
	static 	//statik dikonstruksikan pertama dan sekali saja saat pertama kali main membuat sebuah objek
			//dari class ini
	{
		System.out.println(2);
	}
		
	public KelasSatu(int i) //dikonstruksikan ketika pembuatan objek dengan paramater
	{
		System.out.println(3);
	}
		
	public KelasSatu() //dikonstruksikan ketika pembuatan objek tanpa parameter
	{
		System.out.println(4);
	}
}
