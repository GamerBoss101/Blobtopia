package tech.bosstop.commons.structures;

public class Item {
    private String name;
    private int id;
    private ItemType type;

    public Item(String name, int id, ItemType type) {
        this.name = name;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return this.id;
    }

    public ItemType getType() {
        return this.type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        if(id < 0) {
            throw new IllegalArgumentException("Item id cannot be less than 0");
        }
        this.id = id;
    }

    public void setType(ItemType type) {
        this.type = type;
    }


}