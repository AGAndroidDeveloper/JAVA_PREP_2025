import org.jetbrains.annotations.NotNull;

public record AccountRecordData(int id, String name) {

    @NotNull
    @Override
    public String toString() {
        return "AccountRecordData {" +
                " id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


}
