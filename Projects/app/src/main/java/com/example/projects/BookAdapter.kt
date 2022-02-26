package com.example.projects

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.projects.databinding.BookItemBinding

class BookAdapter : RecyclerView.Adapter<BookAdapter.BookHolder>() {

    val bookList = ArrayList<Book>()

    class BookHolder(item: View) : RecyclerView.ViewHolder(item) {
        val binding = BookItemBinding.bind(item)
        fun bind(book: Book) = with(binding) {
            bookOneImage.setImageResource(book.imageId)
            bookOneName.text = book.name
            bookOneDescription.text = book.description

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BookHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_item, parent, false)
        return BookHolder(view)
    }

    override fun onBindViewHolder(holder: BookHolder, position: Int) {
        holder.bind(bookList[position])
    }

    override fun getItemCount(): Int {
        return bookList.size
    }

    fun addBook(book: Book) {
        bookList.add(book)
        notifyDataSetChanged()
    }
}