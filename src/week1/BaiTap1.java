package week1;
import javax.swing.JOptionPane;
public class BaiTap1 {
	public static void main(String[] args) {
		String strSo1, strSo2;
		Double so1, so2;
		int iLuaChon;
		String strLuaChon;
		int sum = 0;
		String strHienThi ="Tong cua la ";
		do {
			strSo1 = JOptionPane.showInputDialog(null, "Hay nhap so thuc","nhap so thuc",JOptionPane.INFORMATION_MESSAGE);
			iLuaChon = JOptionPane.showConfirmDialog(null,
					"Ban co muon tiep tuc khong?", "Loi",
					JOptionPane.YES_NO_OPTION, 
					JOptionPane.QUESTION_MESSAGE);
			if(iLuaChon == JOptionPane.YES_OPTION) {
				strLuaChon ="co";
			 sum = sum + Integer.parseInt(strSo1);
			}
			else strLuaChon ="khong";
		}while(strLuaChon != "khong");
		sum = sum + Integer.parseInt(strSo1);
		strHienThi += "Tong cua cac so la:"+ sum;
		
		JOptionPane.showMessageDialog(null, strHienThi, "Hien thi hai so", JOptionPane.INFORMATION_MESSAGE);;
		System.exit(0);
	}
}
