This is a Kotlin Multiplatform project targeting Android, iOS.

* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.



# Build a basic to-do app for Android and iOS using Compose Multiplatform and MongoDB Realm for local database integration. Support light/dark theme

## Highlights
📱 Build a to-do app for both Android and iOS.\
📦 Use Compose Multiplatform for shared UI.\
🗂️ Integrate MongoDB Realm as a local database.\
🎨 Create custom Material 3 themes.\
🔄 Implement navigation with Voyager library.\
🖥️ Manage tasks with a ViewModel and state handling.\
✔️ Test and debug on Android and iOS simulators.\
## Key Insights
📚 Cross-Platform Development: Using Compose Multiplatform allows developers to share UI code between Android and iOS, boosting efficiency and reducing redundancy. This approach is ideal for maintaining consistency across platforms.\
🔒 Local Database with MongoDB Realm: MongoDB Realm offers a robust solution for mobile data persistence, providing seamless integration for both Android and iOS applications. It simplifies data management and enhances performance.\
🎨 Custom Theming: Customizing Material 3 colors allows for a tailored user experience, ensuring that the app aligns with branding and design aesthetics while keeping the interface modern and attractive.\
🔄 Effective Navigation: Implementing the Voyager library for navigation simplifies the process of moving between screens, offering smooth transitions and an intuitive user experience, essential for mobile applications.\
📊 State Management: Utilizing a ViewModel to manage application state ensures that the UI responds dynamically to data changes, improving user engagement and usability while maintaining a clean architecture.\
⚙️ Testing on Multiple Platforms: Testing applications on both Android and iOS simulators guarantees functionality across devices, identifying platform-specific issues before deployment.\
🛠️ Future Enhancements: There’s potential for further improvements in error handling and user feedback, enhancing the app’s usability and robustness, which is crucial for professional applications.\
Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…

<img width="458" alt="image" src="https://github.com/user-attachments/assets/90862fd4-c91f-4502-ae90-327a72cb3524" />
<img width="432" alt="image" src="https://github.com/user-attachments/assets/ccdd9d36-59ed-48c8-bd7e-071e79847828" />
<img width="443" alt="image" src="https://github.com/user-attachments/assets/51fbe288-d6f0-412f-ad62-c3604945a1d5" />
<img width="456" alt="image" src="https://github.com/user-attachments/assets/c21adf91-d2c0-4f96-a79f-8c835efa39f2" />
<img width="458" alt="image" src="https://github.com/user-attachments/assets/c57facc5-f549-44fa-a8f3-cefc34facd00" />
<img width="456" alt="image" src="https://github.com/user-attachments/assets/d6067d2f-3844-4ce8-854f-4a61bd684c77" />
<img width="458" alt="image" src="https://github.com/user-attachments/assets/efd33777-d0a4-48e2-a7db-6b67119937fa" />
<img width="453" alt="image" src="https://github.com/user-attachments/assets/284e607e-3468-4b5b-aaea-7bbbf4bb049f" />
<img width="450" alt="image" src="https://github.com/user-attachments/assets/8e624c61-2c93-4e19-b594-f81a0f68841e" />
<img width="449" alt="image" src="https://github.com/user-attachments/assets/0cd8398b-eead-4b5a-8f2b-5c68e9730470" />
<img width="459" alt="image" src="https://github.com/user-attachments/assets/ffc2f13c-b2c7-4393-a98e-0d4f20a51291" />
<img width="446" alt="image" src="https://github.com/user-attachments/assets/f0007190-922f-4b19-9232-5ef188f00ff7" />
![Uploading image.png…]()
