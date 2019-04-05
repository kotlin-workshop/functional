package com.thoughtworks.kotlin.functional

fun main(args: Array<String>) {
    val numbers: List<Int> = listOf(1, 2, 3, 4, 5)

    println(numbers.map { it * it }
            .filter { it % 2 == 0 }
            .sum())
}