class buku
{
String judul;
int tahun;
void isidata(String judulbuku, int tahunterbit)
 {
judul=judulbuku;
tahun=tahunterbit;
}
String isijudul()
 {
return judul;
}
int isitahun()
 {
return tahun;
}
}
public class tugas
{
public static void main (String[] args)
{
buku bukuku = new buku();
bukuku.isijudul("Harry Potter and the Sorcerer's Stone", 1997);
System.out.println("Buku Legendaris ini adalah :  "+bukuku.isijudul());
System.out.println("Diterbitkan pada tahun : "+bukuku.isitahun());
}
}