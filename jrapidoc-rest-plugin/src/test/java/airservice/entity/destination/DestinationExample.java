package airservice.entity.destination;

public class DestinationExample {

    @com.fasterxml.jackson.annotation.JsonIgnore
    private long id;
    public String name;

    public DestinationExample() {
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }


    public String getName() {
        return name;
    }
}
