class Node {
    private String label;
    private int value;
     public void setlabel(String label){ this.label = label;
 }
    
      public String getlabel(){
      return label;
 }
      public void setvalue(int value){ this.value = value;
 }
 public double getvalue(){
     return value;
 }
}

 public class exNode {
     public static void main(String [] args){
         Node exNode =  new Node();
          exNode.setlabel("WELCOME");
          exNode.setvalue(20);
     System.out.println("Label =" + exNode.getlabel());
     System.out.println("Value =" + exNode.getvalue());
         
     }
 }
 
