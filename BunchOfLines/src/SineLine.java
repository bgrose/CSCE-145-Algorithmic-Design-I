
public class SineLine implements Line{
	//Instance Variable
			private double amplitude, frequency;

			//Default Constructor
			public SineLine() 
			{
				this.amplitude = 20;
				this.frequency = 1;
			}

			//Paramerized Constructor
			public SineLine(double aAmplitude, double aFrequency) {
				setAmp(aAmplitude);
				setFreq(aFrequency);
			}

			//Getters
			public double getAmp() 
			{
				return amplitude;
			}
			public double getFreq()
			{
				return frequency;
			}

			//Seters
			public void setAmp(double aAmp) 
			{
				this.amplitude = aAmp;
			}
			
			public void setFreq(double aFreq)
			{
				this.frequency = aFreq;
			}

			//Sets Values for point
			public double getYPoint(double xCord) 
			{
				return amplitude * Math.sin(xCord * frequency);
			}
}
