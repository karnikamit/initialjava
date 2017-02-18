package projectEuler;

/**
 * Created by karnikamit on 2017-02-18.
 */
public class number {
    public boolean isPrime(int n){
        /*
        public method to know if the number is prime.
         */
        if(n>1){
            if(n==2){
                return true;
            }else if(n%2==0){
                return false;
            }else{
                int maxLimit = n/2;
                int start = 3;
                while(start< maxLimit){
                    if(n%start==0){
                        return false;
                    }
                    start ++;
                }
                return true;
            }

        }else{
            return false;
        }
    }
}
