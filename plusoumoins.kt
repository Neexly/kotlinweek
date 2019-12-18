fun main(args: Array<String>) {
        val Nb = 0
        var try = 0
        println("Jeu du Plus ou Moins")
        println("Choissez un nombre entre 0 et 100")
        val Cible = Integer.valueOf(readLine())

        do {
            println("Entrez un nombre")
            val Nb = Integer.valueOf(readLine())

            if (Nb < Cible) {
                println("C'est plus")
                try++

            } else if (Nb > Cible) {
                println("C'est moins")
                try++

            } else {
                println("Vous avez trouver en $try essais")
            }

        } while (Nb != Cible)
    }