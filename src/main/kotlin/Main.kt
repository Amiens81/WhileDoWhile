package org.example
fun main() {
    //todo Первая задача. Первый вариант
    println("Первая задача")
    println("Введите число")
    var number = readLine()!!.toInt() // Число, факториалом которого нужно найти
    var numberToIterate = number // Создаём переменную для использования её в качестве итератора
    var factorial = 1 // Повторяем цикл while до тех пор, пока он не достигнет 0
    while (numberToIterate > 0) {
        factorial *= numberToIterate
        numberToIterate--
    }
    println("Первый вариант. Факториал числа $number равен $factorial")
    //todo ервая задача Второй вариант через рекурсию
    println("Введите ваше число: ")
    val num = readLine()!!.toInt()
    fun factorial(num: Int): Int {
        do{
            return  if (num <= 1) { 1 } else { num * factorial(num - 1) }
        } while (num > 1)
    }
    val result = factorial(num)
    println("Второй вариант. Факториал числа $num  равен $result")
    //todo Вторая задача
    println("Вторая задача")
    println("Введите цену за килограмм конфет")
    val price = readLine()!!.toInt()
    var weight = 1
    while (weight <= 10){
        var cost = price *  weight
        println("Стоимость $weight КГ конфет $cost ")
        weight++
    }
    //todo Третья задача
    println("Третья задача")
    println("Введите первое число")
    val A = readLine()!!.toInt()
    println("Введите трое число, которое должно быть больше первого")
    val B = readLine()!!.toInt()
    var x = A
    var count = 0
    while(x in A .. B){
        println(x++)
        count++
    }
    println("от числа $A до числа $B включая их самих $count чисел ")

    //todo Четвёртая задача
    println("Четвёртая задача")
    println("Введите целое число N (> 0). Число должно быть больше нуля!:")
    var N  = readLine()!!.toInt()
    while (N > 0) {
        val digit = N % 10 // Получаем последнюю цифру
        println(digit) // Выводим цифру
        N /= 10 // Убираем последнюю цифру
    }
    println("Пятая задача")
    var i = 1
    while(i++ <= 20) {
        // Прекращаем выполнение, если число равно 19
        if (i == 19) {
            break
        }
        // Пропускаем нечетные числа
        if (i % 2 != 0) {
            continue
        }
        // Если число делится на 4, умножаем его на 2
        if (i % 4 == 0) {
            println(i * 2)
        } else {
            println(i)
        }
    }

    //todo  Шестая задача
    println("Шестая задача")
    var initialDeposit = 350.0//  сумма вклада
    val interestRate = 0.07 //процентная ставка
    var months = 9 // количество месяцев
    var currentMonth = 0 // месяц начала отсчёта

    while (currentMonth < months) {
        initialDeposit += initialDeposit * interestRate // начисление процентов
        currentMonth++
    }
    println("Конечная сумма вклада: %.2f".format(initialDeposit))
}