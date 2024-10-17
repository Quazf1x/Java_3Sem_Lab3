/*
* Определить класс Set на основе множества целых чисел, n = размер.
* Создать методы для определения пересечения и объединения множеств.
* */


public class Main {
    public static void main(String[] args) {
        // Код для теста работы класса Set
        Set setA = new Set(2);
        Set setB = new Set(3);
        setA.add(7);
        setA.add(10);
        setA.add(33);

        setB.add(33);
        setB.add(10);
        setB.add(5);

        System.out.println(setA.getSet());
        System.out.println(setB.getSet());

        Set unionSet = setA.union(setB);
        Set intersectionSet = setA.intersect(setB);

        System.out.println("Объединение: " + unionSet.getSet());
        System.out.println("Пересечение: " + intersectionSet.getSet());
    }


}

