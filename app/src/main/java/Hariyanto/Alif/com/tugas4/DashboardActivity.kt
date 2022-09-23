package Hariyanto.Alif.com.tugas4


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var auth : FirebaseAuth
    var currentUser : FirebaseUser? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        btnProfil.setOnClickListener(this)
        btnInputData.setOnClickListener(this)
        btnLogOut.setOnClickListener(this)

        auth = Firebase.auth
    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.btnProfil -> {
                var paket: Bundle? = intent.extras
                var nama=(paket?.getString("nama"))
                var email=(paket?.getString("email"))
                var password=(paket?.getString("password"))
                var alamat=(paket?.getString("alamat"))
                var kelas=(paket?.getString("kelas"))
                var nim=(paket?.getString("nim"))
                Intent(this, DisplayDataActivity::class.java).also {
                    it.putExtra("email", email)
                    it.putExtra("password", password)
                    it.putExtra("nama", nama)
                    it.putExtra("alamat", alamat)
                    it.putExtra("kelas", kelas)
                    it.putExtra("nim", nim)
                    startActivity(it)
                }
            }
            R.id.btnLogOut -> {
                auth.signOut()
                finish()
            }
            R.id.btnInputData -> {
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
        }
    }
}