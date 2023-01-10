public class bai2 {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5,6,7,8,9,10};
        int sumarray=sum(array);
        System.out.println(" tổng các phần tử trong mảng là :");
        System.out.println(sumarray);

    }
    public static int sum(int[] array){
        int result=0;
        for (int i = 0; i < array.length; i++) {
            result=result+array[i];
        }
        return result;
    }

}
