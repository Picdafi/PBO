public class ObyekBuku
{
	public static void main(String[]args)
	{
		Buku buku1=new Buku();
		buku1.setBuku("PBO",60000,100);
		buku1.tampil();
	}
	Class Buku
	{
		String judul;
		int harga;
		int halaman;

		public void setBuku (String judul, int harga, int halaman)
		{
			this.judul=judul;
			this.harga=harga;
			this.halaman=halaman;
		}

		public void tampil()
		{
			System.out.println("Judul buku :"+judul);
			System.out.println("Harga buku :"+harga);
			System.out.println("Jumlah halaman :"+halaman);

		}

}
}