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
  bool currentTheme = false;
  final ThemeData emeraldTheme = ThemeData(
      appBarTheme: const AppBarTheme(backgroundColor: Colors.green),
      primaryColor: Colors.green.shade900,
      useMaterial3: false,
      colorScheme: ColorScheme.fromSeed(
        primary: Colors.green.shade300,
        seedColor: Colors.green,
      ));

  final ThemeData rubyTheme = ThemeData(
      appBarTheme: const AppBarTheme(backgroundColor: Colors.red),
      primaryColor: Colors.red.shade900,
      useMaterial3: false,
      colorScheme: ColorScheme.fromSeed(
        primary: Colors.red,
        seedColor: Colors.red,
      ));
      
  void changeTheme() {
    setState(() {
      currentTheme = !currentTheme;
    });
  }

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      theme: currentTheme ? emeraldTheme : rubyTheme,
      title: 'Practical 2',
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: Theme.of(context).appBarTheme.backgroundColor,
          title: const Text("Practical 2"),
        ),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              const SizedBox(width: 100, child: TextField()),
              const SizedBox(height: 40),
              ElevatedButton(
                onPressed: changeTheme,
                child: const Text("Switch Theme"),
              ),
              const SizedBox(height: 40),
              Text(currentTheme ? "Emerald theme" : "Ruby Theme"),
            ],
          ),
        ),
      ),
    );
  }
}
