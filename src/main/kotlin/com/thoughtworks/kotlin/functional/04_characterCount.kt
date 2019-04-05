package com.thoughtworks.kotlin.functional

fun main(args: Array<String>) {
    val names = listOf("Alice", "Bob", "Harry", "Carol")
    println(names
            .map { it.toLowerCase() }
            .reduce { acc, s -> "$acc$s" }
            .toCharArray()
            .groupBy { it }
            .map { (char, charList) -> Pair(char, charList.size) }
    )
}