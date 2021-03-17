package edu.itesm.series

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Series(val foto: Int,
                 val titulo:String,
                 val anio:String,
                  val rank: String,
                 val resumen: String,
                  val oculto: String) : Parcelable