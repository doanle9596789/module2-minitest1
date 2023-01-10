public class bai2timmax {
    public static void main(String[] args) {
        int[] soNguyen={1,2,3,4,5,6,7,8,9,10,20};
        System.out.println("phần tử lớn nhất của mang là");
       System.out.println(max(soNguyen));
    }
    public static int max(int[]array){
        int max=array[0];
        for (int i = 0;i < array.length;i++) {
            if (array[i]>=max){
                max=array[i];
            }else {
                max=array[0];
            }
        }
        return max;
    }
}
