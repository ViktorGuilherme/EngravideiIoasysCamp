package br.com.ioasys.camp.engravideiioasyscamp.viewmodel

import android.util.Log
import br.com.ioasys.camp.engravideiioasyscamp.model.Service
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ViewModelRegistro {

    fun registerUser(novoRegistro: UserRegister): Boolean{

        var boleanoDeRegistro: Boolean = true

        Service.retrofit.registerUserApp(novoRegistro)
            .enqueue(object: Callback<RegisterResponse> {
                override fun onFailure(call: Call<RegisterResponse>, t: Throwable) {
                }

                override fun onResponse(call: Call<RegisterResponse>, response: Response<RegisterResponse>) {
                    boleanoDeRegistro = true
                }
            })
        return boleanoDeRegistro
    }
}