fun main(args: Array<String>) {
    val exercises: Int = 13
    var exercisesSolved: Int = 0
    exercisesSolved ++
    println(exercisesSolved)
    //создание константы "упражнения" и переменной "решено упражнений" l для подсчета решенных заданий, решение 1-го упр

    val myAge: Int = 18
    exercisesSolved ++
    println(myAge)
    //создание константы "мой возраст", решение 2-го упр

    var averageOfAges: Double = 18.0
    averageOfAges = (averageOfAges + 30) / 2
    exercisesSolved ++
    println(averageOfAges)
    /*создание переменной "среднее от возрастов", присвоили ей наш возраст в качестве начального значения,  
    меняем значение переменной на среднее арифметическое нашего возраста и возраста 30 летнего человека, решение 3-го упр*/                     

    val testNumber: Int = 3
    val evenOdd: Int = testNumber % 2
    exercisesSolved ++
    println(evenOdd)
    /*создание констаны "testNumber", присвоили ей любое число, создаем другую константу под названием "evenOdd", 
    значением которой будет остаток от деления testNumber на 2. Теперь меняем testNumber любое другое число.
    Нас спрашивают "Что случилось с evenOdd?", evenOdd покажет остаток от деления числа на 2, которое хранит testNumber, решение 4-го упр*/

    var answer: Int = 0
    answer = (((answer + 1) + 10) * 10 ) shr 3
    exercisesSolved ++
    println(answer)
    /* создание переменной "answer" со значением 0.Увеличили ее значение на 1, добавили к результату 10,
     умножили полученное число на 10 и сделали смещение вправо на 3.
     решение 5-го упр*/

    var age: Int
    age = 16
    println(age)
    age = 30
    println(age)
    exercisesSolved ++
     /* Объявиляем "age". По условию нам нужно выбрать переменная будет это или константа.
    Выбираем переменную, так как "age" изменяет свое значение далее в условии.
    решение 6-го упр */


    val a: Int = 46
    val b: Int = 10
    val answer1 : Int = (a1 * 100) + b1
    val answer2 : Int = (a1 * 100) + (b1 * 100)
    val answer3 : Int = (a1 * 100) + (b1 / 100)
    exercisesSolved ++
    // варианты решений - 4610, 5600, 4601; решение 7-го упр

    println((5 * 3) - (4 / 2) * 2)
    exercisesSolved ++
     /*нас просят добавить скобки , сохраняя порядок осуществляемых операций.
    решение 8-го упр */

    val a1: Double = 23.0
    val b1: Double = 86.0
    val average: Double = (a1 + b1) / 2
    println(average)
    exercisesSolved ++
     /*Объявили две константы а и b типа Double и присвоили им значения.
    Вычислили среднее арифметическое чисел и поместили
    результат в константу "average". решение 9-го упр*/

    val fahrenhei: Double = 64.0
    val celcius: Double = (fahrenhei - 32) / 1.8
    println(celcius)
    exercisesSolved ++
    /*Нас просят конвертировать температуру из °F в °С. Объявили константу "fahrenheit" типа Double и присвоили ей значение.
    Вычислили температуру в °С и поместили результат в константу "celcius".
    решение 10-го упр*/

    val position: Int = 37
    val rowrow: Int = position
    val column: Int = position
    println()
    println()
    // решение 11-го упр
    
    val degrees : Double = 60.0
    val radians : Double = degrees * Math.PI / 180
    exercisesSolved++
     /* Объявили константу "degrees" типа Double и присвоили ей начальное значение.
     Вычислили угол в радианах и сохранили результат в константе "radians".
     решение 12-го упр*/

}

