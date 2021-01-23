package bussiness;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class companymain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;  
		ArrayList<String> maen= new ArrayList<String>();

		while (run) {

			System.out.printf("1.등록\n 2.검색\n 3.종료\n");
			System.out.printf("숫자를 입력하세요 : ");
			int number = sc.nextInt(); 
		

			if (number==1) {
				System.out.printf("등록할 직원의 이름을 입력하시오 : ");
				String kname = sc.nextLine();
				String name = sc.nextLine();  
				System.out.printf("등록할 직원의 부서을 입력하시오 : ");
				String part = sc.nextLine();
				System.out.printf("등록할 직원의 주소를 입력하시오 : ");
				String addr = sc.nextLine();
				System.out.printf("등록할 직원의 생일을 입력하시오 : ");
				String birth = sc.nextLine();
				

				maen.add(name);
				maen.add(part);
				maen.add(addr);
				maen.add(birth);
				
				
				

			} else if (number==2) {
				System.out.print("찾을려는 직원의 이름을 입력하세요 : ");
				String iname = sc.nextLine();
				String cname = sc.nextLine();
				
				if(maen.get(0).equals(cname)) {

					System.out.printf("이름 : " + maen.get(0)+"\n");
					System.out.printf("부서 : " + maen.get(1)+"\n");
					System.out.printf("주소 : " + maen.get(2)+"\n");
					System.out.printf("생일 : " + maen.get(3)+"\n");
					
					maen.clear();

				}else {
					continue;
				}
				
				
			

			} else if (number==3) {
				System.out.printf("프로그램 종료");
				run = false;

			}
		}

	}

}
