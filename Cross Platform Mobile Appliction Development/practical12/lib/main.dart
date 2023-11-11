import 'package:drift/drift.dart' as drift;
import 'package:flutter/material.dart';
import 'package:practical12/database.dart';

void main() {
  runApp(const MaterialApp(home: MyHomePage()));
}

class MyHomePage extends StatefulWidget {
  const MyHomePage({super.key});

  @override
  State<MyHomePage> createState() => _MyHomePageState();
}

class _MyHomePageState extends State<MyHomePage> {
  List<TodoItem>? todoItems;
  bool completed = false;
  final TextEditingController workFieldController = TextEditingController();
  final database = Database();

  void getData() async {
    List<TodoItem> allItems = await database.select(database.todoItems).get();
    setState(() {
      todoItems = allItems;
    });
  }

  void getDataCompleted() async {
    List<TodoItem> allItems = await (database.select(database.todoItems)
          ..where((data) => data.completed.equals(true)))
        .get();
    setState(() {
      todoItems = allItems;
    });
  }

  void completedHelper(bool? status) async {
    setState(() {
      completed = status!;
    });
    (completed) ? getDataCompleted() : getData();
  }

  void addData(DateTime? datetime) async {
    if (datetime != null || workFieldController.text.isNotEmpty) {
      await database.into(database.todoItems).insert(TodoItemsCompanion.insert(
          title: workFieldController.text,
          deadline: datetime.toString(),
          completed: false));
    }
    getData();
  }

  void updateData(String name, bool status) async {
    await (database.update(database.todoItems)
          ..where((data) => data.title.like(name)))
        .write(TodoItemsCompanion(completed: drift.Value<bool>(status)));

    getData();
  }

  @override
  void initState() {
    getData();
    super.initState();
  }

  @override
  Widget build(BuildContext context) {
    selectDate(BuildContext context) async {
      final DateTime? selected = await showDatePicker(
          context: context,
          initialDate: DateTime.now(),
          firstDate: DateTime.now(),
          lastDate: DateTime(2024));

      addData(selected);
    }

    return Scaffold(
      appBar: AppBar(
        title: const Text("Practical 12"),
        actions: [
          const Padding(
              padding: EdgeInsets.all(20), child: Text("Completed only")),
          Switch(value: completed, onChanged: completedHelper)
        ],
      ),
      body: Center(
        child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              todoItems != null
                  ? Expanded(
                      child: ListView.separated(
                      itemCount: todoItems!.length,
                      separatorBuilder: (BuildContext context, int index) =>
                          const Divider(),
                      itemBuilder: (BuildContext context, int index) =>
                          ListTile(
                              title: Text(todoItems![index].title),
                              subtitle: Text(todoItems![index].deadline),
                              trailing: Checkbox(
                                  value: todoItems![index].completed,
                                  onChanged: (status) {
                                    updateData(
                                        todoItems![index].title, status!);
                                  })),
                    ))
                  : const Text("Loading"),
              Padding(
                padding: const EdgeInsets.all(10),
                child: Row(
                  children: [
                    Expanded(
                        child: TextField(
                      controller: workFieldController,
                      decoration: const InputDecoration(hintText: "Enter Work"),
                    )),
                    IconButton(
                        onPressed: () {
                          selectDate(context);
                        },
                        icon: const Icon(Icons.calendar_month))
                  ],
                ),
              )
            ]),
      ),
    );
  }
}
