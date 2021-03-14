package AIms;

public class TestPassingParameter {
	public static void main(String[] args) {
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("cinderellaDVD");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle DVD title"+ jungleDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title:" + jungleDVD.getTitle());
	}
	public static void swap(Object o1, Object o2) {
		Object tmp = o1;
		o1 = o2;
		o2 = tmp;
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
// cơ chế truyền giá trị trong java
// class member là những thành phần dữ liệu dược chia sẻ chung trong cả class
// JAVA is always a pass by value programming language
// từ khóa static được dùng chung cho tất cả các đối tượng trong một lớp sử dụng từ khóa static
// hoàn toàn thực hiện được việc nạp chồng phương thức main() nhưng JVM luôn luôn tìm và thực thi "the original main mathod" khi thực thi chương trình
// main bắt buộc khai báo với static vì phương thức main là phương thức khởi đầu khi thực thi chương trình lúc đó chưa có đối tượng nào cả nên phải được khai báo static
// một số quy tắc với các biến static: khi 1 đối tượng thay đổi giá trị thuộc tính thì tất cả các đối tượng trong lớp đó cũng bị thay đổi theo
// static chỉ thao tác với các thuộc tính static không làm việc với các thuộc tính thông thường của đối tượng
// Vấn đề so sánh hai đối tượng: không sử dụng toán tử so sánh "==", các đối tượng được cung cấp phương thức equals() để thực hiện công việc này
// Phương thức equals() được kế thừa từ lớp Object --> cần phải ghi đè (định nghĩa lại) trước khi sử dụng