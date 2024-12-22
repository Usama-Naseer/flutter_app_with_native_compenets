import 'package:flutter/material.dart';
import 'package:flutter_app_with_native_compenets/auth/login/login_channel.dart';

class LandingPage extends StatelessWidget {
  const LandingPage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(

      body: Column(
        mainAxisAlignment: MainAxisAlignment.start,
        crossAxisAlignment: CrossAxisAlignment.center,
        children: [
          const Row(),
          const SizedBox(
            height: 100,
          ),
          Image.asset('assets/images/logo.png',height: 100,width: 100,),
          const SizedBox(
            height: 20,
          ),
          ElevatedButton(
            onPressed: () async {
              await AuthChannel.authenticate();
            },
            child: const Center(child: Text('Login',)),
          ),
          const SizedBox(
            height: 20,
          ),
          ElevatedButton(
            onPressed: () {},
            child: const Center(child: Text('SignUp')),
          ),
        ],
      ),
    );
  }
}
