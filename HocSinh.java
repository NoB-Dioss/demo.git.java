import java.util.Scanner;

public class HocSinh {
    private String iD;
    private String name;
    private float toan , ly , hoa , diemTrungBinh;

    public HocSinh() {
    }

    public HocSinh(String iD, String name, float toan, float ly, float hoa, float diemTrungBinh) {
        this.iD = iD;
        this.name = name;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.diemTrungBinh = diemTrungBinh;
    }

    public void nhapHS(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ID: "); this.iD = sc.nextLine();
        System.out.print("Nhập Tên: "); this.name = sc.nextLine();
        System.out.print("Nhập Đ.toán: "); this.toan = sc.nextFloat();
        System.out.print("Nhập Đ.lý: "); this.ly = sc.nextFloat();
        System.out.print("Nhập Đ.hóa: "); this.hoa = sc.nextFloat();
        this.diemTrungBinh = (this.toan + this.ly + this.hoa) / 3;
    }
    public void xuatHS(){
        System.out.println("HỌC SINH: " +
                "[ ID: " + iD +
                " - Tên: " + name +
                " - Đ.toán: " + toan +
                " - Đ.lý: " + ly +
                " - Đ.hóa: " + hoa +
                " - Đ.trung bình: " + diemTrungBinh + " ]");
    }
    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getLy() {
        return ly;
    }

    public void setLy(float ly) {
        this.ly = ly;
    }

    public float getHoa() {
        return hoa;
    }

    public void setHoa(float hoa) {
        this.hoa = hoa;
    }

    public float getDiemTrungBinh() {
        return diemTrungBinh;
    }

    public void setDiemTrungBinh(float diemTrungBinh) {
        this.diemTrungBinh = diemTrungBinh;
    }

}

