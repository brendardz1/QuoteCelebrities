package com.example.celebrities.presentation.view.ui.insert

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import com.example.celebrities.R
import com.example.celebrities.databinding.FragmentInsertBinding
import com.example.celebrities.domain.model.QuoteModel
import com.example.celebrities.presentation.ViewModel.InsertViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class InsertFragment : Fragment() {

    private var binding: FragmentInsertBinding? = null
    private val quoteViewModel: InsertViewModel by viewModels()

    // This property is only valid between onCreateView and
    // onDestroyView.


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View{
        binding = FragmentInsertBinding.inflate(inflater, container, false)
        binding!!.btnInsert.setOnClickListener{
            quoteViewModel.addQuote(QuoteModel(id=binding!!.idAdd.text.toString().toInt(),
                quote = binding!!.cita.text.toString(), author = binding!!.autor.text.toString()))
            Toast.makeText(getActivity(), "Cita Agregada", Toast.LENGTH_SHORT).show();
            binding!!.idAdd.setText("")
            binding!!.cita.setText("")
            binding!!.autor.setText("")

        }

        return binding!!.root
    }

}