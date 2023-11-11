import 'package:flutter/material.dart';
import 'package:practical11/student_add.dart';
import 'package:practical11/student_list.dart';

class HomePage extends StatelessWidget {
  const HomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
          appBar: AppBar(title: const Text("Student Home")),
          body: Center(
            child: Padding(
                padding: const EdgeInsets.all(20),
                child: Column(
                  children: [
                    ElevatedButton(
                        onPressed: () {
                          Navigator.push(
                              context,
                              MaterialPageRoute(
                                  builder: ((context) => const StudentAdd())));
                        },
                        child: const Text("Add Student")),
                    const SizedBox(height: 20),
                    ElevatedButton(
                        onPressed: () {
                          Navigator.push(
                              context,
                              MaterialPageRoute(
                                  builder: ((context) => const StudentList())));
                        },
                        child: const Text("List Student Record")),
                  ],
                )),
          )),
    );
  }
}
