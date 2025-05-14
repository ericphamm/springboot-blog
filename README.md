# 📘 Personal Blog – Spring Boot + Tailwind CSS + Thymeleaf

A modern **personal blog web application** powered by **Spring Boot**, **Thymeleaf**, and **Tailwind CSS** — built to help you publish, edit, and manage articles with beautiful responsive design and clean code.

---

## 🚀 Key Features

- ✍️ **Create**, **Edit**, and **Delete** blog posts via intuitive UI
- 🧠 **Rich text editing** using integrated **TinyMCE** (HTML input supported)
- 📄 **Detailed view** for each article styled with Tailwind
- 🖼️ Responsive design with modern layout and article cards
- ⚙️ Built entirely in **Java with Spring Boot** – scalable and fast

---

## 🛠️ Built With

- **Spring Boot** – Backend framework
- **Thymeleaf** – Template engine for dynamic rendering
- **Tailwind CSS** – Utility-first modern CSS framework
- **TinyMCE** – WYSIWYG HTML editor
- **Maven** – Build tool and dependency manager

---

## 📸 Screenshots

- Home page: Grid layout of articles
- Create/Edit: Full-featured form with HTML content input
- Article Detail: Beautiful, styled content layout

---

## 📂 Project Structure

```
src/
├── java/
│   └── controllers/         # Spring MVC Controllers
│   └── models/              # DTOs for articles
│   └── repositories/        # Data layer
├── resources/
│   ├── static/              # CSS, JS, images
│   └── templates/
│       ├── fragments/       # layout.html and reused components
│       ├── articles/        # create.html, edit.html, detail.html
│       └── home/            # index, contact, etc.
```

---

## 💻 Getting Started

### Prerequisites

- Java 17+
- Maven

### Run Locally

```bash
git clone https://github.com/your-username/personal-blog.git
cd personal-blog
./mvnw spring-boot:run
```

Visit [http://localhost:8080](http://localhost:8080)

---

## ✨ TinyMCE Integration

The blog supports styled HTML content using **TinyMCE editor**. You can:

- Add headings, links, images, bullet points, and custom styles
- Save and render content safely using `th:utext` in Thymeleaf
- Easily create longer tech or travel articles

---

## ✨ Example Use Cases

- Personal portfolio blog
- Technical knowledge sharing
- Travel journaling
- SaaS landing content manager

---

## 🙋 Author

**Eric Pham**  
Spring Boot Developer & Blogger  
[LinkedIn](https://linkedin.com/in/your-profile) | [GitHub](https://github.com/your-username)

---

## 📌 License

This project is open-source and available for personal and educational use.