package br.com.ioasys.camp.engravideiioasyscamp.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ioasys.camp.engravideiioasyscamp.R
import kotlinx.android.synthetic.main.activity_cadastro.*
import kotlinx.android.synthetic.main.activity_inicio.*
import kotlinx.android.synthetic.main.activity_inicio.buttonCadastro

class CadastroActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Cadastro"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onStart() {
        super.onStart()

        val prefs = this.getSharedPreferences("REGIST", Context.MODE_PRIVATE)

        buttonCadastro.setOnClickListener{

            val editor = prefs.edit()
            val nome = campoNome.text.toString()
            val email = campoEmail.text.toString()
            val dataNascimento = campoDataNascimento.text.toString()
            val dataParto = campoParto.text.toString()
            editor.putString("NOME", nome)
            editor.putString("DATANASC", dataNascimento)
            editor.putString("DATAPARTO", dataParto)
            editor.putString("EMAIL", email)
            editor.apply()

            val intent = Intent(
                this,
                HomeActivity::class.java)

            startActivity(intent)
        }

    }
}