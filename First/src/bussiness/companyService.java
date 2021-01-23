package bussiness;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class companyService {

	
	Scanner sc;
	private boolean run = true;
	companyBasics[] cmdList;
	int inputNumber;

	public companyService() {
		sc = new Scanner(System.in);

		buttonAction();

	}

	public void setData() {
		
		System.out.print("등록 입력 인원 :  ");
		inputNumber = sc.nextInt();

		cmdList = new companyBasics[inputNumber];

		for (int i = 0; i < cmdList.length; i++) {
			cmdList[i] = new companyBasics();

			System.out.print("등록할 직원의 이름을 입력하시오 : ");
			cmdList[i].setName(sc.next());

			System.out.print("등록할 직원의 부서를 입력하시오 : ");
			cmdList[i].setPart(sc.next());

			System.out.print("등록할 직원의 주소를 입력하시오 : ");
			cmdList[i].setAddr(sc.next());

			System.out.print("등록할 직원의 생일을 입력하시오 : ");
			cmdList[i].setBirthday(sc.next());

			System.out.println();

		}

	}

	public void buttonAction() {

		while (run) {

			System.out.print("1.등록\n 2.검색\n 3.종료\n");
			System.out.print("숫자를 입력하세요 : ");
			int number = sc.nextInt();

			switch (number) {
			case 1:
				setData();
				break;

			case 2:
				System.out.print("찾을려는 직원의 이름을 입력하세요 : ");

				String cname = sc.next();

				for (int i = 0; i < cmdList.length; i++) {
					if (cmdList[i].getName().equals(cname)) {
						cmdList[i].print();
					}
					continue;
				}

				break;

			case 3:

				System.out.print("프로그램 종료");
				run = false;

				break;
			default :
				System.out.println("다시 입력해주세요");
				break;
			}

		}

	}

}
