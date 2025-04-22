```java
public class Beverage {
    // condiments boolean values

    public double cost() {
        double condimentCost = 0.0;

        if (milk) {
            cost += milkCost;
        }

        if (soy) {
            cost += soyCost;
        }

        // ...

        return condimentCost;
    }
}

public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Most Excellent Dark Roast";
    }

    public double cost() {
        return super.cost() + darkRoastCost;
    }
}
```
