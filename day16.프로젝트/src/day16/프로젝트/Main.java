package 여기어때;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import 여기어때.Booking;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static MemberHandler handler = new MemberHandler();
	static int hNum;
	static String hotel;
	static String date;
	static int aNum;
	static String login_id;
	

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		loop: while (true) {
			System.out.println("--- 회원가입/로그인 Page ---");
			System.out.println("1. 회원가입");
			System.out.println("2. 로그인");
			System.out.println("0. 프로그램 종료");

			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				handler.memberInsert();				
				break;
			case 2:
				login_id = handler.memberLogin(); // id = login_id
				if(login_id!="fail") {
					menuSelect01();
				} else if (login_id=="fail") {
					System.out.println("회원가입하세요");
				}
				break;

			case 0:
				System.out.println("프로그램 종료");
				break loop;
			}
		}
	}
	
	

	public static void menuSelect01() throws IOException, ClassNotFoundException {

		loop: while (true) {
			System.out.println("--- 여기어때 ---");
			System.out.println("1. 마이페이지");
			System.out.println("2. 예약하기");
			System.out.println("0. 로그아웃하기");

			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				menuSelect02();
				break;
			case 2:
				reservation();
				break;
			case 0:
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}

	public static void menuSelect02() {

		loop: while (true) {
			System.out.println("--- 마이페이지 ---");
			System.out.println("1. 예약정보확인");
			System.out.println("2. 내정보수정");
			System.out.println("0. 뒤로가기");

			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("--예약정보확인--");
				break;
			case 2:
				System.out.println("--내정보수정--");
				ChangeMyInfo();
				break;
			case 0:
				// 뒤로가기
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}

	}

	public static void ChangeMyInfo() {
		loop: while (true) {
			System.out.println("--바꿀 정보 선택--");
			handler.ShowMyInfo();
			System.out.println("1. 이름");
			System.out.println("2. 비밀번호");
			System.out.println("3. 전화번호");
			System.out.println("0. 뒤로가기");

			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				System.out.println("--이름바꾸기--");
				handler.ChangeMyName();
				break;
			case 2:
				System.out.println("--비밀번호바꾸기--");
				handler.ChangeMyPw();
				break;
			case 3:
				System.out.println("--전화번호바꾸기--");
				handler.ChangeMyPhonNum();
				break;
			case 0:
				// 뒤로가기
				break loop;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
	}

	public static void reservation() {

		ArrayList<Booking> reservation = new ArrayList<>(); // 예약된 정보 배열

		loop: while (true) {
			System.out.println("------------------------------------------------------------");
			System.out.println("지역을 선택하세요");
			for (int i = 0; i < BookingInfo.area.length; i++) {
				System.out.print((i + 1) + "." + BookingInfo.area[i] + " ");
			}
			System.out.println();
			String area = ""; // 지역 저장
			aNum = sc.nextInt(); // 지역선택
			area = BookingInfo.area[aNum - 1];

			System.out.println("------------------------------------------------------------");
			System.out.println("날짜를 입력하세요. ex)0000/0/0");
			date = sc.next(); // 날짜 선택

			System.out.println("------------------------------------------------------------");
			System.out.println("호텔을 선택하세요");
			switch (aNum) {
			case 1: // 인천
				search(BookingInfo.IncheonHotel);
				register(BookingList.IncheonList);
				break;
			case 2: // 부산
				search(BookingInfo.BusanHotel);
				register(BookingList.BusanList);
				break;
			case 3: // 제주
				search(BookingInfo.JejuHotel);
				register(BookingList.JejuList);
				break;
			default:
				System.out.println("잘못된 입력입니다");
				break;
			}
			System.out.println("예약아이디 : " + login_id);
			
			reservation.add(new Booking(login_id, area, hotel, date, true));
			//reservation.add(new Booking(id,area, hotel, date, true));
			
			
			System.out.println("정상적으로 예약이 되었습니다.");
			System.out.println("계속 예약하시겠습니까? 1.예 2.아니오");
			aNum = sc.nextInt();
			if (aNum != 1) {
				break loop;
			}
		}

		System.out.println("------------------------------------------------------------");
		registerSearch(BookingList.IncheonList);
		registerSearch(BookingList.BusanList);
		registerSearch(BookingList.JejuList);

		// 예약된 정보 파일에 저장
		FileInput(reservation);

	}

	// 예약된 정보 파일에 저장
	public static void FileInput(ArrayList<Booking> reservation) {
		try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("res/List.txt"));
            // 문자열을 파일에 쓰기
            for(int i=0; i<reservation.size(); i++) {
            	writer.write(reservation.get(i).toString()+"\n");
            }
            // 파일 쓰기 완료 후 닫기
            writer.close();
            System.out.println("문자열이 파일로 저장되었습니다.");
        } catch (IOException e) {
            e.printStackTrace();
        }
	}
	
	
	// 등록된 예약 조회
	public static void registerSearch(ArrayList<Booking> item) {
		for (int i = 0; i < item.size(); i++) {
			Booking b = item.get(i);
			if (b.isEmpty() == true) {
				System.out.println(b);
			}
		}
	}

	// 예약 등록
	public static void register(ArrayList<Booking> item) {
		for (int i = 0; i < item.size(); i++) {
			Booking b = item.get(i);
			if (b.getHotel().equals(hotel) && b.getDate().equals(date)) {
				if (b.isEmpty() == false) {
					b.setEmpty((true));
					System.out.println("예약되었습니다.");
				} else {
					System.out.println("이미 예약된 방입니다.");
				}
			}
		}
	}

	// 지역 호텔 조회
	public static void search(String[] item) {
		for (int i = 0; i < item.length; i++) {
			System.out.print((i + 1) + "." + item[i] + " ");
		}
		System.out.println();
		hNum = sc.nextInt(); // 호텔 선택
		hotel = item[hNum - 1];
	}

}
