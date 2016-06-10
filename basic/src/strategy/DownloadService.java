package strategy;

import java.net.URI;

import composite.OnCompleteListener;

public class DownloadService {

	public void downloadFromUri(URI uri, Downloader downloader){
		downloader.download(uri);
	}

}
