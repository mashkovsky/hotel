import java.math.BigDecimal;
import java.util.Calendar;

/**
 * @author Masha Shevchenko
 *         Date: 05.03.14
 */
public class Rent {

    private Long id;
    private BigDecimal price;
    private Room room;
    private Person person;
    private Calendar startDay;
    private Calendar expectedEndDay;
    private Calendar realEndDay;
    private int guestsInRoom;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Calendar getStartDay() {
        return startDay;
    }

    public void setStartDay(Calendar startDay) {
        this.startDay = startDay;
    }

    public Calendar getExpectedEndDay() {
        return expectedEndDay;
    }

    public void setExpectedEndDay(Calendar expectedEndDay) {
        this.expectedEndDay = expectedEndDay;
    }

    public Calendar getRealEndDay() {
        return realEndDay;
    }

    public void setRealEndDay(Calendar realEndDay) {
        this.realEndDay = realEndDay;
    }

    public int getGuestsInRoom() {
        return guestsInRoom;
    }

    public void setGuestsInRoom(int guestsInRoom) {
        this.guestsInRoom = guestsInRoom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Rent rent = (Rent) o;

        if (id != null ? !id.equals(rent.id) : rent.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", price=" + price +
                ", room=" + room +
                ", person=" + person +
                ", startDay=" + startDay +
                ", expectedEndDay=" + expectedEndDay +
                ", realEndDay=" + realEndDay +
                ", guestsInRoom=" + guestsInRoom +
                '}';
    }
}
