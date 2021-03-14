package week1;
import javax.swing.JOptionPane;;
public class HienThiSo {
	public static void main(String[] args) {
		String strSo1, strSo2;
		String strHienThi ="ban vua nhap";
		
		strSo1 = JOptionPane.showInputDialog(null, "Hay nhap so thu nhat","nhap so thu nhat",JOptionPane.INFORMATION_MESSAGE);
		strHienThi += strSo1 +"va";
		strSo2 = JOptionPane.showInputDialog(null, "hay nhap so thu hai: ","nhap so thu 2", JOptionPane.INFORMATION_MESSAGE);
		strHienThi +=strSo2;
		JOptionPane.showMessageDialog(null, strHienThi, "Hien thi hai so", JOptionPane.INFORMATION_MESSAGE);;
		System.exit(0);
	}
}
