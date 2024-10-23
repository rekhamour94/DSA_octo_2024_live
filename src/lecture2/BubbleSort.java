package lecture2;

public class BubbleSort {
    public static  void main(String[] args){
        int[] array1 = {4,1,10,3,2};
        for(int i = 0;i<array1.length;i++){
            for(int j  = 0;j<array1.length;j++){
                 if(array1[j]>array1[i]){
                     int temp = array1[i];
                     array1[i] = array1[j];
                     array1[j] = temp;
                 }
            }

        }
        System.out.println("sorted list is as below");
        for(int i = 0;i<array1.length;i++){
            System.out.println(array1[i]);
        }

    }

}
