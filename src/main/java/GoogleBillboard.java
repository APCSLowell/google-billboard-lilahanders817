

public class GoogleBillboard {
	public final static String e = "2.7182818284590452353602874713526624977572470936999595749669676277240766303535475945713821785251664274274663919320030599218174135966290435";  
	public static void main(final String[] args) {
		String str = new String();
		for(int i = 0; i<11; i++){
			str = e.substring(i, i+10));
			double = Double.parseDouble(str);
			if(isPrime == true){
				System.out.println(str+"is prime.");
				break;
			}
		}
		
	}
	

	//Finish this function
	public boolean isPrime(double d){
		if(d<2){
		    return false;
		  }
		  for(int i = 2; i <= Math.sqrt(d); i++){
		    if(d%i == 0){
		      return false;
		    }
		  }
		  return true;
	}

}

