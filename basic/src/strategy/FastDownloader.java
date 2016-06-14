package strategy;

import java.net.URI;

import composite.OnCompleteListener;

public  class FastDownloader implements Downloader{
	
	private OnCompleteListener mOnCompleteListener;

	@Override
	public void download(URI uri) {		
		Thread thread = new Thread(new Runnable() {			
			@Override
			public void run() {
					try {
						int i = 0;
						do{
							System.out.print("#.");
							Thread.sleep(100);
							i++;
						}while(i<15);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}		
					System.out.println("Fast download completed");
					if(mOnCompleteListener!=null){
						mOnCompleteListener.downloadCompleted(FastDownloader.this);
					}
			}
		});
		System.out.println("Start fast download from "+uri);
		thread.start();
		
	}

	@Override
	public void setOnCompleteListener(OnCompleteListener listener) {
		mOnCompleteListener = listener;
		
	}
	
}
