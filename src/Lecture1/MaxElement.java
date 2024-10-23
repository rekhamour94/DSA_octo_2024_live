package Lecture1;

public class MaxElement {
    public static void main(String[] args) {
        int[] array = new int[5];
        int array2[] = {2, 6, 8, 9, 0};
        int max = 0;
        for(int i=0;i<5;i++){
            if(max<array2[i]){
                max= array2[i];
            }
        }
        System.out.println("our maximum value is " +max);

    }
}
