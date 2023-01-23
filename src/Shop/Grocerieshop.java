package Shop;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.util.Stack;

public class Grocerieshop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//Stack<String> stack = new Stack<String>();
		boolean condition = true;

		while (condition) {

			System.out.println("1 Shop Settings");
			System.out.println("2 Manage Shop Items");
			System.out.println("3 Create New Invoice");
			System.out.println("4 Report:Statistics");
			System.out.println("5 Report: All Invoices");
			System.out.println("6 Search (1) Invoice");
			System.out.println("7 Program Statistics");
			System.out.println("8 Exit");
			

			int i = sc.nextInt();
			switch (i) {	
			case 1:
					System.out.println(" 1 Load Data");
					System.out.println(" 2 Set Shop Name");
					System.out.println(" 3 Set Invoice Header");
					System.out.println(" 4 Go Back");
					
					int l = sc.nextInt();
					if (l == 1) {
						
					}
					else if (l == 2) {
						
						try {
							System.out.println("Enter shop name");
				            int shopName = sc.nextInt();
				            FileWriter writer = new FileWriter("shopname.txt");
				            //BufferedReader writer = new BufferedReader(new FileReader("shopname.txt"));
				            writer.write(shopName);
				            writer.close();
				            System.out.println("Shop name saved to file successfully!");
				        } catch (Exception e) {
				            e.printStackTrace();
				        }
						
					}
					else if (l == 3) {
						
						try {
							System.out.println("Enter Tel");
				            int InvoiceHeade = sc.nextInt();
				            System.out.println("Enter Fax  ");
				            int InvoiceHeade1 = sc.nextInt();
				            System.out.println("Enter Email");
				            int InvoiceHeade2 = sc.nextInt();
				            System.out.println("Enter Website");
				            int InvoiceHeade3 = sc.nextInt();
				            FileWriter writer = new FileWriter("InvoiceHeade.txt");
				            writer.write(InvoiceHeade);
				            writer.write(InvoiceHeade1);
				            writer.write(InvoiceHeade2);
				            writer.write(InvoiceHeade3);
				            writer.close();
				            System.out.println("Shop name saved to file successfully!");
				        } catch (Exception e) {
				            e.printStackTrace();
				        }
						
					}
					else if (l == 4) {
						
						
						
					}
					break;	
	
			
		case 2:
				
				System.out.println(" 1 Add Items");
				System.out.println(" 2 Delete Items");
				System.out.println(" 3 Change Item Price");
				System.out.println(" 4 Report All Items");
				System.out.println(" 5 Go Back");
				
				int b = sc.nextInt();
				if (b == 1) {
					
					try {
					System.out.println(" item ID");
					int aa = sc.nextInt();
					System.out.println(" item name");
					int ab = sc.nextInt();
					System.out.println(" unit price item");
					int ac = sc.nextInt();
					System.out.println(" quantity item");
					int ad = sc.nextInt();
					System.out.println(" amount price item");
					int ae = sc.nextInt();
					 FileWriter writer = new FileWriter("InvoiceHeade.txt");
					 writer.write(aa);
					 writer.write(ab);
					 writer.write(ac);
					 writer.write(ad);
					 writer.write(ae);
					} catch (Exception e) {
			            e.printStackTrace();
			        }
					try {
						FileOutputStream file = new FileOutputStream(" InvoiceHeade.txt");
						ObjectOutputStream out = new ObjectOutputStream (file);
						
					out.close();
					file.close();
					System.out.println("serialized and saved");
						
					}catch (Exception e) {
						e.printStackTrace();
					}
				}
				else if (b == 2) {
					
					
					
				}
				else if (b == 3) {
					
					
					
				}
				else if (b == 4) {
					
					
					
				}
				else if (b == 5) {
					
					
					
				}
				
				break;
		case 3:
				
				
				
			break;
		case 4:
			
			
			
			break;
		case 5:
			
			
			
			break;
		
		case 6:
			
			
			
			break;
		case 7:
			
			
			
			break;
		case 8:
			
			
			
			break;
			
			
		}
}
}
}
