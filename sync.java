package practice;
import java.util.*;

import java.lang.*;
class Callme {
void call(String msg) {
System.out.print("[" + msg);

System.out.println("]");
}
}
class Caller extends Thread {
String msg;
Callme target;
public Caller(Callme targ, String s) {
target = targ;
msg = s;
 
start();
}

public void run() {
synchronized(target) { 
target.call(msg);
}
}
}
class sync{
public static void main(String args[]) {
Callme target = new Callme();
Caller ob1 = new Caller(target, "Hello");
Caller ob2 = new Caller(target, "Synchronized");
Caller ob3 = new Caller(target, "World");
Thread t1=new Thread(ob1);
Thread t2=new Thread(ob2);
Thread t3=new Thread(ob3);

try {
t1.join();
t2.join();
t3.join();
} catch(InterruptedException e) {
System.out.println("Interrupted");
}
}
}




