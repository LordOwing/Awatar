package com.example.awatar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;
import android.widget.Toast;

import org.jspecify.annotations.NonNull;


public class UserAdapter extends RecyclerView.Adapter<UserAdapter.UserViewHolder> {

    private List<User> userList;

    public UserAdapter(List<User> userList) {
        this.userList = userList;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item_user, parent, false);
        return new UserViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {
        User currentUser = userList.get(position);
        holder.firstNameText.setText(currentUser.getFirstName());
        holder.lastNameText.setText(currentUser.getLastName());
        holder.avatarImage.setImageResource(currentUser.getAvatarResId());


        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String message = "Kliknięto: " + currentUser.getFirstName() + " " + currentUser.getLastName();
                Toast.makeText(v.getContext(), message, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return userList.size();
    }

    public static class UserViewHolder extends RecyclerView.ViewHolder {
        public ImageView avatarImage;
        public TextView firstNameText;
        public TextView lastNameText;

        public UserViewHolder(@NonNull View itemView) {
            super(itemView);
            avatarImage = itemView.findViewById(R.id.avatarImage);
            firstNameText = itemView.findViewById(R.id.firstNameText);
            lastNameText = itemView.findViewById(R.id.lastNameText);
        }
    }
}