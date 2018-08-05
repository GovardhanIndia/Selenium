package week1day2;

public class FriendNameMobileNoUsingConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String friendName[] = {"Varun", "Praveen", "Vinod", "Vimal", "Karthick"};
		long mobileNo[] = {9884955592l, 98849786798l, 9876543210l, 8907654321l, 8907654321l};

		System.out.println("Friend " + "    " + "Mobile No");
		for (int i = 0; i<=4; i++) {
			System.out.println(friendName[i] + "    " + mobileNo[i]);
		}		
	}
}
