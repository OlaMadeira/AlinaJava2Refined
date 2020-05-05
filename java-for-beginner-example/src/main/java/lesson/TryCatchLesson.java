package lesson;

import animal.Animal;
import animal.Sheep;
import animal.Tiger;

import java.util.Arrays;

public class TryCatchLesson {

    public static Animal[] createArray(){
    // createArray() - метод, создающий массив животных и возвращающий этот массив
        Animal[] animalArray = new Animal[5];
        animalArray[0] = new Tiger("Vasya");
        animalArray[1] = new Sheep("Sonya", 4);
        animalArray[2] = new Tiger("Ivan");
        animalArray[3] = new Sheep("Lyuda", 4);
        animalArray[4] = new Tiger("Petr Nikolaevich");
        return animalArray;
    }

    public static Sheep[] filterOnlySheep(Animal[] animals) {
        Sheep[] result = new Sheep[0];
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Sheep) {
                Sheep[] oldArray = result;
                result = new Sheep[result.length + 1];
                for (int j = 0; j < oldArray.length; j++) {
                    result[j] = oldArray[j];
                }
                Sheep sheep = (Sheep) animals[i];
                result[result.length - 1] = sheep;
                System.out.println(animals[i]);
            }
        }
        return result;
    }

    public static void findSheepFinal() {
        Animal[] animalArray = createArray();

        Sheep[] result = filterOnlySheep(animalArray);

        System.out.println(Arrays.toString(result));
    }

}
