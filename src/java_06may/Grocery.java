package java_06may;

import org.jetbrains.annotations.NotNull;

public record Grocery(int weightInKg, String name) {

    @NotNull
    @Override
    public String toString() {
        return "Grocery { " +
                "weightInKg= " + weightInKg +
                ", name= '" + name + '\'' +
                '}';
    }
}
