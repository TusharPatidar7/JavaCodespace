package coreJava;

public class Switch {
	void meth1(int key) {
		switch (key) {
		case 1:
			System.out.println("Option " + key + "selected!\n");
			System.out.println("----------------------------------------------------------\n");
			if (true)
				System.out.println(">Chennai Super Kings vs Gujarat Titans, 1st Match\r\n"
						+ "Narendra Modi Stadium, Ahmedabad\r\n" + "on 19 APRIL 2032 at 7:30 PM\n");
			System.out.println("\n>Punjab Kings vs Kolkata Knight Riders, 2nd Match\r\n"
					+ "Punjab Cricket Association IS Bindra Stadium, Mohali\r\n" + "on 20 APRIL 2023 at 3:30 PM\n"
					+ "\n>Lucknow Super Giants vs Delhi Capitals, 3rd Match\r\n"
					+ "Bharat Ratna Shri Atal Bihari Vajpayee Ekana Cricket Stadium, Lucknow\r\n"
					+ "on 20 APRIL 2023 at 7:30 PM");
			System.out.println("\n>Rajasthan Royals vs Sunrisers Hyderabad, 4th Match\r\n"
					+ "Rajiv Gandhi International Stadium, Hyderabad\r\n" + "on 21 APRIL 2023 at 3:30 PM"
					+ "\n\n>Mumbai Indians vs Royal Challengers Bangalore, 5th Match\r\n"
					+ "M.Chinnaswamy Stadium, Bengaluru\r\n" + "on 21 APRIL 2023 at 7:30 PM");
			break;
		case 2:
			System.out.println("Option " + key + "selected!\n");
			System.out.println("----------------------------------------------------------\n");
			if (false)
				System.out.println("This block will never executed");
			else {
				System.out.println("--------Match Results--------\n");
				System.out.println(">Mumbai Indians vs Sunrisers Hyderabad, 25th Match\r\n"
						+ "Rajiv Gandhi International Stadium, Hyderabad\r\n"
						+ "Mumbai Indians won by 14 runs \nHeld on 18 APRIL 2023 at 7:30 PM");
				System.out.println("\n>Chennai Super Kings vs Royal Challengers Bangalore, 24th Match\r\n"
						+ "M.Chinnaswamy Stadium, Bengaluru\r\n"
						+ "Chennai Super Kings won by 8 runs\nHeld on 17 APRIL 2023 at 7:30 PM");
				System.out.println(
						"\n>Kolkata Knight Riders vs Mumbai Indians, 22nd Match\r\n" + "Wankhede Stadium, Mumbai\r\n"
								+ "Mumbai Indians won by 5 wkts\nHeld on 16 APRIL 2023 at 3:30 PM");
			}
			break;
		case 3:
			System.out.println("Option " + key + "selected!\n");
			System.out.println("----------------------------------------------------------\n");
			System.out.println("Current News or Old News");
			String news = "current";
			if (news == "current") {
				System.out.println("1. Confident Tilak Varma ready to step up for any role\r\n"
						+ "2. Mumbai pip Sunrisers in nail-biting run-chase\n"
						+ "3. Royals brace for homecoming after confident start");
			} else if (news == "old") {
				System.out.println(">Buoyant PBKS aim to keep SRH winless\r\n"
						+ "After two successive failures with the bat, SRH seek improvements as they return home in search of their first win\n");
				System.out.println("\n>All-round RR hand DC third successive defeat\r\n"
						+ "The RR openers blew away the DC bowling, before a familiar batting implosion ailed the Capitals as they crashed to yet another defeat\n");
				System.out.println("\n>David Warner: An anchor by force of circumstances\r\n"
						+ "Delhi Capitals' fragile batting has had a domino effect on their captain's strike-rate in IPL 2023");
			} else {
				System.out.println("Not selected news type!!");
			}
			break;
		default:
			System.out.println("Option 4 selected!\n");
			System.out.println("----------------------------------------------------------\n");
			String key2 = new Switch().meth2();
			switch (key2) {
			case "CSK":
				System.out.println("Chennai Super Kings	MAT-5	WON-3	LOST-2	Pts-6	NRR: +0.265");
				break;
			case "RCB":
				System.out.println("Royal Challengers Bangalore	MAT-5	WON-2	LOST-3	Pts-4	NRR: -0.318");
				break;
			case "SRH":
				System.out.println("Sunrisers Hyderabad	MAT-5	WON-2	LOST-3	Pts-4	NRR: -0.798");
				break;
			default:
				System.out.println(">Chennai Super Kings	MAT-5	WON-3	LOST-2	Pts-6	NRR: +0.265\n"
						+ "\n>Royal Challengers Bangalore	MAT-5	WON-2	LOST-3	Pts-4	NRR: -0.318\n"
						+ "\n>Sunrisers Hyderabad	MAT-5	WON-2	LOST-3	Pts-4	NRR: -0.798\n"
						+ "\n>Rajasthan Royals	MAT-4	WON-1	LOST-3	Pts-2	NRR: -1.698\n");
			}
			break;
		}
	}

	String meth2() {
		System.out.println("Showing the Point Table\n");
		System.out.println("OPTIONS : \n>Only of particular team\n>All teams points\n\n");
		String key2 = "ALL";// Pass the key2 as to check points according to there names(CSK ,RCB ,SRH, or
							// any value to check all teams points)!
		return key2;
	}

	public static void main(String[] args) {
		System.out.println("--------JAVA IPL-------\n");
		System.out.println("There are following options");
		System.out.println("1. Match Schedule\n2. Match results \n3. News \n4. Point Table\n");
		System.out.println("---------------------------------------------------------------------\n");
		int key1 = 2;// Pass the option in key1 to check the following result!

		new Switch().meth1(key1);
	}
}
