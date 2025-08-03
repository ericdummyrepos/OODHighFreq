# 📦 Amazon Locker System (Java OOD)

This is an Object-Oriented Design (OOD) of an **Amazon Locker System** implemented in Java. The system supports the delivery of packages to smart lockers by couriers, and package retrieval by customers using pickup codes.

---

## 🚀 Features

- Couriers can deliver packages to the nearest available locker.
- Customers can pick up packages using a unique pickup code.
- Lockers are organized by location and support multiple sizes.
- Locker assignment uses a pluggable **Strategy Pattern**.
- Clean, extensible OOP design ready for scaling.

---

## 🧱 Component Architecture

```plaintext
+----------------+        +--------------------+        +------------------+
|  LockerSystem  | -----> |   LockerManager    | -----> | LockerAssignment |
|  (Main API)    |        | (Business Logic)   |        |    Strategy      |
+----------------+        +--------------------+        +------------------+
                               |              \
                               v               v
                 +---------------------+   +-----------------+
                 |   LockerLocation    |   |   PickupCode     |
                 +---------------------+   +-----------------+
                         |
                         v
                  +-------------+
                  |   Locker    |
                  +-------------+
                         |
                         v
                     +--------+
                     | Package|
                     +--------+
