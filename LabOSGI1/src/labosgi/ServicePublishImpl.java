package labosgi;

public class ServicePublishImpl implements ServicePublish{
	
	float sum,substract;
	float multi=1,division=1;

	@Override
	public String publishService() {
		
		return "Execute publish sdhhjdd";
	}

	@Override
	public float sum(float s) {
		
		sum=sum+s;
		return sum;
	}

	//@Override
	public float substract(float su,float su1) {
		
		substract=su-su1;
		return substract;
	}

	@Override
	public float multi(float m) {
		
		multi=multi*m;
		return multi;
	}

	@Override
	public float division(float d,float e) {
		
		division=d/e;
		return division;
	}

	@Override
	public void printsum() {
		
		System.out.println(sum) ;
	}

	@Override
	public void printsubstract() {

		System.out.println(substract) ;
		
	}
	@Override
	public void printdivision() {
		
		System.out.println(division) ;
		
	}
	@Override
	public void printmulti() {
		
		System.out.println(multi) ;
	}
	
	
	

}
