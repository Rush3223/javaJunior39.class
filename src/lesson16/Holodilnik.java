package lesson16;

import java.util.HashMap;
import java.util.Map;

public class Holodilnik {
    private HashMap<String, Integer> products = new HashMap<>();

    public void addProduct(String nameOfProduct, int value) {
       nameOfProduct = nameOfProduct.toLowerCase();
        if (products.containsKey(nameOfProduct)) {
            int currentValue = products.get(nameOfProduct);
            products.put(nameOfProduct, value + currentValue);
        } else { // если нет продукта в холодильнике
            products.put(nameOfProduct, value);
        }
    }
    public void printAllProducts(){
        // проход по map
        for (Map.Entry<String, Integer> pr : products.entrySet()){
            System.out.println(pr.getKey() + " - " + pr.getValue() + " грамм");
        }
    }
    public void printAllProducts2(){
        // второй способ прохода по map
        for (String productName: products.keySet()){
            System.out.println(productName + " - " + products.get(productName));
        }
    }

    // 1 - взять продукт с холодильника (проверка на наличие и проверка достаточного веса (чтоб по требованию 5кг не отдали 2кг). Холодильник должен сообщить об ошибке)
    // 2 - вывести на терминал, какой продукт закончится самым первым (имеет меньший вес)
    // 3 - вывести вес всех продуктов в холодильнике
    // 4 - вывести продукты и вес в отсортированном формате по названию
    // 5 - *** сортировка по весу (постараться сделать) от большего к меньшему
    // UPD ДОБАВИТЬ БОЛЬШЕ ПРОДУКТОВ
}
