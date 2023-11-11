import 'package:flutter/material.dart';

class StudentList extends StatelessWidget {
  final List<String> studentList;
  const StudentList({super.key, required this.studentList});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(title: const Text("Practical 6")),
        body: ListView.separated(
            separatorBuilder: (BuildContext context, int index) =>
                const Divider(),
            itemCount: studentList.length,
            itemBuilder: (BuildContext buildContext, int index) =>
                ListTile(title: Text(studentList[index]))));
  }
}
