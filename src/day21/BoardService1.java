package day21;

// 내용과 작성자로 구성된 게시물 3개까지 저장하는 서비스
// 조건: main 함수1개, 변수6개 , 반복문 사용
// 구현: 게시물쓰기, 게시물 출력

import java.util.Scanner;

public class BoardService1 {

    public static void main(String[] args) {// main start -> main역할?: 번역된 코드를 실행하는 기능



        Scanner scan= new Scanner(System.in); // 임력 객체 만들기

        // 1.저장소 설계-> 게시물 1개당 -> 내용과 작성자로 구성 (2개) -> 게시물이 3개면?->  내용과 작성자로 구성(총 6개)
        // 변수란? 하나의 데이터 또는 주소값을 저장하는 메모리
        // ㄴ  타입이란? 변수에 저장될 데이터 또는 주소의 타입 -> 데이터 분류 -> 기본타입과 참조타입

        String content1=null;   String writer1=null; // 첫번째 게시물의 내용과 작성자

        String content2=null;   String writer2=null; // 두번째 게시물의 내용과 작성자

        String content3=null;   String writer3=null; // 세번째 게시물의 내용과 작성자



        while (true){// 무한루프

            System.out.println("1. 게시물 쓰기 2. 게시물 출력 선택:");
            int choose= scan.nextInt(); // 입력받아 변수에 저장

            if (choose==1){// 만약 입력 값이 1이라면-> 게시물 쓰기

                // 게시물 저장할 내용 입력받기
                System.out.print("새로운 게시물 내용: "); String content= scan.next();
                System.out.print("새로운 게시물 작성자: ");  String writer= scan.next();


                //(1) 게시물을 작성할 공간이 있는지 체크하기  ---  게시물이 존재하지 않는뜻? -> null 또는  " "

                // 참고사항
                // if: 다중 if 는 다중조건의 다중결과를 얻을 수 있다
                // if~ else if 는 다중조건의 무조건 1개의 결과를 얻는다

                // 지금 현재의 조건문에 else if 가 아닌 if를 여러개 쓴다면?
                //                    ↓
                // ---> 만약 content1,2,3 가 모두 널이라면 게시글이 총 3번 등록이 된다

                if (content1==null){// 만약 첫번째 content1이  비어있으면 글을 쓸 수 있음
                    content1=content;// 입력 받은 값을 첫번째 게시물 변수에 저장
                    writer1=writer;
                }// if end

                else if (content2==null) {// 만약에 두번째 content2 가 비어있으면
                    content2=content;
                    writer2=writer;

                }//else if end

                else if (content3==null) {// 만약 content3 가 비어있으면
                    content3=content;
                    writer3=writer;

                }//else if end
                else {
                    System.out.println(" 게시물 쓰기 실패: 빈공간이 없습니다");
                }//else end


            }//if end

            if (choose==2){// 만약 입력값이 2라면-> 게시물 출력

              if (content1!=null){//만약에 첫번째 게시물이 존재 한다면
                  System.out.printf("작성자:%s,내용:%s",writer1,content1);
              }

                if (content2!=null){//만약에 첫번째 게시물이 존재 한다면
                    System.out.printf("작성자:%s,내용:%s",writer2,content2);
                }

                if (content3!=null){//만약에 첫번째 게시물이 존재 한다면
                    System.out.printf("작성자:%s,내용:%s",writer3,content3);
                }

            }//if end





        }//while end



    }// main end

}//class end
