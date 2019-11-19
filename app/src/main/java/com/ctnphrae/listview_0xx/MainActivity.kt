package com.ctnphrae.listview_0xx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val titleArr = arrayOf("Phrae","Nan","Lampang","Lamphon")
    val detailArr = arrayOf("จังหวัดแพร่ เป็นจังหวัดในภาคเหนือตอนบนของประเทศไทย อดีตนครรัฐอิสระขนาดเล็ก มีลักษณะภูมิประเทศเป็นที่ราบระหว่างภูเขา โดยมีทิวเขาล้อมรอบ และมีแม่น้ำสายสำคัญไหลผ่านคือแม่น้ำยม",
        "จังหวัดแพร่ เป็นจังหวัดในภาคเหนือตอนบนของประเทศไทย อดีตนครรัฐอิสระขนาดเล็ก มีลักษณะภูมิประเทศเป็นที่ราบระหว่างภูเขา โดยมีทิวเขาล้อมรอบ และมีแม่น้ำสายสำคัญไหลผ่านคือแม่น้ำยม2",
        "จังหวัดแพร่ เป็นจังหวัดในภาคเหนือตอนบนของประเทศไทย อดีตนครรัฐอิสระขนาดเล็ก มีลักษณะภูมิประเทศเป็นที่ราบระหว่างภูเขา โดยมีทิวเขาล้อมรอบ และมีแม่น้ำสายสำคัญไหลผ่านคือแม่น้ำยม3",
        "จังหวัดแพร่ เป็นจังหวัดในภาคเหนือตอนบนของประเทศไทย อดีตนครรัฐอิสระขนาดเล็ก มีลักษณะภูมิประเทศเป็นที่ราบระหว่างภูเขา โดยมีทิวเขาล้อมรอบ และมีแม่น้ำสายสำคัญไหลผ่านคือแม่น้ำยม4",
        "จังหวัดแพร่ เป็นจังหวัดในภาคเหนือตอนบนของประเทศไทย อดีตนครรัฐอิสระขนาดเล็ก มีลักษณะภูมิประเทศเป็นที่ราบระหว่างภูเขา โดยมีทิวเขาล้อมรอบ และมีแม่น้ำสายสำคัญไหลผ่านคือแม่น้ำย4")

    val context = this

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setTitle("ข้อมูลจังหวัด")
        val mAdapter = ArrayAdapter(context,
                                    android.R.layout.simple_list_item_1,
                                    titleArr)

        lv_province.adapter = mAdapter

        lv_province.setOnItemClickListener { parent, view, position, id ->

            Toast.makeText(context,
                "title = ${titleArr[position]} , detail = ${detailArr[position]}"
                ,Toast.LENGTH_LONG).show()
        }


    }
}
