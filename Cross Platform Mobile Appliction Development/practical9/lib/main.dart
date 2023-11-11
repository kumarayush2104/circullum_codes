import 'dart:convert';
import 'package:flutter/material.dart';
import 'package:http/http.dart' as http;

void main() {
  runApp(const MyHomePage());
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key});

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  List<Map<String, dynamic>>? products;

  void fetchData() async {
    const JsonDecoder decoder = JsonDecoder();

    var url = Uri.https("dummyjson.com", "/products");
    var response = await http.get(url);

    final Map<String, dynamic> object =
        decoder.convert(response.body.toString());

    setState(() {
      products = List.from(object["products"]);
    });
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
              title: const Text("Practical 9"),
            ),
            body: products != null
                ? ListView.separated(
                    separatorBuilder: (context, index) => const Divider(),
                    itemCount: products!.length,
                    itemBuilder: (BuildContext context, int index) =>
                        ListTile(title: Text(products![index]["title"])),
                  )
                : const Text("Loading", textAlign: TextAlign.center)));
  }
}
