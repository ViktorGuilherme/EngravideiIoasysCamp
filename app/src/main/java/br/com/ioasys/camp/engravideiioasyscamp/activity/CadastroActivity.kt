package br.com.ioasys.camp.engravideiioasyscamp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ioasys.camp.engravideiioasyscamp.R
import br.com.ioasys.camp.engravideiioasyscamp.viewmodel.UserRegister
import br.com.ioasys.camp.engravideiioasyscamp.viewmodel.ViewModelRegistro
import kotlinx.android.synthetic.main.activity_cadastro.*
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

        buttonCadastro.setOnClickListener{

            val registroUsuario = UserRegister(
                campoEmail.text.toString(),
                campoSenha.text.toString(),
                campoDataNascimento.text.toString(),
                campoNome.text.toString(),
                campoParto.text.toString()
            )
            val registroModel = ViewModelRegistro()
            val proxTela:Boolean = registroModel.registerUser(registroUsuario)

            if (proxTela){
                val intent = Intent(
                    this,
                    HomeActivity::class.java)

                startActivity(intent)
            }
            else{

            }

            }
        }
    }

