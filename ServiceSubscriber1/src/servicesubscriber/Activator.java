package servicesubscriber;

import labosgi.ServicePublish;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	
	@Override
	public void start(BundleContext context) throws Exception {
		
		System.out.println("Start Subscriber Service");
		serviceReference=context.getServiceReference(ServicePublish.class.getName());
		
		ServicePublish servicePublish=(ServicePublish)context.getService(serviceReference);
		System.out.println(servicePublish.publishService());
		
		//System.out.println("Enter the '@' to end the process: ");
		
		System.out.println("Enter the symbol to process: ");

		String symbol ="";
		float num=1;
		
		Scanner insym =new Scanner(System.in);
		symbol=insym.nextLine();
		
		Scanner innum =new Scanner(System.in);

		try {
			
			
		
				if (symbol.equals("+")) {
			
			System.out.println("Enter numbers to process: ");

			
				while(num!=-1) {
				
				num=insym.nextFloat();
				
				servicePublish.sum(num);
				if(num==-1) {
				
				servicePublish.printsum();
				break;
			}
			
				
		}}
		
				else if (symbol.equals("-")) {
					
					System.out.println("Enter two numbers to process: ");

					
						
						
						num=insym.nextFloat();
						float num1=insym.nextFloat();
						
						servicePublish.substract(num,num1);
					
						
						servicePublish.printsubstract();
						
					
					
						
				}
		
		else if(symbol.equals("/")) {
			
			System.out.println("Enter two numbers:	");

				
				num=insym.nextFloat();
				
				float num1=insym.nextFloat();
				servicePublish.division(num,num1);
						
				servicePublish.printdivision();
			
		}
		
		else if (symbol.equals("*")) {
			
			System.out.println("Enter numbers to process: ");

			
				while(num!=-1) {
				
				num=insym.nextFloat();
				
				servicePublish.multi(num);
				if(num==-1) {
				
				servicePublish.printmulti();
				break;
			}
			
				
		}}
		
		if (symbol=="") {
			
			while(num!=-1) {
				if(num==-1) {
			num=insym.nextFloat();
			servicePublish.printsum();
			
		}}}
		
		}
		
		catch(Exception ex) {
			
		}
		
	}

	public void stop(BundleContext context) throws Exception {
		System.out.println("Good BYE!!!");
		context.ungetService(serviceReference);
		
	}

}
