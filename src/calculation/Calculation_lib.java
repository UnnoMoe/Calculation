package calculation;

//���[�J���ϐ�Calculation_lib(int m, int n)���D�悳���i�����j

public class Calculation_lib{
	//�t�B�[���h�̒�`
	private int m,n;
	
	public Calculation_lib(int m, int n) {
	//this�����Ă�ƃt�B�[���h�B
	//�R���X�g���N�^�̏�����
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