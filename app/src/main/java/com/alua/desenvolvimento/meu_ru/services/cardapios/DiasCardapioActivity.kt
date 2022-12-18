package com.alua.desenvolvimento.meu_ru.services.cardapios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.cardview.widget.CardView
import com.alua.desenvolvimento.meu_ru.R

class DiasCardapioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dias_semana)

        // set Arrow Back to Menu
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setHomeAsUpIndicator(R.drawable.arrow_back)

        chamaActivities()

    }

    private fun chamaActivities() {
        //chamando funções cardapio
        openSegundaFeira()
        openTercaFeira()
        openQuartaFeira()
        openQuintaFeira()
        openSextaFeira()
        openSabado()
    }

    private fun openSegundaFeira() {
        val segundaFeira = findViewById<CardView>(R.id.card_segunda_feira)
        segundaFeira.setOnClickListener {
            val intent = Intent(this, SegundaFeiraActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openTercaFeira() {
        val tercaFeira = findViewById<CardView>(R.id.card_terca_feira)
        tercaFeira.setOnClickListener {
            val intent = Intent(this, TercaFeiraActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openQuartaFeira() {
        val quartaFeira = findViewById<CardView>(R.id.card_quarta_feira)
        quartaFeira.setOnClickListener {
            val intent = Intent(this, QuartaFeiraActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openQuintaFeira() {
        val quintaFeira = findViewById<CardView>(R.id.card_quinta_feira)
        quintaFeira.setOnClickListener {
            val intent = Intent(this, QuintaFeiraActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openSextaFeira() {
        val sextaFeira = findViewById<CardView>(R.id.card_sexta_feira)
        sextaFeira.setOnClickListener {
            val intent = Intent(this, SextaFeiraActivity::class.java)
            startActivity(intent)
        }
    }

    private fun openSabado() {
        val sabado = findViewById<CardView>(R.id.card_sabado)
        sabado.setOnClickListener {
            val intent = Intent(this, SabadoActivity::class.java)
            startActivity(intent)
        }
    }
}