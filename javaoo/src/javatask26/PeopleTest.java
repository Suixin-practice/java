package javatask26;

public class PeopleTest {
	public static void main(String[] args) {
		ChinaPeople chinaPeople = new ChinaPeople();
		AmericanPeople americanPeople = new AmericanPeople();
		chinaPeople.speakHello();
		chinaPeople.averageHeight();
		chinaPeople.averageWeight();
		americanPeople.speakHello();
		americanPeople.averageHeight();
		americanPeople.averageWeight();
	}
}
