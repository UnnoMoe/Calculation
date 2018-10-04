package calculation;

//ローカル変数Calculation_lib(int m, int n)が優先される（引数）

public class Calculation_lib{
	//フィールドの定義
	private int m,n;
	
	public Calculation_lib(int m, int n) {
	//thisがついてるとフィールド。
	//コンストラクタの書き方
		this.m = m;
		this.n = n;
	}
	
	public int getPlus(){
		return this.m + this.n;
	}

	public int getMinus(){
		return this.m - this.n;
	}
	
	public int getTime(){
		return this.m * this.n;
	}
	
	public int getDivide(){
		return this.m / this.n;
	}
	
	public int getMod(){
		return this.m % this.n;
	}
	
}