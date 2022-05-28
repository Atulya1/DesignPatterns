package example.singleton;

	class DoubleCheckLockingSingletonClass
	{
	    private static volatile DoubleCheckLockingSingletonClass obj  = null;
	 
	    private DoubleCheckLockingSingletonClass() {}
	 
	    public static DoubleCheckLockingSingletonClass getInstance()
	    {
	        if (obj == null)
	        {
	            // To make thread safe
	            synchronized (DoubleCheckLockingSingletonClass.class)
	            {
	                // check again as multiple threads
	                // can reach above step
	                if (obj==null)
	                    obj = new DoubleCheckLockingSingletonClass();
	            }
	        }
	        return obj;
	    }
	}
	
	/*
	 * If you notice carefully once an object is created, synchronization is no longer useful 
	 * because now object will not be null and any sequence of operations will lead to consistent 
	 * results.
	 * So we will only acquire lock on the getInstance() once, when the object is null. 
	 * This way we only synchronize the first way through, just what we want. 
	 * 
	 * 
	 * We have declared the object volatile which ensures that multiple threads offer the 
	 * object variable correctly when it is being initialized to Singleton instance. 
	 * This method drastically reduces the overhead of calling the synchronized method every time.
	 */
	
	


