package uz.ferganagroup.teztop.screen

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_sciences.*
import uz.ferganagroup.teztop.R
import uz.ferganagroup.teztop.model.QuizModel
import uz.ferganagroup.teztop.model.ScienceModel
import uz.ferganagroup.teztop.view.SciencesAdapter
import uz.ferganagroup.teztop.view.SciencesAdapterCallback

class SciencesActivity : AppCompatActivity() {
    val sciences = listOf(
        ScienceModel("Matematika", listOf(
            QuizModel("2 ning kvadrati nechi?", null, "2", "4", "8", "16", "B"),
            QuizModel("4 ning kvadrati nechi?", R.drawable.logo, "2", "4", "8", "16", "D"),
            QuizModel("3 ning kvadrati nechi?", null, "2", "4", "9", "16", "C"),
            QuizModel("2 ning kvadrati nechi?", null, "2", "4", "8", "16", "B"),
            QuizModel("2 ning kvadrati nechi?", R.drawable.logo, "2", "4", "8", "16", "B"),
            QuizModel("2 ning kvadrati nechi?", null, "2", "4", "8", "16", "B")
        )),
        ScienceModel("Ona tile", emptyList()),
        ScienceModel("Fizika", emptyList()),
        ScienceModel("Ingliz tili", emptyList())
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sciences)

        imgBack.setOnClickListener {
            finish()
        }


        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = SciencesAdapter(sciences, object: SciencesAdapterCallback{
            override fun onClick(item: ScienceModel) {
                val intent = Intent(this@SciencesActivity, QuizActivity::class.java)
                intent.putExtra("extra", item)
                startActivity(intent)
            }
        })
    }
}