package com.example.davaleba5

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    //private lateinit var checkBox: CheckBox
    private val recyclerView: RecyclerView
            by lazy { findViewById(R.id.recyclerview) }
    private val productsAdapter by lazy { ProductsAdapter(layoutInflater) }
    //private lateinit var button: Button
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //checkBox=findViewById(R.id.check)
//        button=findViewById(R.id.addButton)
//        checkButton(checkBox)
        val db=ProductDBHelper(this)
//        db.insert("პური",0.80f)
//        db.insert("კარაქი",2.10f)
//        db.insert("კვერცხი",0.30f)
//        db.insert("შაქარი",1.40f)
//        db.insert("მარილი",1.00f)
//        db.insert("რძე",2.00f)
//        db.insert("ხორცი",10.00f)
//        db.insert("ზეთი",2.00f)
//        db.insert("ბრინჯი",1.00f)
//        db.insert("Fanta",1.40f)
//        db.insert("კოკა კოლა",1.80f)
//        db.insert("ლიმონათი",1.50f)
//        db.insert("წყალი",2.00f)
//        db.insert("ვაშლი",3.00f)
//        db.insert("მსხალი",3.00f)
//        db.insert("ატამი",3.00f)
//        db.insert("ფორთოხალი",2.00f)
//        db.insert("კივი",3.00f)
//        db.insert("ყურძენი",3.00f)
//        db.insert("ანანასი",4.00f)
//        db.insert("ალუბალი",3.00f)
//        db.insert("საზამთრო",0.40f)
//        db.insert("ნესვი",0.90f)
//        db.insert("კარტოფილი",1.00f)
//        db.insert("კიტრი",0.90f)
//        db.insert("პამიდორი",2.00f)
//        db.insert("სტაფილო",1.40f)
        //db.select(0)
        //db.deleteAll()

        recyclerView.adapter = productsAdapter
        recyclerView.layoutManager = LinearLayoutManager(this,
            LinearLayoutManager.VERTICAL, false)
        productsAdapter.setData(listOf(
            Product(1,"პური",0.80f),
            Product(2,"კარაქი",2.10f),
            Product(3,"კვერცხი",0.30f),
            Product(4,"შაქარი",1.40f),
            Product(5,"მარილი",1.00f),
            Product(6,"რძე",2.00f),
            Product(7,"საქონლის ხორცი",10.00f),
            Product(8,"ზეთი",2.00f),
            Product(9,"ბრინჯი",1.00f),
            Product(10,"ფანტა",1.40f),
            Product(11,"კოკა კოლა",1.80f),
            Product(12,"ლიმონათი",1.50f),
            Product(13,"წყალი",2.00f),
            Product(14,"ვაშლი",3.00f),
            Product(15,"მსხალი",3.00f),
            Product(16,"ატამი",3.00f),
            Product(17,"ფორთოხალი",2.00f),
            Product(18,"კივი",3.00f),
            Product(19,"ყურძენი",3.00f),
            Product(20,"ანანასი",4.00f),
            Product(21,"ალუბალი",3.00f),
            Product(22,"საზამთრო",0.40f),
            Product(23,"ნესვი",0.90f),
            Product(24,"კარტოფილი",1.00f),
            Product(25,"კიტრი",0.90f),
            Product(26,"პამიდორი",2.00f),
            Product(27,"სტაფილო",1.40f),
            Product(28,"კომბოსტო",0.40f),
            Product(29,"ჭარხალი",2.00f),
            Product(30,"ბოლოკი",1.00f),
            Product(31,"ხახვი",1.00f),
            Product(32,"ბადრიჯანი",1.40f),
            Product(33,"ნიორი",1.00f),
            Product(34,"წიწაკა",0.10f),
            Product(35,"მწვანილი",0.10f),
            Product(36,"მაიონეზი",2.30f),
            Product(37,"კეტჩუპი",1.80f),
            Product(38,"ტყემალი",2.00f),
            Product(39,"ყველი",8.00f),
            Product(40,"ქათამი",10.00f),
            Product(41,"თევზი",6.00f),
            Product(42,"ღორის ხორცი",20.00f),
            Product(43,"ცხვრის ხორცი",30.00f),
            Product(44,"კუპატი",15.00f),
            Product(45,"ნეკნები",25.00f),
            Product(46,"ძეხვი(სერვილადი)",1.80f),
            Product(47,"ფარში(ნარევი)",10.00f),
            Product(48,"ფარში(საქონლის)",4.00f),
            Product(49,"შაშხი",9.00f),
            Product(50,"სოსისი",6.00f),
            Product(51,"სარდელი",8.00f),
            Product(52,"ღვინო",5.00f),
            Product(53,"ძეხვი(მონადირეული)",7.00f),
            Product(54,"ძეხვი(სერვილადი)",1.80f),
            Product(55,"ფეიხოა",1.40f),
            Product(56,"მანგო",2.00f),
            Product(57,"ბროწეული",4.00f),
            Product(58,"მანდარინი",1.40f),
            Product(59,"გრეიფრუტი",2.00f),
            Product(60,"ბანანი",0.20f),
            Product(61,"ქლიავი",2.00f),
            Product(62,"ლიმონი",0.30f),
            Product(63,"ლაიმი",0.30f),
            Product(64,"მაწონი",1.00f),
            Product(65,"ყავა",1.00f),
            Product(66,"მაკარონი",2.30f),
            Product(67,"ფქვილი",1.00f),
            Product(68,"ვანილი",0.30f),
            Product(69,"პილპილი",1.00f),
            Product(70,"ლობიო",10.00f),
            Product(71,"სუნელები",0.10f),
            Product(72,"ტარხუნა",0.40f),
            Product(73,"ლუდი",1.80f),
            Product(74,"თაფლი",10.00f),
            Product(75,"პილმენი",10.00f),
            Product(76,"ხინკალი",4.00f)
        ))
    }
//    private fun checkButton(view: View){
//        button.setOnClickListener {
//            if(view is CheckBox){
//                when(view.id){
//                    R.id.check->{
//                        if(view.isChecked){
//                            Toast.makeText(this,"პროდუქტი დაემატა კალათში", Toast.LENGTH_SHORT).show()
//                        }
//                        else Toast.makeText(this,"არცერთი პროდუქტი არ არის მონიშნული", Toast.LENGTH_SHORT).show()
//                    }
//                }
//            }
//        }
//    }
}