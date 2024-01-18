import java.util.ArrayList;
import java.util.List;

// 1.Создать наследника реализованного класса ГорячийНапиток с дополнительным полем int температура.
// 2. Создать класс ГорячихНапитковАвтомат реализующий интерфейс ТорговыйАвтомат и
// реализовать перегруженный метод getProduct(int name, int volume, int temperature) выдающий продукт
// соответствующий имени, объему и температуре
// 3.В main проинициализировать несколько ГорячихНапитков и ГорячихНапитковАвтомат и
// воспроизвести логику заложенную в программе
public class Main {
    public static void main(String[] args) {
        HotDrinks  espressoCoffee = new HotDrinks("espresso Coffee ", 399, 70, 65);
        HotDrinks latteCoffee  = new HotDrinks("latte Coffee", 435, 350, 65);
        HotDrinks cappuccinoCoffee = new HotDrinks("cappuccino Coffee", 450, 350, 65);
        HotDrinks blackTea = new HotDrinks("black Tea", 250, 400, 80);
        HotDrinks greenTea = new HotDrinks("green Tea", 300, 400, 80);
        HotDrinks hotChocolate = new HotDrinks("hot Chocolate", 425, 350, 75);
        HotDrinks milkFroth = new HotDrinks("milk Froth", 250, 250, 55);
        List<HotDrinks> ourDrinks = new ArrayList<>();
        ourDrinks.add(espressoCoffee );
        ourDrinks.add(latteCoffee);
        ourDrinks.add(cappuccinoCoffee);
        ourDrinks.add(blackTea);
        ourDrinks.add(greenTea);
        ourDrinks.add(hotChocolate);
        ourDrinks.add(milkFroth);

        VendingMachine vendingMachine = new VendingMachine();
        vendingMachine.getProduct((ArrayList<HotDrinks>) ourDrinks);

        HotDrinksMachine hotDrinksMachine = new HotDrinksMachine("green tea", 300, 400, 80);
        System.out.println(hotDrinksMachine.getInfo());

        vendingMachine.getProduct("green tea",400, 80, 300);

    }
}