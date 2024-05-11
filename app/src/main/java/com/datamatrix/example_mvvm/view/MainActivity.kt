package com.datamatrix.example_mvvm.view

import android.os.Bundle // Importa la clase Bundle para manejar datos entre actividades
import androidx.activity.enableEdgeToEdge // Importa la función para habilitar el modo de pantalla completa
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity // Importa la clase base para las actividades de Android
import androidx.core.view.ViewCompat // Importa la clase ViewCompat para realizar operaciones con vistas
import androidx.core.view.WindowInsetsCompat // Importa la clase WindowInsetsCompat para trabajar con los bordes de la ventana
import androidx.lifecycle.Observer
import com.datamatrix.example_mvvm.databinding.ActivityMainBinding // Importa la clase generada automáticamente para la actividad
import com.datamatrix.example_mvvm.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val quoteViewModel: QuoteViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        quoteViewModel.quoteModel.observe(this, Observer {currentQuote ->
            binding.tvQuote.text = currentQuote.quote
            binding.tvAuthor.text = currentQuote.author
        })

        binding.viewContainer.setOnClickListener{
            quoteViewModel.randomQuote()
        }
    }
}
