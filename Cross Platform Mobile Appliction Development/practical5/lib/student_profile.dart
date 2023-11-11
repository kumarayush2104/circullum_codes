import 'package:flutter/material.dart';

class StudentProfile extends StatelessWidget {
  final String name;
  final String enrollmentNumber;
  final String logo;
  final List<String> hobbies;

  const StudentProfile(
      {super.key,
      required this.name,
      required this.enrollmentNumber,
      required this.logo,
      required this.hobbies});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text("Student Details"),
      ),
      body: Padding(
        padding: const EdgeInsets.all(40),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            Container(
              decoration: BoxDecoration(
                  shape: BoxShape.circle, border: Border.all(width: 10)),
              child: Image.asset(logo),
            ),
            const SizedBox(height: 50),
            Text(name),
            const SizedBox(height: 20),
            Text(enrollmentNumber),
            const SizedBox(height: 20),
            Row(
                mainAxisAlignment: MainAxisAlignment.spaceAround,
                children: [...hobbies.map((e) => Chip(label: Text(e)))])
          ],
        ),
      ),
    );
  }
}
