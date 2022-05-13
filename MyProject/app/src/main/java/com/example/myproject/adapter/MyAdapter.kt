package com.example.myproject.adapter

import androidx.recyclerview.widget.ListAdapter
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.viewbinding.ViewBinding
import com.example.myproject.base.BaseViewHolder
import com.example.myproject.data.FirstType
import com.example.myproject.data.SecondType
import com.example.myproject.databinding.FirstItemBinding
import com.example.myproject.databinding.SecondItemBinding
import kotlin.IllegalArgumentException

class MyAdapter : ListAdapter<Any, BaseViewHolder<ViewBinding>, Any>> (
    object : DiffUtil.ItemCallback<Any>() {
        override fun areItemsTheSame(oldItem: Any, newItem: Any): Boolean = when {
            oldItem is FirstType && newItem is FirstType -> oldItem.id == newItem.id
            oldItem is SecondType && newItem is SecondType -> oldItem.id == newItem.id
            else -> false
        }

        override fun areContentsTheSame(oldItem: Any, newItem: Any): Boolean = when{
            oldItem is FirstType && newItem is FirstType -> oldItem == newItem
            oldItem is SecondType && newItem is SecondType -> oldItem == newItem
            else -> false
        }
    }
) {
    override fun getItemViewTipe(position: Int): Int =
        when (getItem(position)) {
            is FirstType -> FIRST_ITEM_TYPE
            is SecondType -> Second_ITEM_TYPE
            else -> throw IllegalArgumentException("My adapter can't handle" + getItem(position) + "!")
        }

    override fun onCreateView(
        parent: ViewGroup,
        viewType: Int
    ): BaseViewHolder<ViewBinding, Any> = when (viewType) {
        FIRST_ITEM_TYPE -> FirstViewHolder(parent) as BaseViewHolder<ViewBinding, Any>
        SECOND_ITEM_TYPE -> SecondViewHolder(parent) as BaseViewHolder<ViewBinding, Any>
        else -> throw IllegalArgumentException("My adapter can't handle $viewType viewType")
    }

    }




companion object {
    private const val FIRST_ITEM_TYPE = 9999
    private const val SECOND_ITEM_TYPE = 9998
}



private class FirstViewHolder(parent: ViewGroup) : BaseViewHolder<FirstItemBinding, FirstType> (
    FirstItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    {
        override fun FirstItemBinding.bind(value: FirstType) {
            itemId.text = value.id.toString()
            itemName.text = value.name
        }

    }
        )

private class SecondViewHolder(parent: ViewGroup) : BaseViewHolder<SecondItemBinding, SecondType> (
    SecondItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    {
        override fun SecondItemBinding.bind(value: SecondType) {
            itemId.text = value.id.toString()
            itemName.text = value.name
        }

    }
)