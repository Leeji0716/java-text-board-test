package org.example;

import java.util.Scanner;

public class BoardApp {
    PostController postController = new PostController();
    Scanner scan = new Scanner(System.in);
    public void run() {

        while (true) { // 반복 조건이 true이기 때문에 무한 반복

            System.out.print("명령어 : ");
            String cmd = scan.nextLine();
            if(cmd.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                break;
            }

            switch (cmd) {
                case "add" -> postController.add();
                case "list" -> postController.list();
                case "update" -> postController.update();
                case "delete" -> postController.delete();
                case "detail" -> postController.detail();
                case "search" -> postController.search();
                default -> System.out.println("올바른 명령어가 아닙니다.");
            }
        }
    }
}
