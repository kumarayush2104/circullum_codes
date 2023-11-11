import 'package:flutter/material.dart';
import 'package:practical11/database_manager.dart';

class StudentEdit extends StatefulWidget {
  const StudentEdit({super.key, required this.rollno});

  final String rollno;
  @override
  State<StudentEdit> createState() => _StudentEditState();
}

class _StudentEditState extends State<StudentEdit> {
  List<dynamic>? students;
  DatabaseManager databaseManager = DatabaseManager();

  TextEditingController nameFieldController = TextEditingController();
  TextEditingController rollFieldController = TextEditingController();
  TextEditingController addressFieldController = TextEditingController();

  void updateStudent() async {
    try {
      databaseManager.updateRecord(rollFieldController.text,
          nameFieldController.text, addressFieldController.text);
      Navigator.pop(context);
      Navigator.pop(context);
    } catch (e) {
      print(e.toString());
    }
  }

  void getStudent() async {
    try {
      await databaseManager.openDatabaseHelper("studentDB");
      List list = await databaseManager.getSingleRecord(widget.rollno);
      setState(() {
        students = list;
        nameFieldController.text = list[0]["name"];
        rollFieldController.text = list[0]["roll"].toString();
        addressFieldController.text = list[0]["address"];
      });
    } catch (e) {
      print(e.toString());
    }
  }

  @override
  Widget build(BuildContext context) {
    if (students == null) getStudent();
    return Scaffold(
      appBar: AppBar(title: const Text("Edit Student")),
      body: Column(children: [
        TextField(
            controller: nameFieldController,
            decoration: const InputDecoration(hintText: "Student name")),
        TextField(
            enabled: false,
            controller: rollFieldController,
            decoration: const InputDecoration(hintText: "Student roll no")),
        TextField(
            controller: addressFieldController,
            decoration: const InputDecoration(hintText: "Student address")),
        ElevatedButton(
            onPressed: updateStudent, child: const Text("Update Student"))
      ]),
    );
  }
}
