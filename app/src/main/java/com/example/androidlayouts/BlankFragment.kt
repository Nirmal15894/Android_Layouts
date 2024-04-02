package com.example.androidlayouts

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [BlankFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class BlankFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
        Log.d("nirmal","fragment oncreate")
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d("nirmal","fragment onattach")
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d("nirmal","fragment onviewcreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d("nirmal","fragment onstart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("nirmal","fragment onresume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("nirmal","fragment onpause")
    }

    override fun onStop() {
        super.onStop()

        Log.d("nirmal","fragment onstop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("nirmal","fragment ondestroyview")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("nirmal","fragment ondestroy")
    }

    override fun onDetach() {
        super.onDetach()
        Log.d("nirmal","fragment ondetach")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Log.d("nirmal","fragment oncreateview")
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment BlankFragment.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            BlankFragment().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}