public class bai2timmax {
    public static void main(String[] args) {
        int[] soNguyen={1,2,3,4,5,6,7,8,9,10,20};
        System.out.println("phần tử lớn nhất của mang là");
        int max=soNguyen[0];
        for (int i = 0;i < soNguyen.length;i++) {
            if (soNguyen[i]>=max){
                max=soNguyen[i];
            }else {
                max=soNguyen[0];
            }
        }System.out.println(max);
    }
}
