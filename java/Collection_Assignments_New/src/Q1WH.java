import java.util.Objects;
import java.util.TreeSet;

class Person{
    private Float weight ;
    private Float height ;
    private String name ;

    public Person(Float weight, Float height, String name) {
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public Float getWeight() {
        return weight;
    }

    public Float getheight() {
        return height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "weight=" + weight +
                ", height=" + height +
                ", name='" + name + '\'' +
                '}';
    }
}
public class Q1WH {
    public static void main(String[] args) {
        Person p1 = new Person(78F,34F,"hema");
        Person p2 = new Person(78F,36F,"Raju");
        Person p3 = new Person(68F,74F,"iman");
        Person p4 = new Person(75.1F,31F,"kichu");
        Person p5 = new Person(74F,44F,"vikram");
        Person p6 = new Person(68F,12F,"Ramu");
        TreeSet<Person> e = new TreeSet<>((Person e1, Person e2) ->
        {if (Objects.equals(e1.getWeight(), e2.getWeight()))
        {return  (e1.getheight()).compareTo(e2.getheight());}
            return (e1.getWeight()).compareTo(e2.getWeight());});
        e.add(p1);
        e.add(p2);
        e.add(p3);
        e.add(p4);
        e.add(p5);
        e.add(p6);
        System.out.println(e+"%n");

    }
}