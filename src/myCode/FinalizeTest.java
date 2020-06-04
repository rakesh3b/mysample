package myCode;



public class FinalizeTest {  
     public static void main(String[] args)   
    {   
    	 FinalizeTest obj = new FinalizeTest();   
        System.out.println(obj.hashCode());   
        obj = null;   
        // calling garbage collector    
        System.gc();   
        System.out.println("end of garbage collection");   
  
    }   
    @Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");   
    }   
}  