package edu.itesm.series

import android.app.PendingIntent.getActivity
import android.content.Context
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView

class SeriesAdapter(val context: Context, private val series : List<Series>)
    : RecyclerView.Adapter<SeriesAdapter.SeriesViewHolder>() {


    inner class SeriesViewHolder(renglon: View) : RecyclerView.ViewHolder(renglon){
        var titulo = renglon.findViewById<TextView>(R.id.nombre)
        var anio = renglon.findViewById<TextView>(R.id.anio)
        var resumen = renglon.findViewById<TextView>(R.id.resumen)
        var rank = renglon.findViewById<TextView>(R.id.rank)
        var foto = renglon.findViewById<ImageView>(R.id.foto)
    }

    fun Context.toast(message: CharSequence) =
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    //Crea el renglón
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val renglon_vista = inflater.inflate(R.layout.series_reglon,parent, false)
        return SeriesViewHolder(renglon_vista)
    }

    //Asocia datos con los elementos del renglón
    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int) {
        val series= series[position]
        holder.rank.text = series.rank
        holder.titulo.text = series.titulo
        holder.anio.text = series.anio
        holder.resumen.text = series.resumen
        holder.foto.setImageResource(series.foto)
        holder.itemView.setOnClickListener{
            //val action = SeriessFragmentDirections.actionSeriessFragmentToSerieFragment(series)
            //holder.itemView.findNavController().navigate(action)
            val oculto = series.oculto
            Toast.makeText(context, "$oculto", Toast.LENGTH_SHORT).show()

        }

    }

    // Cuantos elementos tiene la lista
    override fun getItemCount(): Int {
        return series.size
    }
}