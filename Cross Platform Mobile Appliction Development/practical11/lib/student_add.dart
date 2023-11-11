import 'dart:developer';

import 'package:flutter/material.dart';
import 'package:practical11/database_manager.dart';

class StudentAdd extends StatefulWidget {
  const StudentAdd({super.key});
  @override
  State<StudentAdd> createState() => _StudentAddState();
}

class _StudentAddState extends State<StudentAdd> {
  DatabaseManager databaseManager = DatabaseManager();

  TextEditingController nameFieldController = TextEditingController();
  TextEditingController rollFieldController = TextEditingController();
  TextEditingController addressFieldController = TextEditingController();

  void popWindow() {
    Navigator.pop(context);
  }

  void addStudent() async {
    try {
      await databaseManager.openDatabaseHelper("studentDB");
      databaseManager.addRecord(rollFieldController.text,
          nameFieldController.text, addressFieldController.text);
      popWindow();
    } catch (e) {
      log(e.toString());
    }
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(title: const Text("Add Student")),
      body: Column(children: [
        TextField(
            controller: nameFieldController,
            decoration: const InputDecoration(hintText: "Student name")),
        TextField(
            controller: rollFieldController,
            decoration: const InputDecoration(hintText: "Student roll no")),
        TextField(
            controller: addressFieldController,
            decoration: const InputDecoration(hintText: "Student address")),
        ElevatedButton(onPressed: addStudent, child: const Text("Add Student"))
      ]),
    );
  }
}
