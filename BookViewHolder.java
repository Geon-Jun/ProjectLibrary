package com.project.library.adapters.viewholders;

import android.support.v7.widget.RecyclerView;


import com.project.library.databinding.ItemBookBinding;
import com.project.library.models.Book;

import lombok.Getter;

@Getter
public class BookViewHolder extends RecyclerView.ViewHolder {
    private final ItemBookBinding binding;

    public BookViewHolder(ItemBookBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public ItemBookBinding bind(Book item) {
        binding.setItem(item);
        binding.executePendingBindings();
        return binding;
    }
}