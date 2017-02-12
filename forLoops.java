public class forLoops{
    public forLoops(){

    }
    public static void main(String[] args){
        for(int i=2; i < 10; i = i * i){
            System.out.println(i);
        }
        // Conditional loops
        for (int i = 1; i< 10; i++){
            if (i == 9){
                System.out.println("I am breaking");
                break;
            }else if(i == 3){
                System.out.println("I am skppping at 3");
            }else{
                System.out.println("I am i:"+i);
            }

        }

        int result = 0;
        for (int i=0; i< 5; i++){
            if (i == 3){
                result += 10;
            }else{
                result += i;
            }
        }
        System.out.println("Result is: "+result);
        // Enhanced for loops;
        int[] primes = {2, 3, 5, 7};
        for (int n: primes){
            System.out.println(n);
        }
    }
}
