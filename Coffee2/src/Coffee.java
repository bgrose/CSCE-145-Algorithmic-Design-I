/*
 * Written By Bradley Grose
 */
public class Coffee {
		//Instance Varibale of Coffee
		private String name;
		private int caffAmt;
		
		//Default Cup
		public Coffee()
		{
			this.name = "No Name Yet";
			this.caffAmt = 0;
		}
	
		//Sets Coffee Values
		public Coffee(String aName, int aCaffAmt)
		{
			this.setName(aName);
			this.setCaffContent(aCaffAmt);
		}
		
		//Getters
		public String getName()
		{
			return this.name;
		}
		public int getCaffAmt()
		{
			return this.caffAmt;
		}
		
		//Setters
		public void setName(String aName)
		{
			this.name = aName;
		}
		public void setCaffContent(int aCaffAmt)
		{
			if(aCaffAmt >= 50 && aCaffAmt <= 300)
			{
				this.caffAmt = aCaffAmt;
			}
			
			else
			{
				System.out.println("Invalid amount of caffenine entered, assumed 50mg");
				this.caffAmt = 50; //Set Default Invalid
			}

		}
		
		//Sends the Risky Amount to String and Calculated
		public String RiskyAmount()
		{
			double cups = 180 / ((caffAmt / 100.0) * 6);
			return "It would take " + cups + " cups of " + name + " before its dangerous to drink more";
		}
}
