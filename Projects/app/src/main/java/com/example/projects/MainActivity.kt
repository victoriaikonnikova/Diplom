package com.example.projects

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.projects.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val adapter = BookAdapter()
    private val imageIdList =
        listOf(R.drawable.ic_brave_new_world, R.drawable.ic_jane_eyre, R.drawable.ic_little_women)
    private var imageIndex = 0
    private val nameList = listOf("Brave New World", "Jane Eyre", "Little Women")
    private var nameIndex = 0
    private val descriptionList =
        listOf("Book one description", "Book two description", "Book three description")
    private var descriptionIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init() {
        binding.apply {
            rcView.layoutManager = LinearLayoutManager(this@MainActivity)
            rcView.adapter = adapter
            buttonAddBook.setOnClickListener {
                if (imageIndex > 2) imageIndex = 0
                if (nameIndex > 2) nameIndex = 0
                if (descriptionIndex > 2) descriptionIndex = 0
                val book = Book(
                    imageIdList[imageIndex],
                    nameList[nameIndex],
                    descriptionList[descriptionIndex]
                )
                adapter.addBook(book)
                imageIndex++
                nameIndex++
                descriptionIndex++
            }
        }
    }
}