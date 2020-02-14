package br.com.ioasys.camp.engravideiioasyscamp.viewmodel

import android.util.Log
import br.com.ioasys.camp.engravideiioasyscamp.activity.LoginActivity
import br.com.ioasys.camp.engravideiioasyscamp.model.Service
import kotlinx.android.synthetic.main.activity_login.*
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ViewModelLogin {


    fun getLogin():Boolean{

        val act = LoginActivity()
        val email:String = act.campoEmail.text.toString()
        val senha:String = act.campoSenha.text.toString()
        var testeLogin:Boolean = false

        Service.retrofit.loginUser(email , senha).enqueue(object: Callback<UserResponse> {
            override fun onFailure(call: Call<UserResponse>, t: Throwable) {
            }

            override fun onResponse(call: Call<UserResponse>, response: Response<UserResponse>) {
                testeLogin = true
            }

        })
        return testeLogin
    }

}

