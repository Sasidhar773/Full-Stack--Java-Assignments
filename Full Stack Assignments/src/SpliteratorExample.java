import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpliteratorExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("BMW");
        list.add("Mercedes");
        list.add("Audi");
        list.add("Ferrari");
        list.add("Lamborghini");
        list.add("Maruti");

        Spliterator<String> spliterator = list.spliterator();

        
        System.out.println("characteristics : "+spliterator.characteristics());

        
        System.out.println("has characteristics : "
           + spliterator.hasCharacteristics(Spliterator.ORDERED));

        
        System.out.println("estimateSize : "+spliterator.estimateSize());

        
        System.out.println("getExactSizeIfKnown : "+spliterator.getExactSizeIfKnown());

        System.out.println("spliterator for each remaining");
        //forEachRemaining function
        spliterator.forEachRemaining(System.out::println);

        System.out.println("trying split");
        //trySplit method

        spliterator = list.spliterator();
        Spliterator<String> spliterator_new = spliterator.trySplit();

        spliterator.forEachRemaining(System.out::println);
        System.out.println("current spliterator done!");
        spliterator_new.forEachRemaining(System.out::println);
        System.out.println("new spliterator done!");

        //tryAdvance function

        while(spliterator.tryAdvance(System.out::println));
    }

}


