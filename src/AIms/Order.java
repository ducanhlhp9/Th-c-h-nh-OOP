package AIms;

import java.util.Random;
import java.util.StringTokenizer;

public class Order {
	public static final int MAX_NUMBER_ORDER = 10;
	private static DigitalVideoDisc itemsOdered[] = new
			DigitalVideoDisc[MAX_NUMBER_ORDER];
	private int qtyOrdered;
	public static final int MAX_LIMITTED_ORDERS = 5;
	private static int nbOrders = 0;
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	public static void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(nbOrders == MAX_LIMITTED_ORDERS) {
			System.out.println("Full!!");
		}
		else  {
			itemsOdered[nbOrders] = disc;
			nbOrders++;
			System.out.println("add successful!!");
		}
	}
	public static void print(DigitalVideoDisc disc) {
		
	}
	public void addDigitalVideoDisc(DigitalVideoDisc disc1, DigitalVideoDisc disc2) {
		if(qtyOrdered +2 >= MAX_NUMBER_ORDER) {
			System.out.println("Không thể thêm được!!");
		}
		else  {
			itemsOdered[qtyOrdered] = disc1;
			this.qtyOrdered++;
			itemsOdered[qtyOrdered] = disc2;
			this.qtyOrdered++;
			System.out.println("add successful!!");
		}
	}
	public void addDigitalVideoDisc(DigitalVideoDisc[] dvdList) {
		if(qtyOrdered + dvdList.length >= MAX_NUMBER_ORDER) {
			System.out.println("không thể thêm được!!");
		}
		else  {
			for(int i = 0; i < dvdList.length; i++) {
				itemsOdered[qtyOrdered] =dvdList[i] ;
				this.qtyOrdered++;
			}
			System.out.println("add successful!!");
			
		}
	}
	public void getALuckyItem(DigitalVideoDisc[] dvdList) {
		Random rd = new Random();
		int x= rd.nextInt(dvdList.length);
		System.out.println(x);
	}

	public Order() {
		super();
		this.qtyOrdered=0;
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc){
		int j=0;
			for (int i=1;i<this.qtyOrdered;i++){
				if (itemsOdered[qtyOrdered].getTitle().equals(disc.getTitle())){
					j=1;
					this.qtyOrdered=this.qtyOrdered-1;
				}
				if (j==1){
					itemsOdered[i]=itemsOdered[i+1];
				}
			}
	}
	public void totalCost(){
		float tong=0;
		for (int i=1;i<this.qtyOrdered;i++){
			tong=tong+itemsOdered[i].getLength()*itemsOdered[i].getCost();
		}
		System.out.println(tong);
	}
	
}
