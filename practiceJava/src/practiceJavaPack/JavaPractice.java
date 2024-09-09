package practiceJavaPack;

import java.util.Scanner;

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
		
		
		//60까지 완료
	}

}
