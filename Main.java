package hotels;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Reservation reservation = new Reservation();

        Room.RoomList();
        Room.printRoomList();
//        reservation.reservation();

        boolean start = true;

        while (start) {
            Scanner sc = new Scanner(System.in);

            System.out.println("[ 맞왜틀 호텔에 오신것을 환영합니다. ]");
            System.out.println();
            System.out.println("1. 호텔    2. 고객");
            int select = sc.nextInt();

            switch (select) {
                case 1 :
                    reservation.hotel();
                case 2 :
                    reservation.customer();
            }
        }
    }
}