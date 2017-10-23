

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadDataFromFile {
	
	private List<Data> dataList;
	
	
	public ReadDataFromFile(String filePath)
	{
		dataList = new ArrayList<Data>();
		
		BufferedReader br = null;
		FileReader fr = null;
		
		try {
			fr = new FileReader(filePath);
			br = new BufferedReader(fr);
			
			String currentLine;
			int numberOfEmptyLines = 0;
			
			while ((currentLine = br.readLine()) != null) {
				
				
				if(!currentLine.isEmpty())
				{
					String[] allValues = new String[5];
					allValues = currentLine.split("@");
					
					String name = getOthersValues(allValues[1]);
					String surname = getOthersValues(allValues[2]);
					String src_iban = getOthersValues(allValues[3]);
					String dst_iban = getOthersValues(allValues[4]);
					double amount = getAmountValue(allValues[5]);
					
					Data data = new Data(name, surname, src_iban, dst_iban, amount);
					dataList.add(data);
				}
				else
				{
					numberOfEmptyLines++;
					System.out.println("Number of empty lines: "+numberOfEmptyLines);
				}
				
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	
	public String getOthersValues(String str)
	{
		String[] smallArray = str.split(":");
		return smallArray[1];
	}
	
	
	public double getAmountValue(String str)
	{
		String str2 = this.getOthersValues(str);
		str2 = str2.replace("PLN", "");
		str2 = str2.replace(",", ".");
		double amount = Double.parseDouble(str2);
		return amount;
	}


	public List<Data> getDataList() {
		return dataList;
	}


	public void setDataList(List<Data> dataList) {
		this.dataList = dataList;
	}
	
	
	

}
