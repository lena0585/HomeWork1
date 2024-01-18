import java.util.ArrayList;
import java.util.Iterator;

public class VendingMachine {
    public void getProduct(ArrayList<HotDrinks> hotDrinks) {
        System.out.println("У нас сегодня: ");
        Iterator<HotDrinks> iterator = hotDrinks.iterator();
        while (iterator.hasNext())
        {
            HotDrinks item = iterator.next();
            System.out.println(item.getName());
        }
    }

    public void getProduct(String name, int volume, int temp, int price) {
        System.out.printf("Ваш напиток: " + name + ",  его температура:" + temp + ", объем: " + volume + ", цена:" + price );
    }
}
