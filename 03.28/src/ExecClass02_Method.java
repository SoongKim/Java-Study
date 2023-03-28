import java.util.Random;

public class ExecClass02_Method {

	public static void main(String[] args) {
		// 자바는 객체 지향. 모든 것들이 객체로 이뤄져 있습니다.
		// 메소드는 다른 언어들에서도 사용하나, 자바에서 특히 중요하다.
		// C 언어의 함수 = Java의 메소드

		// public static void main의 main!
		// 이 main이 메소드이다!
		// 어디부터 프로그램을 구동한다고 알려주는 시작 지점!
		// 컴퓨터는 main 메소드부터 프로그램을 실행합니다.
		
		Random random = new Random();
		// 랜덤 기능은 난수를 생성하는 기능. 그럼 그 기능은 어디서 올까?
		// 해당 기능을 수행하는 Random이라는 메소드를 호출해서 사용하였다.
		// Class 개념의 등장.
		
		// 객체 생성 간 어떠한 일을 할 수 있는지 적힌 설계도가 존재한다.
		// Random 클래스에는 난수 생성 기능을 수행하는 코드가 적혀있다.
		// 메소드, 클래스 개념 : 앞으로 계속 만날 예정. 면 터두자.
		
		// 앞으로의 프로그래밍은 클래스/메소드의 호출을 통해 이뤄진다.
		// 누군가 만들어준 클래스를 적시 호출하여 기능을 수행하자.
		// 어떤 메소드가 어떤 기능을 수행하는지 알고있어야만
		// 추후 변경사항 발생 시 능숙히 대응할 수 있다.
		
		// 가장 중요한 것은 "어떻게 불러서 어떻게 쓰는가!"
		// 요것만 숙지하고 있으면 문제 없다.
		
		// 클래스(메소드명)를 호출함으로써 해당 기능을 수행할 수 있다.
		// new 는 새로운 메소드를 만들어준다.
		// 
	}

}
