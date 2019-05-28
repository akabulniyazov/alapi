package starter.topic;

public class Topic {

    private String ID;
    private String name;
    private String description;

    public Topic(String ID, String name, String description){
        super();
        this.ID=ID;
        this.description=description;
        this.name=name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
