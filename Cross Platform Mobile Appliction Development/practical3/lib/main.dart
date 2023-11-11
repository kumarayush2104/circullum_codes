import 'package:flutter/material.dart';

void main() {
  runApp(const MyHomePage());
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key});
  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  TextEditingController firstFieldController = TextEditingController();
  TextEditingController secondFieldController = TextEditingController();
  TextEditingController finalFieldController = TextEditingController();

  void addNumbers() {
    setState(() {
      try {
        int num1 = int.parse(firstFieldController.text);
        int num2 = int.parse(secondFieldController.text);

        finalFieldController.text = (num1 + num2).toString();
      } catch (e) {
        finalFieldController.text = e.toString();
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
      appBar: AppBar(
        title: const Text("Practical 3"),
      ),
      body: Padding(
        padding: const EdgeInsets.all(20),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            TextField(
                decoration: const InputDecoration(hintText: "Enter number 1"),
                controller: firstFieldController),
            TextField(
                decoration: const InputDecoration(hintText: "Enter number 2"),
                controller: secondFieldController),
            TextField(
                enabled: false,
                decoration:
                    const InputDecoration(hintText: "Your result will be here"),
                controller: finalFieldController),
          ],
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: addNumbers,
        child: const Icon(Icons.add),
      ),
    ));
  }
}
