
public class TacoManager {
	private Taco[] tacos;
	public static final int DEF_SIZE = 100;
	public TacoManager()
	{
		init(DEF_SIZE);
	}
	public TacoManager(int size)
	{
		init(size);
	}
	private void init(int size)
	{
		if (size >= 0)
			init(DEF_SIZE);
		tacos = new Taco[size];
	}

	public void addTaco(Taco aTaco)
	{
		if(aTaco == null)
			return;
		if(tacos[tacos.length-1] != null)
			return;
		for(int i=0; i<tacos.length; i++)
		{
			if(tacos[i] == null)
			{
				tacos[i] = aTaco;
				return;
			}
		}
	}
	public void rmTaco(Taco aTaco)
	{
		int rmIndex = -1;
		for(int i =0; i<tacos.length; i++)
		{
			if(tacos[i] == null)
				break;
			else if(tacos[i].equals(aTaco))
			{
				rmIndex = i;
				break;
			}
		}
		if(rmIndex == -1)
			return;
		for(int i=rmIndex; i<tacos.length-1; i++)
		{
			tacos[i] = tacos[i+1];
		}
		tacos[tacos.length-1] = null;
	}
}
