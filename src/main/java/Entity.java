import java.util.UUID;
public abstract class Entity implements Identifiable {
    private final String id = UUID.randomUUID().toString();
    @Override public String getId() { return id; }
}
