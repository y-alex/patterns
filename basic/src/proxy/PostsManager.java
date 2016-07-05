package proxy;

public interface PostsManager {
	String getPostText(int postIndex);
	void deletePost(int postIndex);
	void addPost(String postText);
}
