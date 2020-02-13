package br.com.ioasys.camp.engravideiioasyscamp.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import br.com.ioasys.camp.engravideiioasyscamp.R

class VacinasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vacinas)

        setSupportActionBar(findViewById(R.id.toolbar))
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Vacinas"
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}
