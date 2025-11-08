package com.example.test.data

import kotlin.random.Random

class MockNameRepository {
    private val names=listOf(

        "Haven Rogers\n" +
                "Colton Foster\n" +
                "Brielle Ortiz\n" +
                "Landon Bender\n" +
                "Lilyana Clay\n" +
                "Yosef Enriquez\n" +
                "Nellie Hardy\n" +
                "Jayceon Perkins\n" +
                "Sage Carrillo\n" +
                "Wade Hampton\n" +
                "Leona Gutierrez\n" +
                "Luca Chambers\n" +
                "Makayla Frank\n" +
                "Braylen Jarvis\n" +
                "Elisabeth Nunez\n" +
                "Caden Blair\n" +
                "Frances Fry\n" +
                "Jacoby Knight\n" +
                "Gracie Gregory\n" +
                "Travis Bond\n" +
                "Alena O’Donnell\n" +
                "Lian Norris\n" +
                "Arielle Howell\n" +
                "Bradley Weeks\n" +
                "Karen Person\n" +
                "Moses Lawrence\n" +
                "Lauren Macdonald\n" +
                "Hugh Estrada\n" +
                "Sawyer Beck\n" +
                "Eduardo Escobar\n" +
                "Erin Espinosa\n" +
                "Khalid Webster\n" +
                "Kensley Kelly\n" +
                "Cooper Cook\n" +
                "Aaliyah McDaniel\n" +
                "Major Patrick\n" +
                "Lyra Baldwin\n" +
                "Jaiden Valenzuela\n" +
                "Henley Camacho\n" +
                "Tatum Rice"
    )
    fun getRandomName(): String{
        return names[Random.nextInt(0,20)]
    }
}