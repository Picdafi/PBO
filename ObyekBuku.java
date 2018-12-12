public class ObyekBuku
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
		public static void main(String[]args)
		{
			ObyekBuku buku1=new ObyekBuku();
			buku1.setBuku("PBO",60000,100);
			buku1.tampil();
		}
}