public class User {
    private String id;
    private int personIntegration;

    public User(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getPersonIntegration() {
        return personIntegration;
    }

    public void setPersonIntegration(int personIntegration) {
        this.personIntegration = personIntegration;
    }
}
