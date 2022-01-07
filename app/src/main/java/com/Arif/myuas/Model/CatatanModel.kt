package com.Arif.myuas.Model

class CatatanModel (
    val dbmobil: List<Data>
) {
    data class Data (val nama:String?, val harga:Int, val warna:String?)
}