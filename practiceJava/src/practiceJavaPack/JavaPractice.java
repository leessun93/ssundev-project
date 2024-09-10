package practiceJavaPack;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Calcu{
	static double PI = 3.14;	//클래스의 전역 변수
	static int base = 0;		//클래스 변수
	int left, right; 			//인스턴스의 변수(메인의 변수) 다중 변수선언이 되네
	
	public Calcu(int left, int right) {
		this.left = left;
		this.right = right;
	}
	public void setOprands(int left,int right) {
		this.left = left;
		this.right = right;
	}// 이 함수를 통해 클래스에 쓰일 지역 변수에 값 할당 

	public void sum() {
		System.out.println(this.left + this.right);
	}
	
	public void avg() {
		System.out.println((this.left+this.right)/2);
	}
}

//상속
class SubstractionableCalculator extends Calcu{
	
	public SubstractionableCalculator(int left, int right) {
		super(left, right);
	}
	public void substract() {
		System.out.println(this.left - this.right);
	}
}

//상속 또 상속

class DivisionableCalculator extends SubstractionableCalculator{
	public DivisionableCalculator(int left, int right) {
		super(left, right);
	}
	public void division() {
		System.out.println(this.left / this.right);
	}
}

public class JavaPractice {
	public static int functionTest(int limite) {
		return limite + 10;
	}
	
	public static String[] getMembers() {
		String[] members = {"김철순", "황갑돌", "박막례"}; 
		return members;
	}

	public static void main(String[] args) {
		System.out.println("자바 공부 스타트!");	//자바콘솔창 단축키 sysout + Ctrl + Space
		
		
		//bin 은 바이너리 src 는 소스의 약자 bin은 컴파일 후 파일이 들어가는폴더 src는 사람이 작성한 소스 코드가 들어가는 폴더
		
		//byte < short < int < long 
		int a;
		a = 1;
		//플롯이 소수 더블이 더 큰소수 그냥 기본적으로 더블 쓰자
		double b = 1.1;
		float c = 1.2f;
		
		//형변환
		double Conversion = (double)b;
		
		System.out.println("a :" +a + "b :"+ b + "c :" + c+ "형변환 :" + Conversion);		
		
		//연산자
		// + - / * %
		//int / float = float
		
		int i = 1;
		i++;	// == i + 1 을 다음 사이클에 하겠다
		++i;	// == i + 1 값을 먼저 보여주겠다.
		
		//산술 연산자
		// () 먼저 * / 먼저 + - 나중 
		
		//비교연산자
		//== != >= <= > < , 문자열의 경우 데이터 비교시 a.equals(b)  a == b 하면 주소값 비교함
		
		//if(){}
		
		Scanner sc = new Scanner(System.in);
		
		String t = sc.nextLine();
		
		if(t.equals("암호")) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}
				
		//switch 잘 안씀
		switch(t) {
			case "1" :
				System.out.println(1);
				break;
			case "2" :
				System.out.println(2);
				break;
			case "3" :
				System.out.println(3);
				break;
			default :
				System.out.println("틀림");
				break;				
		}
		
		//논리연산자 and(&&) or(||) not(!) 
		sc.close();
		
		//while(){}
		i = 0;
		while(i < 5) {
			System.out.println("와일"+i);
			i++;
		}
		
		//for(){ if(){break;(멈춤) continue(건너뛰고 계속)} }
		for(int i2 = 0; i2 < 5; i2++) {
			System.out.println("포문 i2 :"+i2);
		}
				
		//배열 [] 배열 값을 초기에 선언해주어야한다 다른언어처럼 선언후 데이터만큼 늘지않음
		//선언 1 ,잘 안쓸듯
		String[] strGroup = {"배열1번","배열2번","배열3번","배열4번"};
		//선언 2
		String[] strGroup2 = new String[4];
		strGroup2[0] = "배열2,1번";
		strGroup2[1] = "배열2,2번";
		strGroup2[2] = "배열2,3번";
		strGroup2[3] = "배열2,4번";
		
		//자바에서 lenth 하면 배열의 크기임 안의 데이터 갯수가 아님 다른언어와 좀 다름
		System.out.println("배열 1,2 크기 : " + strGroup.length + '/' + strGroup2.length);
		
		//for-each 배열 반복문
		for(String eachStr : strGroup2) {
			System.out.println(eachStr + "포이치 각각 배열");
		}
		
		int result = functionTest(10);
		System.out.println("펑션 값 :" +result);
	
		String[] getMembers = getMembers();
		System.out.println(getMembers[2]);
		
		
		//String[] args 의 args변수를 run Configuration 에서 인자값에 띄어쓰기로 넣어준체로 실행할 수도 있고
		//Scanner sc = new Scanner(System.in) 으로 실행중에 넣어줄 수 도 있다. sc.Close(); 하기
		
		//while(sc.hasNextInt()){ sysout } 인트만 받고 다른자료형은 끊김
		
		
		//파일 값 불러오기 파일 불러오는건 파일라이브러리 임포트해야함
		try {
			File file = new File("out.txt"); //경로는 현재 파일의 폴더
			Scanner fileSc = new Scanner(file);
			while(fileSc.hasNextInt()) {
				System.out.println(fileSc.nextInt() * 1000);
			}	
			fileSc.close();	
		}catch(FileNotFoundException e) {
			e.printStackTrace();
			
		}
		
		//클래스 선언
		//Calcu clc = new Calcu();
		
		//상속으로 재 선언
		//SubstractionableCalculator clc = new SubstractionableCalculator();
		DivisionableCalculator clc = new DivisionableCalculator(10,20);
		clc.setOprands(10, 20);
		clc.avg();
		clc.sum();	//Ctrl + Click 하면 해당 클래스로 이동함
		
		System.out.println(clc.PI);
		
		//스테틱을 붙이면 메모리의 스테틱영역에 올라가있기 때문에 선언 없이도, 인스턴스를 통하지않고도 바로 사용 가능 
		//이런게 많아질 경우 프로그램 무거워짐
		
		//클래스는 설계도 가져다쓰는 메인클래스 등은 인스턴스라고 불림
		//전역 함수를 통해서 클래스의 지역 변수를 사용할 수 없다.
		//클래스를 통해 내부의 스테틱 변수,함수에 접근 가능
		
		//지역 전역변수 유효범위를 scope라고 불림
		
		//우측 프로젝트에서 파일 두개를 ctrl+ Click으로 선택해서 우클릭 compare with 하면 두 파일 비교가능
		
		//같은 변수이름으로 전역 지역이 선언되어있다면 지역이 우선 그 다음 전역
		//이 경우 전역 지역을 나누려면 this(클래스의 변수지칭) 를 쓰자
		//그러나 이런식으로 변수 쉐도잉 되게 쓰지 말자
		
		//객체지향에서 전역변수 사용가능 절차지향 프로그램에서는 죄악시함 왜냐면 너무 많아지면 문제생겨서
		
		//클래스의 생성자 메소드(Constructor)를 클래스와 같은 이름으로 해서 처음 선언시 바로 값 들어가게할 수 있다.
		//개발자가 안만들어도 디폴트로 생성되긴함.
		
		
		//상속 
		
		//extends == 상속, 자식으로 부모꺼 사용 가능
		//상속의 상속도 가능
		//이 때 this 는 부모값
		
		clc.substract();
		clc.division();
		
		//생성자의 인자가있는 함수를 만들면 인자가 없는 생성자도 만들어주면 인스턴스에서 인자값없이 일반 선언 가능
		// piblic calcu(){}
		// public calcu(int left, int right){this.left = left; this.right = right;}
		
		
		//상속받은 자식 클래스에서 부모 생성자 를 사용하고자 하려는데 부모생성자랑 중복이면
		//자식 클래스에서 super를 사용해서 생성자를 명시해 사용 가능하다.
		
		
		//메소드 오버라이딩 같은이름의 부모 메소드를 자식메소드에서 다시 정의해서 쓰는거
		//이 때 부모의 메소드와 인자갯수, 리턴타입이 같아야한다.(부모 void,자식 int = error) 
		
		//자식에서 단순 부모 메소드를 호출하려면 super.avg();라고 하면 된다.
		//코드 = public int avg(){ return super.avg(); }
		
		//오버로딩 == 인자만 다른 여러 같은이름의 메소드를 정의해서 들어가는 값에따라 다른 로직이 실행되게하는것
		//같은 이름의 같은 인자값의 오버로딩 시 반환타입이 다르면 오류뜸
		
		//javac로 컴파일 하면 한 파일이라도 내부의 class갯수만큼 파일이 생김
		
		//93까지 완료
		
	}

}
