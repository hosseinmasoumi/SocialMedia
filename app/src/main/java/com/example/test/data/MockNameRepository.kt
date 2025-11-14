package com.example.test.data

import kotlin.random.Random

class MockNameRepository {
    private val names = listOf(
        "Ilaria",
        "Blakley",
        "Boone",
        "Natali",
        "Katharina",
        "Jerry",
        "Shaurya",
        "Kenzlie",
        "Janel",
        "Gwenevere",
        "Lotus",
        "Jakoby",
        "Yoel",
        "Nyomi",
        "Zyion",
        "Anagha",
        "Gautham",
        "Honey",
        "Sanya",
        "Kelis",
        "Alexandre",
        "Paizley",
        "Lourdes",
        "Augustine",
        "Taha",
        "Avram",
        "Alaric",
        "Alexis",
        "Javion",
        "Blayke",
        "Yulian",
        "Braeden",
        "Marlen",
        "Mikayla",
        "Sami",
        "Rhylee",
        "Sayler",
        "Arnold",
        "Robinson",
        "Karisma",
        "Treyton",
        "Harley",
        "Wyland",
        "Mark",
        "Henri",
        "Luke",
        "Leidy",
        "Cree",
        "Wilfredo",
        "Dallin"
    )

    fun getRandomName(): String {
        return names[Random.nextInt(0, 49)]
    }
}