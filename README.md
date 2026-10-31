# Online Shop 🛍️

An Android e-commerce application built with Java that lets users browse products, explore categories, track orders, and manage their profile.

---

## Features

- **Home Screen** – Banner carousel with auto-scroll, product grid with badges (Most Popular, Year-End Deal), brand logos section, and a search bar.
- **Category Screen** – Browse products organised by category.
- **Order Screen** – View and track placed orders.
- **Profile Screen** – User account and settings.
- **Bottom Navigation** – Persistent navigation bar across all screens (Home, Category, Order, Account).

---

## Tech Stack

| Layer | Technology |
|---|---|
| Language | Java |
| UI | XML Layouts, ConstraintLayout, RecyclerView, ViewPager2 |
| Architecture | Activity-based (single module) |
| Min SDK | 29 (Android 10) |
| Target SDK | 36 |
| Build system | Gradle (Kotlin DSL) |

---

## Project Structure

```
app/src/main/
├── java/com/example/onlineshop/
│   ├── MainActivity.java        # Home screen with banners & products
│   ├── CategoryActivity.java    # Category browser
│   ├── OrderActivity.java       # Orders screen
│   ├── ProfileActivity.java     # User profile screen
│   ├── BannerAdapter.java       # ViewPager2 adapter for banners
│   ├── ProductAdapter.java      # RecyclerView adapter for products
│   └── Product.java             # Product data model
└── res/
    ├── layout/                  # XML screen & item layouts
    └── drawable/                # Icons, banners, brand logos, badges
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
2. Open the project in Android Studio.
3. Let Gradle sync finish.
4. Run on an emulator or physical device (Android 10+).

---

## Screenshots

> _Add screenshots here by placing images in the repo and linking them below._
>
> ```md
> ![Home](screenshots/home.png)
> ![Category](screenshots/category.png)
> ```

---

## License

This project is open-source and available under the [MIT License](LICENSE).
