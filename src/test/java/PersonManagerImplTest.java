import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;

/**
 * @author Masha Shevchenko
 *         Date: 09.03.14
 */
public class PersonManagerImplTest {

    private PersonManager personManager ;

    @Before
    public void setUp() {
       personManager = new PersonManagerImpl();
    }

//    @Test
//    public void testCreatePersonWithNullParameter() {
//        try{
//            personManager.createPerson(null);
//            fail();
//        } catch (IllegalArgumentException e) {
//
//        }
//    }

    @Test(expected = IllegalArgumentException.class)
    public void testCreatePersonWithNullParameter() {
        personManager.createPerson(null);
    }

    @Test
    public void testCreatePersonWithNullId() {
        Person person = new Person(null,"Andrej","2541143","Lipova,24");
        personManager.createPerson(person);
        assertNotNull(person.getId());
    }

    @Test
    public void testCreatePerson() {
        Person person = new Person(null,"Andrej","2541143","Lipova,24");
        personManager.createPerson(person);
        assertEquals(person,personManager.findPersonById(person.getId()));

    }
}
