import 'package:flutter/material.dart';
import 'package:practical5/student_profile.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        title: 'Practical 5',
        theme: ThemeData(
          colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
          useMaterial3: true,
        ),
        home: const StudentProfile(
          logo: "logo.png",
          enrollmentNumber: "202103103510253",
          name: "Ayush Kumar",
          hobbies: ["Running", "Coding"],
        ));
  }
}
