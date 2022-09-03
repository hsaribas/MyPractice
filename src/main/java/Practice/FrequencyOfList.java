package Practice;

public class FrequencyOfList {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 10, 10, 20, 30, 30, 10};
        int count = 0;
        int num = 10;

        for(int i=0; i<arr.length; i++){
            if(arr[i]==num){
                count++;
            }
        }
        System.out.println("Number 10 has repeated " + count + " times");

    }

}
