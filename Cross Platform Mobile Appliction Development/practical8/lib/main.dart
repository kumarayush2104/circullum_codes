import 'package:flutter/material.dart';
import 'package:shared_preferences/shared_preferences.dart';

void main() {
  runApp(const MyHomePage());
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key});
  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  String? username;
  TextEditingController usernameFieldController = TextEditingController();

  void fetchData() async {
    final SharedPreferences prefs = await SharedPreferences.getInstance();
    String? currentName = prefs.getString("name");
    setState(() {
      username = (currentName != null) ? currentName : "Guest";
    });
  }

  void writeData() async {
    final SharedPreferences prefs = await SharedPreferences.getInstance();
    prefs.setString("name", usernameFieldController.text);
    usernameFieldController.text = "";
    fetchData();
  }

  @override
  void initState() {
    fetchData();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
        home: Scaffold(
      appBar: AppBar(
        title: const Text("Practical 8"),
      ),
      body: Padding(
        padding: const EdgeInsets.all(20),
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: <Widget>[
            TextField(
                maxLines: 1,
                controller: usernameFieldController,
                decoration: const InputDecoration(hintText: "Enter your name")),
            const SizedBox(height: 20),
            ElevatedButton(
                onPressed: () => writeData(), child: const Text("Save")),
            const SizedBox(height: 60),
            Text((username == null) ? "Loading..." : "Welcome $username")
          ],
        ),
      ),
    ));
  }
}
