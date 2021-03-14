package week1;
import javax.swing.JOptionPane;;
public class TongHaiSo {
	public static void main(String[] args) {
		String strSo1, strSo2;
		Integer so1, so2;
		String strHienThi ="Tong cua hai so ";
		
		strSo1 = JOptionPane.showInputDialog(null, "Hay nhap so thu nhat","nhap so thu nhat",JOptionPane.INFORMATION_MESSAGE);
		strHienThi += strSo1 + "va";
		so1=Integer.parseInt(strSo1);
		strSo2 = JOptionPane.showInputDialog(null, "hay nhap so thu hai: ","nhap so thu 2", JOptionPane.INFORMATION_MESSAGE);
		
		so2=Integer.parseInt(strSo2);
		int tong = so1 + so2;
		
		strHienThi +=strSo2 +"la:" +tong;
		JOptionPane.showMessageDialog(null, strHienThi, "Hien thi hai so", JOptionPane.INFORMATION_MESSAGE);;
		System.exit(0);
	}
}
