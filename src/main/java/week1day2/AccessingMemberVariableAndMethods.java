package week1day2;

public class AccessingMemberVariableAndMethods {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LearningAccessModifiers objNew = new LearningAccessModifiers();
		float div;
		System.out.println(objNew.publicName);
		System.out.println(objNew.defaultAge);
		System.out.println(objNew.protectedCompany);
		objNew.defaultSubtract(5, 10);
		objNew.publicAddition();
		div = objNew.protectedDivision(25);
		System.out.println(div);
		
	}

}
