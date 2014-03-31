import java.math.BigDecimal;

/**
 * @author Masha Shevchenko
 *         Date: 05.03.14
 */
public class Room {

    private Long id;
    private int capacity;
    private BigDecimal pricePerDay;

    public Room() {
    }

    public Room(Long id, int capacity, BigDecimal pricePerDay) {
        this.id = id;
        this.capacity = capacity;
        this.pricePerDay = pricePerDay;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        if (id != null ? !id.equals(room.id) : room.id != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }


    @Override
    public String toString() {
        return "Room{" +
                "id=" + id +
                ", capacity=" + capacity +
                ", pricePerDay=" + pricePerDay +
                '}';
    }
}
