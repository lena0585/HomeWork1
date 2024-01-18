
public class HotDrinks {
    private String name;
    private Integer volume;
    private Integer price;
    private Integer temp;

    public HotDrinks(String name, Integer price, Integer volume, Integer temp) {
        this.name = name;
        this.price = price;
        this.volume = volume;
        this.temp = temp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }
    public Integer getTemp() {
        return temp;
    }

    public void setTemp(Integer temp) {
        this.temp = temp;
    }
    public String getInfo() {

        return String.format("Name: %s, price: %d, volume: %d, temp: %d", name, price, volume, temp);

    }


}
