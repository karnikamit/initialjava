package projectEuler;

public class pe7{
    /*
    Find the last prime in the given range.
     */
    public int findPrime(int n){
        number Number = new number();
        int i = 1;
        int num = 2;
        int lastPrime = 0;
        while(i<=n){
            if(Number.isPrime(num)){
                lastPrime = num;
            }
            num ++;
        }
        return lastPrime;

    }

    public static void main(String[] args){
        pe7 prob = new pe7();
        System.out.println(prob.findPrime(10));
    }
}
