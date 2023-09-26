package se.sigmatechnology.codingdojo.datamapper01;

public class Field {
    private final String key;
    private final FieldPack.ValueType type;
    private String text;
    private int integer;

    public Field(String key, String text) {
        this.key = key;
        this.type = FieldPack.ValueType.Text;
        this.text = text;
    }

    public Field(String key, int integer) {
        this.key = key;
        this.type = FieldPack.ValueType.Integer;
        this.integer = integer;
    }

    public String getKey() {
        return key;
    }

    public FieldPack.ValueType getValueType() {
        return type;
    }

    public String getAsText() {
        return text;
    }

    public int getAsInteger() {
        return integer;
    }
}
