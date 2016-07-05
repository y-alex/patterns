package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserInvocationHandler implements InvocationHandler{
	private PostsManager mPostsManager;
	public UserInvocationHandler(PostsManager postsManager) {
		mPostsManager = postsManager;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		try{
			if(method.getName().startsWith("get")){
				return method.invoke(mPostsManager, args);
			}else if (method.getName().startsWith("delete")) {
				throw new IllegalAccessException();
			}else if (method.getName().startsWith("add")) {
				return method.invoke(mPostsManager, args);
			}
		}catch (InvocationTargetException e){
			e.printStackTrace();
		}
		return null;
	}
	

}
