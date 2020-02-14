package br.com.ioasys.camp.engravideiioasyscamp.viewmodel

import java.io.Serializable

data class UserResponse(
    val birth_date: String,
    val createdAt: String,
    val email: String,
    val fk_id_doctor: Int,
    val id_user: Int,
    val name: String,
    val parturition_preview: String,
    val updatedAt: String
) : Serializable