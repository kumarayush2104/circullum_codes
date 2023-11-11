import 'dart:developer';
import 'package:flutter/material.dart';
import 'package:practical11/student_edit.dart';
import 'database_manager.dart';

class StudentItem extends StatelessWidget {
  final String name;
  final String rollno;
  final Function function;
  final String address;
  final DatabaseManager databaseManager = DatabaseManager();

  void removeStudent() async {
    try {
      await databaseManager.openDatabaseHelper("studentDB");
      await databaseManager.removeRecord(rollno);
      function();
    } catch (e) {
      log(e.toString());
    }
  }

  StudentItem(
      {super.key,
      required this.name,
      required this.rollno,
      required this.address,
      required this.function});
  @override
  Widget build(BuildContext context) {
    return ListTile(
      leading: const Icon(Icons.people),
      title: Text(name),
      subtitle: Text("Roll No: $rollno, Address: $address"),
      trailing: Wrap(
        spacing: 25,
        children: <Widget>[
          GestureDetector(
              onTap: () => {
                    Navigator.push(
                        context,
                        MaterialPageRoute(
                            builder: (BuildContext context) =>
                                StudentEdit(rollno: rollno))),
                    function()
                  },
              child: const Icon(Icons.edit)),
          GestureDetector(
              onTap: removeStudent,
              child: const Icon(Icons.delete, color: Colors.red)),
        ],
      ),
    );
  }
}
