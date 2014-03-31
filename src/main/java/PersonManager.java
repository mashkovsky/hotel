import java.util.List;

/**
 * @author Masha Shevchenko
 *         Date: 05.03.14
 */
public interface PersonManager {

    void createPerson(Person person);
    void updatePerson(Person person);
    void deletePerson(Person person);
    Person findPersonById(Long id);
    List<Person> findAllPersons();

}
