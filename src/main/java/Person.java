/**
 * Relationships your parser should find:
 * - extends -> Entity
 * - implements -> Renderable, Updatable
 * - aggregation/association -> Person (mentor), Person (children array)
 *   (optional) aggregation -> Entity (possessions array)
 */
public class Person extends Entity implements Renderable, Updatable {
    private final String name;

    // Association/Aggregation targets (same-type + array form so your simple parser picks up "Person")
    private Person mentor;          // association to another Person
    private Person[] children;      // aggregation of Persons
    private Entity[] possessions;   // optional: aggregation of Entities

    public Person(String name) {
        this.name = name;
        this.children = new Person[0];
        this.possessions = new Entity[0];
    }

    public String getName() { return name; }

    public Person getMentor() { return mentor; }
    public void setMentor(Person mentor) { this.mentor = mentor; }

    public Person[] getChildren() { return children; }
    public void setChildren(Person[] children) { this.children = children == null ? new Person[0] : children; }

    public Entity[] getPossessions() { return possessions; }
    public void setPossessions(Entity[] possessions) { this.possessions = possessions == null ? new Entity[0] : possessions; }

    @Override public void render() { /* no-op for demo */ }
    @Override public void update(double dt) { /* no-op for demo */ }
}

