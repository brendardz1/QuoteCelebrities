package com.example.celebrities.presentation.view.ui.quoterandom

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.example.celebrities.R
import com.example.celebrities.databinding.FragmentQuoteRandomBinding
import com.example.celebrities.presentation.ViewModel.QuoteRandomViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class QuoteRandomFragment : Fragment() {
    private var binding: FragmentQuoteRandomBinding? = null
    private val quoteViewModel: QuoteRandomViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentQuoteRandomBinding.inflate(inflater, container, false)
        quoteViewModel.randomQuote()
        observer()
        binding?.viewContainer?.setOnClickListener{
            quoteViewModel.randomQuote()
        }
        return binding!!.root
    }

    private fun observer(){
        lifecycleScope.launch{
            quoteViewModel.quoteModel.collect{
                binding!!.tvQuote.text = it.quote
                binding!!.tvAuthor.text = it.author
            }
        }
    }
}