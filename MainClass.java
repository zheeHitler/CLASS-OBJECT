
public class MainClass {
     public static void main(String [] args) {
         //Diagram KOTAK
         System.out.println("-----DIAGRAM KOTAK-------");
     kotak persegipanjang = new kotak  (); 
     persegipanjang.setlebar(15.80);
     persegipanjang.setpanjang(20.50);
     System.out.println("Luas =" + persegipanjang.getluas());
      System.out.println("keliling =" + persegipanjang.getkeliling());
       //DIAGRAM MAHASISWA
      System.out.println("-----DIAGRAM MAHASISWA-------");
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
     // DIAGRAM NODE
     System.out.println("-----DIAGRAM NODE-------");
     Node exNode =  new Node();
          exNode.setlabel("WELCOME");
          exNode.setvalue(20);
     System.out.println("Label =" + exNode.getlabel());
     System.out.println("Value =" + exNode.getvalue());
     
     //DIAGRAM STACK
     System.out.println("-----DIAGRAM STACK-------");
        Stack stack = new Stack();
        stack.value[0] = "FAHMI";
	stack.value[1] = "FAZHEERAH";
	stack.value[2]= "FUAD";
	stack.value[3]= "FIRDAYANTI";
	stack.value[4] = "FINA";
	stack.value[5] = "FANI";
        stack.setvalueAt(4 ,"FAZLEE");
        for(int i=0;i<stack.value.length;i++){System.out.println(stack.value[i]);};
            }

   
  
  
  
}
    

