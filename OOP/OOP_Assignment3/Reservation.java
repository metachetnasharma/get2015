package reservation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Reservation {
	
	public List<TrainDetails> Filter (String type,String fromPlace,String toPlace,int seats)
	{
		List<TrainDetails> finalList=new ArrayList<TrainDetails>();
		for(TrainDetails s : TrainDetails.details)
		{
			if((s.trainType).equalsIgnoreCase(type)&&(s.from).equalsIgnoreCase(fromPlace)&&(s.to).equalsIgnoreCase(toPlace)&&(s.seatsAvailable)>=seats)
			{
				finalList.add(s);
				(s.seatsAvailable)--;
			}
			
		}
		return finalList;
	}
	public void show (List<TrainDetails> list)
	{
		System.out.println("Train type\tTrain id\tTrain name\t\tfrom\t\tto\tduration\tfare\tavailable");
		for (TrainDetails trainDetails : list) 
		{
		System.out.println( trainDetails.trainType+"\t\t"+trainDetails.trainId+"\t\t"+trainDetails.trainName+"\t\t"+trainDetails.from+"\t\t"+trainDetails.to+"\t"+trainDetails.trainDuration+"\t\t"+trainDetails.trainFare+"\t"+"\t"+trainDetails.seatsAvailable);

		}
	}
	
	public static void main(String args[])
	{
		TrainDetails trainDb=new TrainDetails();
		trainDb.setupTrain(); 
		 Reservation r=new  Reservation();

		Scanner sc=new Scanner(System.in);
		List<TrainDetails> pList=new ArrayList<TrainDetails>();
		List<TrainDetails> gList=new ArrayList<TrainDetails>();
		
		for(TrainDetails s : TrainDetails.details)
		{
			if((s.trainType).equalsIgnoreCase("P"))
			{
				pList.add(s);
			}
			else if((s.trainType).equalsIgnoreCase("G"))
			{
				gList.add(s);
			}
		}
		while(true)
		{
		System.out.println("enter user name");
		String name=sc.next();
		System.out.println("enter type of train");
		String tType=sc.next();
		Payment obj=new Payment();
		if(tType.charAt(0) == 'P' || tType.charAt(0) == 'p')
		{
			r.show(pList);
			System.out.println("From where you want to go");
			String fromPlace=sc.next();
			System.out.println(" where you want to go");
			String toPlace=sc.next();
			for(TrainDetails s : pList)
			{
				if(((s.from).equalsIgnoreCase(fromPlace))&&((s.to).equalsIgnoreCase(toPlace)))
				{
					System.out.println("Enter no. of seats");
					int seats=sc.nextInt();
					if(s.seatsAvailable>=seats)
					{
					  List<TrainDetails> filterList=new ArrayList<TrainDetails>();
					  filterList= r.Filter(tType,fromPlace,toPlace,seats);
						for (TrainDetails trainDetails : filterList) {
							System.out.println("Train ID : " + trainDetails.trainId);

						}
						System.out.println("Which train would you like to reserve");
						System.out.println("Enter trainId");
						String id=sc.next();
						System.out.println("Enter your payment mode \n Choose 1 for credit card \n choose 2 for payable amount\n choose 3 for netbanking");
						int choice= sc.nextInt();
						switch (choice)
						{
						case 1:
						{
							obj.creditCard();
							break;
						}
						case 2:
						{
							obj.wallet();
							break;
						}
						case 3:
						{
							obj.netBanking();
							break;
						}
						}
					}
					else
						System.out.println("Sorry train is not available");
				}

				
			}
		}
		if(tType.charAt(0) == 'G' || tType.charAt(0) == 'g')
		{
			r.show(gList);
			System.out.println("From where you want to send your goods");
			String fromPlace=sc.next();
			System.out.println(" where you want to send goods");
			String toPlace=sc.next();
			for(TrainDetails s : gList)
			{
				if(((s.from).equalsIgnoreCase(fromPlace))&&((s.to).equalsIgnoreCase(toPlace)))
				{
					System.out.println("Enter weight");
					int wt=sc.nextInt();
					if(s.seatsAvailable>=wt)
					{
					  List<TrainDetails> filterList=new ArrayList<TrainDetails>();
					  filterList= r.Filter(tType,fromPlace,toPlace,wt);
						for (TrainDetails trainDetails : filterList) {
							System.out.println("Train ID : " + trainDetails.trainId);

						}
						System.out.println("Which train would you like to reserve");
						System.out.println("Enter trainId");
						String id=sc.next();
						System.out.println("Enter your payment mode \n Choose 1 for credit card \n choose 2 for payable amount\n choose 3 for netbanking");
						int choice= sc.nextInt();
						switch (choice)
						{
						case 1:
						{
							obj.creditCard();
							break;
						}
						case 2:
						{
							obj.wallet();
							break;
						}
						case 3:
						{
							obj.netBanking();
							break;
						}
						}
					}
					else
						System.out.println("Sorry train is not available");
				}

				
			}
		}

		

		
		}
	}


}		 








