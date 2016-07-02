package facade;

public class LocalData {
	private String mData;
	public String loadData(){
		System.out.printf("The data: %s , has been loaded from local \n", mData);
		return mData;
	}
	
	public void saveData(String data){
		mData = data;
		System.out.printf("The data: %s , has been saved to local \n",data);
	}
}
