public class SmallestArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5};
        int small=array[0];
        for (int i=0;i< array.length;i++){
            if (array[i]<small){
                small=array[i];
            }
        }
        System.out.println(small);
    }
}
