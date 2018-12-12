public class Pegawai
{
	String NamaPegawai;
	int IdPegawai;
	String PosisiPegawai;

	Pegawai(String nama, int Id, String posisi) //konstruktor
	{
		NamaPegawai = nama;
		IdPegawai = Id;
		PosisiPegawai = posisi;
	}
	Pegawai () //konstruktor
	{
		NamaPegawai = "Azkiya";
		IdPegawai = 2541;
		PosisiPegawai="Staf pengajar";
	}
	void show()
	{
		System.out.println("Informasi Pegawai");
		System.out.println("Nama   : "+NamaPegawai);
		System.out.println("Id     :" + IdPegawai );
		System.out.println("Posisi : " + PosisiPegawai);
	}
	public static void main(String args[])
	{
		Pegawai pegawai1 = new Pegawai();
		Pegawai pegawai2 = new Pegawai("Zahwa", 3313,"Staff Akademik");
		pegawai1.show();
		pegawai2.show();
	}
}