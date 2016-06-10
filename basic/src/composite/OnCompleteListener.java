package composite;

import strategy.Downloader;

public interface OnCompleteListener {
	public abstract void downloadCompleted(Downloader downloader);
}
