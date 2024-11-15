package day23;
//BoardService7
// 추가조건: 등록기능과 출력기능 코드를 main함수 밖으로 빼서 각 함수로 구현
// 분리하는 이유: 메서드는 기능 단위로 분리해서 하나의 함수로 묶으면 관리, 사용,재활용
// 추후에 복잡한 프로젝트에서 유지보수/식별/구분이 쉳다

//static이란? 정적키워드, static가 존재하는 변수 혹은 메서드(함수)는 우선할당(프로그램 실행시 메모리에 적재)된다
//static main 함수 안에서 다른 함수가 실행되지 않는이유?
// ㄴ1 static main 함수 안에서는 호출 할 함수가 static 이어야 한다
// ㄴ  main 함수가 먼저 실행 되므로 호출 할 정보를 모른다
// ㄴ 2 static main 함수 안에서는 다른 클래스의 메서드를 호출하기 위해서는 갹채가 필요하다
// ㄴ 객체를 생성하면서 static 이 아닌 메서드 정보를 읽어들인다

import java.util.ArrayList;
import java.util.Scanner;

public class BoardService7 {

    static Scanner scan = new Scanner(System.in); // 정적(static)변수
    static ArrayList<Board> boardList = new ArrayList<>(); // 정적변수

    static void boardWrite(){ // 메소드 정의 // 정적(static)변수
        scan.nextLine();
        System.out.print("내용 : ");      String content = scan.nextLine();
        System.out.print("작성자 : ");    String writer = scan.next();
        System.out.print("비밀번호 : ");  int pwd = scan.nextInt();
        Board board = new Board( content , writer , pwd );
        boardList.add( board );
    } // m end

    static void boardPrint(){ // 메소드 정의  // 정적(static)변수
        for( int index = 0 ; index <= boardList.size()-1 ; index++ ){
            System.out.printf("작성자 : %s , 내용 : %s \n" ,  boardList.get( index).getContent() , boardList.get(index).getWriter() );
        } // for end
    } // m end

    public static void main(String[] args) {  // 정적(static)변수
        while (true){
            System.out.print("1.글쓰기 2.글출력 : ");
            int choose = scan.nextInt();
            if( choose == 1 ) { boardWrite(); // 등록 함수호출
            }else if( choose == 2 ) { boardPrint(); // 출력 함수호출
            }
        } // w end
    } // m end

}
