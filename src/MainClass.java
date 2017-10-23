

import java.util.List;

public class MainClass {
	
	public static void main(String[] args)
	{
		String filePath = null;
		for (String s: args) {
            		System.out.println(s);
			filePath = s;
                }
		
		
		//String filePath = "files/Plik z danymi.txt";
		MainClass mainClass = new MainClass();
		double summAllAmounts = mainClass.getSumAllAmounts(filePath);
		System.out.println("Sum all amounts: "+summAllAmounts);
	    
	}
	
	public MainClass()
	{
	}
	
	public double getSumAllAmounts(String filePath)
	{
		ReadDataFromFile readDataFormFile = new ReadDataFromFile(filePath);
		List<Data> dataList = readDataFormFile.getDataList();
		double sumAmounts = 0;
		for(int i=0; i<dataList.size(); i++)
		{
			//System.out.println(dataList.get(i).toString());
			sumAmounts += dataList.get(i).getAmount();
		}
		
		return sumAmounts;
	}

	
	

}
