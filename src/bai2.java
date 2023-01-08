public class bai2 {
    public static void main(String[] args) {
        int[] soNguyen={1,2,3,4,5,6,7,8,9,10};
        System.out.println(" tổng các phần tử trong mảng là :");
        int resoult=0;
        for (int i = 0; i < soNguyen.length; i++) {
            resoult=resoult+soNguyen[i];
        }
        System.out.println(resoult);
    }
}
