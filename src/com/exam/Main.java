package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class Main 
{
	int total=0;
	public static void main(String[] args) 
	{
		try 
		{
			for(int a=1;;a++){
				Meals meal = new Meals(0, null, 0, 0);
				FileReader fr = new FileReader("menu.txt");
				BufferedReader in = new BufferedReader(fr);
				String line = in.readLine();
				while (line !=null) {
					String[] token = line.split(",");
					int numbering = Integer.parseInt(token[0]);
					String name = token[1];
					int cost = Integer.parseInt(token[2]);
					int kcal = Integer.parseInt(token[3]);
					Meals.meal.add(new Meals(numbering, name, cost, kcal));
					System.out.println(line);
					line = in.readLine();

				}
				
			    System.out.print("請輸入餐點:");
			    Scanner scanner1= new Scanner(System.in);
			    int number1 = scanner1.nextInt();
			    System.out.print("請輸入數量:");
			    Scanner scanner2= new Scanner(System.in);
			    int number2 = scanner2.nextInt();
			    System.out.println("目前餐點:");
			    System.out.print(a+".");

				switch(number1){
				case 1:
					System.out.print("大麥克");
					total=total+65;
					break;
				case 2:
					System.out.print("雙層吉士牛肉堡");
					break;
				case 3:
					System.out.print("麥脆雞原味");
					break;
				case 4:
					System.out.print("麥香魚");
					break;
				case 5:
					System.out.print("薯條大包");
					break;
				case 6:
					System.out.print("可樂");
					break;
				case 7:
					System.out.print("冰紅茶");
					break;		
				}
				


			    System.out.println(number2+"份");
			    
			    System.out.println("=============================================");
			}

				
				
			
			
		} 
		catch (FileNotFoundException e) {
			e.printStackTrace();
			// TODO: handle exception

			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		


	}
	
	
	
}	
	

