
package br.com.ioasys.camp.engravideiioasyscamp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ioasys.camp.engravideiioasyscamp.R
import br.com.ioasys.camp.engravideiioasyscamp.viewmodel.ViewModelLogin
import kotlinx.android.synthetic.main.activity_inicio.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Login"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

    override fun onStart() {
        super.onStart()

        buttonLogin.setOnClickListener{

            val vmlogin = ViewModelLogin()

            if (vmlogin.getLogin()){
                val intent = Intent(
                    this,
                    HomeActivity::class.java)

                startActivity(intent)
            }
            else{
                //Colocar balão de erro
            }

        }

    }
}
