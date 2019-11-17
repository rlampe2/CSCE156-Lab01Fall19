package unl.cse;

import org.joda.time.DateTime;
import org.joda.time.Interval;
import org.joda.time.Period;

public class Birthday {
	public static void main(String args[]) {

		String name = "Sam I Am";

		int month = 4;
		int date = 24;
		int year = 2000;

		DateTime bday = new DateTime(year, month, date, 0, 0);
		DateTime today = new DateTime();

		Period age = new Period(bday, today);

		int years = age.getYears();
		int months = age.getMonths();
		int days = age.getWeeks() * 7 + age.getDays();

		DateTime nextBDay = new DateTime(year + years + 1, month, date, 0, 0);
		Interval daysToNextBDay = new Interval(today, nextBDay);
		double daysRemaining = daysToNextBDay.toDurationMillis() / (1000 * 60 * 60 * 24) + 1;

		// TODO: write code to output results here
		System.out.printf("Greetings, %s, Today you are %d years, %d months, and %d days old.\n", name, years, months, days);
		
		if(daysRemaining == 0.0) {
			System.out.println("Happy Birthday!");
		}else {
			System.out.println("Your friends have " + daysRemaining + " days to shop for you!");
		}

	}
}
