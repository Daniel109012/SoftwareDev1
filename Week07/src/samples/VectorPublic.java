package samples;

import java.util.Random;

public class VectorPublic {
	
	public int dimensions;	// the dimension/length of the vector
	public int[] vector;	// the vector itself
	
//	public VectorPublic() {
//		
//	}
	
	// generate an emptyVector of length "dimensions"
	public VectorPublic(int dimensions) {
		this.dimensions = dimensions;
		this.vector = new int[dimensions];
	}
	
	// generate an emptyVector of length "dimensions" and fills it with random numbers from 0 to "maxNumbers"
	public VectorPublic(int dimensions, int maxNumbers) {
//		this.VectorPublic(dimensions);
		this.dimensions = dimensions;
		this.vector = new int[dimensions];
		generateVectorRandomly(maxNumbers);
	}

	// generate an emptyVector of length "dimensions" and fills it with random numbers from 0 to "maxNumbers" 
	// generated with random seed "randomSeed"
	public VectorPublic(int dimensions, int maxNumbers, int randomSeed) {
//		this.VectorPublic(dimensions);
		this.dimensions = dimensions;
		this.vector = new int[dimensions];
		generateVectorRandomly(maxNumbers, randomSeed);
	}

	public void generateVectorRandomly(int maxNumbers) {
		Random rand = new Random();
		for (int i=0; i<dimensions; i++) {
			vector[i] = rand.nextInt(maxNumbers);
		}
	}
	
	public void generateVectorRandomly(int maxNumbers, int randSeed) {
		Random rand = new Random(randSeed);
		for (int i=0; i<dimensions; i++) {
			vector[i] = rand.nextInt(maxNumbers);
		}
	}

	public void printVector() {
		for (int i=0; i<dimensions; i++) {
			System.out.print(vector[i] + "\t");
		}
		System.out.println();
	}
	
	public void printVector(String name) {
		System.out.print(name + ":\t");
		printVector();
//		for (int i=0; i<dimensions; i++) {
//			System.out.print(vector[i] + "\t");
//		}
//		System.out.println();
	}

	public int dotProduct(int[] vector2) {
//		int result = 0;
//		
//		if (vector2.length != this.dimensions) {
//			System.out.println("Vectors should be of the same length.");
//			return 0;
//		}
//		
//		for (int i=0; i<vector.length; i++) {
//			result += vector[i]*vector2[i];
//		}
//		
//		return result;
		return Mathematics.dotProduct(vector2, this.vector);
	}

}
