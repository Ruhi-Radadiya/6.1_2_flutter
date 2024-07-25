import 'package:flutter/material.dart';

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: const Color(0xffFF5252),
        title: const Align(
          child: Text(
            "Mission of RNW",
            style: TextStyle(
              fontSize: 20,
              fontWeight: FontWeight.w500,
              color: Colors.white,
            ),
          ),
        ),
      ),
      body: Align(
        alignment: Alignment.center,
        child: Container(
          decoration: const BoxDecoration(
            color: Color(0xffFCC8C8),
            border: Border(
              left: BorderSide(
                color: Color(0xffFF5252),
                width: 15,
              ),
            ),
          ),
          child: const Padding(
            padding: EdgeInsets.all(25),
            child: Text(
              "Shaping ''skills'' for ''scaling'' higher\n-RNW",
              style: TextStyle(fontSize: 20, fontWeight: FontWeight.w800),
            ),
          ),
        ),
      ),
    );
  }
}
