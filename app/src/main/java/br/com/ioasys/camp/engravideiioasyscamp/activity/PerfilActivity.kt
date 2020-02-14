package br.com.ioasys.camp.engravideiioasyscamp.activity

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ioasys.camp.engravideiioasyscamp.R
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_perfil.*

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Perfil"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onStart() {
        super.onStart()

        val prefs = getSharedPreferences("REGIST", Context.MODE_PRIVATE)
        val nome = prefs.getString("NOME", "")
        val email = prefs.getString("EMAIL", "")
        val dataNasc = prefs.getString("DATANASC","")
        val dataParto = prefs.getString("DATAPARTO","")


        campoNome.text = nome
        campoDataNascimento.text = dataNasc
        campoParto.text = dataParto
        campoEmail.text = email

    }
}
