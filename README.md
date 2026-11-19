# Online Shop 🛍️

An Android e-commerce application built in Java for browsing luxury perfumes and beauty products. The app features a banner carousel, product grid with badges, brand logos, and four main screens connected by a persistent bottom navigation bar.

---

## Screenshots

> _Add screenshots by placing images in a `screenshots/` folder and linking them here._
>
> ```md
> ![Home](screenshots/home.png)
> ![Category](screenshots/category.png)
> ![Orders](screenshots/orders.png)
> ![Profile](screenshots/profile.png)
> ```

---

## Features

| Screen | Description |
|---|---|
| **Home** | Auto-scrolling banner carousel, product grid with **Most Popular** / **Year-End Deal** badges, brand logo strip (Chanel, Dior, Armani, Prada), search bar with mic button |
| **Category** | Scrollable list of product categories (Parfums, Maquillage, Soins de la peau, Accessoires) |
| **Orders** | Order history screen — empty state with icon and message |
| **Profile** | User avatar, name, email, phone, address, settings options (Account Settings, Notifications, Logout) |

**Shared components**
- Persistent 4-tab bottom navigation bar across all screens (Home / Category / Order / Account)
- Gradient header on every screen
- "Add to cart" action on each product card (shows a Toast confirmation)

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| UI | XML Layouts, ConstraintLayout, RecyclerView, ViewPager2, CardView |
| Min SDK | 29 (Android 10) |
| Target SDK | 36 |
| Build system | Gradle (Kotlin DSL) |
| Libraries | AndroidX AppCompat, Material Components, ConstraintLayout |

---

## Project Structure

```
app/src/main/
├── java/com/example/onlineshop/
│   ├── MainActivity.java          # Home screen — banners, products, brands
│   ├── CategoryActivity.java      # Category browser
│   ├── OrderActivity.java         # Order history
│   ├── ProfileActivity.java       # User profile & settings
│   ├── BannerAdapter.java         # ViewPager2 adapter for the banner carousel
│   ├── ProductAdapter.java        # RecyclerView adapter for product cards
│   └── Product.java               # Product data model (name, price, rating, badges)
└── res/
    ├── layout/
    │   ├── activity_main.xml       # Home screen layout
    │   ├── activity_category.xml  # Category screen layout
    │   ├── activity_order.xml     # Orders screen layout
    │   ├── activity_profile.xml   # Profile screen layout
    │   ├── item_banner.xml        # Single banner item for ViewPager2
    │   └── item_product.xml       # Single product card for RecyclerView
    └── drawable/
        ├── banner1-3.png          # Home screen banners
        ├── product1-6.png         # Product images
        ├── *_logo.png             # Brand logos (Chanel, Dior, Armani, Prada)
        ├── badge_*.xml            # Badge drawables (popular, deal, circle)
        ├── ic_*.xml / *.png       # Icons (cart, home, search, mic, star…)
        └── gradient_header.xml    # Shared gradient header background
```

---

## Getting Started

### Prerequisites

- Android Studio Hedgehog (2023.1) or later
- Android SDK 36
- JDK 11

### Run the app

1. Clone the repository:
   ```bash
   git clone https://github.com/Ouafa-MOUMAN/Online-Shop.git
   ```
2. Open the project in **Android Studio**.
3. Wait for the Gradle sync to finish.
4. Run on an emulator or a physical device running **Android 10 (API 29)** or higher.

---

## License

This project is open-source and available under the [MIT License](LICENSE).
