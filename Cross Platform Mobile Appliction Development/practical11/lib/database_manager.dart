import 'package:sqflite/sqflite.dart';

class DatabaseManager {
  late Database database;

  Future<void> openDatabaseHelper(String databaseName) async {
    database = await openDatabase(databaseName, version: 1,
        onCreate: (Database db, int version) async {
      await db.execute(
          "CREATE TABLE Student (roll INTEGER PRIMARY KEY, name TEXT, address Text)");
    });
  }

  Future<bool> addRecord(String roll, String name, String address) async {
    try {
      await database
          .rawInsert("INSERT INTO Student VALUES($roll, '$name', '$address')");
      return true;
    } catch (e) {
      return false;
    }
  }

  Future<bool> updateRecord(String roll, String name, String address) async {
    try {
      await database.rawUpdate(
        "UPDATE Student SET name = '$name', address = '$address' WHERE roll = $roll",
      );
      return true;
    } catch (e) {
      return false;
    }
  }

  Future<List<Map>> getSingleRecord(String roll) async {
    List<Map> list =
        await database.rawQuery("SELECT * FROM Student where roll = $roll");
    return list;
  }

  Future<bool> removeRecord(String roll) async {
    try {
      await database.rawDelete("DELETE FROM Student where roll = $roll");
      return true;
    } catch (e) {
      return false;
    }
  }

  Future<List<Map>> getRecord() async {
    List<Map> list = await database.rawQuery("SELECT * FROM Student");
    return list;
  }
}
