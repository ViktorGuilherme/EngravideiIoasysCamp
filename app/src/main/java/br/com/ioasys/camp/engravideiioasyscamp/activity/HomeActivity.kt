package br.com.ioasys.camp.engravideiioasyscamp.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import br.com.ioasys.camp.engravideiioasyscamp.R
import br.com.ioasys.camp.engravideiioasyscamp.model.Service
import br.com.ioasys.camp.engravideiioasyscamp.viewmodel.UserResponse
import kotlinx.android.synthetic.main.activity_home.*
import kotlinx.android.synthetic.main.activity_inicio.*
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    override fun onStart() {
        super.onStart()
        getDadosLogin()

        btnCardVacinas.setOnClickListener{
            val intent = Intent(
                this,
                VacinasActivity::class.java)

            startActivity(intent)
        }

        btnCardCheck.setOnClickListener{
            val intent = Intent(
                this,
                ChecklistActivity::class.java)

            startActivity(intent)
        }

    }

    fun getDadosLogin(){
        Service.retrofit.loginUser(campoEmail.text.toString() , campoSenha.text.toString())
            .enqueue(object: Callback<UserResponse> {
            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
            }

            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                response.body()?.let {home ->
                    txtHomeNome.text = home.name
                    txtHomeData.text = home.birth_date
                }
            }

        })
    }
}
