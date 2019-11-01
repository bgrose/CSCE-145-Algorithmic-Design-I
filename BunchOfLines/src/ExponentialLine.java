//Bradley Grose
public class ExponentialLine implements Line {
	
	//Instance Variable
		private double exponent;

		//Default Constructor
		public ExponentialLine() 
		{
			this.exponent = 2;
		}

		//Paramater Constructor
		public ExponentialLine(double aExpo) 
		{
			setExpo(aExpo);
		}

		//Getters
		public double getExpo() 
		{
			return this.exponent;
		}

		//Setters
		public void setExpo(double aExpo) 
		{
			this.exponent = aExpo;
		}

		//Gets Y cordinates
		public double getYPoint(double xCord) 
		{
			return Math.pow(xCord, this.getExpo());
		}
}

