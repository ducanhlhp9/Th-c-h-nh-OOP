package week3;

import javax.swing.JOptionPane;

public class Complex {
    private double real;
    private double virtual;
    
	

	public double getReal() {
		return real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getVirtual() {
		return virtual;
	}

	public void setVirtual(double virtual) {
		this.virtual = virtual;
	}

	public Complex() {
		setReal(0);
		setVirtual(0);
	}
	
	
	 public Complex(double real, double virtual) {
		super();
		this.real = real;
		this.virtual = virtual;
	}

	public void nhapSoPhuc(Complex cmp){
	        String strreal,strvirtual;
	        strreal = JOptionPane.showInputDialog(null,"Nhập phần thực: ",JOptionPane.INFORMATION_MESSAGE);
	        strvirtual = JOptionPane.showInputDialog(null,"Nhập phần ảo: ",JOptionPane.INFORMATION_MESSAGE);
	        cmp.real = Double.parseDouble(strreal);
	        setReal(cmp.real);
	        cmp.virtual = Double.parseDouble(strvirtual);
	        setVirtual(cmp.virtual);
	    }
	public void hienThi(){
        Double a=getVirtual();
        if(a<0){
            JOptionPane.showMessageDialog(null, "SoPhuc: "+ getReal()  + getVirtual() + "i");
        }
        else
            JOptionPane.showMessageDialog(null, "SoPhuc: "+ getReal()+"+" + getVirtual() + "i" );
    }
	
	public Complex congHaiSoPhuc(Complex cmp1, Complex cmp2){
        Double real,virtual;
        Complex cmp=new Complex();
        real=cmp1.real+cmp2.real;
        virtual=cmp1.virtual+cmp2.virtual;
        cmp.real=real;
        setReal(cmp.real);
        cmp.virtual=virtual;
        setVirtual(cmp.virtual);
        return cmp;
    }
    
    public Complex truHaiSoPhuc(Complex cmp1, Complex cmp2){
        Double real,virtual;
        Complex cmp=new Complex();
        real=cmp1.real-cmp2.real;
        virtual=cmp1.virtual-cmp2.virtual;
        cmp.real=real;
        setReal(cmp.real);
        cmp.virtual=virtual;
        setVirtual(cmp.virtual);
        return cmp;
    }
    public Complex nhanHaiSoPhuc(Complex cmp1, Complex cmp2){
        Double real,virtual;
        Complex cmp=new Complex();
        real=(cmp1.real*cmp2.real)-(cmp1.virtual*cmp2.virtual);
        virtual=(cmp1.virtual*cmp2.real)+(cmp1.real*cmp2.virtual);
        cmp.real=real;
        setReal(cmp.real);
        cmp.virtual=virtual;
        setVirtual(cmp.virtual);
        return cmp;
    }
    public Complex chiaHaiSoPhuc(Complex cmp1, Complex cmp2){
        Double real,virtual,a;
        a=Math.pow(cmp2.real,2)+Math.pow(cmp2.virtual,2);
        Complex cmp=new Complex();
        real=((cmp1.real*cmp2.real)+(cmp1.virtual*cmp2.virtual))/a;
        virtual=((cmp1.virtual*cmp2.real)-(cmp1.real*cmp2.virtual))/a;
        cmp.real=real;
        setReal(cmp.real);
        cmp.virtual=virtual;
        setVirtual(cmp.virtual);
        return cmp;
    }
    
	public static void main(String[] args) {
		String a;
        Complex s1= new Complex();
        Complex s2= new Complex();
        Complex kq= new Complex();
        int b;
        do{
            a = JOptionPane.showInputDialog(null,"1.Nhập số thực\n"+"2. Tổng 2 số\n"+"3.Hiệu 2 số\n"+"4.Tích 2 số\n"+"5.Chia 2 số\n"+"6.Thoát\n",JOptionPane.INFORMATION_MESSAGE);
            b=Integer.parseInt(a);
            switch(b){
                case 1:
                {
                    s1.nhapSoPhuc(s1);
                    s1.hienThi();
                    s2.nhapSoPhuc(s2);
                    s2.hienThi();
                    break;
                }
                case 2:
                {
                    kq.congHaiSoPhuc(s1,s2);
                    kq.hienThi();
                    break;
                }
                case 3:{
                    kq.truHaiSoPhuc(s1,s2);
                    kq.hienThi();
                    break;
                }
                case 4:{
                    kq.nhanHaiSoPhuc(s1,s2);
                    kq.hienThi();
                    break;
                }
                case 5:{
                    kq.chiaHaiSoPhuc(s1,s2);
                    kq.hienThi();
                    break;
                }
            }
        }while(b!=6);

	}

}

