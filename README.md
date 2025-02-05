# Food Donation System

## Overview
The **Food Donation System** is an application designed to bridge the gap between food donors (like restaurants, grocery stores, and individuals) and recipients (such as shelters and food banks). This system simplifies the process of donating surplus food, ensuring it reaches those in need efficiently.

The project is built using **Java** for the backend logic, **Firebase** for real-time data management, and the **Google Maps API** to facilitate location tracking and route optimization.

---

## Features
- **User Authentication:** Secure sign-up and login using Firebase Authentication.
- **Real-Time Data:** Donations and requests are managed in real-time with Firebase Realtime Database.
- **Location Services:** Google Maps API integration for locating donors and recipients.
- **Donation Management:** Donors can list available food, while recipients can browse and request donations.
- **Notifications:** Real-time alerts for donation updates.
- **Route Optimization:** Map routes for efficient pick-up and delivery.

---

## Technologies Used
- **Programming Language:** Java
- **Database:** Firebase Realtime Database & Firebase Authentication
- **APIs:** Google Maps API for geolocation and mapping features
- **Build Tool:** Gradle
- **IDE:** Android Studio

---

## Prerequisites
Before running the project, ensure you have the following installed:

1. **Java Development Kit (JDK)** - Version 8 or higher
2. **Firebase Project:**
   - Create a Firebase project at [Firebase Console](https://console.firebase.google.com/).
   - Enable **Firebase Realtime Database** and **Authentication** (email/password).
   - Download the `google-services.json` file and place it in your project’s `src/main/resources/` directory.
3. **Google Maps API Key:**
   - Obtain an API key from the [Google Cloud Console](https://console.cloud.google.com/).
   - Enable **Maps SDK for Android** (if mobile) or **Maps JavaScript API** (if web).
4. **Gradle/Maven:** Ensure your project has the correct dependencies for Firebase and Google Maps.

---

## Installation & Setup

1. **Clone the Repository:**
   ```bash
   git clone https://github.com/RealGachoka/NourishConnect.git)
   cd food-donation-system
   ```

2. **Configure Firebase:**
   - Place the downloaded `google-services.json` in the `src/main/resources/` folder.

3. **Add Google Maps API Key:**
   - Locate your configuration file (e.g., `config.properties`) and add:
     ```properties
     GOOGLE_MAPS_API_KEY=YOUR_API_KEY_HERE
     ```

4. **Build the Project:**
   If using Gradle:
   ```bash
   ./gradlew build
   ```
   Or with Maven:
   ```bash
   mvn clean install
   ```

5. **Run the Application:**
   ```bash
   java -jar build/libs/food-donation-system.jar
   ```

---

## Project Structure
```
food-donation-system/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/fooddonation/
│   │   │       ├── models/          # Data models (Donation, User, etc.)
│   │   │       ├── services/        # Firebase and Google Maps services
│   │   │       ├── controllers/     # Business logic and user interactions
│   │   │       └── Main.java        # Main entry point
│   │   └── resources/
│   │       └── google-services.json # Firebase configuration
├── build.gradle / pom.xml           # Dependency management
├── README.md                        # Project documentation
└── config.properties                # Google Maps API key config
```

---

## Usage
1. **Sign Up/Login:**
   - Users can create an account or log in using their email and password.

2. **Donating Food:**
   - Donors can list surplus food with details (type, quantity, expiration date).
   - Location data is automatically captured using Google Maps.

3. **Requesting Food:**
   - Recipients can browse available donations based on their location.
   - Once a request is made, both parties receive notifications.

4. **Track Deliveries:**
   - The system provides optimized routes for pick-ups and deliveries.

---

## Dependencies
Make sure the following dependencies are added to your `build.gradle` or `pom.xml`:

**For Gradle:**
```gradle
dependencies {
    implementation 'com.google.firebase:firebase-admin:9.0.0'
    implementation 'com.google.maps:google-maps-services:0.10.0'
    implementation 'com.google.code.gson:gson:2.8.6'
}
```

**For Maven:**
```xml
<dependencies>
    <dependency>
        <groupId>com.google.firebase</groupId>
        <artifactId>firebase-admin</artifactId>
        <version>9.0.0</version>
    </dependency>
    <dependency>
        <groupId>com.google.maps</groupId>
        <artifactId>google-maps-services</artifactId>
        <version>0.10.0</version>
    </dependency>
    <dependency>
        <groupId>com.google.code.gson</groupId>
        <artifactId>gson</artifactId>
        <version>2.8.6</version>
    </dependency>
</dependencies>
```

---

## Contributing
Contributions are welcome! If you’d like to improve the project, please fork the repository and submit a pull request.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/YourFeature`)
3. Commit your changes (`git commit -m 'Add YourFeature'`)
4. Push to the branch (`git push origin feature/YourFeature`)
5. Open a pull request

---

## License
This project is licensed under the [MIT License](LICENSE).

---

## Contact
For questions or feedback, feel free to contact:

- **Your Name**  
- **Email:** your.email@example.com  
- **GitHub:** [your-username](https://github.com/your-username)

---

## Acknowledgements
- [Firebase Documentation](https://firebase.google.com/docs)
- [Google Maps API Documentation](https://developers.google.com/maps/documentation)
- Open-source contributors for Java, Firebase, and Google Maps libraries.

---

Happy coding! 🌟

