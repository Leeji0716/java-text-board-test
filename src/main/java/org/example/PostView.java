package org.example;

import java.util.ArrayList;

public class PostView {

    public void printPostList(ArrayList<Post> targetList) {

        System.out.println("===================");
        for (int i = 0; i < targetList.size(); i++) {

            Post post = targetList.get(i);

            System.out.println("번호 : " + post.getId());
            System.out.printf("제목 : %s\n", post.getTitle());
            System.out.println("===================");
        }
    }
    public void printPostDetail(Post post) {
        System.out.println("===================");
        System.out.println("번호 : " + post.getId());
        System.out.println("제목 : " + post.getTitle());
        System.out.println("내용 : " + post.getBody());
        System.out.println("등록날짜 : " + post.getRegDate());
        System.out.println("조회수 : " + post.getHit());
        System.out.println("===================");
    }
}
