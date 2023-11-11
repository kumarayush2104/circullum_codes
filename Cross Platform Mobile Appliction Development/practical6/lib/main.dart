import 'package:flutter/material.dart';
import 'package:practical6/student_home.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(title: "Practical 6", home: StudentHome());
  }
}
