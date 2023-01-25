package com.example.davaleba5
import android.content.ContentValues
import android.database.sqlite.SQLiteDatabase
import android.content.Context
import android.database.sqlite.SQLiteOpenHelper
import android.annotation.SuppressLint
import android.util.Log
class ProductDBHelper(context: Context):SQLiteOpenHelper(context,DBconfig.DATABASE_NAME,null,DBconfig.VERSION) {
    companion object{
        private val SQL_CREATE_TABLE="CREATE TABLE PRODUCTS ("+"${PRODUCT_COLUMNS.ID} INTEGER PRIMARY KEY,"+
                "${PRODUCT_COLUMNS.PRODUCT_NAME} TEXT,"+"${PRODUCT_COLUMNS.PRICE} REAL)"
        private val SQL_DELETE_TABLE="DROP TABLE IF EXISTS PRODUCTS"
    }
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(SQL_CREATE_TABLE)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(SQL_DELETE_TABLE)
        onCreate(db)
    }
    fun insert(productName:String,price:Float){
        val value= ContentValues().apply {
            put(PRODUCT_COLUMNS.PRODUCT_NAME,productName)
            put(PRODUCT_COLUMNS.PRICE,price)
        }
        writableDatabase.insert("PRODUCTS",null,value)
    }
    fun updateProductName(productId:Int,productName:String){
        val cv=ContentValues().apply {
            put(PRODUCT_COLUMNS.PRODUCT_NAME,productName)
        }
        val where="${PRODUCT_COLUMNS.ID}=?"
        val whereArgs= arrayOf(productId.toString())
        writableDatabase.update("PRODUCTS",cv,where,whereArgs)
    }
    fun deleteProduct(productId: Int){
        val where="${PRODUCT_COLUMNS.ID}=?"
        val whereArgs= arrayOf(productId.toString())
        writableDatabase.delete("PRODUCTS",where,whereArgs)
    }
    fun deleteAll(){
        writableDatabase.delete("PRODUCTS",null,null)
    }
    @SuppressLint("Range")
    fun select(id: Int){
        val projection= arrayOf(PRODUCT_COLUMNS.PRODUCT_NAME,PRODUCT_COLUMNS.PRICE,PRODUCT_COLUMNS.ID)
        val where="${PRODUCT_COLUMNS.ID}>=?"
        val whereArgs= arrayOf(id.toString())
        val ordering="${PRODUCT_COLUMNS.ID} ASC"
        val cursor=readableDatabase.query("PRODUCTS",projection,where,whereArgs,null,null,ordering)
        while(cursor.moveToNext()){
            val name=cursor.getString(cursor.getColumnIndex(PRODUCT_COLUMNS.PRODUCT_NAME))
            val price=cursor.getString(cursor.getColumnIndex(PRODUCT_COLUMNS.PRICE))
            val id=cursor.getString(cursor.getColumnIndex(PRODUCT_COLUMNS.ID))
            Log.d("MyProducts","${name}-${price}-${id}")
        }
    }
}