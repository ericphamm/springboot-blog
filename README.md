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
  <img width="1359" alt="Screenshot 2025-05-14 at 8 30 31" src="https://github.com/user-attachments/assets/1ded32f4-e6ad-47ae-9032-2d570275fec0" />

- Create/Edit: Full-featured form with HTML content input
<img width="1359" alt="Screenshot 2025-05-14 at 8 38 38" src="https://github.com/user-attachments/assets/bb29fb1d-fdd3-40af-b40b-ecbb330632ed" />


  
- Article Detail: Beautiful, styled content layout
<img width="1359" alt="Screenshot 2025-05-14 at 8 31 48" src="https://github.com/user-attachments/assets/62767195-756d-4f15-921d-92be5e3ff65f" />

<img width="1359" alt="Screenshot 2025-05-14 at 8 34 40" src="https://github.com/user-attachments/assets/8e75edf6-63a8-4cab-8134-b40f5c95598c" />

- Contact Form: Modern and elegant form

<img width="1359" alt="Screenshot 2025-05-14 at 8 32 44" src="https://github.com/user-attachments/assets/8db14ea1-2600-4f6e-9b37-45336c5813f6" />



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
Junior Software Developer 
[LinkedIn](https://www.linkedin.com/in/ericthangpham) | [GitHub](http://github.com/ericphamm)

---

## 📌 License

This project is open-source and available for personal and educational use.
