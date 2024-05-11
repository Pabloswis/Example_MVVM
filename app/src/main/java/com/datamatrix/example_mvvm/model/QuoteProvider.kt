package com.datamatrix.example_mvvm.model

class QuoteProvider {
    companion object {

        fun random(): QuoteModel {
            val position: Int = (0..10).random()
            return quote[position]
        }

        private val quote = listOf<QuoteModel>(
            QuoteModel(
                "La vida es lo que pasa mientras estás ocupado haciendo otros planes.",
                "John Lennon"
            ),
            QuoteModel("No importa lo lento que vayas mientras no te detengas.", "Confucio"),
            QuoteModel(
                "La única manera de hacer un gran trabajo es amar lo que haces.",
                "Steve Jobs"
            ),
            QuoteModel(
                "La vida es 10% lo que te sucede y 90% cómo reaccionas ante ello.",
                "Charles R. Swindoll"
            ),
            QuoteModel(
                "El éxito es ir de fracaso en fracaso sin perder el entusiasmo.",
                "Winston Churchill"
            ),
            QuoteModel(
                "La única forma de hacer un trabajo excelente es amar lo que haces.",
                "Steve Jobs"
            ),
            QuoteModel("La vida es una flor, el amor es la miel.", "Victor Hugo"),
            QuoteModel(
                "La vida es lo que sucede cuando estás ocupado haciendo otros planes.",
                "John Lennon"
            ),
            QuoteModel(
                "La vida no es esperar a que pase la tormenta, sino aprender a bailar bajo la lluvia.",
                "Vivian Greene"
            ),
            QuoteModel(
                "El único modo de hacer un gran trabajo es amar lo que haces.",
                "Steve Jobs"
            ),
            QuoteModel(
                "La vida es un 10% lo que me sucede y un 90% cómo reacciono ante ello.",
                "Charles R. Swindoll"
            ),
            QuoteModel(
                "El éxito no es definitivo, el fracaso no es fatal: es el coraje para continuar lo que cuenta.",
                "Winston Churchill"
            ),
            QuoteModel(
                "La vida es demasiado importante como para tomarla en serio.",
                "Oscar Wilde"
            ),
            QuoteModel(
                "No esperes por el momento perfecto, toma el momento y hazlo perfecto.",
                "Zoey Sayward"
            ),
            QuoteModel("No dejes que tus sueños sean sueños.", "Jack Johnson")
        )
    }

}
