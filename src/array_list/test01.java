package array_list;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.TreeSet;

public class test01 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<String> name = new ArrayList<>();
		ArrayList<String> number = new ArrayList<>();
		
		String logNa,logNum,delNa,seeNa,forNa,forNam,forNum;
		
		while(true) {
			System.out.println("=================");
			System.out.println("|1.연락처 등록	|");
			System.out.println("|2.연락처 보기	|");
			System.out.println("|3.연락처 삭제	|");
			System.out.println("|4.연락처 수정	|");
			System.out.println("|5.모든 연락처 보기	|");
			System.out.println("|6.종료		|");
			System.out.println("=================");
			System.out.print(">>> ");
			int age = input.nextInt();
			
		switch(age) {
			case 1:
				System.out.print("이름 입력 : ");
				logNa = input.next();
				if(name.contains(logNa)) {
					TreeSet<String> Date = new TreeSet<String>(name);
					name = new ArrayList<String>(Date);
					System.out.println("이미 존재하는 이름입니다");
					continue;
				}
				else
					logNa += name.add(logNa);
				System.out.print("전화번호 입력 : ");
				logNum = input.next();
				logNum += number.add(logNum);
				break;
			case 2:
				System.out.print("조회하실 연락처 이름 입력 : ");
				seeNa = input.next();
				int seeIn = name.indexOf(seeNa);
				if(name.contains(seeNa)) {
						System.out.println("\n이름 : "+name.get(seeIn));
						System.out.println("전화번호 : "+number.get(seeIn)+"\n");
					}								
				else 
					System.out.println("등록되지 않은 연락처 입니다\n");			
				break;
			case 3:
				System.out.print("삭제할 연락처의 이름 입력 : ");
				delNa = input.next();
				int index = name.indexOf(delNa); // 입력한 delNa 값을 index 변수가  인덱스 안에 있는 저장된값을 찾아서 몇번째 순서의 값을 저장한다
					if(name.contains(delNa)) {
						name.remove(index);
						number.remove(index);
						System.out.println("삭제된 연락처 이름(+전화번호) : "+delNa);
					}
					else {
						System.out.println("등록되지 않은 연락처 입니다");
					}		
				break;
			case 4:
				System.out.print("수정할 연락처의 이름 입력 : ");
				forNa = input.next();
				int forIn = name.indexOf(forNa);
				if(name.contains(forNa)) {
					System.out.print("변경할 이름 입력 : ");
					forNam = input.next();
					System.out.print("변경할 전화번호 입력 : ");
					forNum = input.next();
					name.set(forIn, forNam);
					number.set(forIn, forNum);
					System.out.println("\n변경된 이름 : "+forNam);
					System.out.println("변경된 전화번호 : "+forNum+"\n");
				}
				else {
					System.out.println("등록되지 않은 연락처입니다");
					System.out.println("현재 저장된 연락처 이름 : "+name);
				}
				break;
			case 5:
				System.out.println("현재 저장된 연락처 이름 : "+name);
				System.out.println("현재 저장된 연락처 전화번호 : "+number+"\n");
				break;
				
			case 6:
				System.out.println("시스템을 종료 합니다");
				return;		
			default:
				System.out.println("=== 다시 입력하세요 ===");
				break;
			} //switch
		} //while
								
	} //main
} //class
