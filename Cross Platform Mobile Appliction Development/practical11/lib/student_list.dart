import 'dart:developer';

import 'package:flutter/material.dart';
import 'package:practical11/database_manager.dart';
import 'package:practical11/student_item.dart';

class StudentList extends StatefulWidget {
  const StudentList({super.key});
  @override
  State<StudentList> createState() => _StudentListState();
}

class _StudentListState extends State<StudentList> {
  DatabaseManager databaseManager = DatabaseManager();
  List<dynamic>? students;
  void getStudents() async {
    try {
      await databaseManager.openDatabaseHelper("studentDB");
      List list = await databaseManager.getRecord();
      setState(() {
        students = list;
      });
    } catch (e) {
      log(e.toString());
    }
  }

  @override
  void initState() {
    getStudents();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
        appBar: AppBar(title: const Text("List Student")),
        body: students != null
            ? ListView.builder(
                itemCount: students!.length,
                itemBuilder: (BuildContext context, int index) => StudentItem(
                    name: students![index]["name"],
                    rollno: students![index]["roll"].toString(),
                    address: students![index]["address"],
                    function: getStudents))
            : const Text("Loading"));
  }
}
