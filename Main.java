package tenantManegement;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int select;
		int select2;
		
		Monthly monthly = new Monthly();
		Charter charter = new Charter();
		Owning owning = new Owning();
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			select = 0;
			select2 = 0;
			System.out.println("========================");
			System.out.println("===아파트 주민관리 프로그램===");
			System.out.println("========================");

			System.out.println("1.주민정보 등록");
			System.out.println("2.주민정보 전체열람");
			System.out.println("3.주민정보 조회");
			System.out.println("4.주민정보 수정");
			
			select = scan.nextInt();
			
			switch (select) {
			case 1: {//==================================주민정보 등록
				System.out.println("1.월세 주민");
				System.out.println("2.전세 주민");
				System.out.println("3.매매 주민");
				select2 = scan.nextInt();
				
				switch (select2) {
				case 1:
					System.out.println("1-1");
					monthly.input();
					break;
				case 2:
					System.out.println("1-2");
					charter.input();
					break;
				case 3:
					System.out.println("1-3");
					owning.input();
					break;
				default: {
					System.out.println("잘못 입력하셨습니다.\n초기메뉴로 돌아갑니다.");
				}
				}
				Default: {
					System.out.println("잘못 입력하셨습니다.\n초기메뉴로 돌아갑니다.");
				}
			}
			break;
			
			case 2: {//==================================주민정보 전체열람
				System.out.println("1.월세 주민");
				System.out.println("2.전세 주민");
				System.out.println("3.매매 주민");
				select2 = scan.nextInt();
				
				switch (select2) {
				case 1:
					System.out.println("2-1");
					monthly.output();
					break;
				case 2:
					System.out.println("2-2");
					charter.output();
					break;
				case 3:
					System.out.println("2-3");
					owning.output();
					break;
				default: {
					System.out.println("잘못 입력하셨습니다.\n초기메뉴로 돌아갑니다.");
				}
				}
			}
			break;
			
			case 3: {//==================================주민정보 조회
				System.out.println("1.월세 주민");
				System.out.println("2.전세 주민");
				System.out.println("3.매매 주민");
				select2 = scan.nextInt();
				
				switch (select2) {
				case 1:
					System.out.println("3-1");
					monthly.lookUp();
					break;
				case 2:
					System.out.println("3-2");
					charter.lookUp();
					break;
				case 3:
					System.out.println("3-3");
					owning.lookUp();
					break;
				default: {
					System.out.println("잘못 입력하셨습니다.\n초기메뉴로 돌아갑니다.");
				}
				}
				
			}
			break;
			
			case 4: {//==================================주민정보 수정
				System.out.println("1.월세 주민");
				System.out.println("2.전세 주민");
				System.out.println("3.매매 주민");
				select2 = scan.nextInt();
				
				switch (select2) {
				case 1:
					System.out.println("4-1");
					monthly.revise();
					break;
				case 2:
					System.out.println("4-2");
					charter.revise();
					break;
				case 3:
					System.out.println("4-3");
					owning.revise();
					break;
				default: {
					System.out.println("잘못 입력하셨습니다.\n초기메뉴로 돌아갑니다.");
				}
				}
			}
			break;
			default:{
				System.out.println("잘못 입력하셨습니다.");
				break;
			}
			}
		}
	}

}
