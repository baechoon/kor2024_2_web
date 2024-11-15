package day23;

import day23.boardService8mvc.view.BoardView;

public class AppStart {
    public static void main(String[] args) {
        // 메인 뷰 요청
        // 다른 클래스의 존재하는 함수를 호출하는 방법
        // 1. 객체를 생성한 후 객체명.메서드명()
        // 단 패키지가 다르면 public

        BoardView view=new BoardView();
        view.mainPage();

    }
}
