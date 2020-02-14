
package br.com.ioasys.camp.engravideiioasyscamp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ioasys.camp.engravideiioasyscamp.R
import br.com.ioasys.camp.engravideiioasyscamp.model.Service
import br.com.ioasys.camp.engravideiioasyscamp.viewmodel.UserResponse
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_inicio.*
import kotlinx.android.synthetic.main.activity_inicio.buttonLogin
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

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
            val intent = Intent(
                this,
                HomeActivity::class.java)

            getLogin(intent)
        }

    }

    fun getLogin(intent: Intent){
        Service.retrofit.loginUser(campoEmail.text.toString() , campoSenha.text.toString())
            .enqueue(object: Callback<UserResponse> {
                override fun onFailure(call: Call<UserResponse>, t: Throwable) {
                }

                override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                    startActivity(intent)
                }

            })
    }


}
