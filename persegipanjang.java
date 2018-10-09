 class kotak {
    private double panjang, lebar, luas,keliling;
    
     public double getpanjang(){
     return panjang;
 }
 
 public double getlebar(){
     return lebar;
 }
 
 public double getluas(){
     return getpanjang()*getlebar();
 }
 public double getkeliling(){
     return (getpanjang()+ getlebar());
 }
 
 public void setpanjang(double panjang){ this.panjang = panjang;
 }
 public void setlebar(double lebar){ this.lebar = lebar;
 }
 public void setluas(double luas){ this.luas = luas;
 }
 public void setkeliling(double keliling){ this.keliling = keliling;
 }
}
 
    public class persegipanjang {
    public static void main(String [] args) {
     kotak persegipanjang = new kotak  (); 
     persegipanjang.setlebar(15.80);
     persegipanjang.setpanjang(20.50);
     System.out.println("Luas =" + persegipanjang.getluas());
      System.out.println("keliling =" + persegipanjang.getkeliling());
  
     
    }
    }