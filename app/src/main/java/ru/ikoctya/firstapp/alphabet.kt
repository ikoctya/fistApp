package ru.ikoctya.firstapp

// Вывод четных букв циклом
fun alfabet() {
    for (bukva in 'b'..'z' step 2) {
        println(bukva)
    }
}

// Вывод четных букв из коллекции
fun alfabet2() {
    val bukvy = ('a'..'z').toList()
    print(bukvy.slice(1..25 step 2))
}
