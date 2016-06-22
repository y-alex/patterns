package builder;

public class SparePart {
	private int mWidth;
	private int mLength;
	private int mHeight;
	private int mWeight;
	private int mBulk;
	
		
	
	 private SparePart(Builder builder) {
	    mWidth = builder.width;
		mLength = builder.lenght;
		mHeight = builder.height;
		mWeight = builder.weight;
		mBulk = builder.bulk;
	}



	public static class Builder{
		//this is required parameters
		private int width;
		private int lenght;
		private int height;
		
		//this is not required parameters
		private int weight;
		private int bulk;
		
		public Builder(int width, int length, int heigth){
			this.width =  width;
			this.lenght = lenght;
			this.height = heigth;
		}
		
		public Builder setWeight(int weight){
			this.weight = weight;
			return this;
		}
		
		public Builder setBulk(int bulk){
			this.bulk = bulk;
			return this;
		}
		
		public SparePart build(){
			return new SparePart(this);
		}
	}
}
