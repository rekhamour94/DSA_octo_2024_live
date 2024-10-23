package lecture2;

public class LinearSearch {
    public static  void main(String[] args){
        int[] array1 = {8,2,3,10,13,2,1};
        int  value = 2;
        for(int i = 0;i<array1.length;i++){
            if(value==array1[i]){
                System.out.println("value found at "+(i+1));
                break;
            }
        }

    }
}
