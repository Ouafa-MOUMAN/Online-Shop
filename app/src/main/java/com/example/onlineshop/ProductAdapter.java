package com.example.onlineshop;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ProductAdapter extends RecyclerView.Adapter<ProductAdapter.ProductViewHolder> {

    private List<Product> productList;

    public ProductAdapter(List<Product> productList) {
        this.productList = productList;
    }

    @NonNull
    @Override
    public ProductViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_product, parent, false);
        return new ProductViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ProductViewHolder holder, int position) {
        Product product = productList.get(position);

        // Image
        holder.productImage.setImageResource(product.getImageResource());

        // Nom
        holder.productName.setText(product.getName());

        // Prix (sans décimales)
        holder.productPrice.setText(String.format("%.0f", product.getPrice()));

        // Rating
        holder.productRating.setText(String.valueOf(product.getRating()));

        // Badge MOST POPULAR
        if (product.isMostPopular()) {
            holder.badgePopularText.setVisibility(View.VISIBLE);
        } else {
            holder.badgePopularText.setVisibility(View.GONE);
        }

        // Badge YEAR-END DEALS
        if (product.hasYearEndDeal()) {
            holder.badgeDeal.setVisibility(View.VISIBLE);
        } else {
            holder.badgeDeal.setVisibility(View.GONE);
        }

        // Discount
        if (product.getDiscount() != null) {
            holder.productDiscount.setText(product.getDiscount());
            holder.productDiscount.setVisibility(View.VISIBLE);
        } else {
            holder.productDiscount.setVisibility(View.GONE);
        }

        // Sold count
        if (product.getSoldCount() != null) {
            holder.badgeSold.setVisibility(View.VISIBLE);
            TextView soldText = holder.badgeSoldText;
            soldText.setText(product.getSoldCount());
        } else {
            holder.badgeSold.setVisibility(View.GONE);
        }

        // Click sur Add to Cart
        holder.btnAddToCart.setOnClickListener(v -> {
            Toast.makeText(v.getContext(),
                    "Ajouté au panier: " + product.getName(),
                    Toast.LENGTH_SHORT).show();
        });
    }

    @Override
    public int getItemCount() {
        return productList.size();
    }

    static class ProductViewHolder extends RecyclerView.ViewHolder {
        ImageView productImage;
        TextView productName;
        TextView productPrice;
        TextView productRating;
        TextView badgePopularText;
        View badgeDeal;
        TextView productDiscount;
        View badgeSold;
        TextView badgeSoldText;
        CardView btnAddToCart;

        public ProductViewHolder(@NonNull View itemView) {
            super(itemView);
            productImage = itemView.findViewById(R.id.product_image);
            productName = itemView.findViewById(R.id.product_name);
            productPrice = itemView.findViewById(R.id.product_price);
            productRating = itemView.findViewById(R.id.product_rating);
            badgePopularText = itemView.findViewById(R.id.badge_popular_text);
            badgeDeal = itemView.findViewById(R.id.badge_deal);
            productDiscount = itemView.findViewById(R.id.product_discount);
            badgeSold = itemView.findViewById(R.id.badge_sold);
            badgeSoldText = itemView.findViewById(R.id.badge_sold_text);
            btnAddToCart = itemView.findViewById(R.id.btn_add_to_cart);
        }
    }
}