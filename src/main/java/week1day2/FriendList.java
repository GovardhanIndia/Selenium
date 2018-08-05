package week1day2;

public class FriendList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String friendList[] = {"Varun", "Praveen", "Vinod", "Vimal"};
		
		for(String oneName : friendList) {
			System.out.println(oneName);
			System.out.println("The Lenght of " + oneName + " : " + oneName.length());
		}

	}

}
