package com.thoughtworks.kotlin.functional

fun main(args: Array<String>) {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)
    println(numbers.map { number -> number * number })

//    println(numbers
//            .map { it.toString() }
//            .map { it * it }
//            .fold(0) { acc, s -> acc + s.length })
//            .reduce { acc:Int, number:Int -> acc + number })
}