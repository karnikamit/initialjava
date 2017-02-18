public class sayHello{
    // methods with params
    public sayHello(){

    }
    static void greet(String name){
        System.out.println("Hello "+name);
    }

    static int add(int a, int b){
        return a + b;
    }

    public static void main(String[] args){
        greet("Amit");
        System.out.println(add(2,1));
    }
}
