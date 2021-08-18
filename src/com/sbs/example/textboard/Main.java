package com.sbs.example.textboard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		List<Article> articles = new ArrayList<>();
		int lastArticleid = 0;
		
		while(true) {
			System.out.printf("명령어) ");
			String command = sc.nextLine().trim();
			
			if(command.length()==0) {
				continue;
			}
			
			if(command.equals("system exit")) {
				break;
			}
			
			if(command.equals("article write")) {
				int id = lastArticleid + 1;
				lastArticleid = id;
				
				System.out.printf("제목 : ");
				String title = sc.nextLine();
				System.out.printf("내용 : ");
				String body = sc.nextLine();
				
				System.out.printf("%d번 글이 생성되었습니다.\n",id);
			}
			
			else if(command.equals("article list")) {
				System.out.printf("게시물이 존재하지 않습니다.\n");
			}
			
			else {
				System.out.printf("존재하지 않는 명령어입니다.\n");
			}
		}
		
		System.out.println("프로그램을 종료합니다.");
	}

}
