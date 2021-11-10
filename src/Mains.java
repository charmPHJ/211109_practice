public class Mains extends Thread{ // 쓰레드 상속받기 문법임
    @Override
    public void run(){ // 서브 스레드

        try{
            for (int i = 0; i <= 5; i++){
                Thread.sleep(1000); // 쓰레드 문법 (1초마다 텀이 생김,실행간격 심호흡)
                System.out.println(i);
            }
        } catch (InterruptedException e){ // for문쓸때의 명령어

        }
    }

    public static void main(String[] args) { // 메인 스레드

        for (int i = 0; i <= 5; i++){
           // 쓰레드 문법 (1초마다 텀이 생김,실행간격 심호흡)
            System.out.println("apdps");
        }

        Mains mains = new Mains(); // 객체화
        mains.start(); // 스타트 후 맨위 서브스레드 시작
        for (int i = 0; i <= 5; i++){

            System.out.println(
                    "메인"
            );
        }


    }
}