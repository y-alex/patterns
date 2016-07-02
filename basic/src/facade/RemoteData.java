package facade;

public class RemoteData {
	public boolean isAvailable = true;
	private String mData;
	public String loadData(){
		System.out.printf("The data: %s , has been loaded from remote \n", mData);
		return mData;
		
	}
	
	public void saveData(String data){
		mData = data;
		System.out.printf("The data: %s , has been saved to remote \n",data);
	}
}
