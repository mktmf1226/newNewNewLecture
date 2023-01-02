package basic03_crawling;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Test01_choongang {

	public static void main(String[] args) {
		//중앙정보처리학원 웹페이지의 공지사항 제목만 크롤링
		
		try {
			
			String URL="https://www.choongang.co.kr/html/sub07_01_n.php";
			
			//웹페이지 소스 가져오기
			Document doc =Jsoup.connect(URL).get();
			System.out.println(doc.toString());
			
			
			
		}catch (Exception e) {
			System.out.println("크롤링 실패 : " + e);
		}//end
		
		
		
		

	}//main() end
}//class end
