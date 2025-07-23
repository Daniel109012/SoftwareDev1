package samples;

import java.util.Random;

public class VectorPrivate {

	private int dimensions;	// the dimension/length of the vector
	private int[] vector;	// the vector itself
	
	
	
	public int getDimensions() {
		return dimensions;
	}

	public void setDimensions(int dimensions) {
		if (this.dimensions > 0)
			System.out.println("Dimensions were already set, changing it would cause errors.");
		else
			this.dimensions = dimensions;
	}

	public int[] getVector() {
		return vector;
	}

	public void setVector(int[] vector) {
		this.vector = vector;
		this.dimensions = vector.length;
	}

	public VectorPrivate() {
		
	}
	
	// generate an emptyVector of length "dimensions"
	public VectorPrivate(int dimensions) {
		this.dimensions = dimensions;
		this.vector = new int[dimensions];
	}
	
	// generate an emptyVector of length "dimensions" and fills it with random numbers from 0 to "maxNumbers"
	public VectorPrivate(int dimensions, int maxNumbers) {
//		this.VectorPublic(dimensions);
		this.dimensions = dimensions;
		this.vector = new int[dimensions];
		generateVectorRandomly(maxNumbers);
	}

	// generate an emptyVector of length "dimensions" and fills it with random numbers from 0 to "maxNumbers" 
	// generated with random seed "randomSeed"
	public VectorPrivate(int dimensions, int maxNumbers, int randomSeed) {
//		this.VectorPublic(dimensions);
		this.dimensions = dimensions;
		this.vector = new int[dimensions];
		generateVectorRandomly(maxNumbers, randomSeed);
	}

	private void generateVectorRandomly(int maxNumbers) {
		Random rand = new Random();
		for (int i=1; i<dimensions; i++) {
			vector[i] = rand.nextInt(maxNumbers);
		}
	}
	
	public void generateVectorRandomly(int maxNumbers, int randSeed) {
		Random rand = new Random(randSeed);
		for (int i=1; i<dimensions; i++) {
			vector[i] = rand.nextInt(maxNumbers);
		}
	}

	public void printVector() {
		if (this.vector != null)
			for (int i=1; i<dimensions; i++) {
				System.out.print(vector[i] + "\t");
			}
		else
			System.out.println("The vector is not yet initialized.");
		System.out.println();
	}
	
	public void printVector(String name) {
		System.out.print(name + ":\t");
		for (int i=1; i<dimensions; i++) {
			System.out.print(vector[i] + "\t");
		}
		System.out.println();
	}

	public int dotProduct(int[] vector2) {
		int result = 0;
		
		if (vector2.length != this.dimensions) {
			System.out.println("Vectors should be of the same length.");
			return 0;
		}
		
		for (int i=0; i<vector.length; i++) {
			result += vector[i]*vector2[i];
		}
		
		return result;
	}
}
