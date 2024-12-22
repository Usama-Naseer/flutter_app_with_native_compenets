import 'package:flutter/services.dart';

class AuthChannel {
  static const MethodChannel _channel = MethodChannel('loginChannel');

  static Future<String> authenticate() async {
    final  result = await _channel.invokeMethod('startLoginActivity');
    return result;
  }
}