
public class KelasDua {
	{
		System.out.println(5);
	}
	
	static{
		//karena main program ada di KelasDua, maka static KelasDua dikonstruksikan pertama
		System.out.println(7); 
	}
		
	public static void main(String[] args)
	{
		System.out.println(6);
		KelasSatu satu = new KelasSatu();
		KelasSatu dua = new KelasSatu(10);
		KelasDua tiga = new KelasDua();
	}
}
