package com.project.library.adapters.viewholders;

import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.project.library.databinding.ItemBorrowingBinding;
import com.project.library.models.Borrowing;
import com.project.library.utils.MyDateTimeFormatter;

import lombok.Getter;

@Getter
public class BorrowingViewHolder extends RecyclerView.ViewHolder {
    private final ItemBorrowingBinding binding;

    public BorrowingViewHolder(ItemBorrowingBinding binding) {
        super(binding.getRoot());
        this.binding = binding;
    }

    public ItemBorrowingBinding bind(Borrowing item) {
        binding.setItem(item);
        binding.executePendingBindings();
        if (item.getStartTime() != null) {
            Log.e("DATE","item.getStartTime() != null");
            binding.txtBorrowingItemBorrowingTime.setText(MyDateTimeFormatter.yMdhm.format(item.getStartTime()));
        }
        if (item.getExpiryTime() != null) {
            binding.txtBorrowingItemExpiryTime.setText(MyDateTimeFormatter.yMdhm.format(item.getExpiryTime()));
        }
        if (item.getReturnTime() != null) {
            binding.txtBorrowingItemReturnTime.setText(MyDateTimeFormatter.yMdhm.format(item.getReturnTime()));
        }
        return binding;
    }
}