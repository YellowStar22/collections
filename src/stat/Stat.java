package stat;

class Stat {
	
	static String min = "LI";
	String max = "Li";
	

	public void Stat() {
		min = "MAX";
		this.max = "LI";
		
	}
	
	public String getMin() {
		return min;
	}
	
	public void setMin(String s) {
		Stat.min = s ;
	}
	
	public String getMax() {
		return max;
	}
	
	public void setMax(String s) {
		this.max = s;
	}

}
