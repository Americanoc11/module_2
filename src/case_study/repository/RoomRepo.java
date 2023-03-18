package case_study.repository;

import case_study.common.FileRead;
import case_study.common.FileWrite;
import case_study.model.Facillity.Room;

import java.util.ArrayList;
import java.util.List;

public class RoomRepo implements IRoomRepo {
    private static String pathRoom="src/case_study/data/list_room";
    @Override
    public void display() {
        List<Room> roomList= FileRead.readRoom(pathRoom);
        for (Room r: roomList){
            System.out.println(r.toString());
        }
    }

    @Override
    public void addRoom(Room room) {
        List<Room> roomList= new ArrayList<>();
        roomList.add(room);
        FileWrite.writeRoom(pathRoom,room);
    }
}
