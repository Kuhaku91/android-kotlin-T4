package Hariyanto.Alif.com.tugas4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_display_data.*

class DisplayDataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_data)

        var paket: Bundle? = intent.extras
        var username=(paket?.getString("nama"))
        var email=(paket?.getString("email"))
        var password=(paket?.getString("password"))
        var alamat=(paket?.getString("alamat"))
        var no_telp=(paket?.getString("kelas"))
        var no_ktp=(paket?.getString("nim"))

        if( tvNama!= null){
            tvNama.text = tvNama
        }
        if( email!= null){
            Email.text = email
        }
        if( password!= null){
            Password.text = password
        }
        if( alamat!= null){
            Alamat.text = alamat
        }
        if( tvKelas!= null){
            tvKelas.text = tvKelas
        }
        if( tvNIM!= null){
            tvNIM.text = tvNIM
        }
    }
}
