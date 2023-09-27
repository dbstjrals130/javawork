package banking.arraylist;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

import banking.array.Account;

public class BankArrayList {
	
	//통장 계좌를 저장할 자료 구조의 객체 생성
	static List<Account> accountList = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean sw = true;
		
		while(sw) {
			System.out.println("===============================================================");
			System.out.println("1.계좌 생성 | 2.계좌 목록 | 3.예금 | 4.출금 | 5.계좌 삭제 | 6.종료");
			System.out.println("===============================================================");
			System.out.println("선택>");
			
			//메뉴 선택
			int selectNo = Integer.parseInt(scanner.nextLine());
			
			if(selectNo == 1) {
				createAccount();		//계좌 생성
			}else if(selectNo == 2) {
				getAccountList();		//계좌 목록
			}else if(selectNo == 3) {
				deposit();				//입금
			}else if(selectNo == 4) {
				//withdraw();			//출금
			}else if(selectNo == 5) {
				//removeAccount();		//계좌 삭제
			}else if(selectNo == 6) {
				sw = false;				//종료
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
			
		}//while끝			
		System.out.println("프로그램을 종료합니다.");
		scanner.close();

	}//main끝
	
	private static void createAccount() {
		System.out.println("-----------------------------");
		System.out.println("계좌 생성");
		System.out.println("-----------------------------");
		
		while(true) {
			System.out.print("계좌 번호(숫자만:00-00-000) : ");
			String ano = scanner.nextLine();
			
			String regExp = "\\d{2}-\\d{2}-\\d{3}";	//정규 표현식
			boolean result = Pattern.matches(regExp, ano);
			
			if(result) {
			//중복 계좌가 있는지 체킹
			if(findAccount(ano) != null) { //중복 계좌가 있으면
				System.out.println("이미 등록된 계좌입니다. 다시 입력해 주세요.");
			}else { //중복 계좌가 없으면
				System.out.print("계좌주: ");
				String owner = scanner.nextLine();
				
				System.out.print("초기 입금액: ");
				int balance = Integer.parseInt(scanner.nextLine());
				
				//입력받은 내용을 매개변수로 계좌 생성됨
				Account newAccount = new Account(ano, owner, balance);
				accountList.add(newAccount);
				System.out.println("결과: 계좌가 생성되었습니다.");
				break;
			}
		}else {
			System.out.println("계좌번호 형식이 아닙니다. 다시 입력해 주세요.");
		}
		
			
		}//while 끝
	}
	
	private static void getAccountList() {
		System.out.println("------------------------------");
		System.out.println("계좌 목록");
		System.out.println("------------------------------");
		
		//계좌 목록 조회
		for(int i=0; i<accountList.size(); i++) {
			Account account = accountList.get(i);
				System.out.println("계좌번호 : " + account.getAno() + "\t");
				System.out.println("계좌주 : " + account.getOwner() + "\t");
				System.out.println("잔고 : " + account.getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("----------------------------------------");
		System.out.println("입금");
		System.out.println("----------------------------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		System.out.print("입금액 : ");
		int money = Integer.parseInt(scanner.nextLine());
		
		if(findAccount(ano) != null) {
			Account account = findAccount(ano);
			account.setBalance(account.getBalance() + money);
		}else {
			System.out.println("결과 : 계좌가 없습니다.");
		}
		
	}
	
	
	private static void removeAccount() {
		System.out.println("----------------------------------------");
		System.out.println("계좌 삭제");
		System.out.println("----------------------------------------");
		
		System.out.print("계좌번호 : ");
		String ano = scanner.nextLine();
		
		
	}
	
	
	
	
	
	
	
	
	
	

	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountList.size(); i++) {
			//1. 이미 등록된 계좌를 가져와서 
			//2. 외부에서 입력한 계좌와 일치하는지 비교함
			String dbAno = accountList.get(i).getAno();		
			if(dbAno.equals(ano)) {
				account = accountList.get(i);  //계좌 객체 생성
				break;
			}
			
		}	
		return account;
	}

}

