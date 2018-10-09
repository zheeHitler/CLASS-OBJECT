 
class mahasiswa {
   private String nama, nim, alamat, golongandarah, status, tinggibadan, beratbadan;
    
    public String getnama(){
     return nama;
 }
  public void setnama(String nama){ this.nama = nama;
 }
  
   public String getnim(){
     return nim;
 }
  public void setnim(String nim){ this.nim = nim;
 }
 
    public String getalamat(){
     return alamat;
 }
  public void setalamat(String alamat){ this.alamat = alamat;
 }
  
    public String getgolongandarah(){
     return golongandarah;
 }
  public void setgolongandarah(String golongandarah){ this.golongandarah = golongandarah;
 }
   public String getstatus(){
     return status;
 }
  public void setstatus(String status){ this.status = status;
 }
  
    public String gettinggibadan(){
     return tinggibadan;
 }
  public void settinggibadan(String tinggibadan){ this.tinggibadan = tinggibadan;
 }
    public String getberatbadan(){
     return beratbadan;
 }
  public void setberatbadan(String beratbadan){ this.beratbadan = beratbadan;
 }
 }
  
    public class Exmahasiswa{
    public static void main(String [] args){
      mahasiswa MAHASISWA = new mahasiswa ();
      MAHASISWA.setnama("zheerah");
      MAHASISWA.setnim("D0217023");
      MAHASISWA.setalamat("CAMPALAGIAN");
      MAHASISWA.setgolongandarah("B");
      MAHASISWA.setstatus("MAHASISWI");
      MAHASISWA.settinggibadan("159 cm");
      MAHASISWA.setberatbadan("55 kg");
      
      
     System.out.println("NAMA = " + MAHASISWA.getnama());
     System.out.println("NIM  = " + MAHASISWA.getnim());
     System.out.println("ALAMAT = " + MAHASISWA.getalamat());
     System.out.println("GOLONGAN DARAH = " + MAHASISWA.getgolongandarah());
     System.out.println("STATUS =    " + MAHASISWA.getstatus());
     System.out.println("TINGGI BADAN = " + MAHASISWA.gettinggibadan());
     System.out.println("BERAT BADAN = " + MAHASISWA.getberatbadan());
            }

   
  
  
  
}
 