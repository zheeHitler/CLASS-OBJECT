import java.util.Scanner;
class Stack {
     String[] value = new String[100];
	int top;
	
	void setvalueAt(int position, String value) {
    
 }
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
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
