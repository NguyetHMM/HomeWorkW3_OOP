package complex;

import complex.Complex;

public class TestComplex {
    public static void main(String[] args) {


        Complex cmp1 = new Complex();
        System.out.print("So phuc khoi tao khong tham so: ");
        cmp1.inSoPhuc(cmp1);
        System.out.println();

        Complex cmp2 = new Complex();
        System.out.println("Nhap so phuc thu nhat! ");
        cmp2.nhapSoPhuc(cmp2);
        System.out.print("So phuc thu nhat: ");
        cmp2.inSoPhuc(cmp2);

        Complex cmp3 = new Complex();
        System.out.println("Nhap so phuc thu hai! ");
        cmp3.nhapSoPhuc(cmp3);
        System.out.print("So phuc thu hai: ");
        cmp3.inSoPhuc(cmp3);

        Complex tong = new Complex();
        tong.congHaiSoPhuc(cmp2, cmp3);
        System.out.print("Tong cua hai so phuc : ");
        tong.inSoPhuc(tong);

        Complex hieu = new Complex();
        hieu.truHaiSoPhuc(cmp2, cmp3);
        System.out.print("Hieu cua hai so phuc : ");
        hieu.inSoPhuc(hieu);

        Complex tich = new Complex();
        tich.nhanHaiSoPhuc(cmp2, cmp3);
        System.out.print("Tich cua hai so phuc : ");
        tich.inSoPhuc(tich);

        Complex thuong = new Complex();
        if (thuong.chiaHaiSoPhuc(cmp2, cmp3) != null) {
            System.out.println("Thuong hai so phuc la: ");
            thuong.inSoPhuc(thuong);
        }
    }
}
