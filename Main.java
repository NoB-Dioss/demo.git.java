import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DanhSachHocSinh danhSach = new DanhSachHocSinh();
        int luaChon = 0,rs = 0,tuongTac = 0;
        do{
            System.out.println("\nĐây là chương trình \"QUẢN LÝ SINH VIÊN\"");
            System.out.println("Bạn có muốn tương tác với chương trình ?\n"
                    +"1. Có !\n"
                    +"0. Thoát !");
            System.out.print("Nhập tương tác: ");
            tuongTac = sc.nextInt();
            while (tuongTac < 0 || tuongTac > 1){
                System.out.println("Nhập sai tương tác , nhập lại :");
                tuongTac = sc.nextInt();
                rs++;
                if(rs == 5){
                    System.out.println("Nhập sai quá số lần cho phép , tự động thoát !");
                    tuongTac = 0;
                }
            }
            rs = 0;
            switch (tuongTac){
                case 1:
                    System.out.println("--- MENU CHƯƠNG TRÌNH ---"
                            +"\n1. Thêm 1 học sinh vào danh sách !"
                            +"\n2. Thêm nhiều học sinh vào danh sách !"
                            +"\n3. In ra màn hình danh sách học sinh !"
                            +"\n4. Sắp xếp học sinh theo điểm toán !"
                            +"\n5. Sắp xếp học sinh theo điểm lý !"
                            +"\n6. Sắp xếp học sinh theo điểm hóa !"
                            +"\n7. Sắp xếp học sinh theo điểm trung bình !"
                            +"\n8. Xuất ra học sinh giỏi của lớp !"
                            +"\n9. Đếm và xuất ra số lượng học lực !"
                            +"\n0. Thoát !");
                    System.out.print("Nhập tương tác: ");
                    luaChon = sc.nextInt();
                    while (luaChon < 0 || luaChon > 9){
                        System.out.println("Nhập sai lựa chọn , nhập lại :");
                        luaChon = sc.nextInt();
                        rs++;
                        if(rs == 5){
                            System.out.println("Nhập sai quá số lần cho phép , tự động thoát !");
                            tuongTac = 0;
                            luaChon = 0;
                        }
                    }
                    rs = 0;
                    switch (luaChon){
                        case 1:
                            HocSinh hocSinh = new HocSinh();
                            hocSinh.nhapHS();
                            danhSach.themHocSinh(hocSinh);
                            break;
                        case 2:
                            danhSach.nhapDanhSach();
                            break;
                        case 3:
                            danhSach.inDanhSach();
                            break;
                        case 4:
                            danhSach.sapXepDiemToan();
                            System.out.println("Danh sách sau khi sắp xếp điểm toán:");
                            danhSach.inDanhSach();
                            break;
                        case 5:
                            danhSach.sapXepDiemLy();
                            System.out.println("Danh sách sau khi sắp xếp điểm lý:");
                            danhSach.inDanhSach();
                            break;
                        case 6:
                            danhSach.sapXepDiemHoa();
                            System.out.println("Danh sách sau khi sắp xếp điểm hóa:");
                            danhSach.inDanhSach();
                            break;
                        case 7:
                            danhSach.sapXepDiemTB();
                            System.out.println("Danh sách sau khi sắp xếp điểm TB:");
                            danhSach.inDanhSach();
                            break;
                        case 8:
                            System.out.println("HỌC SINH GIỎI CỦA LỚP: \n");
                            danhSach.xuatHSG();
                            break;
                        case 9:
                            System.out.println("HỌC LỰC CỦA CẢ LỚP");
                            danhSach.demVaXuatHocLuc();
                            break;
                    }

            }
        }while (tuongTac != 0);
    }
}
