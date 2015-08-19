package reservation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TrainDetails {
	String trainName, trainId, from, to, trainType;
	int trainDuration, trainFare, seatsAvailable;
	public static List<TrainDetails> details = new ArrayList<TrainDetails>();

	public TrainDetails() {
		// TODO Auto-generated constructor stub
	}

	public TrainDetails(String type, String id, String name, String from,
			String to, int duration, int fare, int available) {
		this.trainName = name;
		this.trainId = id;
		this.trainType = type;
		this.trainDuration = duration;
		this.trainFare = fare;
		this.seatsAvailable = available;
		this.from = from;
		this.to = to;
	}

	public static void setupTrain() {
		final String Train_Details = "D://trainDetails.txt";
		Scanner sc = new Scanner(System.in);

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader(Train_Details));
			try {
				String sCurrentLine;
				while ((sCurrentLine = br.readLine()) != null) {
					String[] dataFileData = sCurrentLine.split(","); // Reading
																		// up
																		// questions
																		// line
																		// by
																		// line
					details.add(new TrainDetails(dataFileData[0],
							dataFileData[1], dataFileData[2], dataFileData[3],
							dataFileData[4], Integer.parseInt(dataFileData[5]),
							Integer.parseInt(dataFileData[6]), Integer
									.parseInt(dataFileData[7])));
				}
			} catch (IOException e) {
				e.printStackTrace();
			}

		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

	}
}
