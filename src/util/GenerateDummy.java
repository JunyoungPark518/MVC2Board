package util;

public class GenerateDummy {
	public static void main(String[] args) {
		for(int i=1; i<10; i++){   
			System.out.println("INSERT INTO Article(id, title, content, regdate, hits) VALUES('babungv0"+i+"','게시판0"+i+"','게시판입니다.','2017-06-0"+i+"','1');");
		}
		for(int i=10; i<31; i++){
			System.out.println("INSERT INTO Article(id, title, content, regdate, hits) VALUES('babungv"+i+"','게시판"+i+"','게시판입니다.','2017-06-"+i+"','1');");
		}
	}
}
	