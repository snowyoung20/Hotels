package hotels;

import java.util.List;
import java.util.ArrayList;
public class Room {
    private String roomNumber;
    private String roomName;
    private String roomSize;
    private int roomPrice;
  
    private static List<Room> roomList;
  
    public Room(String roomNumber, String roomName, String roomSize, int roomPrice) {
        this.roomNumber = roomNumber;
        this.roomName = roomName;
        this.roomSize = roomSize;
        this.roomPrice = roomPrice;
    }
    public String getRoomNumber() {
        return roomNumber;
    }
    public String getRoomName() {
        return roomName;
    }
    public String getRoomSize() {
        return roomSize;
    }
    public int getRoomPrice() {
        return roomPrice;
    }
  

    public static void RoomList() {
        roomList = new ArrayList<>();
        roomList.add(new Room("101", "싱글룸", "18평", 50000));
        roomList.add(new Room("202", "더블룸", "28평", 80000));
        roomList.add(new Room("303", "트윈룸", "26평", 100000));
        roomList.add(new Room("404", "스위트룸", "36평", 250000));
        roomList.add(new Room("505", "더블룸", "30평", 90000));
        roomList.add(new Room("606", "스튜디오룸", "30평", 150000));
        roomList.add(new Room("707", "싱글룸", "18평", 60000));
        roomList.add(new Room("808", "스튜디오룸", "32평", 180000));
        roomList.add(new Room("909", "더블룸", "28평", 90000));
        roomList.add(new Room("1010", "스위트룸", "40평", 350000));
    }


    public List<Room> getRoomList() {
        return roomList;
    }

    public String toString() {
        return getRoomNumber() + "  |  " + getRoomSize() + "  |  " + getRoomPrice();
    }

    public static void printRoomList() {
        for (Room r : roomList) {
            System.out.println(r);
        }
    }

    public String returnRoomSize(String roomNumber) throws HotelsBadException {
        for (Room r : roomList) {
            if (getRoomNumber().equals(roomNumber)) {
                return getRoomSize();
            }
        }
        throw new HotelsBadException("없는 번호입니다.");
    }

    public int returnPrice(String roomNumber) throws HotelsBadException {
        for (Room r : roomList) {
            if (getRoomNumber().equals(roomNumber)) {
                return getRoomPrice();
            }
        }
        throw new HotelsBadException("없는 번호입니다.");
    }
}
    public List<Room> getRoomList() {
        return roomList;
    }
}