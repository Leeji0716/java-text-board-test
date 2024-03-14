package org.example;

import java.util.ArrayList;


public class PostRepository {
    ArrayList<Post> postList = new ArrayList<>();
    CommonUtil commonUtil = new CommonUtil();
    int latestPostId = 4;

    public PostRepository() {
        makeTestData(); // 시작과 동시에 테스트 데이터 생성
    }

    public void makeTestData() {
        Post a1 = new Post(1, "안녕하세요 반갑습니다. 자바 공부중이에요.", "냉무", 0, commonUtil.getCurrentDateTime());
        Post a2 = new Post(2, "자바 질문좀 할게요~", "냉무", 0, commonUtil.getCurrentDateTime());
        Post a3 = new Post(3, "정처기 따야되나요?", "냉무", 0, commonUtil.getCurrentDateTime());
        postList.add(a1);
        postList.add(a2);
        postList.add(a3);
    }

    public ArrayList<Post> findPostByKeyword(String keyword) {
        ArrayList<Post> searchedList = new ArrayList<>();

        for (int i = 0; i < postList.size(); i++) {
            Post post = postList.get(i);
            if (post.getTitle().contains(keyword)) {
                searchedList.add(post);
            }
        }

        return searchedList;
    }

    public Post findPostById(int id) {
        for (int i = 0; i < postList.size(); i++) {
            Post post = postList.get(i);

            if (post.getId() == id) {
                return post;
            }
        }
        return null; // null -> 없다. 객체 타입에서만 사용 가능
    }

    public void deletePost(Post post) {
        postList.remove(post);
    }

    public void updatePost(Post post, String newTitle, String newBody) {
        post.setTitle(newTitle);
        post.setBody(newBody);
    }

    public ArrayList<Post> findAll() {
        return postList;
    }

    public Post savePost(String title, String body) {

        Post post = new Post(latestPostId, title, body, 0, commonUtil.getCurrentDateTime());
        postList.add(post);
        latestPostId++;

        return post;
    }
}
