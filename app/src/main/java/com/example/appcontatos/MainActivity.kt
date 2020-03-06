package com.example.appcontatos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var email = "root"
        var senha = "root"

        btn_acesso.setOnClickListener{
            if (name.text.toString().equals(email) && password.text.toString().equals(senha)){
                var intent = Intent(this, Home::class.java)
                startActivity(intent)
                Toast.makeText(this,
                    "Bem vindo!",
                    Toast.LENGTH_LONG).show()
            }
            else{
                Toast.makeText(this,
                    "Senha ou email incorretos",
                    Toast.LENGTH_LONG).show()
            }

        }
    }
}
