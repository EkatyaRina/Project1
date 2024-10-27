import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

    //Задание 1
    val exercises = 13
    var exercisesSolved = 13
    println()
    println("Всего завершено заданий - $exercisesSolved")

    //Задание 2
    val katyaAge = 17
    println("Задание 2; Мой возраст - $katyaAge")

    //Задание 3
    var katyaAge1 = 17.6
    katyaAge1 = (17.6 + 30)/2
    println("Задание 3; Среднеарифметический возраст = $katyaAge1")

    //Задание 4
    val testNumber = 7
    val evenOdd = testNumber % 2
    println("Задание 4; остаток от деления testNumber ($testNumber) на 2 = $evenOdd")

    //Задание 5
    var answer = 0
    answer += 1
    answer += 10
    answer *= 10
    answer = answer shr 3
    println("Задание 5; answer = $answer")

    //Задание 6
    var age = 16
    print("Задание 6; В ответе исп-ем var т.к. значение изменяется $age;")
    age = 30
    println(" $age ")

    //Задание 7
    val a: Int = 46
    val b: Int = 10
    //1
    val answer1: Int = (a * 100) + b
    //2
    val answer2: Int = (a * 100) + (b * 100)
    //3
    val answer3: Int = (a * 100) + (b / 10)
    println("Задание 7; answer1 = $answer1, answer2= $answer2, answer3 = $answer3")

    //Задание 8
    println("Задание 8; " + ((5 * 3) - (4/2 * 2)))

    //Задание 9
    val a9 = 23.9
    val b9 = .3
    val average = (a9 + b9) /2
    println("Задание 9; average = $average ")

    //Задание 10
    val fahrenheit = 76.5
    val celcius = (fahrenheit * 5/9) - 32
    println("Задание 10; celcius = $celcius ")

    //Задание 11
    val position = 61
    val row = position / 8
    val column = position % 8
    println("Задание 11; строка = $row, столбец = $column")

    //Задание 12
    val degrees = 65.1
    val radians = degrees / PI
    println("Задание 12; radians = $radians")

    //Задание 13
    val x1 = 2.8
    val x2 = 5.4
    val y1 = 3.0
    val y2 = 4.9
    val distance = sqrt((x2 - x1).pow(2) + (y2 - y1).pow(2))
    val formatedDistance = String.format("%.2f", distance)
    println("Задание 13; Расстояние между двумя точками на плоскости = $formatedDistance")
    println()
}