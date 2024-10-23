package lecture2;

public class SwapDemo {
    public static  void main(String[] args){
        int[] array1 = {1,2,3,4,5};
        int  k = 1;
        int j = 3;
        // 1 4 3 2 5
        for(int i = 0;i<array1.length;i++){
            if(k==i){
                int temp = array1[k];
                array1[k] = array1[j];
                array1[j] = temp;
                System.out.println("value found at "+(i+1));

            }
        }
        for(int i = 0;i<array1.length;i++){
                System.out.println("elements at "+ i + " is " +array1[i]);


        }

    }

}
