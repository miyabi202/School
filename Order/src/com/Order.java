package com;

public class Order {
	private String name;
	private Integer lcd;
	private Integer ram;
	private Integer mouse;
	private Integer sum;
	private boolean isMember; // 新增這個變數表示是否為會員

	public Order(String name, Integer lcd, Integer ram, Integer mouse,boolean isMember, Integer sum) {
		super();
		this.name = name;
		this.lcd = lcd;
		this.ram = ram;
		this.mouse = mouse;
		// 確保 isMember 正確初始化
        this.isMember = isMember;
		//this.calculateSum();}
	     this.sum = sum != null ? sum : 0; // 如果 sum 是 null，則設定為 0
	    this.calculateSum(); }// 呼叫 calculateSum 計算總價

		    /*這行程式碼使用了三元運算子（Ternary Operator）的寫法。這種寫法是一種簡短的條件表達式，用於根據條件的真偽來賦予變數不同的值。
		     
		// 在建構子中計算 sum
        calculateSum(){
        	double discount;
        	if (isMember.isSelected()) {
        	    discount = 0.9;
        	} else {
        	    discount = 1.0;
        	}
        }*/
		    // 新增計算 sum 的方法
		    public void calculateSum() {
		    	
		    	    // 判斷是否是會員
		    	    if (isMember) {
		    	        // 如果是會員，先打 0.95 折扣
		    	        this.sum = (int) (lcd * 4999 * 0.95 + ram * 1280 * 0.95 + mouse * 799 * 0.95);
		    	    } else {
		    	        // 如果不是會員，不打折扣
		    	        this.sum = (int) (lcd * 4999 + ram * 1280 + mouse * 799);
		    	    }

		    	    // 判斷是否超過 2000，如果超過再打 0.95 折扣
		    	    if (this.sum > 2000) {
		    	        this.sum = (int) (this.sum * 0.95);
		    	    }
		    	}
		    	
		    	
		    	
		    
		        // 根據是否是會員，計算不同的折扣
		       /* double discount = isMember ? 0.95 : 1.0;*/
		    	/*錯了因為超過2000
		    	double discount;
		    	if(sum>=2000) {
		    		sum=(int)(sum*0.95);
		    	} // 如果總價大於等於2000，先打95折
		    	if (isMember==true) {
		    		discount = isMember ? 0.95 : 1.0;
		    	} else { //若小於2000就是只有會員價格
		    		discount = isMember ? 0.95 : 1.0;
		    	}
		        // 進行總價計算
		        this.sum = (int) (lcd * 4999 * discount + ram * 1280 * discount + mouse * 799 * discount);
		 
		    }/*double discount;
if (isMember) {
    discount = 0.95;
} else {
    discount = 1.0;
}*/
		    
		   public void show() {
			   if(sum>=2000) sum=(int)(sum*0.95);
			   if(member==1) sum=(int)(sum*0.95);
		   }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLcd() {
		return lcd;
	}

	public void setLcd(Integer lcd) {
		this.lcd = lcd;
	}

	public Integer getRam() {
		return ram;
	}

	public void setRam(Integer ram) {
		this.ram = ram;
	}

	public Integer getMouse() {
		return mouse;
	}

	public void setMouse(Integer mouse) {
		this.mouse = mouse;
	}

	public Integer getSum() {
		return sum;
		
	}

	
	public boolean isMember() {
		return isMember;
	}

	public void setMember(boolean isMember) {
		this.isMember = isMember;
	}

 
}
