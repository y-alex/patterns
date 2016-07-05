package proxy;

import java.util.ArrayList;

public class TopPostsManager implements PostsManager{
	
	private ArrayList<String> mPostsList;
	
	public TopPostsManager() {
		mPostsList = new ArrayList<>();
	}

	@Override
	public String getPostText(int postIndex) {
		String text = null;
		if(mPostsList.size()>postIndex)
			text = mPostsList.get(postIndex);
		return text;
	}

	@Override
	public void deletePost(int postIndex) {
		if(mPostsList.size()>postIndex)
			mPostsList.remove(postIndex);
		
	}

	@Override
	public void addPost(String postText) {
		mPostsList.add(postText);
		
	}

	

}
