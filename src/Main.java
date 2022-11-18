// 문제 : 아래와 같이 출력되도록 해주세요.
// 조건 : `숨쉬다` 기능을 중복하지 말아주세요.

class Main {
	public static void main(String[] args) {
		사람 a사람 = new 사람();
		a사람.숨쉬다();
	}
}

class 사람 extends 동물 {
	//extensd는 상속이라는 의미이며 A is B이다라는 의미가 맞아야 한다
	//사람은 동물이다라는 의미이며 동물이라는 설계도에 숨쉬다라느 기능을 넣지 않아도 된다
	void 숨쉬다() {
		System.out.println("숨쉬다.");
	}
}

class 동물 {

}