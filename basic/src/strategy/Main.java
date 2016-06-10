package strategy;

import java.net.URI;

import composite.OnCompleteListener;

/**
 * This class is the example of the usage Strategy pattern
 * Downloader - interface that contain method download()
 * FastDownload and SlowDownload are download approaches whith different algorithms
 * According to Open Close SOLID principle, DownloadService - this is our working class that uses by our clients
 * and can't be modificated.
 * @author Alex
 *
 */
public class Main {

	public static void main(String[] args) {
		DownloadService downloadService = new DownloadService();
		SlowDownloader slowDownloader = new SlowDownloader();
		FastDownloader fastDownloader = new FastDownloader();
		slowDownloader.setOnCompleteListener(new OnCompleteListener() {			
			@Override
			public void downloadCompleted(Downloader downloader) {
					downloadService.downloadFromUri(URI.create("http://testUri.com"), fastDownloader);			
			}
		});
		
		downloadService.downloadFromUri(URI.create("http://testUri.com"), slowDownloader);
		
		fastDownloader.setOnCompleteListener(new OnCompleteListener() {			
			@Override
			public void downloadCompleted(Downloader downloader) {
				System.out.println("Last download completed!");				
			}
		});
	}

}
