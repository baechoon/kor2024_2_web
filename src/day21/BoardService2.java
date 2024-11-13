package day21;

import java.util.Scanner;

// 내용과 작성자로 구성된 게시물 100개까지 저장하는 서비스
// 조건: main 함수1개,반복문 사용,배열 최대2개
// 구현: 게시물쓰기, 게시물 출력
public class BoardService2 {//class s

    public static void main(String[] args) {//main s

        Scanner scan = new Scanner(System.in); // 입력 객체 선언

        //BoardService1 에서 변수를 사용했는데 왜 배열 변수를 사용할까?--> 여러개의 변수에 있는 데이터를 배열로 사용하면 관리가 편하다

        //배열이란? 여러개의 동일한 타입의 데이터들을 *하나의 변수*에 저장할 수 있는 타입(참조타입)
        //ㄴ 인덱스란? 배열내 저장된 데이터들의 저장 순서 번호--> 인덱스 번호는 0번 부터 최대 길이까지 부여
        //ㄴ 반복문과의 활용: 시작값 부터 끝 값 까지 반복

        //배열을 왜 쓰지? 여러개의 변수(데이터)를 관리하기 힘들어서 , 단 동일한 타입이어야 함
        // 만약 다른 타입을 하나의 배열에 저장하고 싶다? class 사용


        String[] content = new String[100];// 배열 선언하는 방법: 타입[] 변수명=new 타입[개수]
        String[] writer = new String[100];// String 타입의 데이터 100개를 저장할 수 있는 배열선언

        while (true) {// while s

            System.out.println("1. 게시물 쓰기 2. 게시물 출력:");

            int choose = scan.nextInt();// 입력 받은 값 변수에 저장

            if (choose == 1) {

                System.out.print("새로운 게시물 제목:");
                String cont = scan.next();
                //String content= scan.next();//---> main(함수) 안에 content(변수(지역)) 가 이미 있기에 오류가 난다
                //만약에 main 함수 밖에서 쓴다면? 오류가 안난다 왜? 필드(멤버변수)이기 때문에
                System.out.print("새로운 게시물 작성자:");
                String writ = scan.next();

                // 만약에 게시물이 비어있다면
                // 인덱스 0부터 마지막인덱스 99까지 1씩 증가하면 된다
                // 스위치 변수? 상태를 저장하는 변수
                boolean save = false;//처음에는 false 해서 저장 실패 했다는 뜻
                for (int index = 0; index <= content.length - 1; index++) {
                    if (content[index] == null) { // 만약 인덱스 번호 번째에 content가 비어있다면
                        content[index] = cont;
                        writer[index] = writ;//입력받은 값 저장
                        save = true; // 저장성공 했으면 save 변수에 true 값으로 변경
                        break;//만약에 저장을 했으면 1개만 저장해야 하므로  break 를 써서 반복문 종료

                    }//if e

                   /* else {* 오류*
                        System.out.println("비어있는 자리가 없습니다");
                         첫번째가 비어있지 않아도 뒤에는 자리가 있을 수 있다

                    }*/


                }// for e
                //for 종료후에 save 변수 값이 ture 이면 성공 false 이면 실패

                if (save = false) { // 또는  if (!false)
                    System.out.println("게시물 쓰기 실패:빈 공간이 없습니다");
                } else {
                    System.out.println("게시물 쓰기 성공");
                }

            }//if (choose == 1) end


                if (choose == 2) {
                    for (int index = 0; index <= content.length - 1; index++) {
                        if (content[index] != null) {// 만약에 인덱스 번째에 게시물이 존재 한다면
                            System.out.printf("작성자:%s,내용:%s", writer[index], content[index]);
                        }//if e

                    }//for e
                }//if e




        }// while e

    }//main e
}//class e
