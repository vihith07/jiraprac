public class Main{
    public static void print(String exp){
        System.out.println(exp);
    }
    public static void main(String args[]){
        print("for loop");
        exec_for();
        print("while loop");
        exec_while();
    }

    public static void exec_for(){
        for(int i=1;i<=100;i++){
            print(i+" , ");
        }
    }
    public static void exec_while(){
        int i=1;
        while(i++<=100){
            print(i+" , ");
        }
    }
}