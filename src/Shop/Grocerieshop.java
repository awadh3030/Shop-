package Shop;


import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Grocerieshop {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// ArrayList<Integer> list = new ArrayList<Integer>();

		Stack<String> stack1 = new Stack<String>();
		Stack<String> stack2 = new Stack<String>();
		Stack<String> stack = new Stack<String>();

		int count0 = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		int count4 = 0;
		int count5 = 0;
		int count6 = 0;
		int count7 = 0;

		int count8 = 0;
		int count9 = 0;

		boolean condition = true;

		while (condition) {

			Invoice Invoice = new Invoice();

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

//						
//						for (int ii = 0; ii < stack2.size(); ii++) {
//				            System.out.println(stack2.pop());
//						}
//						
//						for (int iii = 0; iii < stack.size(); iii++) {
//				            System.out.println(stack.pop());
//						}

					System.out.println(stack2);
					System.out.println(stack);

				} else if (l == 2) {
					System.out.println("Enter shop name");
					String shop1 = sc.next();
					stack.push("shop name" + shop1);
				} else if (l == 3) {

					System.out.println("Enter Tel");
					int Tel = sc.nextInt();
					String Tell = Integer.toString(Tel);
					stack.push("Tel" + Tell);
					System.out.println("Enter Fax  ");
					String Fax = sc.next();
					stack.push(" Fax:" + Fax);

					System.out.println("Enter Email");
					String Email = sc.next();
					stack.push("Email:" + Email);
					System.out.println("Enter Website");
					String Website = sc.next();
					stack.push("Website:" + Website);
				}

				else if (l == 4) {

					condition = true;

				}

				count0++;
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
						Invoice.Product.setItemID(aa);
						String ID = Integer.toString(aa);
						stack2.push("id items" + ID);

						System.out.println(" item name");
						String ab = sc.next();
						Invoice.Product.setItemname(ab);
						stack2.push("item name" + ab);

						System.out.println(" unit price item");
						int ac = sc.nextInt();
						Invoice.Product.setUnitprice(ac);
						String price = Integer.toString(ac);
						stack2.push("unit price:" + price);

						System.out.println(" quantity item");
						int ad = sc.nextInt();
						Invoice.Product.setQuantity(ad);
						String quantity = Integer.toString(ad);
						stack2.push("quantity" + quantity);

						System.out.println(" amount price item");
						int ae = sc.nextInt();
						Invoice.Product.setAmountprice(ae);
						String amount = Integer.toString(ae);
						stack2.push("amount price:" + amount);

						FileOutputStream file = new FileOutputStream("item.txt");
						ObjectOutputStream out = new ObjectOutputStream(file);
						out.writeObject(Invoice.Product);
						out.close();
						file.close();
						System.out.println("serialized and saved");
					} catch (Exception e) {
						e.printStackTrace();
					}
					count8++;
				}

				else if (b == 2) {

					System.out.println("Enter number of Dlete idItem");
					int Dlete = sc.nextInt();
					stack2.remove(Dlete);

				} else if (b == 3) {

					int itemToChange = sc.nextInt();
					stack2.removeElementAt(itemToChange);
					System.out.println("Entert new product price: ");
					Double product = sc.nextDouble();
					Invoice.Product.setUnitprice(itemToChange);
					String newValue = Double.toString(product);
					stack2.push("Price: " + newValue);

				} else if (b == 4) {
//					for (int ii = 0; ii < stack2.size(); ii++) {
//			            System.out.println(stack2.pop());
//					}
					System.out.println(stack2);

				} else if (b == 5) {

					condition = true;

				}

				count1++;
				break;
			case 3:

				try {
					System.out.println("customer Name");
					String Invoice0 = sc.next();
					Invoice.setCustomeName(Invoice0);
					stack.push("customer Name:" + Invoice0);
					stack1.push("customer Name:" + Invoice0);
					System.out.println("phone number");
					int Invoice1 = sc.nextInt();
					Invoice.setPhonenumber(Invoice1);
					String Invoic1 = Integer.toString(Invoice1);
					stack.push("phone number" + Invoic1);
					stack1.push("phone number" + Invoic1);
					System.out.println("invoice date");
					int Invoice2 = sc.nextInt();
					Invoice.setNumberofitems(Invoice2);
					String Invoic2 = Integer.toString(Invoice2);
					stack.push("invoice date" + Invoic2);
					stack1.push("invoice date" + Invoic2);
					System.out.println("id items");
					int Invoice3 = sc.nextInt();
					Invoice.Product.setItemID(Invoice3);
					String Invoic3 = Integer.toString(Invoice3);
					stack.push("id items" + Invoic3);
					stack1.push("id items" + Invoic3);
					System.out.println("item name");
					String item = sc.next();
					Invoice.Product.setItemname(item);
					stack.push("item name" + item);
					stack1.push("item name" + item);
					System.out.println("unit price");
					int item1 = sc.nextInt();
					Invoice.Product.setUnitprice(item1);
					String item11 = Integer.toString(item1);
					stack.push("unit price:" + item11);
					stack1.push("unit price:" + item11);
					System.out.println("quantity");
					int item2 = sc.nextInt();
					Invoice.Product.setQuantity(item2);
					String item22 = Integer.toString(item2);
					stack.push("quantity" + item22);
					stack1.push("quantity" + item22);
					System.out.println("amount price");
					int item3 = sc.nextInt();
					Invoice.Product.setAmountprice(item3);
					String item33 = Integer.toString(item3);
					stack.push("amount price:" + item33);
					stack1.push("amount price:" + item33);

					System.out.println("total amount");
					int Invoice4 = sc.nextInt();
					Invoice.setTotalamount(Invoice4);
					String Invoice44 = Integer.toString(Invoice4);
					stack.push("total amount:" + Invoice44);
					stack1.push("total amount:" + Invoice44);
					System.out.println("paid amount");
					int Invoice5 = sc.nextInt();
					Invoice.setPaidamount(Invoice5);
					String Invoice55 = Integer.toString(Invoice5);
					stack.push("paid amount:" + Invoice55);
					stack1.push("paid amount:" + Invoice55);
					System.out.println("balance");
					int Invoice6 = sc.nextInt();
					Invoice.setBalance(Invoice6);
					String Invoice66 = Integer.toString(Invoice6);
					stack.push("balance:" + Invoice66);
					stack1.push("balance:" + Invoice66);

					// BufferedWriter writer = new BufferedWriter(new FileWriter("Invoice.txt"));

//			      for (String list1 : stack)
//			      {
//				      writer.write("\n"+list1);
//
//			      }
//			      writer.close();
//			    } catch (IOException e) {
//			      System.out.println("An error occurred.");
//			      e.printStackTrace();  
//			    }  
					FileOutputStream file = new FileOutputStream("Invoice.txt");
					ObjectOutputStream out = new ObjectOutputStream(file);
					out.writeObject(Invoice);
					out.close();
					file.close();
					System.out.println("serialized and saved");
				} catch (Exception e) {
					e.printStackTrace();
				}

				count9++;
				count2++;
				break;

			case 4:

				System.out.println("\n No Of Items " + count8++);
				System.out.println(" No of Invoices " + count9++);

				count3++;
				break;
			case 5:

//			for (int iii = 0; iii < stack.size(); iii++) {
//	            System.out.println(stack.pop());
				// }

				System.out.print(stack + "\n");

				count3++;
				break;

			case 6:
				System.out.print(stack1 + "\n");
				count5++;
				break;
			case 7:
				System.out.println(count0++);
				System.out.println(count1++);
				System.out.println(count2++);
				System.out.println(count3++);
				System.out.println(count4++);
				System.out.println(count5++);
				System.out.println(count6++);
				System.out.println(count7++);

				count6++;
				break;
			case 8:

				System.out.println("Are you sure you want to exit? press 1 YES and 2 for NO ");

				int s = sc.nextInt();
				if (s == 1) {

					condition = false;
				} else {

					condition = true;
				}

				count7++;
				break;

			}
		}
	}
}
