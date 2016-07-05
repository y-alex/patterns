package proxy;

import java.lang.reflect.Proxy;

/*
 * This is example of the Protection proxy pattern with usage 
 *  java reflect api.
 *  In this example Moderator can only get Post text and delete post.
 *  User can only get and add post.
 */

public class Main {

public static void main(String ... args){
	PostsManager topPostsManager = new TopPostsManager();
	
	PostsManager proxyModerator = getModeratorProxy(topPostsManager);
	PostsManager proxyUser = getUserProxy(topPostsManager);
	
	try{
		proxyModerator.addPost("New post text");
		System.out.println("Post added by moderator!");

	}catch(Exception e) {
		System.out.println("Moderator can not add new posts, only user!");
		
	}
	
	try{
		proxyUser.addPost("New post text");
		System.out.println("Post added by user!");
		System.out.println(proxyUser.getPostText(0));
	}catch(Exception e) {
		System.out.println("User can not add new posts, only user!");
		
	}
	
}	
	
	static PostsManager getModeratorProxy( PostsManager postsManager){
		return (PostsManager) Proxy.newProxyInstance(postsManager.getClass()
				.getClassLoader(), postsManager.getClass().getInterfaces(),new ModeratorInvocationHandler(postsManager));
	}
	
	static PostsManager getUserProxy( PostsManager postsManager){
		return (PostsManager) Proxy.newProxyInstance(postsManager.getClass()
				.getClassLoader(), postsManager.getClass().getInterfaces(),new UserInvocationHandler(postsManager));
	}
}
