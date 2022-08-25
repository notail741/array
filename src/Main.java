public class Main {
    public static void main(String[] args) {
       //int [] weights = {90,91,93,92,85,87,88,89, 0, 0, 0, 0};
        //weights[0] = 90;
        //int januaryWeith = weights[0];
        //System.out.println(januaryWeith);
        //System.out.println(weights[0]);
        //System.out.println(weights[4]);
        //int january = 0;
        //System.out.println(weights[january]);
        //for (int i = 0; i < weights.length; i++) {
            //System.out.println(weights[i]);
       // }
    // ## 1 задача
        //
        //Объявите три массива:
        //
        //1. Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new.
        //    - Подсказка
        //
        //        ```java
        //        //объявление массива из 12-ти элементов, заполненного нулями
        //
        //        int [] weight = new int [12];
        //        ```
        //
        //2. Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями.
        //    - Подсказка
        //
        //        ```java
        //        //объявление целочисленного массива, заполненного 12 элементами
        //
        //        int [] weight = {90, 91, 93, 92, 85, 87, 84, 83, 0, 0, 0, 0};
        //        ```
        //
        //3. Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        int [] arrayOne = new int[3];
        arrayOne [0] = 1;
        arrayOne [1] = 2;
        arrayOne [2] = 3;
        double [] arrayTwo = {1.57, 7.645, 9.986};
        int [] arrayThree = {1,2,3,4};

        //## 2 задача
        //
        //Пройдите по каждому из трех массивов и распечатайте все элементы всех трех массивов, начиная с первого элемента, через запятую. Запятая между последним элементом одного массива и первым элементом следующего не нужна.

        for (int i = 0; i < arrayOne.length-1; i++) {
            System.out.print(arrayOne[i] + ", ");
        }
            System.out.print(arrayOne[2]);
        System.out.println();
        for (int i = 0; i < arrayTwo.length-1; i++) {
            System.out.print(arrayTwo[i] + ", ");
        }
            System.out.print(arrayTwo[2]);
        System.out.println();
        for (int i = 0; i < arrayThree.length-1; i++) {
            System.out.print(arrayThree[i] + ", ");
        }
        System.out.print(arrayThree[3]);
        System.out.println();
        //Теперь ваша задача – распечатать все элементы всех трех массивов, но начинать нужно не с первого элемента массива, а с последнего. Элементы должны быть распечатаны через запятую, при этом элементы одного массива располагаются на одной строчке, а элементы другого массива – на другой.
        //
        //Запятая между последним элементом одного массива и первым элементом следующего не нужна.
        //
        //Если во втором задании в консоль у вас вывелся результат
        for (int i = arrayOne.length-1; i >=0; i--) {
            System.out.print(arrayOne[i] + " ,");
        }
        System.out.println();
        for (int i = arrayTwo.length-1; i >=0; i--) {
            System.out.print(arrayTwo[i] + " ,");
        }
        System.out.println();
        for (int i = arrayThree.length-1; i >=0; i--) {
            System.out.print(arrayThree[i] + " ,");
        }
        System.out.println();

        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1).
        //
        //Важно: код должен работать с любым целочисленным массивом, поэтому для решения задания вам нужно использовать циклы.
        //
        //Распечатайте результат преобразования в консоль.
        int n =2;
        for (int i = 0; i < arrayOne.length; i++){
            if (arrayOne[i] % 2==0){
                n = i + 1;
            }
            System.out.println(n);
        }
    }
}
