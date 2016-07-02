package facade;

public class DataManagerFacade {
	private LocalData mLocalData;
	private RemoteData mRemoteData;
	
	public DataManagerFacade(LocalData localData, RemoteData remoteData){
		mLocalData = localData;
		mRemoteData = remoteData;
	}
	public String loadData(){
		if(mRemoteData.isAvailable){
			return mRemoteData.loadData();
		}else{
			return mLocalData.loadData();
		}
	}
	
	public void saveData(String data){
		if(mRemoteData.isAvailable){
			mRemoteData.saveData(data);
		}
		mLocalData.saveData(data);
		
	}
}
