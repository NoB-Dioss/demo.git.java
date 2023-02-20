import java.util.*;

public class DanhSachHocSinh {
    private ArrayList<HocSinh> danhSach;

    public DanhSachHocSinh() {
        this.danhSach = new ArrayList<HocSinh>();
    }
    public void themHocSinh(HocSinh hs){
        this.danhSach.add(hs);
    }

    public void nhapDanhSach(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số lương học sinh muốn thêm: ");
        int n = sc.nextInt();
        for (int i = 0 ; i < n ; i++){
            System.out.println("\nNhập học sinh thứ: " + (i + 1));
            HocSinh hocSinh = new HocSinh();
            hocSinh.nhapHS();
            themHocSinh(hocSinh);
        }
    }
    public void inDanhSach(){
        for (HocSinh hocSinh:danhSach) {
            hocSinh.xuatHS();
        }
    }
    public void sapXepDiemToan(){
        Collections.sort(danhSach, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh hs1, HocSinh hs2) {
                if (hs1.getToan() < hs2.getToan()){
                    return -1;
                }
                else if (hs1.getToan() > hs2.getToan()){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
    }
    public void sapXepDiemLy(){
        Collections.sort(danhSach, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh hs1, HocSinh hs2) {
                if (hs1.getLy() < hs2.getLy()){
                    return 1;
                }
                else if (hs1.getLy() > hs2.getLy()){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
    }
    public void sapXepDiemHoa(){
        Collections.sort(danhSach, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh hs1, HocSinh hs2) {
                if (hs1.getHoa() < hs2.getHoa()){
                    return -1;
                }
                else if (hs1.getHoa() > hs2.getHoa()){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
    }
    public void sapXepDiemTB(){
        Collections.sort(danhSach, new Comparator<HocSinh>() {
            @Override
            public int compare(HocSinh hs1, HocSinh hs2) {
                if (hs1.getDiemTrungBinh() < hs2.getDiemTrungBinh()){
                    return -1;
                }
                else if (hs1.getDiemTrungBinh() > hs2.getDiemTrungBinh()){
                    return 1;
                }
                else {
                    return 0;
                }
            }
        });
    }

    public void xuatHSG(){
        for (HocSinh hocSinh:danhSach) {
            if (hocSinh.getDiemTrungBinh() > 8.0){
                System.out.println(hocSinh);
            }
        }
    }

    public void demVaXuatHocLuc(){
        int gioi = 0;
        int kha = 0;
        int trungbinh = 0;
        int yeu = 0;
        for (HocSinh hocSinh:danhSach) {
            if (hocSinh.getDiemTrungBinh() > 8.0){
                gioi++;
            }
            if (hocSinh.getDiemTrungBinh() < 8.0 && hocSinh.getDiemTrungBinh() >= 6.5){
                kha++;
            }
            if (hocSinh.getDiemTrungBinh() < 6.5 && hocSinh.getDiemTrungBinh() >= 5.0){
                trungbinh++;
            }
            if (hocSinh.getDiemTrungBinh() < 5.0){
                yeu++;
            }
        }
        System.out.println("HỌC LỰC CỦA LỚP\n"
                + "\nGiỏi: " + gioi
                + "\nKhá: " + kha
                + "\nTrung Bình: " + trungbinh
                + "\n Yếu: " + yeu);
    }


}
