
package com.example.main;

import java.util.*;

public class BuildingMain {

public static void main(String args[])
	{
		int nofloor = 0,noofDays =0;
		String temp =null;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total no of floors in the building");
		
			nofloor = sc.nextInt();
			noofDays = nofloor;
			System.out.println("nofloor = " +nofloor);

			int floorSize[] = new int[nofloor];

	for(int i = 0; i< nofloor ; i++)
	{
		System.out.println("Enter the floor size given on day :" + (i+1));
		floorSize[i] = sc.nextInt();
	}
	
	//Logic starts 
	System.out.println("The order of construction is as follows");
	int i = 0;
	int day =0;
	Stack pendingfloor = new Stack();
	while ( nofloor !=0 && i <= noofDays -1)
	{
		if(nofloor ==  floorSize[i]) 
		{
			day = i+1;
			System.out.println("Day :  " + day);
			System.out.print(floorSize[i] + " "  );
			nofloor--;
			i++;
			
				while(!pendingfloor.empty() && (int) pendingfloor.peek() == nofloor)
				{
					System.out.print((int) pendingfloor.peek()+ " " );
					pendingfloor.pop();
					nofloor--;
				}
				
			
			System.out.println(" ");

		}
		else
		{
			day = i+1;
			pendingfloor.push(floorSize[i])	;
			System.out.println("Day :  " + day);
			System.out.println(" ");
			i++;

			
		}
	}
	
	}
	

}
