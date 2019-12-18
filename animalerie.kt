class Animalerie{

    var allAnimals = mutableListOf<Animaux>()
    fun affiche() {
        for (a in allAnimals) {
            a.quiSuisJe()
        }
    }

    fun add(wichOne : Animaux){
        allAnimals.add(wichOne)
    }
}

interface Animaux {
    fun quiSuisJe()

    fun parler()
}

class Chat : Animaux{

    override fun parler() {
        println("Miaou")
    }

    override fun quiSuisJe() {
        println("Je suis un chat")
    }
}

class Chien : Animaux{

    override fun parler() {
        println("Wouf")
    }

    override fun quiSuisJe() {
        println("Je suis un chien")
    }
}

class perroquet : Animaux{

    override fun parler() {
        println("Je suis Coco le coco")
    }

    override fun quiSuisJe() {
        println("Je suis un perroquet")
    }
}

fun main() {
    val Animalerie = Animalerie()
    Animalerie.add(Chien())
    Animalerie.add(Chat())
    Animalerie.add(perroquet())
    Animalerie.affiche()
}