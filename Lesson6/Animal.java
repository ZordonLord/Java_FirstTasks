package Lesson6;

import java.util.Objects;

public class Animal {
    protected String type;
//    protected Owner owner;
    protected long id;
    protected String name;

    public Animal(long id, String name) {
        this.type = getClass().getSimpleName();
        this.id = id;
        this.name = name;
//        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return id == animal.id && Objects.equals(type, animal.type) && Objects.equals(name, animal.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, id, name);
    }

    @Override
    public String toString() {
        return type+"{" +
                "type='" + type + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
    //    public String toString() {
//        return getClass().getName() +
//        "@" +
//        Integer.toHexString(hashCode());
//    }
}
