package com.alua.desenvolvimento.meu_ru.ui.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.cardview.widget.CardView
import com.alua.desenvolvimento.meu_ru.R
import com.alua.desenvolvimento.meu_ru.ui.auth.LoginActivity
import com.alua.desenvolvimento.meu_ru.ui.utils.DeclaracaoQRcode
import com.alua.desenvolvimento.meu_ru.services.cardapios.DiasCardapioActivity
import com.alua.desenvolvimento.meu_ru.ui.utils.FichasRefeicaoActivity
import com.alua.desenvolvimento.meu_ru.ui.utils.SobreActivity
import com.google.firebase.auth.FirebaseAuth

class MenuActivity : AppCompatActivity() {

    private var mAuth: FirebaseAuth? = null
    private val sb: StringBuilder = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        navigateActivitiesMenu()
        deslogar()
    }

    private fun deslogar(){
        val btnLogout = findViewById<Button>(R.id.btn_sair)
        btnLogout.setOnClickListener {
            FirebaseAuth.getInstance().signOut()
            val voltarTelaLogin = Intent(this, LoginActivity::class.java)
            startActivity(voltarTelaLogin)
            finish()
        }
    }

    private fun navigateActivitiesMenu() {
        val btnFichas = findViewById<CardView>(R.id.crdFichas)
        val btnCardapio = findViewById<CardView>(R.id.crdCardapio)
        val btnDeclaracao = findViewById<CardView>(R.id.crdDeclaracao)
        val btnSobre = findViewById<CardView>(R.id.crdSobre)

        btnFichas.setOnClickListener {
            val intent = Intent(this, FichasRefeicaoActivity::class.java)
            startActivity(intent)
        }

        btnCardapio.setOnClickListener {
            val intent = Intent(this, DiasCardapioActivity::class.java)
            startActivity(intent)
        }

        btnDeclaracao.setOnClickListener {
            val intent = Intent(this, DeclaracaoQRcode::class.java)
            startActivity(intent)
        }

        btnSobre.setOnClickListener {
            val intent = Intent(this, SobreActivity::class.java)
            startActivity(intent)
        }
    }

}