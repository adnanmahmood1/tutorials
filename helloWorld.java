public class HelloWorld {
    int total; 
    public static void main(String[] args) {
        System.out.println("Hello World!"); 
         HelloWorld programm = new HelloWorld();
        System.out.println(programm.addOperations(5,6)); 
       
    }   

    public  int addOperations(int a, int b) {
        total = a+b;
        return total; 
    }   

    public int minusOperations(int a, int b){
        //null 
    }
}