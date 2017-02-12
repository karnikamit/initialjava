// Array is a collection of variables of same type
public class arrayDs{
    public arrayDs(){

    }

    public static void main(String[] args){
        // To declare an array, you need to declare the type of variable with square bracets;
        // now you need to define array's capacity i.e no of elements it will hold;
        int[] arr = new int[5];
        for (int i =0; i < 5; i++){
            arr[i] = i;
            System.out.println("Element in arr "+i+" at position:"+i);
        }

        String[] myFriends = {"Amit", "Siddhu", "Mrunal"};
        System.out.println(myFriends[1]);
        int[] myNos = {1, 2, 3, 4, 5};
        int sum = 0;
        for (int i=0; i< myNos.length;i++){
            sum += myNos[i];
        }
        System.out.println("Sum is: "+sum);

        // MultiDimensional Array;
        // Array that contain other arrays!
        int[][] sample = {{1, 2}, {3, 4}, {6}};
        int x = sample[2][0];
        System.out.println(x);



    }
}