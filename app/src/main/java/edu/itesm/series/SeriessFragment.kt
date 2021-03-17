package edu.itesm.series

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.fragment_seriess.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [SeriessFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class SeriessFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seriess, container, false)
    }

    override fun onViewCreated(itemView: View, savedInstanceState: Bundle?) {
        super.onViewCreated(itemView, savedInstanceState)
        seriess_recycler.apply {
            // set a LinearLayoutManager to handle Android
            // RecyclerView behavior
            layoutManager = LinearLayoutManager(activity)
            // set the custom adapter to the RecyclerView
            adapter = SeriesAdapter(requireContext(), createData())
        }
    }

    fun createData(): ArrayList<Series>{
        val series = ArrayList<Series>()
        series.add(Series(R.drawable.bbad,"Nombre: Breaking Bad","Año inicio: 2008", "Rank: 4.6", "Resumen:  Walter White (Bryan Cranston), un profesor de química con problemas económicos a quien le diagnostican un cáncer de pulmón inoperable. Para pagar su tratamiento y asegurar el futuro económico de su familia comienza a cocinar y vender metanfetamina, junto con Jesse Pinkman (Aaron Paul), un antiguo alumno suyo. ", "Reparto:  Bryan Cranston, Aaron Paul, Anna Gunn "))
        series.add(Series(R.drawable.gthrones,"Nombre: Juego de Tronos","Año inicio: 2011", "Rank: 4.6", "Resumen: Relata las vivencias de un grupo de personajes de distintas casas nobiliarias en el continente ficticio de Poniente para tener el control del Trono de Hierro y gobernar los siete reinos que conforman el territorio", "Reparto: Kit Harington, Emilia Clarke, Lena Headey"))
        series.add(Series(R.drawable.pblinders,"Nombre: Peaky Blinders","Año inicio: 2013", "Rank: 4.5", "Resumen: Narra la historia de la familia gitana Shelby y su banda de gángsters, un grupo de personas características por sus boinas con cuchillas y dueñas de los asuntos ilegales, que dominan las apuestas clandestinas y se rigen mediante extorsiones.", "Reparto: Cillian Murphy, Helen McCrory, Paul Anderson"))
        series.add(Series(R.drawable.chernobyl,"Nombre: Chernobyl","Año inicio: 2019", "Rank: 4.5", "Resumen: La planta nuclear de Chernobyl, que por aquel entonces pertenecía a la República Socialista Soviética de Ucrania, explota causando uno de los mayores desastres medioambientales de la historia, debido al sobrecalentamiento del núcleo del reactor nuclear.", "Reparto: Jared Harris, Stellan Skarsgård, Paul Ritter"))
        series.add(Series(R.drawable.vikings,"Nombre: Vikings","Año inicio: 2013", "Rank: 4.5", "Resumen: Ragnar Lothbrok, figura mítica que aseguraba que era el descendiente de Odín, el dios principal de la mitología nórdica.", "Reparto: Alex Høgh Andersen, Gustaf Skarsgård, Marco Ilsø"))
        series.add(Series(R.drawable.shelock,"Nombre: Sherlock","Año inicio: 2010", "Rank: 4.5", "Resumen: Versión contemporánea del detective más famoso de todos los tiempos, el clásico de las novelas de Sir Arthur Conan Doyle, Sherlock Holmes. La ficción, al más puro estilo de género miniserie, se presenta en temporadas de tres episodios largos de 90 minutos de duración.", "Reparto: Benedict Cumberbatch, Martin Freeman, Amanda Abbington"))
        series.add(Series(R.drawable.sonsa,"Nombre: Sons of Anarchy","Año inicio: 2008", "Rank: 4.5", "Resumen: Narra las aventuras de los Hijos de la Anarquía, una banda de moteros con su propio código de moral a los que no les importa cometer actos criminales y atroces con tal de su subsistencia.", "Reparto: Charlie Hunnam, Katey Sagal, Kim Coates"))
        series.add(Series(R.drawable.sopranos,"Nombre: The Sopranos","Año inicio: 1999", "Rank: 4.5", "Resumen: Una serie que cuenta las vivencias de una familia de la mafia italiana instalada en Nueva Jersey, y las dificultades que surgen tanto en el hogar como en la organización criminal.", "Reparto: James Gandolfini, Edie Falco, Lorraine Bracco"))
        series.add(Series(R.drawable.erkenci,"Nombre: Erkenci Kuş","Año inicio: 2018", "Rank: 4.5", "Resumen: Una telenovela turca que se centra en la historia de amor entre una joven soñadora, Sanem, y el hijo del dueño de una prestigiosa agencia de publicidad, Can. Esta relación de amor comienza en dicha agencia donde ella acude a trabajar, aunque su sueño es ser escritora.", "Reparto: Demet Özdemir, Can Yaman, Öznur Serçeler"))
        series.add(Series(R.drawable.originals,"Nombre: The Originals","Año inicio: 2013", "Rank: 4.5", "Resumen: Está centrada en los vampiros originales y tiene como principal protagonista a Klaus Mikaelson (Joseph Morgan, 'Crónicas vampíricas', 'Immortals').", "Reparto: Joseph Morgan, Claire Holt, Daniel Gillies"))
        series.add(Series(R.drawable.outlander,"Nombre: Outlander","Año inicio: 2014", "Rank: 4.5", "Resumen: Basada en la saga de novelas de Diana Gabaldon, Outlander es una serie que mezcla fantasía, historia y romance en los parajes de la Escocia del siglo XVIII.", "Reparto: Caitriona Balfe, Sam Heughan, Sophie Skelton"))
        series.add(Series(R.drawable.simpsons,"Nombre: The Simpsons","Año inicio: 1989", "Rank: 4.5", "Resumen: Serie de animación que no necesita presentaciones y que es conocida en todo el mundo, aclamada por crítica y público, y que cuenta el día a día de la familia más disparatada de Springfield, sus amigos y el resto de los habitantes de esta ciudad.", "Reparto: Harry Shearer, Dan Castellaneta, Hank Azaria"))
        series.add(Series(R.drawable.supernat,"Nombre: Supernatural","Año inicio: 2005", "Rank: 4.5", "Resumen: Cuenta la historia de dos hermanos que recorren los Estados Unidos en un Chevrolet Impala enfrentándose a todo tipo de seres sobrenaturales por el camino.", "Reparto: Jared Padalecki, Jensen Ackles, Misha Collins"))
        series.add(Series(R.drawable.goodd,"Nombre: The good doctor","Año inicio: 2017", "Rank: 4.5", "Resumen: The Good Doctor se centra en un joven y brillante cirujano que padece el síndrome de Savant. Poco se sabe de este síndrome del sabio además de que aquellos que lo sufren tienen una memoria prodigiosa y muy especial. ", "Reparto: Freddie Highmore, Antonia Thomas, Fiona Gubelmann"))
        series.add(Series(R.drawable.bandofb,"Nombre: Band of Brothers","Año inicio: 2001", "Rank: 4.4", "Resumen: Miniserie dramática ambientada en la Segunda Guerra Mundial. Basada en la novela de Stephen Ambrose, la serie está coproducida por Steven Spielberg y Tom Hanks.", "Reparto: Nicholas Aaron, Damian Lewis, Donnie Wahlberg"))


        return series
    }
}