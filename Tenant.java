package tenantManegement;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Map.Entry;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Tenant {
	String name = null;
	String add = null;
	String tel = null;
	String famInfo = null;
	
	String[] tenantInfo = new String[3];
	JSONObject jsonObject = new JSONObject();
    JSONArray personArray = new JSONArray();
    JSONObject personInfo = new JSONObject();
    String jsonInfo = "";
    
	Scanner scan = new Scanner(System.in);
	
	
	HashMap<String, String[]> tenant = new HashMap<String, String[]>();
	
	void input() {
		System.out.println("주민정보 입력을 시작합니다.\n");

		
		while(true) {
			//초기화
			name = null;
			add = null;
			tel = null;
			famInfo = null;
			
			personInfo = new JSONObject();
			
			System.out.println("이름을 입력하세요.");
			name = scan.next();
			personInfo.put("name", name);
			
			System.out.println("주소를 입력하세요.");
			add = scan.next();
			personInfo.put("add", add);
			
			System.out.println("전화번호를 입력하세요.");
			tel = scan.next();
			personInfo.put("tel", tel);
			
			System.out.println("가족정보를 입력하세요.");
			famInfo = scan.next();
			personInfo.put("famInfo", famInfo);
			
			personArray.add(personInfo);
		    jsonObject.put("persons", personArray);
			
			add = "주소:"+add;
			tenantInfo[0] = "이름:"+name;
			tenantInfo[1] = "전화번호:"+tel;
			tenantInfo[2] = "가족정보:"+famInfo;
			
			
			tenant.put(add, tenantInfo);
			
			System.out.println("주민정보 입력을 계속하시겠습니까?(Y/N)\n");
			String ans = scan.next();
			if(ans.equals("Y") || ans.equals("y")) {
				System.out.println("주민정보 입력을 계속합니다.\n");
			}else if(ans.equals("N") || ans.equals("n")) {
				System.out.println("주민정보 입력을 그만둡니다.\n");
				break;
			}else {
				System.out.println("잘못입력하셨습니다. 초기화면으로 돌아갑니다.");
				break;
			}
		}
	}
	
	void output() {
		String[] tenantInfo;
		System.out.println("전체 주민정보 열람을 시작합니다.\n");

		Iterator iterator = tenant.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry entry = (Entry) iterator.next();
			
			tenantInfo = (String[]) entry.getValue();
			
			System.out.print(add+"\t");
			for(int i =0; i < tenantInfo.length; i++) {
				System.out.print(tenantInfo[i]+"\t");
			}
			System.out.println("\n");
		}
	}
	
	void lookUp() {
		System.out.println("조회할 주소를 입력하세요");
		String findAdd = scan.next();
		
		System.out.println(findAdd+"의 주소의 정보를 조회합니다.\n");
		
		String[] findInfo = tenant.get(findAdd);
		
		System.out.println("주소:");
	}
	

}
