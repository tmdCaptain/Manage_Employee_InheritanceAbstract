package Person_Abstract_Arraylist;

import java.util.Scanner;

public abstract class Person {
	
	static Scanner sc = new Scanner(System.in);
	private int maNv;
	private String hoTen;
	private boolean gioiTinh;
	private String soDienThoai;
	private long luongCB;
	
	public Person() {
		
	}
	public int getMaNv() {
		return maNv;
	}

	public void setMaNv(int maNv) {
		this.maNv = maNv;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public boolean isGioiTinh() {
		return gioiTinh;
	}

	public void setGioiTinh(boolean gioiTinh) {
		this.gioiTinh = gioiTinh;
	}

	public String getSoDienThoai() {
		return soDienThoai;
	}

	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}

	public long getLuongCB() {
		return luongCB;
	}

	public void setLuongCB(long luongCB) {
		this.luongCB = luongCB;
	}

	public void nhapDL() {
		System.out.println(" Nhập mã số: ");
		this.maNv = sc.nextInt();
		sc.nextLine();
		System.out.println(" Nhập họ tên: ");
		this.hoTen = sc.nextLine();
		System.out.println(" Nhap gioi tinh ");
		this.gioiTinh = sc.nextBoolean();
		sc.nextLine();
		System.out.println(" Nhập số điện thoại: ");
		this.soDienThoai = sc.nextLine();
		System.out.println(" Nhập lương căn bản: ");
		this.luongCB = sc.nextLong();
	}
	
	public abstract String thongTin();
	public abstract long thueThuNhap();
	public abstract long thucLanh();

}

class HanhChanh extends Person{
	private long phuCap;
	private long thuong;

//	Constructor rỗng cho class HanhChanh
	public HanhChanh() {
		
	}

	public long getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(long phuCap) {
		this.phuCap = phuCap;
	}

	public long getThuong() {
		return thuong;
	}

	public void setThuong(long thuong) {
		this.thuong = thuong;
	}
	
	public long thueThuNhap() {
		long  x=0;
		System.out.println(" Thuế cần đóng là :");
		if(this.getLuongCB() < 10000000 )
			System.out.println(" Không đóng thuế " );
		else if(this.getLuongCB()>=10000000&&this.getLuongCB()<20000000)
			x+= (long) (this.getLuongCB() * 0.1);
		else if(this.getLuongCB()>=2000000&&this.getLuongCB()<40000000)
			x+=(long) (this.getLuongCB() * 0.15);
		else
			x+=(long)(this.getLuongCB() * 0.25);
		return x ;
	}
	
	public long thucLanh() {
		return this.getLuongCB() + this.getPhuCap() + this.getThuong();
	}
	
	public void nhapDL() {
		super.nhapDL();
		System.out.println(" Nhập phụ cấp ");
		this.phuCap=sc.nextLong();
		System.out.println(" Nhập lương thưởng ");
		this.thuong=sc.nextLong();
	}

	public String thongTin() {
		return "HanhChanh [phuCap=" + phuCap + ", thuong=" + thuong + ", MaNv=" + getMaNv() + ", HoTen="
				+ getHoTen() + ", GioiTinh()=" + isGioiTinh() + ", SoDienThoai=" + getSoDienThoai()
				+ ", LuongCB()=" + getLuongCB() + "]";
	}
	
}

class KinhDoanh extends Person{
	private long doanhSo;
//	Constructor rỗng cho class HanhChanh
	public KinhDoanh() {
		
	}

	public long getDoanhSo() {
		return doanhSo;
	}

	public void setDoanhSo(long doanhSo) {
		this.doanhSo = doanhSo;
	}

	public long thuongDoanhSo() {
		return this.getDoanhSo() * 30/100;
	}
	
	public long thueThuNhap() {
		long  x=0;
		System.out.println(" Thuế cần đóng là :");
		if(this.getLuongCB() < 10000000 )
			System.out.println(" Không đóng thuế " );
		else if(this.getLuongCB()>=10000000&&this.getLuongCB()<20000000)
			x+= (long) (this.getLuongCB() * 0.1);
		else if(this.getLuongCB()>=2000000&&this.getLuongCB()<40000000)
			x+=(long) (this.getLuongCB() * 0.15);
		else
			x+=(long)(this.getLuongCB() * 0.25);
		return x ;
	}
	
	public long thucLanh() {
		return this.getLuongCB() + this.thuongDoanhSo();
	}
	
	public void nhapDL() {
		super.nhapDL();
		System.out.println(" Nhập doanh số: ");
		this.doanhSo = sc.nextLong();
	}

	@Override
	public String thongTin() {
		return "KinhDoanh [doanhSo=" + doanhSo + ", thuongDoanhSo()=" + thuongDoanhSo() + ", thueThuNhap()="
				+ thueThuNhap() + ", thucLanh()=" + thucLanh() + ", getMaNv()=" + getMaNv() + ", getHoTen()="
				+ getHoTen() + ", isGioiTinh()=" + isGioiTinh() + ", getSoDienThoai()=" + getSoDienThoai()
				+ ", getLuongCB()=" + getLuongCB() + "]";
	}
}










