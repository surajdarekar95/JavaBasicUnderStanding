
public class AutomaticPromotionInMO {

	// In method overloading if the exact match method is not available then it will
	// be promoted to the next level
	// this is called automatic promotion in method overloading.
	// byte-->short-->int-->long-->float-->double
	// char-->int-->long-->float-->double

	public void m2(int i) {
		System.out.println("Calling int method");
	}

	public void m2(float f) {
		System.out.println("calling float method");
	}

	public static void main(String[] args) {

		AutomaticPromotionInMO Ap = new AutomaticPromotionInMO();
		Ap.m2(10);
		Ap.m2(10.5f);
		Ap.m2('a');
		Ap.m2(10L);
// Ap.m2(10.5); this method will give an error because the promotion of double to next level is not possible.

	}

}
