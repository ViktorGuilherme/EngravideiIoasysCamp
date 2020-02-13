package br.com.ioasys.camp.engravideiioasyscamp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ioasys.camp.engravideiioasyscamp.R
import kotlinx.android.synthetic.main.activity_inicio.*


class InicioActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio)
    }

    override fun onStart() {
        super.onStart()

        buttonCadastro.setOnClickListener{
            val intent = Intent(
                this,
                CadastroActivity::class.java)

            startActivity(intent)
        }

        buttonLogin.setOnClickListener{
            val intent = Intent(
                this,
                LoginActivity::class.java)

            startActivity(intent)
        }

    }
}
