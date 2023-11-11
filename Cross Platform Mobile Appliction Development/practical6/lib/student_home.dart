import 'package:flutter/material.dart';
import 'package:practical6/student_list.dart';

class StudentHome extends StatelessWidget {
  StudentHome({super.key});

  final Map<String, List<String>> classes = Map.of({
    "1st A": ["1st Year Student 1", "1st Year Student 2", "1st Year Student 3"],
    "1st B": ["1st Year Student 4", "1st Year Student 5", "1st Year Student 6"],
    "1st C": ["1st Year Student 7", "1st Year Student 8", "1st Year Student 9"],
    "1st D": [
      "1st Year Student 10",
      "1st Year Student 11",
      "1st Year Student 12"
    ],
    "2nd A": ["2nd Year Student 1", "2nd Year Student 2", "2nd Year Student 3"],
    "2nd B": ["2nd Year Student 4", "2nd Year Student 5", "2nd Year Student 6"],
    "2nd C": ["2nd Year Student 7", "2nd Year Student 8", "2nd Year Student 9"],
    "2nd D": [
      "2nd Year Student 10",
      "2nd Year Student 11",
      "2nd Year Student 12"
    ],
    "3rd A": ["3rd Year Student 1", "3rd Year Student 2", "3rd Year Student 3"],
    "3rd B": ["3rd Year Student 4", "3rd Year Student 5", "3rd Year Student 6"]
  });

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Practical 6")),
      body: ListView.separated(
          itemBuilder: (BuildContext buildContext, int index) => ListTile(
              title: Text(classes.keys.toList()[index]),
              onTap: () {
                Navigator.push(
                    context,
                    MaterialPageRoute(
                      builder: (context) => StudentList(
                          studentList: classes.values.toList()[index]),
                    ));
              }),
          separatorBuilder: (BuildContext buildContext, int index) =>
              const Divider(),
          itemCount: classes.length),
    );
  }
}
