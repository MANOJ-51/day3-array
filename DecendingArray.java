public class DecendingArray {
    public static void main(String[] args) {
        int [] array={5,4,1,8,9,};
        int compare=0;
        for (int i=0;i< array.length;i++){
            for (int j=i+1;j< array.length;j++){
                if (array[i]<array[j]) {
                    compare=array[i];
                    array[i]=array[j];
                    array[j]=compare;
                }
            }
        }
        for (int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
    }
}
