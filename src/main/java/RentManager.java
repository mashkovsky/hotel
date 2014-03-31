import java.util.List;

/**
 * @author Masha Shevchenko
 *         Date: 05.03.14
 */
public interface RentManager {

    void createRent(Rent rent);
    void updateRent(Rent rent);
    void deleteRent(Rent rent);
    Rent findRentById(Long id);
    List<Rent> findAllRents();
    List<Rent> findRentForPerson(Person person);
    List<Rent> findRentForRoom(Room room);
    List<Person> findAllGuestsForRoom(Room room);
}
