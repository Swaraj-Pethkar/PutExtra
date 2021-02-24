package com.example.putextra

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import java.util.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [fragmentPage.newInstance] factory method to
 * create an instance of this fragment.
 */
class fragmentPage : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Log.e("Fragment","onCreate")
    }

    @SuppressLint("SetTextI18n")
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        var view = inflater.inflate(R.layout.fragment_page, container, false)
        var label = view.findViewById<TextView>(R.id.label);

        var show = getArguments()?.getString("name");
        label.text = """Hello ${show.toString().substring(0, 1).toUpperCase(Locale.ROOT)}""" + show.toString().substring(1).toLowerCase(
            Locale.ROOT
        );

        Log.e("Fragment","onCreateView")
        return view
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment fragmentPage.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic fun newInstance(param1: String, param2: String) =
                fragmentPage().apply {
                    arguments = Bundle().apply {
                        putString(ARG_PARAM1, param1)
                        putString(ARG_PARAM2, param2)
                    }
                }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e("Fragment","onAttach")
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        Log.e("Fragment","onActivityCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.e("Fragment","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("Fragment","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("Fragment","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("Fragment","onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.e("Fragment","onDestroyView")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("Fragment","onDestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.e("Fragment","onDetach")
    }
}