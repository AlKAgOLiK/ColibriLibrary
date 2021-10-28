# ColibriLibrary
Бібліотека містить вирішення проблем, що найчастіше виникають у початківців, що вивчають Java. усі проблеми що розміщені тут взяті із https://www.cyberforum.ru/java-beginners/ 
Бібліотека постійно поповнюється.

поточна версія 1.0.0.0

бібліотека містить:
    Пакети: 
        cMath - пакет для математичних задач
        
    Класи пакету cMath:
        public class PrimeNumber - Клас визначає чи є число простим, чи складним
            public boolean thisPrimeNamber(int nam); // метод визначення простого числа
            public boolean thisСomplexNamber(int nam);//метод визначення складного числа
        public class Factorize - клас розкладу числа на множники
            public static ArrayList<Integer> factorize(int nam); //метод розкладу числа на простi множники
            public static int[] getFactorizeArray(int nam); //метод розкладу числа на просты множники
            public static void printFactorize(int nam); //метод виведення в консоль 
            private static String toString(int copy, ArrayList<Integer> mn); //Метод створює строку формату: число = множник1 * множник2 * ... * множникn
