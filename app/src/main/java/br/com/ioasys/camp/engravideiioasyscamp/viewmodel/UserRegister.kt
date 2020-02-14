package br.com.ioasys.camp.engravideiioasyscamp.viewmodel

import java.io.Serializable

data class UserRegister(
    val email: String,
    val password: String,
    val birth_date: String,
    val name: String,
    val parturition_preview: String
) : Serializable