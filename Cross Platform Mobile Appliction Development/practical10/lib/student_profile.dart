import 'package:flutter/material.dart';

class StudentProfile extends StatelessWidget {
  final String name;
  final String logo;

  const StudentProfile({
    super.key,
    required this.name,
    required this.logo,
  });

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(
          title: const Text("Student Details"),
        ),
        body: Center(
          child: Padding(
            padding: const EdgeInsets.all(40),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: <Widget>[
                Container(
                  margin: const EdgeInsets.all(5),
                  height: 300.0,
                  width: 300.0,
                  decoration: BoxDecoration(
                    shape: BoxShape.circle,
                    border: Border.all(width: 5),
                    image: DecorationImage(
                      image: NetworkImage(logo),
                      fit: BoxFit.cover,
                    ),
                  ),
                ),
                const SizedBox(height: 50),
                Text(name),
                const SizedBox(height: 20),
              ],
            ),
          ),
        ));
  }
}
