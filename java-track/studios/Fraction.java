//A fraction has a numerator and denominator. 
//A fraction should be able to add itself to another fraction, 
//returning a new fraction that represents the sum. 
//A fraction should be able to multiply itself by another fraction, 
//returning a new fraction as the product. 
//A fraction should be able to take the reciprocal of itself, 
//returning that value as a new fraction. 
//A fraction should be able to simplify itself, 
//returning a new fraction as that simplification.
public class Fraction {

	//fields
	private int num;
	private int den;

//constructor	
	public Fraction (int num, int den){
		this.num = num;
		this.den = den;
	}
	//getters
	
	public int getNum(){
		return num;
	}
	
	public int getDen(){
		return den;
	}
	//method to add to another fraction
	public Fraction addFraction (Fraction f){
		int n;
		int d;
		if (this.getDen() == f.getDen()){
		d = this.getDen();
		n = this.getNum() + f.getNum();
		}
		else {
			n = this.getNum() * f.getDen() + f.getNum() * this.getDen();
			d = this.getDen() * f.getDen();
		}
		Fraction Sum = new Fraction (n, d);
		return Sum;
	}
	
	//public String addFractions(){
		
	//return "add fractions answer: " + this.addNum + "/" + this.addDen;
	//}

	//method to multiply fractions
	public Fraction multFracts(Fraction g){
		int n2;
		int d2;
		n2 = this.getDen() * g.getNum();
		d2 = this.getNum() * g.getDen();
		
		Fraction Mult = new Fraction (n2, d2);
		return Mult;
	}
	
//make reciprocal fraction
	public Fraction recipNums(Fraction r){
	int n3;
	int d3;
	n3 = this.getDen(); 
	d3 = this.getNum();
	
	Fraction Recip = new Fraction (n3, d3);
	return Recip;
	}
		
	
}
