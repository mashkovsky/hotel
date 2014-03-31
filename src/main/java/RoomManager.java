import java.util.List;

/**
 * @author Masha Shevchenko
 *         Date: 05.03.14
 */
public interface RoomManager {

    void createRoom(Room room);
    void updateRoom(Room room);
    void deleteRoom(Room room);
    Room findRoomById(Long id);
    List<Room> findAllRooms();
}
