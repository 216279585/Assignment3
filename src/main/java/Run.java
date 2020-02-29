public class Run {

    public static void main(String[] args) {

        //noise method of parent class
        Animal parentMethod = new Animal();
        parentMethod.makeNoise();


        //noise method of child class
        Animal childMethod = new Cat();
        childMethod.makeNoise();


        //interface examples - interface is an alternative to inheritance
        CatInterface catInterExample = new CatInterface();
        catInterExample.makeNoise();





    }
}
