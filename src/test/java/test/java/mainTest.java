package test.java;

import org.junit.Test;




public class mainTest {

	
	/**
	 * @param args
	 * @throws Exception 
	 */
	
	@Test
	public void main() throws Exception {
		// TODO Auto-generated method stub

		//for (int i=0; i<args.length; i++) System.out.println(args[i]);
		
		
		String args=String.valueOf(System.getProperty("totest"));
		String url=String.valueOf(System.getProperty("url"));
		String xpath=String.valueOf(System.getProperty("xpath"));
		//remember another system property called batch
		
		
		//System.out.println(args.length);
		main.java.tests test = new main.java.tests();
		main.java.juega1 test2 = new main.java.juega1();
		
		
		
		if(!args.isEmpty()){
			
			if (args.equals("juega1")){
				
				test2.setUp();
			}else{
				String[] options={args,url,xpath};
				System.out.println(args+"     "+url+"      "+xpath);
				test.setUp(options);
			}
				
			}else{
				String[] options=new String[1];
				options[0]="nothing";
				test.setUp(options);
			
		}
		
		
		
		//test.setUp(args);
		//test.setUp(options);
		//test2.setUp();
		//call to tests class and run it.
	}
		
	

}


