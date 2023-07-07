package Person_Abstract_Arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPerson {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		Tạo ra 2 arraylist để chứa các thông tin của hành chính và kinh doanh
		ArrayList<Person>  prhc = new ArrayList<Person>();
		ArrayList<Person>  prkd = new ArrayList<Person>();
		
		Person x,y ;
		int chon;
		String tt = "end";
		do {
			
			System.out.println("---------Mời bạn chọn-----------");
			System.out.println("----1.Nhập danh sách nhân viên hành chính----");
			System.out.println("----2.Nhập danh sách nhân viên kinh doanh---- ");
			System.out.println("----3.Hiển thị thông tin của tất cả nhân viên hành chính----");
			System.out.println("----4.Hiển thị tổng doanh thu tiền lương của phòng hành chính----");
			System.out.println("----5.Hiển thị tổng doanh thu tiền lương của phòng hành chính----");
			System.out.println("----6.Hiển thị tổng doanh thu tiền lương của phòng kinh doanh----");
			System.out.println("----7.Thông tin của cả phòng kinh doanh và hành chánh----");
			System.out.println("----8.Xóa nhân viên ở phòng hành chính theo mã nhân viên----");
			System.out.println("----9.Tìm nhân viên theo mã nhân viên----");

			System.out.println(" Nhập lựa chọn của bạn");
			chon = sc.nextInt();
			switch(chon) {
				case 1:
					System.out.println(" Nhập thông tin cho nhân viên hành chính");
					do {
						x = new HanhChanh();
						x.nhapDL();
						sc.nextLine();
						prhc.add(x);
						System.out.println(" Nhập end để kết thúc nhập");
						tt = sc.nextLine();
					}while(!tt.equals("end"));
					break;
				case 2:
					System.out.println(" Nhập thông tin cho nhân viên kinh doanh");
					do {
						y = new KinhDoanh();
						y.nhapDL();
						prkd.add(y);
						System.out.println(" Nhập end để kết thúc nhập");
					}while(!tt.equals("end"));
					break;
				case 3:
					
					System.out.println("Tất cả thông tin của nhân viên hành chính");
					for(Person a : prhc) 
					{
						System.out.println(" Thông tin của " + a.getHoTen());
						System.out.println(" Thông tin : " + a.thongTin());
					}
					break;
				case 4:
					
					System.out.println("Tất cả thông tin của nhân viên kinh doanh");
					for(Person a : prkd) {
						System.out.println(" Thông tin của " + a.getHoTen());
						System.out.println(" Thông tin " + a.thongTin());
					}
					break;
				case 5:
					System.out.println(" Tổng tiền lương phòng hành chính");
					for (Person a : prhc) 
					{
						long sum =0;
						sum+=a.thucLanh();
					    System.out.println(" Tổng tiền lương phòng hành chánh  : " + sum);
				    }
					break;
				case 6:
					System.out.println(" Tổng tiền lương phòng kinh doanh");
					for (Person a : prkd) 
					{
						long sum =0;
						sum+=a.thucLanh();
					    System.out.println(" Tổng tiền lương phòng hành chánh  : " + sum);
				    }
					break;
				case 7:
					System.out.println(" Thông tin của cả phòng kinh doanh và hành chánh");
					for (Person a : prkd) 
					{
						System.out.println("" + a.thongTin());
						
				    }
					
					for (Person a : prhc) 
					{
						System.out.println("" + a.thongTin());
						
				    }
					break;
				case 8:
					
					System.out.println("Nhập mã số cần xóa: ");
					int mscx = sc.nextInt();
					for (int i = 0; i < prhc.size(); i++) {
					    if (prhc.get(i).getMaNv()==mscx) {
					        prhc.remove(i);
					    }
					break;
					}
					
				case 9:
					
					System.out.println("Nhập mã số cần tìm: ");
					int msct = sc.nextInt();
					for (int i = 0; i < prhc.size(); i++) {
					    if (prhc.get(i).getMaNv()==msct) {
					        System.out.println("Thông tin của nhân viên " + prhc.get(i).thongTin());
					    }
					    else
					    	System.out.println(" Không tồn tại!");
					break;
					}
			}
		}while(chon<=10);
	}

}
