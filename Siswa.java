public class Siswa
{
	String NamaSiswa;
	String Alamat;
	int Nilai;

	Siswa(String nama, String alt, int nil) //konstruktor
	{
		NamaSiswa = nama;
		Alamat = alt;
		Nilai= nil;
	}
	void show()
	{
		System.out.println("Data Siswa");
		System.out.println("Nama   : "+NamaSiswa);
		System.out.println("Alamat :" + Alamat );
		System.out.println("Nilai  : " + Nilai);
	}
	public static void main(String args[])
	{
		Siswa siswa1 = new Siswa("Rita Anggini", "Jln. Mawar KGII Yogyakarta",80);
		siswa1.show();
	}
}