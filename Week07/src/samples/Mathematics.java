package samples;

public class Mathematics {

	public static void main(String[] args) {
//		VectorPublic vp = new VectorPublic();
//		vp.printVector();
		
//		VectorPublic vp1 = new VectorPublic(10);
//		vp1.printVector();
		VectorPublic vp2 = new VectorPublic(10,10);
		vp2.printVector("vp2");
		VectorPublic vp3 = new VectorPublic(10,10,1);
		vp3.printVector("vp3");
		
//		vp3.dimensions = 11;
//		vp3.printVector("vp3");
		
//		VectorPrivate vp4 = new VectorPrivate();
//		vp4.setDimensions(10);
//		System.out.println(vp4.getDimensions());
		
//		vp4.printVector();
//		vp4.setVector(new int[10]);
//		vp4.printVector();
//		vp4.generateVectorRandomly(10);
//		vp4.printVector();
		
		// Let's program the dot product...
		// v1 = (a,b,c), v2 = (x,y,z) --> v1.v2 = a*x + b*y + c*z
		
		System.out.println(vp2.dotProduct(vp3.vector));
		
//		Mathematics m = new Mathematics();
//		System.out.println(m.dotProduct(vp2.vector,vp3.vector));
		System.out.println(dotProduct(vp2.vector,vp3.vector));
	}
	
//	public int dotProduct(int[] vector1, int[] vector2) {
	public static int dotProduct(int[] vector1, int[] vector2) {
		int result = 0;
		
		if (vector1.length != vector2.length) {
			System.out.println("Vectors should be of the same length.");
			return 0;
		}
		
		for (int i=0; i<vector1.length; i++) {
			result += vector1[i]*vector2[i];
		}
		
		return result;
	}


}
