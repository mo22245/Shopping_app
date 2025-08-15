## README.md

# 🛍️ Flutter Shopping App - تطبيق التسوق الذكي

تطبيق تسوق متكامل مطور بـ Flutter يوفر تجربة مستخدم استثنائية مع دعم كامل للغة العربية.

## 📱 لقطات الشاشة
<img width="1919" height="995" alt="Screenshot 2025-08-16 002558" src="https://github.com/user-attachments/assets/07b9e243-a49b-40c9-9cc9-dbda5d0acdef" />

<img width="1919" height="987" alt="Screenshot 2025-08-16 002612" src="https://github.com/user-attachments/assets/5c485ff3-453a-482f-96b2-1b2d7ce1ba6d" />

<img width="1919" height="1020" alt="Screenshot 2025-08-16 002723" src="https://github.com/user-attachments/assets/5234ad6e-00c4-4612-883a-e998ada83bac" />

<img width="1917" height="1021" alt="Screenshot 2025-08-16 002755" src="https://github.com/user-attachments/assets/de4f1b7b-a6fc-4a4f-8a5c-7f83748a7a8e" />

<img width="1919" height="1017" alt="Screenshot 2025-08-16 002815" src="https://github.com/user-attachments/assets/4670a597-6242-4d02-8413-68c32f6e84a2" />

<img width="1916" height="713" alt="Screenshot 2025-08-16 002829" src="https://github.com/user-attachments/assets/3c883e3b-f891-4d80-b56e-30d9abe1e015" />



## ✨ الميزات الرئيسية

### 🎨 واجهة المستخدم
- **شاشة ترحيب جذابة** مع صور متنوعة وتصميم احترافي
- **تصميم متجاوب** يتكيف مع جميع أحجام الشاشات
- **ألوان متناسقة وجذابة** مع تدرجات لونية حديثة
- **خط Suwannaphum-Regular المخصص** للنصوص الرئيسية
- **أيقونات واضحة ومعبرة** لتحسين تجربة المستخدم

### 🔐 نظام المصادقة
- **نموذج تسجيل حساب جديد** مع التحقق من صحة البيانات:
  - الاسم الكامل (يجب أن يبدأ بحرف كبير)
  - البريد الإلكتروني (يجب أن يحتوي على @)
  - كلمة المرور (6 أحرف على الأقل)
  - تأكيد كلمة المرور (يجب أن تطابق)
- **نموذج تسجيل الدخول** مع التحقق الأساسي
- **رسائل نجاح تفاعلية** عند إكمال العمليات بنجاح

### 🛒 شاشة التسوق
- **AppBar مع عنوان "منتجاتنا"** وأيقونة السلة
- **PageView أفقي** لعرض المنتجات المميزة مع تأثيرات بصرية
- **GridView متجاوب** يعرض المنتجات في صفين
- **بطاقات منتجات أنيقة** تحتوي على:
  - صورة المنتج
  - اسم المنتج
  - السعر
  - زر إضافة للسلة مع تأثير بصري
- **قسم "العروض الساخنة"** مع ListView أفقي يحتوي على:
  - 5 عروض مختلفة
  - صور وأوصاف للعروض
  - تخطيط جذاب باستخدام Expanded

### 🌍 دعم اللغة العربية
- **واجهة مستخدم باللغة العربية** بشكل كامل
- **اتجاه النص من اليمين لليسار (RTL)**
- **ترجمة جميع النصوص والرسائل**
- **دعم الخطوط العربية**

### ⚡ انتقالات متحركة
- **انتقالات سلسة** بين الشاشات باستخدام FadeTransition
- **تأثيرات بصرية ناعمة** تحسن تجربة المستخدم
- **مدة انتقال محسنة** (600ms) للحصول على تجربة مثلى

### 🎯 تجربة المستخدم
- **رسائل SnackBar تفاعلية** عند إضافة المنتجات للسلة
- **تحقق شامل من المدخلات** مع رسائل خطأ واضحة
- **تصميم مرن** يعمل على جميع أحجام الشاشات
- **معالجة الأخطاء** للصور والاتصال بالشبكة

## 🏗️ البنية التقنية

### هيكل المشروع
```
shopping_app/
├── lib/
│   ├── main.dart                 # نقطة البداية الرئيسية
│   ├── screens/                  # شاشات التطبيق
│   │   ├── welcome_screen.dart   # شاشة الترحيب
│   │   ├── signup_screen.dart    # شاشة التسجيل
│   │   ├── signin_screen.dart    # شاشة تسجيل الدخول
│   │   └── shopping_screen.dart  # شاشة التسوق
│   ├── widgets/                  # المكونات القابلة لإعادة الاستخدام
│   │   ├── product_card.dart     # بطاقة المنتج
│   │   └── offer_card.dart       # بطاقة العرض
│   ├── models/                   # نماذج البيانات
│   │   ├── product.dart          # نموذج المنتج
│   │   └── offer.dart            # نموذج العرض
│   └── utils/                    # الأدوات المساعدة
│       └── page_transitions.dart # انتقالات الصفحات
├── assets/                       # الموارد الثابتة
│   ├── images/                   # الصور
│   └── fonts/                    # الخطوط المخصصة
└── screenshots/                  # لقطات الشاشة
```

### التقنيات المستخدمة
- **Flutter SDK**: إطار العمل الرئيسي
- **Dart**: لغة البرمجة
- **Material Design**: نظام التصميم
- **Custom Fonts**: خطوط مخصصة (Suwannaphum-Regular, Cairo)
- **Network Images**: صور من الإنترنت مع معالجة الأخطاء
- **Form Validation**: التحقق من صحة النماذج
- **Responsive Design**: تصميم متجاوب

## # Flutter Shopping App - Complete Project

## Project Structure
```
shopping_app/
├── lib/
│   ├── main.dart
│   ├── screens/
│   │   ├── welcome_screen.dart
│   │   ├── signup_screen.dart
│   │   ├── signin_screen.dart
│   │   └── shopping_screen.dart
│   ├── widgets/
│   │   ├── product_card.dart
│   │   └── offer_card.dart
│   ├── models/
│   │   ├── product.dart
│   │   └── offer.dart
│   └── utils/
│       └── page_transitions.dart
├── assets/
│   ├── images/
│   │   ├── local_image.png
│   │   ├── product1.jpg
│   │   ├── product2.jpg
│   │   └── offers/
│   └── fonts/
│       └── Cairo/
├── pubspec.yaml
└── README.md
