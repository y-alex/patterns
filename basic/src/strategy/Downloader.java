package strategy;

import java.net.URI;

import composite.OnCompleteListener;

public interface Downloader {
	public abstract void download(URI uri);
	public abstract void setOnCompleteListener(OnCompleteListener listener);
}
