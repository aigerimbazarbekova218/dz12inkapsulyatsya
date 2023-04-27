public class Main {
    public static void main(String[] args) {
        System.out.println("Fish_____________________");
        Fish newfish=new Fish();
        newfish.setName("Nemo");
        newfish.setAge(1);
        newfish.setColor("yellow");
        System.out.println(newfish.getName());
        System.out.println(newfish.getAge());
        System.out.println(newfish.getColor());
        System.out.println("Parrot____________________");
        Parrot newparrot= new Parrot();
        newparrot.setName("Bella");
        newparrot.setAge(2);
        newparrot.setColor("green");
        System.out.println(newparrot.getName());
        System.out.println(newparrot.getAge());
        System.out.println(newparrot.getColor());
        System.out.println("Cat______________________________");
        Cat newcat=new Cat();
        newcat.setName("Marusya");
        newcat.setAge(2);
        newcat.setColor("white");
        System.out.println(newcat.getName());
        System.out.println(newcat.getAge());
        System.out.println(newcat.getColor());
        System.out.println("Dog_____________________");
        Dog newdog=new Dog();
        newdog.setName("Daisy");
        newdog.setAge(3);
        newdog.setColor("black");
        System.out.println(newdog.getName());
        System.out.println(newdog.getAge());
        System.out.println(newdog.getColor());
    }
}