import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});
  static const List<String> images = [
    "ac.jpg",
    "tv-set.jpg",
    "sofa.jpg",
    "dining-table.jpg",
    "chair.jpg",
    "tv.jpg",
    "bed.jpg",
    "fan.jpg",
    "cupboard.jpg",
    "dressing-table.jpg"
  ];
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: "Practical 7",
      home: Scaffold(
          appBar: AppBar(title: const Text("Practical 7")),
          body: GridView.count(
              mainAxisSpacing: 20,
              crossAxisSpacing: 20,
              crossAxisCount: 2,
              children: images.map((e) => Image.asset(e)).toList())),
    );
  }
}
