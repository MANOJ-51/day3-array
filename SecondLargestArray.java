public class SecondLargestArray {
    public static void main(String[] args) {
        int []array={1,7,6,4,9,8,3,2};
        int compare=0;
        for (int i=0;i<array.length;i++){
            for(int j=i+1;j<array.length;j++){
                if (array[i]<array[j]){
                 compare=array[i];
                 array[i]=array[j];
                 array[j]=compare;
                }
            }
        }
        System.out.println("THE SECOND LARGEST NUMBER IS: "+array[1]);
    }
}
