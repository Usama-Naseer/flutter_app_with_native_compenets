import 'package:flutter/material.dart';
import 'package:flutter/services.dart';
import 'package:flutter_app_with_native_compenets/auth/landing_page.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        primaryColor: const Color(0xffE40074),
        primaryColorLight: const Color(0xffE40074),
        brightness: Brightness.light,
        elevatedButtonTheme: const ElevatedButtonThemeData(
          style: ButtonStyle(
            maximumSize: WidgetStatePropertyAll(Size.fromWidth(200)),
            backgroundColor: WidgetStatePropertyAll(Color(0xffE40074)),
            alignment: Alignment.center,
            foregroundColor: WidgetStatePropertyAll(Colors.white),
            elevation: WidgetStatePropertyAll(5),
            textStyle: WidgetStatePropertyAll(TextStyle(fontSize: 16,fontWeight: FontWeight.w500,color: Colors.white))
          )
        ),
        colorScheme: const ColorScheme.light(primary: Color(0xffE40074),secondary: Colors.white),
        useMaterial3: true,
      ),
      home: const LandingPage(),
    );
  }
}




