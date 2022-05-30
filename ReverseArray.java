public class ReverseArray {
    public static void main(String[] args) {
        int [] array={1,2,3,4,5,6};
        System.out.println("THE ORIGINAL ORDER IS:-");
        for(int i=0;i< array.length;i++){
            System.out.println(array[i]);
        }
        System.out.println("");
        System.out.println("THE REVERSE ORDER IS :-");
        for (int i= array.length-1;i>=0;--i){
            System.out.println(array[i]);
        }
    }
}
